package p000;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0481 implements InterfaceC0485, InterfaceC0484, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2707 f2127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f2128;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0481)) {
            return false;
        }
        long j = this.f2128;
        C0481 c0481 = (C0481) obj;
        if (j != c0481.f2128) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C2707 c2707 = this.f2127;
        C2707 c2708 = c0481.f2127;
        int i = c2707.f8705;
        int i2 = c2708.f8705;
        long j2 = 0;
        while (j2 < this.f2128) {
            long jMin = Math.min(c2707.f8706 - i, c2708.f8706 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c2707.f8704[i] != c2708.f8704[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c2707.f8706) {
                c2707 = c2707.f8709;
                i = c2707.f8705;
            }
            if (i2 == c2708.f8706) {
                c2708 = c2708.f8709;
                i2 = c2708.f8705;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C2707 c2707 = this.f2127;
        if (c2707 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2707.f8706;
            for (int i3 = c2707.f8705; i3 < i2; i3++) {
                i = (i * 31) + c2707.f8704[i3];
            }
            c2707 = c2707.f8709;
        } while (c2707 != this.f2127);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p000.InterfaceC0485
    public final C2531 peek() {
        return new C2531(new C2388(this));
    }

    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f2128;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c0481.write(this, j);
        return j;
    }

    @Override // p000.InterfaceC0485
    public final byte readByte() throws EOFException {
        long j = this.f2128;
        if (j == 0) {
            throw new EOFException();
        }
        C2707 c2707 = this.f2127;
        int i = c2707.f8705;
        int i2 = c2707.f8706;
        int i3 = i + 1;
        byte b = c2707.f8704[i];
        this.f2128 = j - 1;
        if (i3 != i2) {
            c2707.f8705 = i3;
            return b;
        }
        this.f2127 = c2707.m4679();
        AbstractC2709.m4683(c2707);
        return b;
    }

    @Override // p000.InterfaceC0485
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // p000.InterfaceC0485
    public final int readInt() throws EOFException {
        long j = this.f2128;
        if (j < 4) {
            throw new EOFException();
        }
        C2707 c2707 = this.f2127;
        int i = c2707.f8705;
        int i2 = c2707.f8706;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c2707.f8704;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f2128 = j - 4;
        if (i5 != i2) {
            c2707.f8705 = i5;
            return i6;
        }
        this.f2127 = c2707.m4679();
        AbstractC2709.m4683(c2707);
        return i6;
    }

    @Override // p000.InterfaceC0485
    public final long readLong() throws EOFException {
        long j = this.f2128;
        if (j < 8) {
            throw new EOFException();
        }
        C2707 c2707 = this.f2127;
        int i = c2707.f8705;
        int i2 = c2707.f8706;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c2707.f8704;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f2128 = j - 8;
        if (i4 != i2) {
            c2707.f8705 = i4;
            return j3;
        }
        this.f2127 = c2707.m4679();
        AbstractC2709.m4683(c2707);
        return j3;
    }

    @Override // p000.InterfaceC0485
    public final short readShort() throws EOFException {
        long j = this.f2128;
        if (j < 2) {
            throw new EOFException();
        }
        C2707 c2707 = this.f2127;
        int i = c2707.f8705;
        int i2 = c2707.f8706;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c2707.f8704;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f2128 = j - 2;
        if (i5 == i2) {
            this.f2127 = c2707.m4679();
            AbstractC2709.m4683(c2707);
        } else {
            c2707.f8705 = i5;
        }
        return (short) i6;
    }

    @Override // p000.InterfaceC0485
    public final String readString(Charset charset) {
        return m1879(this.f2128, charset);
    }

    @Override // p000.InterfaceC0485
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C2707 c2707 = this.f2127;
            if (c2707 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c2707.f8706 - c2707.f8705);
            long j2 = iMin;
            this.f2128 -= j2;
            j -= j2;
            int i = c2707.f8705 + iMin;
            c2707.f8705 = i;
            if (i == c2707.f8706) {
                this.f2127 = c2707.m4679();
                AbstractC2709.m4683(c2707);
            }
        }
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        return C3459.NONE;
    }

    public final String toString() {
        long j = this.f2128;
        if (j <= 2147483647L) {
            return m1883((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2128).toString());
    }

    @Override // p000.InterfaceC2774
    public final void write(C0481 c0481, long j) {
        C2707 c2707M4684;
        if (c0481 == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0972.m2590(c0481.f2128, 0L, j);
        while (j > 0) {
            C2707 c2707 = c0481.f2127;
            int i = c2707.f8706 - c2707.f8705;
            if (j < i) {
                C2707 c2708 = this.f2127;
                C2707 c2709 = c2708 != null ? c2708.f8710 : null;
                if (c2709 != null && c2709.f8708) {
                    if ((((long) c2709.f8706) + j) - ((long) (c2709.f8707 ? 0 : c2709.f8705)) <= JSONWriter.MASK_WRITE_ENUMS_USING_NAME) {
                        c2707.m4682(c2709, (int) j);
                        c0481.f2128 -= j;
                        this.f2128 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    c2707M4684 = c2707.m4681();
                } else {
                    c2707M4684 = AbstractC2709.m4684();
                    byte[] bArr = c2707.f8704;
                    byte[] bArr2 = c2707M4684.f8704;
                    int i3 = c2707.f8705;
                    AbstractC0280.m1528(bArr, i3, i3 + i2, bArr2, 2);
                }
                c2707M4684.f8706 = c2707M4684.f8705 + i2;
                c2707.f8705 += i2;
                c2707.f8710.m4680(c2707M4684);
                c0481.f2127 = c2707M4684;
            }
            C2707 c27010 = c0481.f2127;
            long j2 = c27010.f8706 - c27010.f8705;
            c0481.f2127 = c27010.m4679();
            C2707 c27011 = this.f2127;
            if (c27011 == null) {
                this.f2127 = c27010;
                c27010.f8710 = c27010;
                c27010.f8709 = c27010;
            } else {
                c27011.f8710.m4680(c27010);
                C2707 c27012 = c27010.f8710;
                if (c27012 == c27010) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c27012.f8708) {
                    int i4 = c27010.f8706 - c27010.f8705;
                    if (i4 <= (8192 - c27012.f8706) + (c27012.f8707 ? 0 : c27012.f8705)) {
                        c27010.m4682(c27012, i4);
                        c27010.m4679();
                        AbstractC2709.m4683(c27010);
                    }
                }
            }
            c0481.f2128 -= j2;
            this.f2128 += j2;
            j -= j2;
        }
    }

    @Override // p000.InterfaceC0484
    public final /* bridge */ /* synthetic */ InterfaceC0484 writeByte(int i) {
        m1890(i);
        return this;
    }

    @Override // p000.InterfaceC0484
    public final /* bridge */ /* synthetic */ InterfaceC0484 writeInt(int i) {
        m1893(i);
        return this;
    }

    @Override // p000.InterfaceC0484
    public final /* bridge */ /* synthetic */ InterfaceC0484 writeShort(int i) {
        m1895(i);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1855() throws EOFException {
        skip(this.f2128);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0516 mo1856(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount: ").toString());
        }
        if (this.f2128 < j) {
            throw new EOFException();
        }
        if (j < JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) {
            return new C0516(m1878(j));
        }
        C0516 c0516M1883 = m1883((int) j);
        skip(j);
        return c0516M1883;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final byte[] mo1858() {
        return m1878(this.f2128);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0481 clone() {
        C0481 c0481 = new C0481();
        if (this.f2128 == 0) {
            return c0481;
        }
        C2707 c2707 = this.f2127;
        C2707 c2707M4681 = c2707.m4681();
        c0481.f2127 = c2707M4681;
        c2707M4681.f8710 = c2707M4681;
        c2707M4681.f8709 = c2707M4681;
        for (C2707 c2708 = c2707.f8709; c2708 != c2707; c2708 = c2708.f8709) {
            c2707M4681.f8710.m4680(c2708.m4681());
        }
        c0481.f2128 = this.f2128;
        return c0481;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean mo1860() {
        return this.f2128 == 0;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int mo1861(C2335 c2335) throws EOFException {
        int iM1052 = AbstractC0055.m1052(this, c2335, false);
        if (iM1052 == -1) {
            return -1;
        }
        skip(c2335.f7539[iM1052].mo1964());
        return iM1052;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1862(long j, C0481 c0481, long j2) {
        long j3 = j;
        AbstractC0972.m2590(this.f2128, j3, j2);
        if (j2 == 0) {
            return;
        }
        c0481.f2128 += j2;
        C2707 c2707 = this.f2127;
        while (true) {
            long j4 = c2707.f8706 - c2707.f8705;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c2707 = c2707.f8709;
        }
        C2707 c2708 = c2707;
        long j5 = j2;
        while (j5 > 0) {
            C2707 c2707M4681 = c2708.m4681();
            int i = c2707M4681.f8705 + ((int) j3);
            c2707M4681.f8705 = i;
            c2707M4681.f8706 = Math.min(i + ((int) j5), c2707M4681.f8706);
            C2707 c2709 = c0481.f2127;
            if (c2709 == null) {
                c2707M4681.f8710 = c2707M4681;
                c2707M4681.f8709 = c2707M4681;
                c0481.f2127 = c2707M4681;
            } else {
                c2709.f8710.m4680(c2707M4681);
            }
            j5 -= (long) (c2707M4681.f8706 - c2707M4681.f8705);
            c2708 = c2708.f8709;
            j3 = 0;
        }
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final long mo1863(InterfaceC2846 interfaceC2846) {
        long j = 0;
        while (true) {
            long j2 = interfaceC2846.read(this, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final long mo1865() throws EOFException {
        long j;
        char c;
        int i;
        byte b;
        long j2 = 0;
        if (this.f2128 == 0) {
            throw new EOFException();
        }
        long j3 = -7;
        long j4 = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            C2707 c2707 = this.f2127;
            byte[] bArr = c2707.f8704;
            int i3 = c2707.f8705;
            int i4 = c2707.f8706;
            while (true) {
                if (i3 >= i4) {
                    j = j2;
                    c = 0;
                    i = 1;
                    break;
                }
                c = 0;
                b = bArr[i3];
                i = 1;
                if (b >= 48 && b <= 57) {
                    int i5 = 48 - b;
                    if (j4 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j4 == -922337203685477580L && i5 < j3) {
                        break loop0;
                    }
                    j4 = (j4 * 10) + ((long) i5);
                } else {
                    j = j2;
                    if (b != 45 || i2 != 0) {
                        z2 = true;
                        break;
                    }
                    j3--;
                    z = true;
                }
                i3++;
                i2++;
                j2 = j;
            }
            if (i3 == i4) {
                this.f2127 = c2707.m4679();
                AbstractC2709.m4683(c2707);
            } else {
                c2707.f8705 = i3;
            }
            if (z2 || this.f2127 == null) {
                long j5 = this.f2128 - ((long) i2);
                this.f2128 = j5;
                if (i2 >= (z ? 2 : i)) {
                    return z ? j4 : -j4;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbM2803 = AbstractC1095.m2803(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                byte bM1866 = m1866(j);
                char[] cArr = AbstractC0738.f2831;
                char c2 = cArr[(bM1866 >> 4) & 15];
                char c3 = cArr[bM1866 & ek.m];
                char[] cArr2 = new char[2];
                cArr2[c] = c2;
                cArr2[i] = c3;
                sbM2803.append(new String(cArr2));
                throw new NumberFormatException(sbM2803.toString());
            }
            j2 = j;
        }
        C0481 c0481 = new C0481();
        c0481.m1891(j4);
        c0481.m1890(b);
        if (!z) {
            c0481.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(c0481.m1880()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final byte m1866(long j) {
        AbstractC0972.m2590(this.f2128, j, 1L);
        C2707 c2707 = this.f2127;
        c2707.getClass();
        long j2 = this.f2128;
        if (j2 - j < j) {
            while (j2 > j) {
                c2707 = c2707.f8710;
                j2 -= (long) (c2707.f8706 - c2707.f8705);
            }
            return c2707.f8704[(int) ((((long) c2707.f8705) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c2707.f8706;
            int i2 = c2707.f8705;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c2707.f8704[(int) ((((long) i2) + j) - j3)];
            }
            c2707 = c2707.f8709;
            j3 = j4;
        }
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String mo1867(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM1868 = m1868(0L, j2, (byte) 10);
        if (jM1868 != -1) {
            return AbstractC0055.m1051(this, jM1868);
        }
        if (j2 < this.f2128 && m1866(j2 - 1) == 13 && m1866(j2) == 10) {
            return AbstractC0055.m1051(this, j2);
        }
        C0481 c0481 = new C0481();
        m1862(0L, c0481, Math.min(32, this.f2128));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2128, j) + " content=" + c0481.mo1856(c0481.f2128).mo1965() + (char) 8230);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final long m1868(long j, long j2, byte b) {
        C2707 c2707;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f2128 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f2128;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c2707 = this.f2127) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c2707 = c2707.f8710;
                j4 -= (long) (c2707.f8706 - c2707.f8705);
            }
            while (j4 < j2) {
                byte[] bArr = c2707.f8704;
                int iMin = (int) Math.min(c2707.f8706, (((long) c2707.f8705) + j2) - j4);
                for (int i = (int) ((((long) c2707.f8705) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c2707.f8705)) + j4;
                    }
                }
                j4 += (long) (c2707.f8706 - c2707.f8705);
                c2707 = c2707.f8709;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c2707.f8706 - c2707.f8705)) + j3;
            if (j5 > j) {
                break;
            }
            c2707 = c2707.f8709;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c2707.f8704;
            int iMin2 = (int) Math.min(c2707.f8706, (((long) c2707.f8705) + j2) - j3);
            for (int i2 = (int) ((((long) c2707.f8705) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c2707.f8705)) + j3;
                }
            }
            j3 += (long) (c2707.f8706 - c2707.f8705);
            c2707 = c2707.f8709;
            j = j3;
        }
        return -1L;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC0484 mo1869(String str) {
        m1898(str);
        return this;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void mo1870(C0481 c0481, long j) throws EOFException {
        long j2 = this.f2128;
        if (j2 >= j) {
            c0481.write(this, j);
        } else {
            c0481.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC0484 mo1871(C0516 c0516) {
        m1889(c0516);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final long m1872(C0516 c0516) {
        int i;
        int i2;
        C2707 c2707 = this.f2127;
        if (c2707 == null) {
            return -1L;
        }
        long j = this.f2128;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                c2707 = c2707.f8710;
                j -= (long) (c2707.f8706 - c2707.f8705);
            }
            if (c0516.mo1964() == 2) {
                byte bMo1967 = c0516.mo1967(0);
                byte bMo1968 = c0516.mo1967(1);
                while (j < this.f2128) {
                    byte[] bArr = c2707.f8704;
                    i = (int) ((((long) c2707.f8705) + j2) - j);
                    int i3 = c2707.f8706;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (c2707.f8706 - c2707.f8705)) + j;
                            c2707 = c2707.f8709;
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bMo1967 || b == bMo1968) {
                                i2 = c2707.f8705;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrMo1966 = c0516.mo1966();
            while (j < this.f2128) {
                byte[] bArr2 = c2707.f8704;
                i = (int) ((((long) c2707.f8705) + j2) - j);
                int i4 = c2707.f8706;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrMo1966.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrMo1966[i5]) {
                                i2 = c2707.f8705;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (c2707.f8706 - c2707.f8705)) + j;
                        c2707 = c2707.f8709;
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (c2707.f8706 - c2707.f8705)) + j;
            if (j3 > 0) {
                break;
            }
            c2707 = c2707.f8709;
            j = j3;
        }
        if (c0516.mo1964() == 2) {
            byte bMo1969 = c0516.mo1967(0);
            byte bMo19610 = c0516.mo1967(1);
            while (j < this.f2128) {
                byte[] bArr3 = c2707.f8704;
                i = (int) ((((long) c2707.f8705) + j2) - j);
                int i6 = c2707.f8706;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (c2707.f8706 - c2707.f8705)) + j;
                        c2707 = c2707.f8709;
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bMo1969 || b3 == bMo19610) {
                            i2 = c2707.f8705;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrMo1967 = c0516.mo1966();
        while (j < this.f2128) {
            byte[] bArr4 = c2707.f8704;
            i = (int) ((((long) c2707.f8705) + j2) - j);
            int i7 = c2707.f8706;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrMo1967.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrMo1967[i8]) {
                            i2 = c2707.f8705;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (c2707.f8706 - c2707.f8705)) + j;
                    c2707 = c2707.f8709;
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC0484 mo1873(long j) {
        m1892(j);
        return this;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C0516 mo1874() {
        return mo1856(this.f2128);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final boolean mo1875(long j) {
        return this.f2128 >= j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final C0479 m1876(C0479 c0479) {
        byte[] bArr = AbstractC0055.f1043;
        if (c0479 == AbstractC0972.f3528) {
            c0479 = new C0479();
        }
        if (c0479.f2118 != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0479.f2118 = this;
        c0479.f2119 = true;
        return c0479;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final String mo1877() {
        return mo1867(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final byte[] m1878(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount: ").toString());
        }
        if (this.f2128 < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final String m1879(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount: ").toString());
        }
        if (this.f2128 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C2707 c2707 = this.f2127;
        int i = c2707.f8705;
        if (((long) i) + j > c2707.f8706) {
            return new String(m1878(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c2707.f8704, i, i2, charset);
        int i3 = c2707.f8705 + i2;
        c2707.f8705 = i3;
        this.f2128 -= j;
        if (i3 == c2707.f8706) {
            this.f2127 = c2707.m4679();
            AbstractC2709.m4683(c2707);
        }
        return str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final String m1880() {
        return m1879(this.f2128, AbstractC0580.UTF_8);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final boolean mo1881(long j, C0516 c0516) {
        int iMo1964 = c0516.mo1964();
        if (j >= 0 && iMo1964 >= 0 && this.f2128 - j >= iMo1964 && c0516.mo1964() >= iMo1964) {
            for (int i = 0; i < iMo1964; i++) {
                if (m1866(((long) i) + j) == c0516.mo1967(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC0484 mo1882(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final C0516 m1883(int i) {
        if (i == 0) {
            return C0516.f2200;
        }
        AbstractC0972.m2590(this.f2128, 0L, i);
        C2707 c2707 = this.f2127;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c2707.f8706;
            int i6 = c2707.f8705;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c2707 = c2707.f8709;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C2707 c2708 = this.f2127;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c2708.f8704;
            i2 += c2708.f8706 - c2708.f8705;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c2708.f8705;
            c2708.f8707 = true;
            i7++;
            c2708 = c2708.f8709;
        }
        return new C2710(bArr, iArr);
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void mo1884(long j) throws EOFException {
        if (this.f2128 < j) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC0484 mo1885(long j) {
        m1891(j);
        return this;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final long mo1886() throws EOFException {
        int i;
        if (this.f2128 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C2707 c2707 = this.f2127;
            byte[] bArr = c2707.f8704;
            int i3 = c2707.f8705;
            int i4 = c2707.f8706;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b + JSONB.Constants.BC_INT64_BYTE_ZERO;
                } else if (b >= 97 && b <= 102) {
                    i = b + JSONB.Constants.BC_LOCAL_DATE;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC0738.f2831;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & ek.m]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C0481 c0481 = new C0481();
                    c0481.m1892(j);
                    c0481.m1890(b);
                    throw new NumberFormatException("Number too large: ".concat(c0481.m1880()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f2127 = c2707.m4679();
                AbstractC2709.m4683(c2707);
            } else {
                c2707.f8705 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f2127 != null);
        this.f2128 -= (long) i2;
        return j;
    }

    @Override // p000.InterfaceC0485
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final InputStream mo1887() {
        return new C0480(this, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final C2707 m1888(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C2707 c2707 = this.f2127;
        if (c2707 == null) {
            C2707 c2707M4684 = AbstractC2709.m4684();
            this.f2127 = c2707M4684;
            c2707M4684.f8710 = c2707M4684;
            c2707M4684.f8709 = c2707M4684;
            return c2707M4684;
        }
        C2707 c2708 = c2707.f8710;
        if (c2708.f8706 + i <= 8192 && c2708.f8708) {
            return c2708;
        }
        C2707 c2707M4685 = AbstractC2709.m4684();
        c2708.m4680(c2707M4685);
        return c2707M4685;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void m1889(C0516 c0516) {
        c0516.mo1972(c0516.mo1964(), this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m1890(int i) {
        C2707 c2707M1888 = m1888(1);
        byte[] bArr = c2707M1888.f8704;
        int i2 = c2707M1888.f8706;
        c2707M1888.f8706 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f2128++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m1891(long j) {
        if (j == 0) {
            m1890(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m1897(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C2707 c2707M1888 = m1888(i);
        byte[] bArr = c2707M1888.f8704;
        int i2 = c2707M1888.f8706 + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC0055.f1043[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c2707M1888.f8706 += i;
        this.f2128 += (long) i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final void m1892(long j) {
        if (j == 0) {
            m1890(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C2707 c2707M1888 = m1888(i);
        byte[] bArr = c2707M1888.f8704;
        int i2 = c2707M1888.f8706;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0055.f1043[(int) (15 & j)];
            j >>>= 4;
        }
        c2707M1888.f8706 += i;
        this.f2128 += (long) i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m1893(int i) {
        C2707 c2707M1888 = m1888(4);
        byte[] bArr = c2707M1888.f8704;
        int i2 = c2707M1888.f8706;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c2707M1888.f8706 = i2 + 4;
        this.f2128 += 4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final void m1894(long j) {
        C2707 c2707M1888 = m1888(8);
        byte[] bArr = c2707M1888.f8704;
        int i = c2707M1888.f8706;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c2707M1888.f8706 = i + 8;
        this.f2128 += 8;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void m1895(int i) {
        C2707 c2707M1888 = m1888(2);
        byte[] bArr = c2707M1888.f8704;
        int i2 = c2707M1888.f8706;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c2707M1888.f8706 = i2 + 2;
        this.f2128 += 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m1896(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC2844.m4779(i2, "endIndex < beginIndex: ", " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM2802 = AbstractC1095.m2802(i2, "endIndex > string.length: ", " > ");
            sbM2802.append(str.length());
            throw new IllegalArgumentException(sbM2802.toString().toString());
        }
        if (charset.equals(AbstractC0580.UTF_8)) {
            m1897(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final void m1897(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC2844.m4779(i2, "endIndex < beginIndex: ", " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM2802 = AbstractC1095.m2802(i2, "endIndex > string.length: ", " > ");
            sbM2802.append(str.length());
            throw new IllegalArgumentException(sbM2802.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C2707 c2707M1888 = m1888(1);
                byte[] bArr = c2707M1888.f8704;
                int i3 = c2707M1888.f8706 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c2707M1888.f8706;
                int i6 = (i3 + i) - i5;
                c2707M1888.f8706 = i5 + i6;
                this.f2128 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C2707 c2707M1889 = m1888(2);
                    byte[] bArr2 = c2707M1889.f8704;
                    int i7 = c2707M1889.f8706;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c2707M1889.f8706 = i7 + 2;
                    this.f2128 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C2707 c2707M18810 = m1888(3);
                    byte[] bArr3 = c2707M18810.f8704;
                    int i8 = c2707M18810.f8706;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c2707M18810.f8706 = i8 + 3;
                    this.f2128 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m1890(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C2707 c2707M18811 = m1888(4);
                        byte[] bArr4 = c2707M18811.f8704;
                        int i11 = c2707M18811.f8706;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c2707M18811.f8706 = i11 + 4;
                        this.f2128 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final void m1898(String str) {
        m1897(0, str.length(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final void m1899(int i) {
        String str;
        if (i < 128) {
            m1890(i);
            return;
        }
        if (i < 2048) {
            C2707 c2707M1888 = m1888(2);
            byte[] bArr = c2707M1888.f8704;
            int i2 = c2707M1888.f8706;
            bArr[i2] = (byte) ((i >> 6) | Opcodes.CHECKCAST);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c2707M1888.f8706 = i2 + 2;
            this.f2128 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m1890(63);
            return;
        }
        if (i < 65536) {
            C2707 c2707M1889 = m1888(3);
            byte[] bArr2 = c2707M1889.f8704;
            int i3 = c2707M1889.f8706;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c2707M1889.f8706 = i3 + 3;
            this.f2128 += 3;
            return;
        }
        if (i <= 1114111) {
            C2707 c2707M18810 = m1888(4);
            byte[] bArr3 = c2707M18810.f8704;
            int i4 = c2707M18810.f8706;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c2707M18810.f8706 = i4 + 4;
            this.f2128 += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC0738.f2831;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            AbstractC1468.m3300(i5, 8, 8);
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C2707 c2707 = this.f2127;
        if (c2707 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c2707.f8706 - c2707.f8705);
        byteBuffer.put(c2707.f8704, c2707.f8705, iMin);
        int i = c2707.f8705 + iMin;
        c2707.f8705 = i;
        this.f2128 -= (long) iMin;
        if (i == c2707.f8706) {
            this.f2127 = c2707.m4679();
            AbstractC2709.m4683(c2707);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC0972.m2590(bArr.length, i, i2);
        C2707 c2707 = this.f2127;
        if (c2707 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c2707.f8706 - c2707.f8705);
        byte[] bArr2 = c2707.f8704;
        int i3 = c2707.f8705;
        AbstractC0280.m1524(bArr2, i, i3, bArr, i3 + iMin);
        int i4 = c2707.f8705 + iMin;
        c2707.f8705 = i4;
        this.f2128 -= (long) iMin;
        if (i4 == c2707.f8706) {
            this.f2127 = c2707.m4679();
            AbstractC2709.m4683(c2707);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.InterfaceC2774
    public final void close() {
    }

    @Override // p000.InterfaceC0484, p000.InterfaceC2774, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.InterfaceC0485, p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0481 mo1854() {
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0484 mo1857() {
        return this;
    }

    @Override // p000.InterfaceC0484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final InterfaceC0484 mo1864() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C2707 c2707M1888 = m1888(1);
            int iMin = Math.min(i, 8192 - c2707M1888.f8706);
            byteBuffer.get(c2707M1888.f8704, c2707M1888.f8706, iMin);
            i -= iMin;
            c2707M1888.f8706 += iMin;
        }
        this.f2128 += (long) iRemaining;
        return iRemaining;
    }

    @Override // p000.InterfaceC0484
    public final InterfaceC0484 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        AbstractC0972.m2590(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2707 c2707M1888 = m1888(1);
            int iMin = Math.min(i3 - i, 8192 - c2707M1888.f8706);
            int i4 = i + iMin;
            AbstractC0280.m1524(bArr, c2707M1888.f8706, i, c2707M1888.f8704, i4);
            c2707M1888.f8706 += iMin;
            i = i4;
        }
        this.f2128 += j;
    }
}
