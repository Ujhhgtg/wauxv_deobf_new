package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import p000.C2589feyxiexzfUjhhgtg;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.InterfaceC2595feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final C2589feyxiexzfUjhhgtg maskCursor;
    private final byte[] maskKey;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final InterfaceC2595feyxiexzfUjhhgtg source;
    private final C2598feyxiexzfUjhhgtg controlFrameBuffer = new C2598feyxiexzfUjhhgtg();
    private final C2598feyxiexzfUjhhgtg messageFrameBuffer = new C2598feyxiexzfUjhhgtg();

    /* JADX INFO: compiled from: obf */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str);

        void onReadMessage(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf);

        void onReadPing(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf);

        void onReadPong(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf);
    }

    public WebSocketReader(boolean z, InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, FrameCallback frameCallback, boolean z2, boolean z3) {
        this.isClient = z;
        this.source = interfaceC2595feyxiexzfUjhhgtg;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new C2589feyxiexzfUjhhgtg();
    }

    private final void readControlFrame() throws ProtocolException, EOFException {
        short s;
        String strM3865feyxiexzfUjhhgtg;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo2113Ujhhgtgfeyxiexzf(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.m3862Ujhhgtgfeyxiexzf(this.maskCursor);
                this.maskCursor.m3846Ujhhgtgfeyxiexzf(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.controlFrameBuffer;
                long j2 = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = c2598feyxiexzfUjhhgtg.readShort();
                    strM3865feyxiexzfUjhhgtg = this.controlFrameBuffer.m3865feyxiexzfUjhhgtg();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s = 1005;
                    strM3865feyxiexzfUjhhgtg = "";
                }
                this.frameCallback.onReadClose(s, strM3865feyxiexzfUjhhgtg);
                this.closed = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.controlFrameBuffer;
                frameCallback.onReadPing(c2598feyxiexzfUjhhgtg2.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg3 = this.controlFrameBuffer;
                frameCallback2.onReadPong(c2598feyxiexzfUjhhgtg3.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg3.f8401Ujhhgtgfeyxiexzf));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.readByte(), 255);
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i = iAnd & 15;
            this.opcode = i;
            boolean z2 = (iAnd & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (iAnd & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (iAnd & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.readByte(), 255);
            boolean z5 = (iAnd2 & 128) != 0;
            if (z5 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = iAnd2 & 127;
            this.frameLength = j;
            if (j == 126) {
                this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j == 127) {
                long j2 = this.source.readLong();
                this.frameLength = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                this.source.readFully(this.maskKey);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo2113Ujhhgtgfeyxiexzf(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.m3862Ujhhgtgfeyxiexzf(this.maskCursor);
                    this.maskCursor.m3846Ujhhgtgfeyxiexzf(this.messageFrameBuffer.f8401Ujhhgtgfeyxiexzf - this.frameLength);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m3865feyxiexzfUjhhgtg());
            return;
        }
        FrameCallback frameCallback = this.frameCallback;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.messageFrameBuffer;
        frameCallback.onReadMessage(c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf));
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final InterfaceC2595feyxiexzfUjhhgtg getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
