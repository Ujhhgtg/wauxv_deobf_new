package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2530 implements InterfaceC0484 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC2774 f8061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0481 f8062 = new C0481();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f8063;

    public C2530(InterfaceC2774 interfaceC2774) {
        this.f8061 = interfaceC2774;
    }

    @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC2774 interfaceC2774 = this.f8061;
        if (this.f8063) {
            return;
        }
        C0481 c0481 = this.f8062;
        long j = c0481.f2128;
        if (j > 0) {
            interfaceC2774.write(c0481, j);
        }
        th = null;
        try {
            interfaceC2774.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f8063 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0484, p000.InterfaceC2774, java.io.Flushable
    public final void flush() {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        C0481 c0481 = this.f8062;
        long j = c0481.f2128;
        InterfaceC2774 interfaceC2774 = this.f8061;
        if (j > 0) {
            interfaceC2774.write(c0481, j);
        }
        interfaceC2774.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8063;
    }

    @Override // p000.InterfaceC2774
    public final C3459 timeout() {
        return this.f8061.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f8061 + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f8062.write(byteBuffer);
        mo1864();
        return iWrite;
    }

    @Override // p000.InterfaceC0484
    public final InterfaceC0484 writeByte(int i) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1890(i);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    public final InterfaceC0484 writeInt(int i) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1893(i);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    public final InterfaceC0484 writeShort(int i) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1895(i);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C0481 mo1854() {
        return this.f8062;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final InterfaceC0484 mo1857() {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        C0481 c0481 = this.f8062;
        long j = c0481.f2128;
        if (j > 0) {
            this.f8061.write(c0481, j);
        }
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final long mo1863(InterfaceC2846 interfaceC2846) {
        long j = 0;
        while (true) {
            long j2 = interfaceC2846.read(this.f8062, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            mo1864();
        }
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final InterfaceC0484 mo1864() {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        C0481 c0481 = this.f8062;
        long j = c0481.f2128;
        if (j == 0) {
            j = 0;
        } else {
            C2707 c2707 = c0481.f2127.f8710;
            int i = c2707.f8706;
            if (i < 8192 && c2707.f8708) {
                j -= (long) (i - c2707.f8705);
            }
        }
        if (j > 0) {
            this.f8061.write(c0481, j);
        }
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final InterfaceC0484 mo1869(String str) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1898(str);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final InterfaceC0484 mo1871(C0516 c0516) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1889(c0516);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final InterfaceC0484 mo1873(long j) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1892(j);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final InterfaceC0484 mo1882(int i, int i2, byte[] bArr) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.write(bArr, i, i2);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final InterfaceC0484 mo1885(long j) {
        if (this.f8063) {
            throw new IllegalStateException("closed");
        }
        this.f8062.m1891(j);
        mo1864();
        return this;
    }

    @Override // p000.InterfaceC2774
    public final void write(C0481 c0481, long j) {
        if (!this.f8063) {
            this.f8062.write(c0481, j);
            mo1864();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p000.InterfaceC0484
    public final InterfaceC0484 write(byte[] bArr) {
        if (!this.f8063) {
            this.f8062.write(bArr, 0, bArr.length);
            mo1864();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
