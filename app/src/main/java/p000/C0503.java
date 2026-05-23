package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᤝᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0503 extends InputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0508 f2170;

    public /* synthetic */ C0503(InterfaceC0508 interfaceC0508, int i) {
        this.f2169 = i;
        this.f2170 = interfaceC0508;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f2169) {
            case 0:
                jMin = Math.min(((C0504) this.f2170).f2172, 2147483647);
                break;
            default:
                C2477 c2477 = (C2477) this.f2170;
                if (c2477.f7915) {
                    throw new IOException("closed");
                }
                jMin = Math.min(c2477.f7914.f2172, 2147483647);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2169) {
            case 0:
                break;
            default:
                ((C2477) this.f2170).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f2169) {
            case 0:
                C0504 c0504 = (C0504) this.f2170;
                if (c0504.f2172 > 0) {
                    return c0504.readByte() & 255;
                }
                return -1;
            default:
                C2477 c2477 = (C2477) this.f2170;
                C0504 c0505 = c2477.f7914;
                if (c2477.f7915) {
                    throw new IOException("closed");
                }
                if (c0505.f2172 == 0 && c2477.f7913.read(c0505, 8192L) == -1) {
                    return -1;
                }
                return c0505.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f2169) {
            case 0:
                return ((C0504) this.f2170) + ".inputStream()";
            default:
                return ((C2477) this.f2170) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f2169) {
            case 0:
                return ((C0504) this.f2170).read(bArr, i, i2);
            default:
                C2477 c2477 = (C2477) this.f2170;
                C0504 c0504 = c2477.f7914;
                if (!c2477.f7915) {
                    AbstractC0968.m2469(bArr.length, i, i2);
                    if (c0504.f2172 == 0 && c2477.f7913.read(c0504, 8192L) == -1) {
                        return -1;
                    }
                    return c0504.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m1759() {
    }
}
