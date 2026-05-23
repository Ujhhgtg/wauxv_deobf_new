package okhttp3.internal.ws;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import p000.C0502;
import p000.C0504;
import p000.C0539;
import p000.InterfaceC0507;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C0502 maskCursor;
    private final byte[] maskKey;
    private final C0504 messageBuffer = new C0504();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC0507 sink;
    private final C0504 sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, InterfaceC0507 interfaceC0507, Random random, boolean z2, boolean z3, long j) {
        this.isClient = z;
        this.sink = interfaceC0507;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = interfaceC0507.mo1760();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C0502() : null;
    }

    private final void writeControlFrame(int i, C0539 c0539) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iMo1870 = c0539.mo1870();
        if (iMo1870 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.m1796(i | 128);
        if (this.isClient) {
            this.sinkBuffer.m1796(iMo1870 | 128);
            this.random.nextBytes(this.maskKey);
            C0504 c0504 = this.sinkBuffer;
            byte[] bArr = this.maskKey;
            
            c0504.write(bArr, 0, bArr.length);
            if (iMo1870 > 0) {
                C0504 c0505 = this.sinkBuffer;
                long j = c0505.f2172;
                c0539.mo1878(c0539.mo1870(), c0505);
                this.sinkBuffer.m1782(this.maskCursor);
                this.maskCursor.m1758(j);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.m1796(iMo1870);
            C0504 c0506 = this.sinkBuffer;
            
            c0539.mo1878(c0539.mo1870(), c0506);
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

    public final InterfaceC0507 getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C0539 c0539) throws EOFException {
        C0539 c0539Mo1762;
        if (i == 0 && c0539 == null) {
            c0539Mo1762 = C0539.f2244;
        } else {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C0504 c0504 = new C0504();
            c0504.m1801(i);
            if (c0539 != null) {
                c0539.mo1878(c0539.mo1870(), c0504);
            }
            c0539Mo1762 = c0504.mo1762(c0504.f2172);
        }
        try {
            writeControlFrame(8, c0539Mo1762);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C0539 c0539) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.m1795(c0539);
        int i2 = i | 128;
        if (this.perMessageDeflate && c0539.mo1870() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | 192;
        }
        long j = this.messageBuffer.f2172;
        this.sinkBuffer.m1796(i2);
        int i3 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.m1796(i3 | ((int) j));
        } else if (j <= 65535L) {
            this.sinkBuffer.m1796(i3 | 126);
            this.sinkBuffer.m1801((int) j);
        } else {
            this.sinkBuffer.m1796(i3 | 127);
            this.sinkBuffer.m1800(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            C0504 c0504 = this.sinkBuffer;
            byte[] bArr = this.maskKey;
            
            c0504.write(bArr, 0, bArr.length);
            if (j > 0) {
                this.messageBuffer.m1782(this.maskCursor);
                this.maskCursor.m1758(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.mo1763();
    }

    public final void writePing(C0539 c0539) throws IOException {
        writeControlFrame(9, c0539);
    }

    public final void writePong(C0539 c0539) throws IOException {
        writeControlFrame(10, c0539);
    }
}
