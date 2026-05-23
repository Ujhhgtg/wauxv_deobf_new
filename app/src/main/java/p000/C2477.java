package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᛸᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2477 implements InterfaceC0508 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2786 f7913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0504 f7914 = new C0504();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f7915;

    public C2477(InterfaceC2786 interfaceC2786) {
        this.f7913 = interfaceC2786;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f7915) {
            return;
        }
        this.f7915 = true;
        this.f7913.close();
        this.f7914.m1761();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7915;
    }

    @Override // p000.InterfaceC0508
    public final C2477 peek() {
        return new C2477(new C2343(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C0504 c0504 = this.f7914;
        if (c0504.f2172 == 0 && this.f7913.read(c0504, 8192L) == -1) {
            return -1;
        }
        return c0504.read(byteBuffer);
    }

    @Override // p000.InterfaceC0508
    public final byte readByte() throws EOFException {
        mo1790(1L);
        return this.f7914.readByte();
    }

    @Override // p000.InterfaceC0508
    public final void readFully(byte[] bArr) throws EOFException {
        C0504 c0504 = this.f7914;
        try {
            mo1790(bArr.length);
            c0504.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c0504.f2172;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c0504.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p000.InterfaceC0508
    public final int readInt() throws EOFException {
        mo1790(4L);
        return this.f7914.readInt();
    }

    @Override // p000.InterfaceC0508
    public final long readLong() throws EOFException {
        mo1790(8L);
        return this.f7914.readLong();
    }

    @Override // p000.InterfaceC0508
    public final short readShort() throws EOFException {
        mo1790(2L);
        return this.f7914.readShort();
    }

    @Override // p000.InterfaceC0508
    public final String readString(Charset charset) {
        InterfaceC2786 interfaceC2786 = this.f7913;
        C0504 c0504 = this.f7914;
        c0504.mo1769(interfaceC2786);
        return c0504.m1785(c0504.f2172, charset);
    }

    @Override // p000.InterfaceC0508
    public final void skip(long j) throws EOFException {
        if (this.f7915) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C0504 c0504 = this.f7914;
            if (c0504.f2172 == 0 && this.f7913.read(c0504, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c0504.f2172);
            c0504.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        return this.f7913.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f7913 + ')';
    }

    @Override // p000.InterfaceC0508, p000.InterfaceC0507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C0504 mo1760() {
        return this.f7914;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long m4428(long j, long j2, byte b) {
        if (this.f7915) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            C0504 c0504 = this.f7914;
            long j3 = j2;
            byte b2 = b;
            long jM1774 = c0504.m1774(jMax, j3, b2);
            if (jM1774 != -1) {
                return jM1774;
            }
            long j4 = c0504.f2172;
            if (j4 >= j3 || this.f7913.read(c0504, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            j2 = j3;
            b = b2;
        }
        return -1L;
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C0539 mo1762(long j) throws EOFException {
        mo1790(j);
        return this.f7914.mo1762(j);
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final byte[] mo1764() {
        InterfaceC2786 interfaceC2786 = this.f7913;
        C0504 c0504 = this.f7914;
        c0504.mo1769(interfaceC2786);
        return c0504.m1784(c0504.f2172);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m4429() throws EOFException {
        mo1790(4L);
        int i = this.f7914.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo1766() {
        if (this.f7915) {
            throw new IllegalStateException("closed");
        }
        C0504 c0504 = this.f7914;
        return c0504.mo1766() && this.f7913.read(c0504, 8192L) == -1;
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1767(C2302 c2302) throws EOFException {
        C0504 c0504;
        if (this.f7915) {
            throw new IllegalStateException("closed");
        }
        do {
            c0504 = this.f7914;
            int iM908 = AbstractC0048.m908(c0504, c2302, true);
            if (iM908 != -2) {
                if (iM908 == -1) {
                    break;
                }
                c0504.skip(c2302.f7417[iM908].mo1870());
                return iM908;
            }
        } while (this.f7913.read(c0504, 8192L) != -1);
        return -1;
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final long mo1771() throws EOFException {
        C0504 c0504;
        mo1790(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zMo1781 = mo1781(j2);
            c0504 = this.f7914;
            if (!zMo1781) {
                break;
            }
            byte bM1772 = c0504.m1772(j);
            if ((bM1772 < 48 || bM1772 > 57) && !(j == 0 && bM1772 == 45)) {
                if (j != 0) {
                    break;
                }
                AbstractC3681.m5317(16);
                AbstractC3681.m5317(16);
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(Integer.toString(bM1772, 16)));
            }
            j = j2;
        }
        return c0504.mo1771();
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final String mo1773(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "limit < 0: ").toString());
        }
        long j2 = j == 9223372036854775807L ? 9223372036854775807L : j + 1;
        long jM4428 = m4428(0L, j2, (byte) 10);
        C0504 c0504 = this.f7914;
        if (jM4428 != -1) {
            return AbstractC0048.m907(c0504, jM4428);
        }
        if (j2 < 9223372036854775807L && mo1781(j2) && c0504.m1772(j2 - 1) == 13 && mo1781(j2 + 1) && c0504.m1772(j2) == 10) {
            return AbstractC0048.m907(c0504, j2);
        }
        C0504 c0505 = new C0504();
        c0504.m1768(0L, c0505, Math.min(32, c0504.f2172));
        throw new EOFException("\\n not found: limit=" + Math.min(c0504.f2172, j) + " content=" + c0505.mo1762(c0505.f2172).mo1871() + (char) 8230);
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo1776(C0504 c0504, long j) throws EOFException {
        C0504 c0505 = this.f7914;
        try {
            mo1790(j);
            c0505.mo1776(c0504, j);
        } catch (EOFException e) {
            c0504.mo1769(c0505);
            throw e;
        }
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final C0539 mo1780() {
        InterfaceC2786 interfaceC2786 = this.f7913;
        C0504 c0504 = this.f7914;
        c0504.mo1769(interfaceC2786);
        return c0504.mo1762(c0504.f2172);
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final boolean mo1781(long j) {
        C0504 c0504;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
        }
        if (this.f7915) {
            throw new IllegalStateException("closed");
        }
        do {
            c0504 = this.f7914;
            if (c0504.f2172 >= j) {
                return true;
            }
        } while (this.f7913.read(c0504, 8192L) != -1);
        return false;
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final String mo1783() {
        return mo1773(9223372036854775807L);
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public final boolean mo1787(long j, C0539 c0539) {
        int iMo1870 = c0539.mo1870();
        if (this.f7915) {
            throw new IllegalStateException("closed");
        }
        if (iMo1870 >= 0 && c0539.mo1870() >= iMo1870) {
            for (int i = 0; i < iMo1870; i++) {
                long j2 = i;
                if (mo1781(1 + j2) && this.f7914.m1772(j2) == c0539.mo1873(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public final void mo1790(long j) throws EOFException {
        if (!mo1781(j)) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final long mo1792() throws EOFException {
        C0504 c0504;
        mo1790(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zMo1781 = mo1781(i2);
            c0504 = this.f7914;
            if (!zMo1781) {
                break;
            }
            byte bM1772 = c0504.m1772(i);
            if ((bM1772 < 48 || bM1772 > 57) && ((bM1772 < 97 || bM1772 > 102) && (bM1772 < 65 || bM1772 > 70))) {
                if (i != 0) {
                    break;
                }
                AbstractC3681.m5317(16);
                AbstractC3681.m5317(16);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM1772, 16)));
            }
            i = i2;
        }
        return c0504.mo1792();
    }

    @Override // p000.InterfaceC0508
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final InputStream mo1793() {
        return new C0503(this, 1);
    }

    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) {
        if (j >= 0) {
            if (!this.f7915) {
                C0504 c0505 = this.f7914;
                if (c0505.f2172 == 0 && this.f7913.read(c0505, 8192L) == -1) {
                    return -1L;
                }
                return c0505.read(c0504, Math.min(j, c0505.f2172));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
    }
}
