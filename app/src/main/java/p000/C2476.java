package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᛸᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2476 implements InterfaceC0507 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2713 f7910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0504 f7911 = new C0504();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f7912;

    public C2476(InterfaceC2713 interfaceC2713) {
        this.f7910 = interfaceC2713;
    }

    @Override // p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC2713 interfaceC2713 = this.f7910;
        if (this.f7912) {
            return;
        }
        C0504 c0504 = this.f7911;
        long j = c0504.f2172;
        if (j > 0) {
            interfaceC2713.write(c0504, j);
        }
        th = null;
        try {
            interfaceC2713.close();
        } catch (Throwable th) {
            if (false) {
                th = th;
            }
        }
        this.f7912 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0507, p000.InterfaceC2713, java.io.Flushable
    public final void flush() {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        C0504 c0504 = this.f7911;
        long j = c0504.f2172;
        InterfaceC2713 interfaceC2713 = this.f7910;
        if (j > 0) {
            interfaceC2713.write(c0504, j);
        }
        interfaceC2713.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7912;
    }

    @Override // p000.InterfaceC2713
    public final C3400 timeout() {
        return this.f7910.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f7910 + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f7911.write(byteBuffer);
        mo1770();
        return iWrite;
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 writeByte(int i) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1796(i);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 writeInt(int i) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1799(i);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 writeShort(int i) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1801(i);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C0504 mo1760() {
        return this.f7911;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final InterfaceC0507 mo1763() {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        C0504 c0504 = this.f7911;
        long j = c0504.f2172;
        if (j > 0) {
            this.f7910.write(c0504, j);
        }
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final long mo1769(InterfaceC2786 interfaceC2786) {
        long j = 0;
        while (true) {
            long j2 = interfaceC2786.read(this.f7911, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            mo1770();
        }
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final InterfaceC0507 mo1770() {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        C0504 c0504 = this.f7911;
        long j = c0504.f2172;
        if (j == 0) {
            j = 0;
        } else {
            C2646 c2646 = c0504.f2171.f8545;
            int i = c2646.f8541;
            if (i < 8192 && c2646.f8543) {
                j -= (long) (i - c2646.f8540);
            }
        }
        if (j > 0) {
            this.f7910.write(c0504, j);
        }
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final InterfaceC0507 mo1775(String str) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1804(str);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final InterfaceC0507 mo1777(C0539 c0539) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1795(c0539);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final InterfaceC0507 mo1779(long j) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1798(j);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final InterfaceC0507 mo1788(int i, int i2, byte[] bArr) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.write(bArr, i, i2);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final InterfaceC0507 mo1791(long j) {
        if (this.f7912) {
            throw new IllegalStateException("closed");
        }
        this.f7911.m1797(j);
        mo1770();
        return this;
    }

    @Override // p000.InterfaceC2713
    public final void write(C0504 c0504, long j) {
        if (!this.f7912) {
            this.f7911.write(c0504, j);
            mo1770();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 write(byte[] bArr) {
        if (!this.f7912) {
            this.f7911.write(bArr, 0, bArr.length);
            mo1770();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
