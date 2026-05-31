package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public char[] f5812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f5813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f5814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f5818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int[] f5819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int[] f5820;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f5821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f5822;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f5823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f5824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public char[] f5825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f5826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Reader f5827;

    public C1715(Reader reader) {
        m3602(1, 1);
        this.f5826 = -1;
        this.f5825 = new char[4096];
        this.f5827 = reader;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int m3596(char c) throws IOException {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case Opcodes.AALOAD /* 50 */:
                return 2;
            case Opcodes.BALOAD /* 51 */:
                return 3;
            case '4':
                return 4;
            case Opcodes.SALOAD /* 53 */:
                return 5;
            case Opcodes.ISTORE /* 54 */:
                return 6;
            case Opcodes.LSTORE /* 55 */:
                return 7;
            case Opcodes.FSTORE /* 56 */:
                return 8;
            case Opcodes.DSTORE /* 57 */:
                return 9;
            default:
                switch (c) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c) {
                            case Opcodes.LADD /* 97 */:
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new IOException("Invalid hex char '" + c + "' (=" + ((int) c) + ") provided!");
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3597(int i) {
        int i2 = this.f5813;
        if (i > i2) {
            throw new IllegalStateException(AbstractC2844.m4785(AbstractC1095.m2802(i, "Cannot back ", " chars which is larger than the internal buffer size ("), this.f5813, ")"));
        }
        this.f5817 += i;
        int i3 = this.f5814 - i;
        this.f5814 = i3;
        if (i3 < 0) {
            this.f5814 = i3 + i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3598(boolean z) {
        int i = this.f5813;
        int i2 = i * 2;
        char[] cArr = new char[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.f5816;
        int i4 = i - i3;
        if (z) {
            System.arraycopy(this.f5812, i3, cArr, 0, i4);
            System.arraycopy(this.f5812, 0, cArr, i4, this.f5814);
            this.f5812 = cArr;
            System.arraycopy(this.f5819, this.f5816, iArr, 0, i4);
            System.arraycopy(this.f5819, 0, iArr, i4, this.f5814);
            this.f5819 = iArr;
            System.arraycopy(this.f5820, this.f5816, iArr2, 0, i4);
            System.arraycopy(this.f5820, 0, iArr2, i4, this.f5814);
            this.f5820 = iArr2;
            this.f5814 += i4;
        } else {
            System.arraycopy(this.f5812, i3, cArr, 0, i4);
            this.f5812 = cArr;
            System.arraycopy(this.f5819, this.f5816, iArr, 0, i4);
            this.f5819 = iArr;
            System.arraycopy(this.f5820, this.f5816, iArr2, 0, i4);
            this.f5820 = iArr2;
            this.f5814 -= this.f5816;
        }
        this.f5813 = i2;
        this.f5815 = i2;
        this.f5816 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String m3599() {
        int i = this.f5814;
        int i2 = this.f5816;
        return i >= i2 ? new String(this.f5812, i2, (i - i2) + 1) : new String(this.f5812, i2, this.f5813 - i2).concat(new String(this.f5812, 0, this.f5814 + 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3600() {
        int i = this.f5813;
        int i2 = i / 2;
        int i3 = this.f5815;
        if (i3 != i) {
            int i4 = this.f5816;
            if (i3 > i4) {
                this.f5815 = i;
                return;
            } else if (i4 - i3 < i2) {
                m3598(true);
                return;
            } else {
                this.f5815 = i4;
                return;
            }
        }
        int i5 = this.f5816;
        if (i5 < 0) {
            this.f5814 = 0;
            this.f5818 = 0;
        } else {
            if (i5 <= i2) {
                m3598(false);
                return;
            }
            this.f5814 = 0;
            this.f5818 = 0;
            this.f5815 = i5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3601(char c) {
        this.f5822++;
        if (this.f5824) {
            this.f5824 = false;
            this.f5822 = 1;
            this.f5821++;
        } else if (this.f5823) {
            this.f5823 = false;
            if (c == '\n') {
                this.f5824 = true;
            } else {
                this.f5822 = 1;
                this.f5821++;
            }
        }
        if (c == '\t') {
            int i = this.f5822 - 1;
            this.f5822 = (1 - (i % 1)) + i;
        } else if (c == '\n') {
            this.f5824 = true;
        } else if (c == '\r') {
            this.f5823 = true;
        }
        int i2 = this.f5821;
        int i3 = this.f5822;
        int[] iArr = this.f5819;
        int i4 = this.f5814;
        iArr[i4] = i2;
        this.f5820[i4] = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3602(int i, int i2) {
        this.f5821 = i;
        this.f5822 = i2 - 1;
        this.f5823 = false;
        this.f5824 = false;
        char[] cArr = this.f5812;
        if (cArr == null || 4096 != cArr.length) {
            this.f5813 = 4096;
            this.f5815 = 4096;
            this.f5812 = new char[4096];
            this.f5819 = new int[4096];
            this.f5820 = new int[4096];
        }
        this.f5818 = 0;
        this.f5817 = 0;
        this.f5816 = 0;
        this.f5814 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final char m3603() throws IOException {
        int i = this.f5826 + 1;
        this.f5826 = i;
        int i2 = this.f5818;
        if (i >= i2) {
            if (i2 == 4096) {
                this.f5818 = 0;
                this.f5826 = 0;
            }
            try {
                char[] cArr = this.f5825;
                int i3 = this.f5818;
                int i4 = this.f5827.read(cArr, i3, 4096 - i3);
                if (i4 == -1) {
                    this.f5827.close();
                    throw new IOException();
                }
                this.f5818 += i4;
            } catch (IOException e) {
                int i5 = this.f5814;
                if (i5 != 0) {
                    this.f5814 = i5 - 1;
                    m3597(0);
                } else {
                    int i6 = this.f5821;
                    int i7 = this.f5822;
                    this.f5819[i5] = i6;
                    this.f5820[i5] = i7;
                }
                throw e;
            }
        }
        return this.f5825[this.f5826];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final char m3604() throws IOException {
        char cM3603;
        char cM3604;
        int i = this.f5817;
        if (i > 0) {
            this.f5817 = i - 1;
            int i2 = this.f5814 + 1;
            this.f5814 = i2;
            if (i2 == this.f5813) {
                this.f5814 = 0;
            }
            return this.f5812[this.f5814];
        }
        int i3 = this.f5814 + 1;
        this.f5814 = i3;
        if (i3 == this.f5815) {
            m3600();
        }
        char cM3605 = m3603();
        this.f5812[this.f5814] = cM3605;
        if (cM3605 != '\\') {
            m3601(cM3605);
            return cM3605;
        }
        m3601(cM3605);
        int i4 = 1;
        while (true) {
            int i5 = this.f5814 + 1;
            this.f5814 = i5;
            if (i5 == this.f5815) {
                m3600();
            }
            try {
                cM3603 = m3603();
                this.f5812[this.f5814] = cM3603;
                if (cM3603 != '\\') {
                    break;
                }
                m3601(cM3603);
                i4++;
            } catch (IOException unused) {
                if (i4 > 1) {
                    m3597(i4 - 1);
                }
                return '\\';
            }
        }
        m3601(cM3603);
        if (cM3603 != 'u' || (i4 & 1) != 1) {
            m3597(i4);
            return '\\';
        }
        int i6 = this.f5814 - 1;
        this.f5814 = i6;
        if (i6 < 0) {
            this.f5814 = this.f5813 - 1;
        }
        while (true) {
            try {
                cM3604 = m3603();
                if (cM3604 != 'u') {
                    break;
                }
                m3601(cM3604);
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder("Invalid escape character at line ");
                sb.append(this.f5821);
                sb.append(" column ");
                throw new IllegalStateException(AbstractC2844.m4785(sb, this.f5822, "."));
            }
        }
        char cM3606 = m3603();
        char cM3607 = m3603();
        char cM3608 = m3603();
        char cM3596 = (char) ((m3596(cM3604) << 12) | (m3596(cM3606) << 8) | (m3596(cM3607) << 4) | m3596(cM3608));
        this.f5812[this.f5814] = cM3596;
        m3601(cM3604);
        m3601(cM3606);
        m3601(cM3607);
        m3601(cM3608);
        if (i4 == 1) {
            return cM3596;
        }
        m3597(i4 - 1);
        return '\\';
    }
}
