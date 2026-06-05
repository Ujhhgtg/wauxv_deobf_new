package okhttp3.internal.ws;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import p000.C2589feyxiexzfUjhhgtg;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.InterfaceC2596feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C2589feyxiexzfUjhhgtg maskCursor;
    private final byte[] maskKey;
    private final C2598feyxiexzfUjhhgtg messageBuffer = new C2598feyxiexzfUjhhgtg();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC2596feyxiexzfUjhhgtg sink;
    private final C2598feyxiexzfUjhhgtg sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg, Random random, boolean z2, boolean z3, long j) {
        this.isClient = z;
        this.sink = interfaceC2596feyxiexzfUjhhgtg;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = interfaceC2596feyxiexzfUjhhgtg.mo2145Ujhhgtgfeyxiexzf();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C2589feyxiexzfUjhhgtg() : null;
    }

    private final void writeControlFrame(int i, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        if (iMo2578Ujhhgtgfeyxiexzf > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.m3869feyxiexzfUjhhgtg(i | 128);
        if (this.isClient) {
            this.sinkBuffer.m3869feyxiexzfUjhhgtg(iMo2578Ujhhgtgfeyxiexzf | 128);
            this.random.nextBytes(this.maskKey);
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.sinkBuffer;
            byte[] bArr = this.maskKey;
            c2598feyxiexzfUjhhgtg.getClass();
            c2598feyxiexzfUjhhgtg.write(bArr, 0, bArr.length);
            if (iMo2578Ujhhgtgfeyxiexzf > 0) {
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.sinkBuffer;
                long j = c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf;
                c2633Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2598feyxiexzfUjhhgtg2);
                this.sinkBuffer.m3862Ujhhgtgfeyxiexzf(this.maskCursor);
                this.maskCursor.m3846Ujhhgtgfeyxiexzf(j);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.m3869feyxiexzfUjhhgtg(iMo2578Ujhhgtgfeyxiexzf);
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg3 = this.sinkBuffer;
            c2598feyxiexzfUjhhgtg3.getClass();
            c2633Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2598feyxiexzfUjhhgtg3);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC2596feyxiexzfUjhhgtg getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws EOFException {
        C2633Ujhhgtgfeyxiexzf c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf;
        if (i == 0 && c2633Ujhhgtgfeyxiexzf == null) {
            c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf = C2633Ujhhgtgfeyxiexzf.f8466Ujhhgtgfeyxiexzf;
        } else {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
            c2598feyxiexzfUjhhgtg.m3874feyxiexzfUjhhgtg(i);
            if (c2633Ujhhgtgfeyxiexzf != null) {
                c2633Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2598feyxiexzfUjhhgtg);
            }
            c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
        }
        try {
            writeControlFrame(8, c2633UjhhgtgfeyxiexzfMo2106Ujhhgtgfeyxiexzf);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.m3868feyxiexzfUjhhgtg(c2633Ujhhgtgfeyxiexzf);
        int i2 = i | 128;
        if (this.perMessageDeflate && c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | Opcodes.CHECKCAST;
        }
        long j = this.messageBuffer.f8401Ujhhgtgfeyxiexzf;
        this.sinkBuffer.m3869feyxiexzfUjhhgtg(i2);
        int i3 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.m3869feyxiexzfUjhhgtg(i3 | ((int) j));
        } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.m3869feyxiexzfUjhhgtg(i3 | 126);
            this.sinkBuffer.m3874feyxiexzfUjhhgtg((int) j);
        } else {
            this.sinkBuffer.m3869feyxiexzfUjhhgtg(i3 | 127);
            this.sinkBuffer.m3873feyxiexzfUjhhgtg(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.sinkBuffer;
            byte[] bArr = this.maskKey;
            c2598feyxiexzfUjhhgtg.getClass();
            c2598feyxiexzfUjhhgtg.write(bArr, 0, bArr.length);
            if (j > 0) {
                this.messageBuffer.m3862Ujhhgtgfeyxiexzf(this.maskCursor);
                this.maskCursor.m3846Ujhhgtgfeyxiexzf(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.mo2146Ujhhgtgfeyxiexzf();
    }

    public final void writePing(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws IOException {
        writeControlFrame(9, c2633Ujhhgtgfeyxiexzf);
    }

    public final void writePong(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) throws IOException {
        writeControlFrame(10, c2633Ujhhgtgfeyxiexzf);
    }
}
