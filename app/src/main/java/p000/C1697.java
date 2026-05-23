package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲈᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1697 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public char[] f5769;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f5770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f5771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5772;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5773;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5774;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f5775;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int[] f5776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int[] f5777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f5778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f5779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f5780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f5781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public char[] f5782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f5783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Reader f5784;

    public C1697(Reader reader) {
        m3434(1, 1);
        this.f5783 = -1;
        this.f5782 = new char[4096];
        this.f5784 = reader;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int m3428(char c) throws IOException {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case 50 /* 50 */:
                return 2;
            case 51 /* 51 */:
                return 3;
            case '4':
                return 4;
            case 53 /* 53 */:
                return 5;
            case 54 /* 54 */:
                return 6;
            case 55 /* 55 */:
                return 7;
            case 56 /* 56 */:
                return 8;
            case 57 /* 57 */:
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
                            case 97 /* 97 */:
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
    public final void m3429(int i) {
        int i2 = this.f5770;
        if (i > i2) {
            throw new IllegalStateException(AbstractC2784.m4751(AbstractC1194.m2787(i, "Cannot back ", " chars which is larger than the internal buffer size ("), this.f5770, ")"));
        }
        this.f5774 += i;
        int i3 = this.f5771 - i;
        this.f5771 = i3;
        if (i3 < 0) {
            this.f5771 = i3 + i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3430(boolean z) {
        int i = this.f5770;
        int i2 = i * 2;
        char[] cArr = new char[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.f5773;
        int i4 = i - i3;
        if (z) {
            System.arraycopy(this.f5769, i3, cArr, 0, i4);
            System.arraycopy(this.f5769, 0, cArr, i4, this.f5771);
            this.f5769 = cArr;
            System.arraycopy(this.f5776, this.f5773, iArr, 0, i4);
            System.arraycopy(this.f5776, 0, iArr, i4, this.f5771);
            this.f5776 = iArr;
            System.arraycopy(this.f5777, this.f5773, iArr2, 0, i4);
            System.arraycopy(this.f5777, 0, iArr2, i4, this.f5771);
            this.f5777 = iArr2;
            this.f5771 += i4;
        } else {
            System.arraycopy(this.f5769, i3, cArr, 0, i4);
            this.f5769 = cArr;
            System.arraycopy(this.f5776, this.f5773, iArr, 0, i4);
            this.f5776 = iArr;
            System.arraycopy(this.f5777, this.f5773, iArr2, 0, i4);
            this.f5777 = iArr2;
            this.f5771 -= this.f5773;
        }
        this.f5770 = i2;
        this.f5772 = i2;
        this.f5773 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String m3431() {
        int i = this.f5771;
        int i2 = this.f5773;
        return i >= i2 ? new String(this.f5769, i2, (i - i2) + 1) : new String(this.f5769, i2, this.f5770 - i2).concat(new String(this.f5769, 0, this.f5771 + 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3432() {
        int i = this.f5770;
        int i2 = i / 2;
        int i3 = this.f5772;
        if (i3 != i) {
            int i4 = this.f5773;
            if (i3 > i4) {
                this.f5772 = i;
                return;
            } else if (i4 - i3 < i2) {
                m3430(true);
                return;
            } else {
                this.f5772 = i4;
                return;
            }
        }
        int i5 = this.f5773;
        if (i5 < 0) {
            this.f5771 = 0;
            this.f5775 = 0;
        } else {
            if (i5 <= i2) {
                m3430(false);
                return;
            }
            this.f5771 = 0;
            this.f5775 = 0;
            this.f5772 = i5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3433(char c) {
        this.f5779++;
        if (this.f5781) {
            this.f5781 = false;
            this.f5779 = 1;
            this.f5778++;
        } else if (this.f5780) {
            this.f5780 = false;
            if (c == '\n') {
                this.f5781 = true;
            } else {
                this.f5779 = 1;
                this.f5778++;
            }
        }
        if (c == '\t') {
            int i = this.f5779 - 1;
            this.f5779 = (1) + i;
        } else if (c == '\n') {
            this.f5781 = true;
        } else if (c == '\r') {
            this.f5780 = true;
        }
        int i2 = this.f5778;
        int i3 = this.f5779;
        int[] iArr = this.f5776;
        int i4 = this.f5771;
        iArr[i4] = i2;
        this.f5777[i4] = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3434(int i, int i2) {
        this.f5778 = i;
        this.f5779 = i2 - 1;
        this.f5780 = false;
        this.f5781 = false;
        char[] cArr = this.f5769;
        if (cArr == null || 4096 != cArr.length) {
            this.f5770 = 4096;
            this.f5772 = 4096;
            this.f5769 = new char[4096];
            this.f5776 = new int[4096];
            this.f5777 = new int[4096];
        }
        this.f5775 = 0;
        this.f5774 = 0;
        this.f5773 = 0;
        this.f5771 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final char m3435() throws IOException {
        int i = this.f5783 + 1;
        this.f5783 = i;
        int i2 = this.f5775;
        if (i >= i2) {
            if (i2 == 4096) {
                this.f5775 = 0;
                this.f5783 = 0;
            }
            try {
                char[] cArr = this.f5782;
                int i3 = this.f5775;
                int i4 = this.f5784.read(cArr, i3, 4096 - i3);
                if (i4 == -1) {
                    this.f5784.close();
                    throw new IOException();
                }
                this.f5775 += i4;
            } catch (IOException e) {
                int i5 = this.f5771;
                if (i5 != 0) {
                    this.f5771 = i5 - 1;
                    m3429(0);
                } else {
                    int i6 = this.f5778;
                    int i7 = this.f5779;
                    this.f5776[0] = i6;
                    this.f5777[0] = i7;
                }
                throw e;
            }
        }
        return this.f5782[this.f5783];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final char m3436() throws IOException {
        char cM3435;
        char cM3436;
        int i = this.f5774;
        if (i > 0) {
            this.f5774 = i - 1;
            int i2 = this.f5771 + 1;
            this.f5771 = i2;
            if (i2 == this.f5770) {
                this.f5771 = 0;
            }
            return this.f5769[this.f5771];
        }
        int i3 = this.f5771 + 1;
        this.f5771 = i3;
        if (i3 == this.f5772) {
            m3432();
        }
        char cM3437 = m3435();
        this.f5769[this.f5771] = cM3437;
        if (cM3437 != '\\') {
            m3433(cM3437);
            return cM3437;
        }
        m3433(92);
        int i4 = 1;
        while (true) {
            int i5 = this.f5771 + 1;
            this.f5771 = i5;
            if (i5 == this.f5772) {
                m3432();
            }
            try {
                cM3435 = m3435();
                this.f5769[this.f5771] = cM3435;
                if (cM3435 != '\\') {
                    break;
                }
                m3433(92);
                i4++;
            } catch (IOException unused) {
                if (i4 > 1) {
                    m3429(i4 - 1);
                }
                return '\\';
            }
        }
        m3433(cM3435);
        if (cM3435 != 'u' || (i4 & 1) != 1) {
            m3429(i4);
            return '\\';
        }
        int i6 = this.f5771 - 1;
        this.f5771 = i6;
        if (i6 < 0) {
            this.f5771 = this.f5770 - 1;
        }
        while (true) {
            try {
                cM3436 = m3435();
                if (cM3436 != 'u') {
                    break;
                }
                m3433(117);
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder("Invalid escape character at line ");
                sb.append(this.f5778);
                sb.append(" column ");
                throw new IllegalStateException(AbstractC2784.m4751(sb, this.f5779, "."));
            }
        }
        char cM3438 = m3435();
        char cM3439 = m3435();
        char cM34310 = m3435();
        char cM3428 = (char) ((m3428(cM3436) << 12) | (m3428(cM3438) << 8) | (m3428(cM3439) << 4) | m3428(cM34310));
        this.f5769[this.f5771] = cM3428;
        m3433(cM3436);
        m3433(cM3438);
        m3433(cM3439);
        m3433(cM34310);
        if (i4 == 1) {
            return cM3428;
        }
        m3429(i4 - 1);
        return '\\';
    }
}
