package okhttp3.internal.ws;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import p000.C0479;
import p000.C0481;
import p000.C0516;
import p000.InterfaceC0484;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C0479 maskCursor;
    private final byte[] maskKey;
    private final C0481 messageBuffer = new C0481();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC0484 sink;
    private final C0481 sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, InterfaceC0484 interfaceC0484, Random random, boolean z2, boolean z3, long j) {
        this.isClient = z;
        this.sink = interfaceC0484;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = interfaceC0484.mo1854();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C0479() : null;
    }

    private final void writeControlFrame(int i, C0516 c0516) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iMo1964 = c0516.mo1964();
        if (iMo1964 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.m1890(i | 128);
        if (this.isClient) {
            this.sinkBuffer.m1890(iMo1964 | 128);
            this.random.nextBytes(this.maskKey);
            C0481 c0481 = this.sinkBuffer;
            byte[] bArr = this.maskKey;
            c0481.getClass();
            c0481.write(bArr, 0, bArr.length);
            if (iMo1964 > 0) {
                C0481 c0482 = this.sinkBuffer;
                long j = c0482.f2128;
                c0516.mo1972(c0516.mo1964(), c0482);
                this.sinkBuffer.m1876(this.maskCursor);
                this.maskCursor.m1852(j);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.m1890(iMo1964);
            C0481 c0483 = this.sinkBuffer;
            c0483.getClass();
            c0516.mo1972(c0516.mo1964(), c0483);
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

    public final InterfaceC0484 getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C0516 c0516) throws EOFException {
        C0516 c0516Mo1856;
        if (i == 0 && c0516 == null) {
            c0516Mo1856 = C0516.f2200;
        } else {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C0481 c0481 = new C0481();
            c0481.m1895(i);
            if (c0516 != null) {
                c0516.mo1972(c0516.mo1964(), c0481);
            }
            c0516Mo1856 = c0481.mo1856(c0481.f2128);
        }
        try {
            writeControlFrame(8, c0516Mo1856);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C0516 c0516) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.m1889(c0516);
        int i2 = i | 128;
        if (this.perMessageDeflate && c0516.mo1964() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | Opcodes.CHECKCAST;
        }
        long j = this.messageBuffer.f2128;
        this.sinkBuffer.m1890(i2);
        int i3 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.m1890(i3 | ((int) j));
        } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.m1890(i3 | 126);
            this.sinkBuffer.m1895((int) j);
        } else {
            this.sinkBuffer.m1890(i3 | 127);
            this.sinkBuffer.m1894(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            C0481 c0481 = this.sinkBuffer;
            byte[] bArr = this.maskKey;
            c0481.getClass();
            c0481.write(bArr, 0, bArr.length);
            if (j > 0) {
                this.messageBuffer.m1876(this.maskCursor);
                this.maskCursor.m1852(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.mo1857();
    }

    public final void writePing(C0516 c0516) throws IOException {
        writeControlFrame(9, c0516);
    }

    public final void writePong(C0516 c0516) throws IOException {
        writeControlFrame(10, c0516);
    }
}
