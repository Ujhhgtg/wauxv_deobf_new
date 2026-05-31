package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2531 implements InterfaceC0485 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC2846 f8064;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0481 f8065 = new C0481();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f8066;

    public C2531(InterfaceC2846 interfaceC2846) {
        this.f8064 = interfaceC2846;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f8066) {
            return;
        }
        this.f8066 = true;
        this.f8064.close();
        this.f8065.m1855();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8066;
    }

    @Override // p000.InterfaceC0485
    public final C2531 peek() {
        return new C2531(new C2388(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C0481 c0481 = this.f8065;
        if (c0481.f2128 == 0 && this.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
            return -1;
        }
        return c0481.read(byteBuffer);
    }

    @Override // p000.InterfaceC0485
    public final byte readByte() throws EOFException {
        mo1884(1L);
        return this.f8065.readByte();
    }

    @Override // p000.InterfaceC0485
    public final void readFully(byte[] bArr) throws EOFException {
        C0481 c0481 = this.f8065;
        try {
            mo1884(bArr.length);
            c0481.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c0481.f2128;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c0481.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p000.InterfaceC0485
    public final int readInt() throws EOFException {
        mo1884(4L);
        return this.f8065.readInt();
    }

    @Override // p000.InterfaceC0485
    public final long readLong() throws EOFException {
        mo1884(8L);
        return this.f8065.readLong();
    }

    @Override // p000.InterfaceC0485
    public final short readShort() throws EOFException {
        mo1884(2L);
        return this.f8065.readShort();
    }

    @Override // p000.InterfaceC0485
    public final String readString(Charset charset) {
        InterfaceC2846 interfaceC2846 = this.f8064;
        C0481 c0481 = this.f8065;
        c0481.mo1863(interfaceC2846);
        return c0481.m1879(c0481.f2128, charset);
    }

    @Override // p000.InterfaceC0485
    public final void skip(long j) throws EOFException {
        if (this.f8066) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C0481 c0481 = this.f8065;
            if (c0481.f2128 == 0 && this.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c0481.f2128);
            c0481.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        return this.f8064.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f8064 + ')';
    }

    @Override // p000.InterfaceC0485, p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C0481 mo1854() {
        return this.f8065;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long m4449(long j, long j2, byte b) {
        if (this.f8066) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            C0481 c0481 = this.f8065;
            long j3 = j2;
            byte b2 = b;
            long jM1868 = c0481.m1868(jMax, j3, b2);
            if (jM1868 != -1) {
                return jM1868;
            }
            long j4 = c0481.f2128;
            if (j4 >= j3 || this.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            j2 = j3;
            b = b2;
        }
        return -1L;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C0516 mo1856(long j) throws EOFException {
        mo1884(j);
        return this.f8065.mo1856(j);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final byte[] mo1858() {
        InterfaceC2846 interfaceC2846 = this.f8064;
        C0481 c0481 = this.f8065;
        c0481.mo1863(interfaceC2846);
        return c0481.m1878(c0481.f2128);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m4450() throws EOFException {
        mo1884(4L);
        int i = this.f8065.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo1860() {
        if (this.f8066) {
            throw new IllegalStateException("closed");
        }
        C0481 c0481 = this.f8065;
        return c0481.mo1860() && this.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1861(C2335 c2335) throws EOFException {
        C0481 c0481;
        if (this.f8066) {
            throw new IllegalStateException("closed");
        }
        do {
            c0481 = this.f8065;
            int iM1052 = AbstractC0055.m1052(c0481, c2335, true);
            if (iM1052 != -2) {
                if (iM1052 == -1) {
                    break;
                }
                c0481.skip(c2335.f7539[iM1052].mo1964());
                return iM1052;
            }
        } while (this.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1);
        return -1;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final long mo1865() throws EOFException {
        C0481 c0481;
        mo1884(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zMo1875 = mo1875(j2);
            c0481 = this.f8065;
            if (!zMo1875) {
                break;
            }
            byte bM1866 = c0481.m1866(j);
            if ((bM1866 < 48 || bM1866 > 57) && !(j == 0 && bM1866 == 45)) {
                if (j != 0) {
                    break;
                }
                AbstractC2727.m4694(16);
                AbstractC2727.m4694(16);
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(Integer.toString(bM1866, 16)));
            }
            j = j2;
        }
        return c0481.mo1865();
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final String mo1867(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM4449 = m4449(0L, j2, (byte) 10);
        C0481 c0481 = this.f8065;
        if (jM4449 != -1) {
            return AbstractC0055.m1051(c0481, jM4449);
        }
        if (j2 < Long.MAX_VALUE && mo1875(j2) && c0481.m1866(j2 - 1) == 13 && mo1875(j2 + 1) && c0481.m1866(j2) == 10) {
            return AbstractC0055.m1051(c0481, j2);
        }
        C0481 c0482 = new C0481();
        c0481.m1862(0L, c0482, Math.min(32, c0481.f2128));
        throw new EOFException("\\n not found: limit=" + Math.min(c0481.f2128, j) + " content=" + c0482.mo1856(c0482.f2128).mo1965() + (char) 8230);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo1870(C0481 c0481, long j) throws EOFException {
        C0481 c0482 = this.f8065;
        try {
            mo1884(j);
            c0482.mo1870(c0481, j);
        } catch (EOFException e) {
            c0481.mo1863(c0482);
            throw e;
        }
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final C0516 mo1874() {
        InterfaceC2846 interfaceC2846 = this.f8064;
        C0481 c0481 = this.f8065;
        c0481.mo1863(interfaceC2846);
        return c0481.mo1856(c0481.f2128);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final boolean mo1875(long j) {
        C0481 c0481;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
        }
        if (this.f8066) {
            throw new IllegalStateException("closed");
        }
        do {
            c0481 = this.f8065;
            if (c0481.f2128 >= j) {
                return true;
            }
        } while (this.f8064.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1);
        return false;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final String mo1877() {
        return mo1867(Long.MAX_VALUE);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public final boolean mo1881(long j, C0516 c0516) {
        int iMo1964 = c0516.mo1964();
        if (this.f8066) {
            throw new IllegalStateException("closed");
        }
        if (iMo1964 >= 0 && c0516.mo1964() >= iMo1964) {
            for (int i = 0; i < iMo1964; i++) {
                long j2 = i;
                if (mo1875(1 + j2) && this.f8065.m1866(j2) == c0516.mo1967(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public final void mo1884(long j) throws EOFException {
        if (!mo1875(j)) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final long mo1886() throws EOFException {
        C0481 c0481;
        mo1884(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zMo1875 = mo1875(i2);
            c0481 = this.f8065;
            if (!zMo1875) {
                break;
            }
            byte bM1866 = c0481.m1866(i);
            if ((bM1866 < 48 || bM1866 > 57) && ((bM1866 < 97 || bM1866 > 102) && (bM1866 < 65 || bM1866 > 70))) {
                if (i != 0) {
                    break;
                }
                AbstractC2727.m4694(16);
                AbstractC2727.m4694(16);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM1866, 16)));
            }
            i = i2;
        }
        return c0481.mo1886();
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final InputStream mo1887() {
        return new C0480(this, 1);
    }

    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) {
        if (j >= 0) {
            if (!this.f8066) {
                C0481 c0482 = this.f8065;
                if (c0482.f2128 == 0 && this.f8064.read(c0482, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                    return -1L;
                }
                return c0482.read(c0481, Math.min(j, c0482.f2128));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
    }
}
