package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0480 extends InputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0485 f2126;

    public /* synthetic */ C0480(InterfaceC0485 interfaceC0485, int i) {
        this.f2125 = i;
        this.f2126 = interfaceC0485;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f2125) {
            case 0:
                jMin = Math.min(((C0481) this.f2126).f2128, Integer.MAX_VALUE);
                break;
            default:
                C2531 c2531 = (C2531) this.f2126;
                if (c2531.f8066) {
                    throw new IOException("closed");
                }
                jMin = Math.min(c2531.f8065.f2128, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2125) {
            case 0:
                break;
            default:
                ((C2531) this.f2126).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f2125) {
            case 0:
                C0481 c0481 = (C0481) this.f2126;
                if (c0481.f2128 > 0) {
                    return c0481.readByte() & 255;
                }
                return -1;
            default:
                C2531 c2531 = (C2531) this.f2126;
                C0481 c0482 = c2531.f8065;
                if (c2531.f8066) {
                    throw new IOException("closed");
                }
                if (c0482.f2128 == 0 && c2531.f8064.read(c0482, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                    return -1;
                }
                return c0482.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f2125) {
            case 0:
                return ((C0481) this.f2126) + ".inputStream()";
            default:
                return ((C2531) this.f2126) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f2125) {
            case 0:
                return ((C0481) this.f2126).read(bArr, i, i2);
            default:
                C2531 c2531 = (C2531) this.f2126;
                C0481 c0481 = c2531.f8065;
                if (!c2531.f8066) {
                    AbstractC0972.m2590(bArr.length, i, i2);
                    if (c0481.f2128 == 0 && c2531.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                        return -1;
                    }
                    return c0481.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m1853() {
    }
}
