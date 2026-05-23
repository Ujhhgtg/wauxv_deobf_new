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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0504 implements InterfaceC0508, InterfaceC0507, Cloneable, ByteChannel {

    public C2646 f2171;

    public long f2172;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0504)) {
            return false;
        }
        long j = this.f2172;
        C0504 c0504 = (C0504) obj;
        if (j != c0504.f2172) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C2646 c2646 = this.f2171;
        C2646 c2647 = c0504.f2171;
        int i = c2646.f8540;
        int i2 = c2647.f8540;
        long j2 = 0;
        while (j2 < this.f2172) {
            long jMin = Math.min(c2646.f8541 - i, c2647.f8541 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c2646.f8539[i] != c2647.f8539[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c2646.f8541) {
                c2646 = c2646.f8544;
                i = c2646.f8540;
            }
            if (i2 == c2647.f8541) {
                c2647 = c2647.f8544;
                i2 = c2647.f8540;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C2646 c2646 = this.f2171;
        if (c2646 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2646.f8541;
            for (int i3 = c2646.f8540; i3 < i2; i3++) {
                i = (i * 31) + c2646.f8539[i3];
            }
            c2646 = c2646.f8544;
        } while (c2646 != this.f2171);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p000.InterfaceC0508
    public final C2477 peek() {
        return new C2477(new C2343(this));
    }

    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f2172;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c0504.write(this, j);
        return j;
    }

    @Override // p000.InterfaceC0508
    public final byte readByte() throws EOFException {
        long j = this.f2172;
        if (j == 0) {
            throw new EOFException();
        }
        C2646 c2646 = this.f2171;
        int i = c2646.f8540;
        int i2 = c2646.f8541;
        int i3 = i + 1;
        byte b = c2646.f8539[i];
        this.f2172 = j - 1;
        if (i3 != i2) {
            c2646.f8540 = i3;
            return b;
        }
        this.f2171 = c2646.m4645();
        AbstractC2648.m4649(c2646);
        return b;
    }

    @Override // p000.InterfaceC0508
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

    @Override // p000.InterfaceC0508
    public final int readInt() throws EOFException {
        long j = this.f2172;
        if (j < 4) {
            throw new EOFException();
        }
        C2646 c2646 = this.f2171;
        int i = c2646.f8540;
        int i2 = c2646.f8541;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c2646.f8539;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f2172 = j - 4;
        if (i5 != i2) {
            c2646.f8540 = i5;
            return i6;
        }
        this.f2171 = c2646.m4645();
        AbstractC2648.m4649(c2646);
        return i6;
    }

    @Override // p000.InterfaceC0508
    public final long readLong() throws EOFException {
        long j = this.f2172;
        if (j < 8) {
            throw new EOFException();
        }
        C2646 c2646 = this.f2171;
        int i = c2646.f8540;
        int i2 = c2646.f8541;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c2646.f8539;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f2172 = j - 8;
        if (i4 != i2) {
            c2646.f8540 = i4;
            return j3;
        }
        this.f2171 = c2646.m4645();
        AbstractC2648.m4649(c2646);
        return j3;
    }

    @Override // p000.InterfaceC0508
    public final short readShort() throws EOFException {
        long j = this.f2172;
        if (j < 2) {
            throw new EOFException();
        }
        C2646 c2646 = this.f2171;
        int i = c2646.f8540;
        int i2 = c2646.f8541;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c2646.f8539;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f2172 = j - 2;
        if (i5 == i2) {
            this.f2171 = c2646.m4645();
            AbstractC2648.m4649(c2646);
        } else {
            c2646.f8540 = i5;
        }
        return (short) i6;
    }

    @Override // p000.InterfaceC0508
    public final String readString(Charset charset) {
        return m1785(this.f2172, charset);
    }

    @Override // p000.InterfaceC0508
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C2646 c2646 = this.f2171;
            if (c2646 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c2646.f8541 - c2646.f8540);
            long j2 = iMin;
            this.f2172 -= j2;
            j -= j2;
            int i = c2646.f8540 + iMin;
            c2646.f8540 = i;
            if (i == c2646.f8541) {
                this.f2171 = c2646.m4645();
                AbstractC2648.m4649(c2646);
            }
        }
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        return C3400.NONE;
    }

    public final String toString() {
        long j = this.f2172;
        if (j <= 2147483647L) {
            return m1789((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2172).toString());
    }

    @Override // p000.InterfaceC2713
    public final void write(C0504 c0504, long j) {
        C2646 c2646M4650;
        if (c0504 == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0968.m2469(c0504.f2172, 0L, j);
        while (j > 0) {
            C2646 c2646 = c0504.f2171;
            int i = c2646.f8541 - c2646.f8540;
            if (j < i) {
                C2646 c2647 = this.f2171;
                C2646 c2648 = c2647 != null ? c2647.f8545 : null;
                if (c2648 != null && c2648.f8543) {
                    if ((((long) c2648.f8541) + j) - ((long) (c2648.f8542 ? 0 : c2648.f8540)) <= 8192L) {
                        c2646.m4648(c2648, (int) j);
                        c0504.f2172 -= j;
                        this.f2172 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (false || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    c2646M4650 = c2646.m4647();
                } else {
                    c2646M4650 = AbstractC2648.m4650();
                    byte[] bArr = c2646.f8539;
                    byte[] bArr2 = c2646M4650.f8539;
                    int i3 = c2646.f8540;
                    AbstractC0270.m1382(bArr, i3, i3 + i2, bArr2, 2);
                }
                c2646M4650.f8541 = c2646M4650.f8540 + i2;
                c2646.f8540 += i2;
                c2646.f8545.m4646(c2646M4650);
                c0504.f2171 = c2646M4650;
            }
            C2646 c2649 = c0504.f2171;
            long j2 = c2649.f8541 - c2649.f8540;
            c0504.f2171 = c2649.m4645();
            C2646 c26410 = this.f2171;
            if (c26410 == null) {
                this.f2171 = c2649;
                c2649.f8545 = c2649;
                c2649.f8544 = c2649;
            } else {
                c26410.f8545.m4646(c2649);
                C2646 c26411 = c2649.f8545;
                if (c26411 == c2649) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c26411.f8543) {
                    int i4 = c2649.f8541 - c2649.f8540;
                    if (i4 <= (8192 - c26411.f8541) + (c26411.f8542 ? 0 : c26411.f8540)) {
                        c2649.m4648(c26411, i4);
                        c2649.m4645();
                        AbstractC2648.m4649(c2649);
                    }
                }
            }
            c0504.f2172 -= j2;
            this.f2172 += j2;
            j -= j2;
        }
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 writeByte(int i) {
        m1796(i);
        return this;
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 writeInt(int i) {
        m1799(i);
        return this;
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 writeShort(int i) {
        m1801(i);
        return this;
    }

    public final void m1761() throws EOFException {
        skip(this.f2172);
    }

    @Override // p000.InterfaceC0508
    public final C0539 mo1762(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount: ").toString());
        }
        if (this.f2172 < j) {
            throw new EOFException();
        }
        if (j < 4096L) {
            return new C0539(m1784(j));
        }
        C0539 c0539M1789 = m1789((int) j);
        skip(j);
        return c0539M1789;
    }

    @Override // p000.InterfaceC0508
    public final byte[] mo1764() {
        return m1784(this.f2172);
    }

    public final C0504 clone() {
        C0504 c0504 = new C0504();
        if (this.f2172 == 0) {
            return c0504;
        }
        C2646 c2646 = this.f2171;
        C2646 c2646M4647 = c2646.m4647();
        c0504.f2171 = c2646M4647;
        c2646M4647.f8545 = c2646M4647;
        c2646M4647.f8544 = c2646M4647;
        for (C2646 c2647 = c2646.f8544; c2647 != c2646; c2647 = c2647.f8544) {
            c2646M4647.f8545.m4646(c2647.m4647());
        }
        c0504.f2172 = this.f2172;
        return c0504;
    }

    @Override // p000.InterfaceC0508
    public final boolean mo1766() {
        return this.f2172 == 0;
    }

    @Override // p000.InterfaceC0508
    public final int mo1767(C2302 c2302) throws EOFException {
        int iM908 = AbstractC0048.m908(this, c2302, false);
        if (iM908 == -1) {
            return -1;
        }
        skip(c2302.f7417[iM908].mo1870());
        return iM908;
    }

    public final void m1768(long j, C0504 c0504, long j2) {
        long j3 = j;
        AbstractC0968.m2469(this.f2172, j3, j2);
        if (j2 == 0) {
            return;
        }
        c0504.f2172 += j2;
        C2646 c2646 = this.f2171;
        while (true) {
            long j4 = c2646.f8541 - c2646.f8540;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c2646 = c2646.f8544;
        }
        C2646 c2647 = c2646;
        long j5 = j2;
        while (j5 > 0) {
            C2646 c2646M4647 = c2647.m4647();
            int i = c2646M4647.f8540 + ((int) j3);
            c2646M4647.f8540 = i;
            c2646M4647.f8541 = Math.min(i + ((int) j5), c2646M4647.f8541);
            C2646 c2648 = c0504.f2171;
            if (c2648 == null) {
                c2646M4647.f8545 = c2646M4647;
                c2646M4647.f8544 = c2646M4647;
                c0504.f2171 = c2646M4647;
            } else {
                c2648.f8545.m4646(c2646M4647);
            }
            j5 -= (long) (c2646M4647.f8541 - c2646M4647.f8540);
            c2647 = c2647.f8544;
            j3 = 0;
        }
    }

    @Override // p000.InterfaceC0507
    public final long mo1769(InterfaceC2786 interfaceC2786) {
        long j = 0;
        while (true) {
            long j2 = interfaceC2786.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // p000.InterfaceC0508
    public final long mo1771() throws EOFException {
        long j;
        char c;
        int i;
        byte b;
        long j2 = 0;
        if (this.f2172 == 0) {
            throw new EOFException();
        }
        long j3 = -7;
        long j4 = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            C2646 c2646 = this.f2171;
            byte[] bArr = c2646.f8539;
            int i3 = c2646.f8540;
            int i4 = c2646.f8541;
            while (true) {
                if (i3 >= i4) {
                    j = 0L;
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
                    j = 0L;
                    if (j4 == -922337203685477580L && i5 < j3) {
                        break loop0;
                    }
                    j4 = (j4 * 10) + ((long) i5);
                } else {
                    j = 0L;
                    if (b != 45 || i2 != 0) {
                        z2 = true;
                        break;
                    }
                    j3--;
                    z = true;
                }
                i3++;
                i2++;
                j2 = 0L;
            }
            if (i3 == i4) {
                this.f2171 = c2646.m4645();
                AbstractC2648.m4649(c2646);
            } else {
                c2646.f8540 = i3;
            }
            if (z2 || this.f2171 == null) {
                long j5 = this.f2172 - ((long) i2);
                this.f2172 = j5;
                if (i2 >= (z ? 2 : 1)) {
                    return z ? j4 : -j4;
                }
                if (j5 == 0L) {
                    throw new EOFException();
                }
                StringBuilder sbM2788 = AbstractC1194.m2788(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                byte bM1772 = m1772(0L);
                char[] cArr = AbstractC0743.f2837;
                char c2 = cArr[(bM1772 >> 4) & 15];
                char c3 = cArr[bM1772 & 15];
                char[] cArr2 = new char[2];
                cArr2[0] = c2;
                cArr2[1] = c3;
                sbM2788.append(new String(cArr2));
                throw new NumberFormatException(sbM2788.toString());
            }
            j2 = 0L;
        }
        C0504 c0504 = new C0504();
        c0504.m1797(j4);
        c0504.m1796(b);
        if (!z) {
            c0504.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(c0504.m1786()));
    }

    public final byte m1772(long j) {
        AbstractC0968.m2469(this.f2172, j, 1L);
        C2646 c2646 = this.f2171;
        
        long j2 = this.f2172;
        if (j2 - j < j) {
            while (j2 > j) {
                c2646 = c2646.f8545;
                j2 -= (long) (c2646.f8541 - c2646.f8540);
            }
            return c2646.f8539[(int) ((((long) c2646.f8540) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c2646.f8541;
            int i2 = c2646.f8540;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c2646.f8539[(int) ((((long) i2) + j) - j3)];
            }
            c2646 = c2646.f8544;
            j3 = j4;
        }
    }

    @Override // p000.InterfaceC0508
    public final String mo1773(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "limit < 0: ").toString());
        }
        long j2 = j != 9223372036854775807L ? j + 1 : 9223372036854775807L;
        long jM1774 = m1774(0L, j2, (byte) 10);
        if (jM1774 != -1) {
            return AbstractC0048.m907(this, jM1774);
        }
        if (j2 < this.f2172 && m1772(j2 - 1) == 13 && m1772(j2) == 10) {
            return AbstractC0048.m907(this, j2);
        }
        C0504 c0504 = new C0504();
        m1768(0L, c0504, Math.min(32, this.f2172));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2172, j) + " content=" + c0504.mo1762(c0504.f2172).mo1871() + (char) 8230);
    }

    public final long m1774(long j, long j2, byte b) {
        C2646 c2646;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f2172 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f2172;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c2646 = this.f2171) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c2646 = c2646.f8545;
                j4 -= (long) (c2646.f8541 - c2646.f8540);
            }
            while (j4 < j2) {
                byte[] bArr = c2646.f8539;
                int iMin = (int) Math.min(c2646.f8541, (((long) c2646.f8540) + j2) - j4);
                for (int i = (int) ((((long) c2646.f8540) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c2646.f8540)) + j4;
                    }
                }
                j4 += (long) (c2646.f8541 - c2646.f8540);
                c2646 = c2646.f8544;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c2646.f8541 - c2646.f8540)) + j3;
            if (j5 > j) {
                break;
            }
            c2646 = c2646.f8544;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c2646.f8539;
            int iMin2 = (int) Math.min(c2646.f8541, (((long) c2646.f8540) + j2) - j3);
            for (int i2 = (int) ((((long) c2646.f8540) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c2646.f8540)) + j3;
                }
            }
            j3 += (long) (c2646.f8541 - c2646.f8540);
            c2646 = c2646.f8544;
            j = j3;
        }
        return -1L;
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 mo1775(String str) {
        m1804(str);
        return this;
    }

    @Override // p000.InterfaceC0508
    public final void mo1776(C0504 c0504, long j) throws EOFException {
        long j2 = this.f2172;
        if (j2 >= j) {
            c0504.write(this, j);
        } else {
            c0504.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 mo1777(C0539 c0539) {
        m1795(c0539);
        return this;
    }

    public final long m1778(C0539 c0539) {
        int i;
        int i2;
        C2646 c2646 = this.f2171;
        if (c2646 == null) {
            return -1L;
        }
        long j = this.f2172;
        long j2 = 0;
        if (j < 0) {
            while (false) {
                c2646 = c2646.f8545;
                j -= (long) (c2646.f8541 - c2646.f8540);
            }
            if (c0539.mo1870() == 2) {
                byte bMo1873 = c0539.mo1873(0);
                byte bMo1874 = c0539.mo1873(1);
                while (j < this.f2172) {
                    byte[] bArr = c2646.f8539;
                    i = (int) ((((long) c2646.f8540) + 0L) - j);
                    int i3 = c2646.f8541;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (c2646.f8541 - c2646.f8540)) + j;
                            c2646 = c2646.f8544;
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bMo1873 || b == bMo1874) {
                                i2 = c2646.f8540;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrMo1872 = c0539.mo1872();
            while (j < this.f2172) {
                byte[] bArr2 = c2646.f8539;
                i = (int) ((((long) c2646.f8540) + 0L) - j);
                int i4 = c2646.f8541;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrMo1872.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrMo1872[i5]) {
                                i2 = c2646.f8540;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (c2646.f8541 - c2646.f8540)) + j;
                        c2646 = c2646.f8544;
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (c2646.f8541 - c2646.f8540)) + j;
            if (j3 > 0) {
                break;
            }
            c2646 = c2646.f8544;
            j = j3;
        }
        if (c0539.mo1870() == 2) {
            byte bMo1875 = c0539.mo1873(0);
            byte bMo1876 = c0539.mo1873(1);
            while (j < this.f2172) {
                byte[] bArr3 = c2646.f8539;
                i = (int) ((((long) c2646.f8540) + 0L) - j);
                int i6 = c2646.f8541;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (c2646.f8541 - c2646.f8540)) + j;
                        c2646 = c2646.f8544;
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bMo1875 || b3 == bMo1876) {
                            i2 = c2646.f8540;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrMo1873 = c0539.mo1872();
        while (j < this.f2172) {
            byte[] bArr4 = c2646.f8539;
            i = (int) ((((long) c2646.f8540) + 0L) - j);
            int i7 = c2646.f8541;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrMo1873.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrMo1873[i8]) {
                            i2 = c2646.f8540;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (c2646.f8541 - c2646.f8540)) + j;
                    c2646 = c2646.f8544;
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 mo1779(long j) {
        m1798(j);
        return this;
    }

    @Override // p000.InterfaceC0508
    public final C0539 mo1780() {
        return mo1762(this.f2172);
    }

    @Override // p000.InterfaceC0508
    public final boolean mo1781(long j) {
        return this.f2172 >= j;
    }

    public final C0502 m1782(C0502 c0502) {
        byte[] bArr = AbstractC0048.f978;
        if (c0502 == AbstractC0968.f3511) {
            c0502 = new C0502();
        }
        if (c0502.f2162 != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0502.f2162 = this;
        c0502.f2163 = true;
        return c0502;
    }

    @Override // p000.InterfaceC0508
    public final String mo1783() {
        return mo1773(9223372036854775807L);
    }

    public final byte[] m1784(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount: ").toString());
        }
        if (this.f2172 < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final String m1785(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount: ").toString());
        }
        if (this.f2172 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C2646 c2646 = this.f2171;
        int i = c2646.f8540;
        if (((long) i) + j > c2646.f8541) {
            return new String(m1784(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c2646.f8539, i, i2, charset);
        int i3 = c2646.f8540 + i2;
        c2646.f8540 = i3;
        this.f2172 -= j;
        if (i3 == c2646.f8541) {
            this.f2171 = c2646.m4645();
            AbstractC2648.m4649(c2646);
        }
        return str;
    }

    public final String m1786() {
        return m1785(this.f2172, AbstractC0599.f2413);
    }

    @Override // p000.InterfaceC0508
    public final boolean mo1787(long j, C0539 c0539) {
        int iMo1870 = c0539.mo1870();
        if (j >= 0 && iMo1870 >= 0 && this.f2172 - j >= iMo1870 && c0539.mo1870() >= iMo1870) {
            for (int i = 0; i < iMo1870; i++) {
                if (m1772(((long) i) + j) == c0539.mo1873(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 mo1788(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    public final C0539 m1789(int i) {
        if (i == 0) {
            return C0539.f2244;
        }
        AbstractC0968.m2469(this.f2172, 0L, i);
        C2646 c2646 = this.f2171;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c2646.f8541;
            int i6 = c2646.f8540;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c2646 = c2646.f8544;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C2646 c2647 = this.f2171;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c2647.f8539;
            i2 += c2647.f8541 - c2647.f8540;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c2647.f8540;
            c2647.f8542 = true;
            i7++;
            c2647 = c2647.f8544;
        }
        return new C2649(bArr, iArr);
    }

    @Override // p000.InterfaceC0508
    public final void mo1790(long j) throws EOFException {
        if (this.f2172 < j) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0507
    public final /* bridge */ /* synthetic */ InterfaceC0507 mo1791(long j) {
        m1797(j);
        return this;
    }

    @Override // p000.InterfaceC0508
    public final long mo1792() throws EOFException {
        int i;
        if (this.f2172 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C2646 c2646 = this.f2171;
            byte[] bArr = c2646.f8539;
            int i3 = c2646.f8540;
            int i4 = c2646.f8541;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b + -48;
                } else if (b >= 97 && b <= 102) {
                    i = b + -87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC0743.f2837;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C0504 c0504 = new C0504();
                    c0504.m1798(j);
                    c0504.m1796(b);
                    throw new NumberFormatException("Number too large: ".concat(c0504.m1786()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f2171 = c2646.m4645();
                AbstractC2648.m4649(c2646);
            } else {
                c2646.f8540 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f2171 != null);
        this.f2172 -= (long) i2;
        return j;
    }

    @Override // p000.InterfaceC0508
    public final InputStream mo1793() {
        return new C0503(this, 0);
    }

    public final C2646 m1794(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C2646 c2646 = this.f2171;
        if (c2646 == null) {
            C2646 c2646M4650 = AbstractC2648.m4650();
            this.f2171 = c2646M4650;
            c2646M4650.f8545 = c2646M4650;
            c2646M4650.f8544 = c2646M4650;
            return c2646M4650;
        }
        C2646 c2647 = c2646.f8545;
        if (c2647.f8541 + i <= 8192 && c2647.f8543) {
            return c2647;
        }
        C2646 c2646M4651 = AbstractC2648.m4650();
        c2647.m4646(c2646M4651);
        return c2646M4651;
    }

    public final void m1795(C0539 c0539) {
        c0539.mo1878(c0539.mo1870(), this);
    }

    public final void m1796(int i) {
        C2646 c2646M1794 = m1794(1);
        byte[] bArr = c2646M1794.f8539;
        int i2 = c2646M1794.f8541;
        c2646M1794.f8541 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f2172++;
    }

    public final void m1797(long j) {
        if (j == 0) {
            m1796(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m1803(0, 20, "-9223372036854775808");
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
            if (j < 10000000000L) {
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
        C2646 c2646M1794 = m1794(i);
        byte[] bArr = c2646M1794.f8539;
        int i2 = c2646M1794.f8541 + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC0048.f978[(int) (j % 10L)];
            j /= 10L;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c2646M1794.f8541 += i;
        this.f2172 += (long) i;
    }

    public final void m1798(long j) {
        if (j == 0) {
            m1796(48);
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
        C2646 c2646M1794 = m1794(i);
        byte[] bArr = c2646M1794.f8539;
        int i2 = c2646M1794.f8541;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0048.f978[(int) (15 & j)];
            j >>>= 4;
        }
        c2646M1794.f8541 += i;
        this.f2172 += (long) i;
    }

    public final void m1799(int i) {
        C2646 c2646M1794 = m1794(4);
        byte[] bArr = c2646M1794.f8539;
        int i2 = c2646M1794.f8541;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c2646M1794.f8541 = i2 + 4;
        this.f2172 += 4;
    }

    public final void m1800(long j) {
        C2646 c2646M1794 = m1794(8);
        byte[] bArr = c2646M1794.f8539;
        int i = c2646M1794.f8541;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c2646M1794.f8541 = i + 8;
        this.f2172 += 8;
    }

    public final void m1801(int i) {
        C2646 c2646M1794 = m1794(2);
        byte[] bArr = c2646M1794.f8539;
        int i2 = c2646M1794.f8541;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c2646M1794.f8541 = i2 + 2;
        this.f2172 += 2;
    }

    public final void m1802(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC2784.m4745(i2, "endIndex < beginIndex: ", " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM2787 = AbstractC1194.m2787(i2, "endIndex > string.length: ", " > ");
            sbM2787.append(str.length());
            throw new IllegalArgumentException(sbM2787.toString().toString());
        }
        if (charset.equals(AbstractC0599.f2413)) {
            m1803(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    public final void m1803(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC2784.m4745(i2, "endIndex < beginIndex: ", " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM2787 = AbstractC1194.m2787(i2, "endIndex > string.length: ", " > ");
            sbM2787.append(str.length());
            throw new IllegalArgumentException(sbM2787.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C2646 c2646M1794 = m1794(1);
                byte[] bArr = c2646M1794.f8539;
                int i3 = c2646M1794.f8541 - i;
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
                int i5 = c2646M1794.f8541;
                int i6 = (i3 + i) - i5;
                c2646M1794.f8541 = i5 + i6;
                this.f2172 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C2646 c2646M1795 = m1794(2);
                    byte[] bArr2 = c2646M1795.f8539;
                    int i7 = c2646M1795.f8541;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c2646M1795.f8541 = i7 + 2;
                    this.f2172 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C2646 c2646M1796 = m1794(3);
                    byte[] bArr3 = c2646M1796.f8539;
                    int i8 = c2646M1796.f8541;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c2646M1796.f8541 = i8 + 3;
                    this.f2172 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m1796(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C2646 c2646M1797 = m1794(4);
                        byte[] bArr4 = c2646M1797.f8539;
                        int i11 = c2646M1797.f8541;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c2646M1797.f8541 = i11 + 4;
                        this.f2172 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void m1804(String str) {
        m1803(0, str.length(), str);
    }

    public final void m1805(int i) {
        String str;
        if (i < 128) {
            m1796(i);
            return;
        }
        if (i < 2048) {
            C2646 c2646M1794 = m1794(2);
            byte[] bArr = c2646M1794.f8539;
            int i2 = c2646M1794.f8541;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c2646M1794.f8541 = i2 + 2;
            this.f2172 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m1796(63);
            return;
        }
        if (i < 65536) {
            C2646 c2646M1795 = m1794(3);
            byte[] bArr2 = c2646M1795.f8539;
            int i3 = c2646M1795.f8541;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c2646M1795.f8541 = i3 + 3;
            this.f2172 += 3;
            return;
        }
        if (i <= 1114111) {
            C2646 c2646M1796 = m1794(4);
            byte[] bArr3 = c2646M1796.f8539;
            int i4 = c2646M1796.f8541;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c2646M1796.f8541 = i4 + 4;
            this.f2172 += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (true) {
            char[] cArr = AbstractC0743.f2837;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            AbstractC2665.m4660(i5, 8, 8);
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C2646 c2646 = this.f2171;
        if (c2646 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c2646.f8541 - c2646.f8540);
        byteBuffer.put(c2646.f8539, c2646.f8540, iMin);
        int i = c2646.f8540 + iMin;
        c2646.f8540 = i;
        this.f2172 -= (long) iMin;
        if (i == c2646.f8541) {
            this.f2171 = c2646.m4645();
            AbstractC2648.m4649(c2646);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC0968.m2469(bArr.length, i, i2);
        C2646 c2646 = this.f2171;
        if (c2646 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c2646.f8541 - c2646.f8540);
        byte[] bArr2 = c2646.f8539;
        int i3 = c2646.f8540;
        AbstractC0270.m1378(bArr2, i, i3, bArr, i3 + iMin);
        int i4 = c2646.f8540 + iMin;
        c2646.f8540 = i4;
        this.f2172 -= (long) iMin;
        if (i4 == c2646.f8541) {
            this.f2171 = c2646.m4645();
            AbstractC2648.m4649(c2646);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.InterfaceC2713
    public final void close() {
    }

    @Override // p000.InterfaceC0507, p000.InterfaceC2713, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.InterfaceC0508, p000.InterfaceC0507
    public final C0504 mo1760() {
        return this;
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 mo1763() {
        return this;
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 mo1770() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C2646 c2646M1794 = m1794(1);
            int iMin = Math.min(i, 8192 - c2646M1794.f8541);
            byteBuffer.get(c2646M1794.f8539, c2646M1794.f8541, iMin);
            i -= iMin;
            c2646M1794.f8541 += iMin;
        }
        this.f2172 += (long) iRemaining;
        return iRemaining;
    }

    @Override // p000.InterfaceC0507
    public final InterfaceC0507 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        AbstractC0968.m2469(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2646 c2646M1794 = m1794(1);
            int iMin = Math.min(i3 - i, 8192 - c2646M1794.f8541);
            int i4 = i + iMin;
            AbstractC0270.m1378(bArr, c2646M1794.f8541, i, c2646M1794.f8539, i4);
            c2646M1794.f8541 += iMin;
            i = i4;
        }
        this.f2172 += j;
    }
}
