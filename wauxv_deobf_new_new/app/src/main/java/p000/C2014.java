package p000;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2014 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f6672 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2930 f6674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f6677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f6678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0253 f6682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0493 f6684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int f6685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int[] f6686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int f6687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f6688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C1774 f6689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C1774 f6690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C1774 f6691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f6692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f6693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int[] f6694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int[] f6695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f6696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f6697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f6698;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2014 f6673 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0493 f6681 = new C0493();

    public C2014(C2930 c2930, int i, String str, String str2, int i2) {
        this.f6674 = c2930;
        this.f6675 = "<init>".equals(str) ? 262144 | i : i;
        this.f6676 = c2930.m4932(str);
        this.f6677 = c2930.m4932(str2);
        this.f6678 = str2;
        this.f6687 = 0;
        this.f6685 = 0;
        this.f6686 = null;
        this.f6688 = i2;
        if (i2 != 0) {
            int iM5037 = C3506.m5037(str2) >> 2;
            this.f6680 = (i & 8) != 0 ? iM5037 - 1 : iM5037;
            C1774 c1774 = new C1774();
            this.f6689 = c1774;
            m4036(c1774);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4027(int i, C1774 c1774) {
        C1774 c1775 = this.f6691;
        c1775.f5922 = new C0231(i, c1774, c1775.f5922);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4028() {
        int i = this.f6688;
        if (i != 4) {
            if (i == 1) {
                this.f6691.f5918 = (short) this.f6693;
                this.f6691 = null;
                return;
            }
            return;
        }
        C1774 c1774 = new C1774();
        c1774.f5920 = new C1420(c1774);
        C0493 c0493 = this.f6681;
        c1774.m3657(c0493.f2146, c0493.f2147);
        this.f6690.f5921 = c1774;
        this.f6690 = c1774;
        this.f6691 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4029(int i, int i2) {
        while (i < i2) {
            int i3 = this.f6695[i];
            C0493 c0493 = this.f6684;
            int i4 = ((-268435456) & i3) >> 28;
            C2930 c2930 = this.f6674;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 251658240;
                if (i6 == 16777216) {
                    c0493.m1915(i5);
                } else if (i6 == 33554432) {
                    c0493.m1915(7);
                    c0493.m1918(c2930.m4933(7, c2930.f9377[i5].f9365).f9361);
                } else {
                    if (i6 != 50331648) {
                        throw new AssertionError();
                    }
                    c0493.m1915(8);
                    c0493.m1918((int) c2930.f9377[i5].f9366);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i7 = i4 - 1;
                    if (i4 > 0) {
                        sb.append('[');
                        i4 = i7;
                    } else {
                        if ((i3 & 251658240) == 33554432) {
                            sb.append('L');
                            sb.append(c2930.f9377[i3 & 1048575].f9365);
                            sb.append(';');
                        } else {
                            int i8 = i3 & 1048575;
                            if (i8 == 1) {
                                sb.append('I');
                            } else if (i8 == 2) {
                                sb.append('F');
                            } else if (i8 == 3) {
                                sb.append('D');
                            } else if (i8 != 4) {
                                switch (i8) {
                                    case 9:
                                        sb.append('Z');
                                        break;
                                    case 10:
                                        sb.append('B');
                                        break;
                                    case 11:
                                        sb.append('C');
                                        break;
                                    case Opcodes.FCONST_1 /* 12 */:
                                        sb.append('S');
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c0493.m1915(7);
                        c0493.m1918(c2930.m4933(7, sb.toString()).f9361);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4030(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        C2930 c2930 = this.f6674;
        C2929 c2929M4931 = c2930.m4931(9, str, str2, str3);
        c0493.m1913(i, c2929M4931.f9361);
        C1774 c1774 = this.f6691;
        if (c1774 != null) {
            int i4 = this.f6688;
            if (i4 == 4 || i4 == 3) {
                c1774.f5920.m3232(i, 0, c2929M4931, c2930);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case Opcodes.GETSTATIC /* 178 */:
                    i2 = this.f6692 + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case Opcodes.PUTSTATIC /* 179 */:
                    i3 = this.f6692;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case Opcodes.GETFIELD /* 180 */:
                    i2 = this.f6692 + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.f6692;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.f6693) {
                this.f6693 = i2;
            }
            this.f6692 = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4031() {
        char c;
        int i;
        int[] iArr = this.f6694;
        if (iArr != null) {
            if (this.f6684 == null) {
                this.f6684 = new C0493();
            }
            int[] iArr2 = this.f6695;
            boolean z = true;
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            int i4 = 0;
            int i5 = 3;
            if (this.f6674.f9370 < 50) {
                C0493 c0493 = this.f6684;
                c0493.m1918(iArr2[0]);
                c0493.m1918(i2);
                int i6 = i2 + 3;
                m4029(3, i6);
                this.f6684.m1918(i3);
                m4029(i6, i3 + i6);
            } else {
                int i7 = this.f6683 == 0 ? iArr2[0] : (iArr2[0] - iArr[0]) - 1;
                int i8 = iArr[1];
                int i9 = i2 - i8;
                if (i3 == 0) {
                    switch (i9) {
                        case -3:
                        case -2:
                        case -1:
                            c = 248;
                            break;
                        case 0:
                            c = i7 >= 64 ? (char) 251 : (char) 0;
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c = 252;
                            break;
                        default:
                            c = 255;
                            break;
                    }
                } else if (i9 == 0 && i3 == 1) {
                    c = i7 < 63 ? '@' : (char) 247;
                } else {
                    c = 255;
                }
                if (c != 255) {
                    int i10 = 3;
                    while (true) {
                        if (i4 >= i8 || i4 >= i2) {
                            i = i5;
                        } else {
                            boolean z2 = z;
                            i = i5;
                            if (this.f6695[i10] != this.f6694[i10]) {
                                c = 255;
                            } else {
                                i10++;
                                i4++;
                                z = z2;
                                i5 = i;
                            }
                        }
                    }
                } else {
                    i = i5;
                }
                if (c == 0) {
                    this.f6684.m1915(i7);
                } else if (c == '@') {
                    this.f6684.m1915(i7 + 64);
                    m4029(i2 + 3, i2 + 4);
                } else if (c == 247) {
                    C0493 c0494 = this.f6684;
                    c0494.m1915(247);
                    c0494.m1918(i7);
                    m4029(i2 + 3, i2 + 4);
                } else if (c == 248) {
                    C0493 c0495 = this.f6684;
                    c0495.m1915(i9 + 251);
                    c0495.m1918(i7);
                } else if (c == 251) {
                    C0493 c0496 = this.f6684;
                    c0496.m1915(251);
                    c0496.m1918(i7);
                } else if (c != 252) {
                    C0493 c0497 = this.f6684;
                    c0497.m1915(255);
                    c0497.m1918(i7);
                    c0497.m1918(i2);
                    int i11 = i2 + 3;
                    m4029(i, i11);
                    this.f6684.m1918(i3);
                    m4029(i11, i3 + i11);
                } else {
                    int i12 = i;
                    C0493 c0498 = this.f6684;
                    c0498.m1915(i9 + 251);
                    c0498.m1918(i7);
                    m4029(i8 + i12, i2 + i12);
                }
            }
            this.f6683++;
        }
        this.f6694 = this.f6695;
        this.f6695 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4032(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f6695;
        if (iArr == null || iArr.length < i4) {
            this.f6695 = new int[i4];
        }
        int[] iArr2 = this.f6695;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4033(int i) {
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        c0493.m1915(i);
        C1774 c1774 = this.f6691;
        if (c1774 != null) {
            int i2 = this.f6688;
            if (i2 == 4 || i2 == 3) {
                c1774.f5920.m3232(i, 0, null, null);
            } else {
                int i3 = this.f6692 + f6672[i];
                if (i3 > this.f6693) {
                    this.f6693 = i3;
                }
                this.f6692 = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m4028();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4034(int i, int i2) {
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        if (i == 17) {
            c0493.m1913(i, i2);
        } else {
            c0493.m1912(i, i2);
        }
        C1774 c1774 = this.f6691;
        if (c1774 != null) {
            int i3 = this.f6688;
            if (i3 == 4 || i3 == 3) {
                c1774.f5920.m3232(i, i2, null, null);
            } else if (i != 188) {
                int i4 = this.f6692 + 1;
                if (i4 > this.f6693) {
                    this.f6693 = i4;
                }
                this.f6692 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4035(int i, C1774 c1774) {
        boolean z;
        C0493 c0493 = this.f6681;
        int i2 = c0493.f2147;
        this.f6698 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c1774.f5913 & 4) == 0 || c1774.f5914 - i2 >= -32768) {
            if (i3 != i) {
                c0493.m1915(i);
                c1774.m3656(c0493, c0493.f2147 - 1, true);
            } else {
                c0493.m1915(i3);
                c1774.m3656(c0493, c0493.f2147 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c0493.m1915(200);
            } else {
                if (i3 == 168) {
                    c0493.m1915(201);
                } else {
                    c0493.m1915(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                    c0493.m1918(8);
                    c0493.m1915(220);
                    this.f6697 = true;
                    z = true;
                }
                c1774.m3656(c0493, c0493.f2147 - 1, true);
            }
            z = false;
            c1774.m3656(c0493, c0493.f2147 - 1, true);
        }
        C1774 c1775 = this.f6691;
        if (c1775 != null) {
            C1774 c1776 = null;
            int i4 = this.f6688;
            if (i4 == 4) {
                c1775.f5920.m3232(i3, 0, null, null);
                C1774 c1774M3654 = c1774.m3654();
                c1774M3654.f5913 = (short) (c1774M3654.f5913 | 2);
                m4027(0, c1774);
                if (i3 != 167) {
                    c1776 = new C1774();
                }
            } else if (i4 == 3) {
                c1775.f5920.m3232(i3, 0, null, null);
            } else {
                int[] iArr = f6672;
                if (i4 == 2) {
                    this.f6692 += iArr[i3];
                } else if (i3 == 168) {
                    short s = c1774.f5913;
                    if ((s & 32) == 0) {
                        c1774.f5913 = (short) (s | 32);
                        this.f6696 = true;
                    }
                    c1775.f5913 = (short) (c1775.f5913 | 16);
                    m4027(this.f6692 + 1, c1774);
                    c1776 = new C1774();
                } else {
                    int i5 = this.f6692 + iArr[i3];
                    this.f6692 = i5;
                    m4027(i5, c1774);
                }
            }
            if (c1776 != null) {
                if (z) {
                    c1776.f5913 = (short) (c1776.f5913 | 2);
                }
                m4036(c1776);
            }
            if (i3 == 167) {
                m4028();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4036(C1774 c1774) {
        boolean z = this.f6697;
        C0493 c0493 = this.f6681;
        this.f6697 = z | c1774.m3657(c0493.f2146, c0493.f2147);
        short s = c1774.f5913;
        if ((s & 1) != 0) {
            return;
        }
        int i = this.f6688;
        if (i == 4) {
            C1774 c1775 = this.f6691;
            if (c1775 != null) {
                if (c1774.f5914 == c1775.f5914) {
                    c1775.f5913 = (short) ((s & 2) | c1775.f5913);
                    c1774.f5920 = c1775.f5920;
                    return;
                }
                m4027(0, c1774);
            }
            C1774 c1776 = this.f6690;
            if (c1776 != null) {
                if (c1774.f5914 == c1776.f5914) {
                    c1776.f5913 = (short) (c1776.f5913 | (c1774.f5913 & 2));
                    c1774.f5920 = c1776.f5920;
                    this.f6691 = c1776;
                    return;
                }
                c1776.f5921 = c1774;
            }
            this.f6690 = c1774;
            this.f6691 = c1774;
            c1774.f5920 = new C1420(c1774);
            return;
        }
        if (i == 3) {
            C1774 c1777 = this.f6691;
            if (c1777 == null) {
                this.f6691 = c1774;
                return;
            } else {
                c1777.f5920.f5114 = c1774;
                return;
            }
        }
        if (i != 1) {
            if (i == 2 && this.f6691 == null) {
                this.f6691 = c1774;
                return;
            }
            return;
        }
        C1774 c1778 = this.f6691;
        if (c1778 != null) {
            c1778.f5918 = (short) this.f6693;
            m4027(this.f6692, c1774);
        }
        this.f6691 = c1774;
        this.f6692 = 0;
        this.f6693 = 0;
        C1774 c1779 = this.f6690;
        if (c1779 != null) {
            c1779.f5921 = c1774;
        }
        this.f6690 = c1774;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m4037(Object obj) {
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        C2930 c2930 = this.f6674;
        C2929 c2929M4928 = c2930.m4928(obj);
        int i = c2929M4928.f9361;
        int i2 = c2929M4928.f9362;
        boolean z = i2 == 5 || i2 == 6;
        if (z) {
            c0493.m1913(20, i);
        } else if (i >= 256) {
            c0493.m1913(19, i);
        } else {
            c0493.m1912(18, i);
        }
        C1774 c1774 = this.f6691;
        if (c1774 != null) {
            int i3 = this.f6688;
            if (i3 == 4 || i3 == 3) {
                c1774.f5920.m3232(18, 0, c2929M4928, c2930);
                return;
            }
            int i4 = this.f6692 + (z ? 2 : 1);
            if (i4 > this.f6693) {
                this.f6693 = i4;
            }
            this.f6692 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0270  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:287:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178 A[PHI: r3
      0x0178: PHI (r3v70 int) = (r3v69 int), (r3v69 int), (r3v72 int), (r3v72 int) binds: [B:89:0x018a, B:93:0x0194, B:79:0x0169, B:83:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4038() {
        int i;
        int i2;
        String str;
        int i3;
        char c;
        char c2;
        boolean zM3230;
        boolean zM3231;
        char c3;
        int iM3233;
        int i4;
        int i5;
        int i6;
        int i7;
        C1774 c1774 = this.f6689;
        C1774 c1775 = C1774.f5912;
        int i8 = this.f6688;
        if (i8 != 4) {
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f6679 = this.f6693;
                    return;
                } else {
                    this.f6679 = 0;
                    this.f6680 = 0;
                    return;
                }
            }
            for (C0253 c0253 = this.f6682; c0253 != null; c0253 = (C0253) c0253.f1480) {
                C1774 c1776 = (C1774) c0253.f1479;
                for (C1774 c1777 = (C1774) c0253.f1478; c1777 != c1776; c1777 = c1777.f5921) {
                    if ((c1777.f5913 & 16) == 0) {
                        c1777.f5922 = new C0231(Integer.MAX_VALUE, (C1774) null, c1777.f5922);
                    } else {
                        C0231 c0231 = (C0231) c1777.f5922.f1427;
                        c0231.f1427 = new C0231(Integer.MAX_VALUE, (C1774) null, (C0231) c0231.f1427);
                    }
                }
            }
            if (this.f6696) {
                c1774.f5923 = c1775;
                C1774 c1774M3655 = c1774;
                while (c1774M3655 != c1775) {
                    C1774 c1778 = c1774M3655.f5923;
                    c1774M3655.f5923 = null;
                    if (c1774M3655.f5919 == 0) {
                        c1774M3655.f5919 = (short) 1;
                        c1774M3655 = c1774M3655.m3655(c1778);
                    } else {
                        c1774M3655 = c1778;
                    }
                }
                i = 1;
                short s = 1;
                for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
                    for (C1774 c1779 = c1774; c1779 != null; c1779 = c1779.f5921) {
                        if ((c1779.f5913 & 16) != 0 && c1779.f5919 == s2) {
                            C1774 c1774M3656 = (C1774) ((C0231) c1779.f5922.f1427).f1426;
                            if (c1774M3656.f5919 == 0) {
                                s = (short) (s + 1);
                                c1774M3656.f5923 = c1775;
                                while (c1774M3656 != c1775) {
                                    C1774 c17710 = c1774M3656.f5923;
                                    c1774M3656.f5923 = null;
                                    if (c1774M3656.f5919 == 0) {
                                        c1774M3656.f5919 = s;
                                        c1774M3656 = c1774M3656.m3655(c17710);
                                    } else {
                                        c1774M3656 = c17710;
                                    }
                                }
                            }
                        }
                    }
                }
                for (C1774 c17711 = c1774; c17711 != null; c17711 = c17711.f5921) {
                    if ((c17711.f5913 & 16) != 0) {
                        C1774 c1774M3657 = (C1774) ((C0231) c17711.f5922.f1427).f1426;
                        c1774M3657.f5923 = c1775;
                        C1774 c17712 = c1775;
                        while (c1774M3657 != c1775) {
                            C1774 c17713 = c1774M3657.f5923;
                            c1774M3657.f5923 = c17712;
                            if ((c1774M3657.f5913 & 64) != 0 && c1774M3657.f5919 != c17711.f5919) {
                                c1774M3657.f5922 = new C0231(c1774M3657.f5917, (C1774) c17711.f5922.f1426, c1774M3657.f5922);
                            }
                            c17712 = c1774M3657;
                            c1774M3657 = c1774M3657.m3655(c17713);
                        }
                        while (c17712 != c1775) {
                            C1774 c17714 = c17712.f5923;
                            c17712.f5923 = null;
                            c17712 = c17714;
                        }
                    }
                }
            } else {
                i = 1;
            }
            c1774.f5923 = c1775;
            int i9 = this.f6679;
            while (c1774 != c1775) {
                C1774 c17715 = c1774.f5923;
                short s3 = c1774.f5916;
                int i10 = c1774.f5918 + s3;
                if (i10 > i9) {
                    i9 = i10;
                }
                C0231 c0232 = c1774.f5922;
                if ((c1774.f5913 & 16) != 0) {
                    c0232 = (C0231) c0232.f1427;
                }
                c1774 = c17715;
                while (c0232 != null) {
                    C1774 c17716 = (C1774) c0232.f1426;
                    if (c17716.f5923 == null) {
                        int i11 = c0232.f1425;
                        c17716.f5916 = (short) (i11 == Integer.MAX_VALUE ? i : i11 + s3);
                        c17716.f5923 = c1774;
                        c1774 = c17716;
                    }
                    c0232 = (C0231) c0232.f1427;
                }
            }
            this.f6679 = i9;
            return;
        }
        C0253 c0254 = this.f6682;
        C2930 c2930 = this.f6674;
        if (c0254 != null) {
            c2930.m4935("java/lang/Throwable");
            throw null;
        }
        C1420 c1420 = c1774.f5920;
        int i12 = this.f6680;
        c1420.getClass();
        int[] iArr = new int[i12];
        c1420.f5115 = iArr;
        c1420.f5116 = new int[0];
        int i13 = this.f6675;
        int i14 = 33554432;
        if ((i13 & 8) == 0) {
            if ((i13 & 262144) == 0) {
                iArr[0] = c2930.m4935(c2930.f9371) | 33554432;
            } else {
                iArr[0] = 16777222;
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i15 = 0;
        int i16 = 1;
        while (true) {
            str = this.f6678;
            i3 = i14;
            c = '[';
            c2 = ')';
            if (str.charAt(i16) == ')') {
                break;
            }
            while (str.charAt(i16) == '[') {
                i16++;
            }
            int i17 = i16 + 1;
            if (str.charAt(i16) == 'L') {
                while (true) {
                    i7 = i17 + 1;
                    if (str.charAt(i17) == ';') {
                        break;
                    } else {
                        i17 = i7;
                    }
                }
                i16 = i7;
            } else {
                i16 = i17;
            }
            i15++;
            i14 = i3;
        }
        C3506[] c3506Arr = new C3506[i15];
        int i18 = 1;
        int i19 = 0;
        while (str.charAt(i18) != c2) {
            int i20 = i18;
            while (str.charAt(i20) == c) {
                i20++;
            }
            int i21 = i20 + 1;
            if (str.charAt(i20) == 'L') {
                while (true) {
                    i6 = i21 + 1;
                    if (str.charAt(i21) == ';') {
                        break;
                    } else {
                        i21 = i6;
                    }
                }
                i21 = i6;
            }
            c3506Arr[i19] = C3506.m5038(i18, i21, str);
            i18 = i21;
            i19++;
            c2 = ')';
            c = '[';
        }
        for (int i22 = 0; i22 < i15; i22++) {
            int iM3229 = C1420.m3229(c2930, c3506Arr[i22].m5039(), 0);
            int[] iArr2 = c1420.f5115;
            int i23 = i2 + 1;
            iArr2[i2] = iM3229;
            if (iM3229 == 16777220 || iM3229 == 16777219) {
                i2 += 2;
                iArr2[i23] = 16777216;
            } else {
                i2 = i23;
            }
        }
        while (i2 < i12) {
            c1420.f5115[i2] = 16777216;
            i2++;
        }
        c1420.m3231(this);
        c1774.f5923 = c1775;
        C1774 c17717 = c1774;
        int iMax = 0;
        while (c17717 != c1775) {
            C1774 c17718 = c17717.f5923;
            c17717.f5923 = null;
            c17717.f5913 = (short) (c17717.f5913 | 8);
            int length = c17717.f5920.f5116.length + c17717.f5918;
            if (length > iMax) {
                iMax = length;
            }
            C0231 c0233 = c17717.f5922;
            while (c0233 != null) {
                C1774 c1774M3654 = ((C1774) c0233.f1426).m3654();
                C1420 c1421 = c17717.f5920;
                C1420 c1422 = c1774M3654.f5920;
                int i24 = c0233.f1425;
                int length2 = c1421.f5115.length;
                int length3 = c1421.f5116.length;
                if (c1422.f5115 == null) {
                    c1422.f5115 = new int[length2];
                    zM3230 = true;
                } else {
                    zM3230 = false;
                }
                int i25 = iMax;
                C1774 c17719 = c17717;
                int i26 = 0;
                while (i26 < length2) {
                    int[] iArr3 = c1421.f5117;
                    int i27 = length3;
                    if (iArr3 == null || i26 >= iArr3.length || (i4 = iArr3[i26]) == 0) {
                        iM3233 = c1421.f5115[i26];
                    } else {
                        int i28 = i4 & (-268435456);
                        int i29 = i4 & 251658240;
                        if (i29 == 67108864) {
                            i5 = i28 + c1421.f5115[i4 & 1048575];
                            if ((i4 & 1048576) == 0 || !(i5 == 16777220 || i5 == 16777219)) {
                                iM3233 = i5;
                            } else {
                                iM3233 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                            }
                        } else if (i29 == 83886080) {
                            i5 = i28 + c1421.f5116[i27 - (i4 & 1048575)];
                            if ((i4 & 1048576) == 0 || !(i5 == 16777220 || i5 == 16777219)) {
                                iM3233 = i5;
                            } else {
                                iM3233 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                            }
                        } else {
                            iM3233 = i4;
                        }
                    }
                    if (c1421.f5122 != null) {
                        iM3233 = c1421.m3233(c2930, iM3233);
                    }
                    zM3230 |= C1420.m3230(c2930, iM3233, c1422.f5115, i26);
                    i26++;
                    length3 = i27;
                }
                int i30 = length3;
                if (i24 > 0) {
                    for (int i31 = 0; i31 < length2; i31++) {
                        zM3230 |= C1420.m3230(c2930, c1421.f5115[i31], c1422.f5115, i31);
                    }
                    if (c1422.f5116 == null) {
                        c1422.f5116 = new int[1];
                        zM3230 = true;
                    }
                    zM3231 = C1420.m3230(c2930, i24, c1422.f5116, 0) | zM3230;
                } else {
                    int length4 = c1421.f5116.length + c1421.f5119;
                    if (c1422.f5116 == null) {
                        c1422.f5116 = new int[c1421.f5120 + length4];
                        zM3230 = true;
                    }
                    for (int i32 = 0; i32 < length4; i32++) {
                        int iM3234 = c1421.f5116[i32];
                        if (c1421.f5122 != null) {
                            iM3234 = c1421.m3233(c2930, iM3234);
                        }
                        zM3230 |= C1420.m3230(c2930, iM3234, c1422.f5116, i32);
                    }
                    int i33 = 0;
                    while (i33 < c1421.f5120) {
                        int iM3235 = c1421.f5118[i33];
                        int i34 = iM3235 & (-268435456);
                        int i35 = iM3235 & 251658240;
                        int i36 = length4;
                        if (i35 == 67108864) {
                            int i37 = i34 + c1421.f5115[iM3235 & 1048575];
                            iM3235 = ((iM3235 & 1048576) == 0 || !(i37 == 16777220 || i37 == 16777219)) ? i37 : Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        } else {
                            if (i35 == 83886080) {
                                int i38 = i34 + c1421.f5116[i30 - (iM3235 & 1048575)];
                                if ((iM3235 & 1048576) != 0) {
                                    c3 = 3;
                                    if (i38 == 16777220 || i38 == 16777219) {
                                        iM3235 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                                    }
                                } else {
                                    c3 = 3;
                                }
                                iM3235 = i38;
                            }
                            if (c1421.f5122 != null) {
                                iM3235 = c1421.m3233(c2930, iM3235);
                            }
                            zM3230 |= C1420.m3230(c2930, iM3235, c1422.f5116, i36 + i33);
                            i33++;
                            length4 = i36;
                        }
                        if (c1421.f5122 != null) {
                            iM3235 = c1421.m3233(c2930, iM3235);
                        }
                        zM3230 |= C1420.m3230(c2930, iM3235, c1422.f5116, i36 + i33);
                        i33++;
                        length4 = i36;
                    }
                    zM3231 = zM3230;
                }
                if (zM3231 && c1774M3654.f5923 == null) {
                    c1774M3654.f5923 = c17718;
                    c17718 = c1774M3654;
                }
                c0233 = (C0231) c0233.f1427;
                iMax = i25;
                c17717 = c17719;
            }
            c17717 = c17718;
        }
        while (c1774 != null) {
            if ((c1774.f5913 & 10) == 10) {
                c1774.f5920.m3231(this);
            }
            if ((c1774.f5913 & 8) == 0) {
                C1774 c17720 = c1774.f5921;
                int i39 = c1774.f5914;
                C0493 c0493 = this.f6681;
                int i40 = (c17720 == null ? c0493.f2147 : c17720.f5914) - 1;
                if (i40 >= i39) {
                    for (int i41 = i39; i41 < i40; i41++) {
                        c0493.f2146[i41] = 0;
                    }
                    c0493.f2146[i40] = JSONB.Constants.BC_INT64_INT;
                    m4032(i39, 0, 1);
                    this.f6695[3] = c2930.m4935("java/lang/Throwable") | i3;
                    m4031();
                    this.f6682 = C0253.m1454(this.f6682, c1774, c17720);
                    iMax = Math.max(iMax, 1);
                }
            }
            c1774 = c1774.f5921;
        }
        this.f6679 = iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4039(int i, String str, String str2, String str3) {
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        C2930 c2930 = this.f6674;
        C2929 c2929M4931 = c2930.m4931(10, str, str2, str3);
        String str4 = c2929M4931.f9365;
        int i2 = c2929M4931.f9361;
        if (i == 185) {
            c0493.m1913(Opcodes.INVOKEINTERFACE, i2);
            if (c2929M4931.f9367 == 0) {
                c2929M4931.f9367 = C3506.m5037(str4);
            }
            c0493.m1912(c2929M4931.f9367 >> 2, 0);
        } else {
            c0493.m1913(i, i2);
        }
        C1774 c1774 = this.f6691;
        if (c1774 != null) {
            int i3 = this.f6688;
            if (i3 == 4 || i3 == 3) {
                c1774.f5920.m3232(i, 0, c2929M4931, c2930);
                return;
            }
            if (c2929M4931.f9367 == 0) {
                c2929M4931.f9367 = C3506.m5037(str4);
            }
            int i4 = c2929M4931.f9367;
            int i5 = (i4 & 3) - (i4 >> 2);
            int i6 = i == 184 ? this.f6692 + i5 + 1 : this.f6692 + i5;
            if (i6 > this.f6693) {
                this.f6693 = i6;
            }
            this.f6692 = i6;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m4040(int i, String str) {
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        C2930 c2930 = this.f6674;
        C2929 c2929M4933 = c2930.m4933(7, str);
        c0493.m1913(i, c2929M4933.f9361);
        C1774 c1774 = this.f6691;
        if (c1774 != null) {
            int i2 = this.f6688;
            if (i2 == 4 || i2 == 3) {
                c1774.f5920.m3232(i, this.f6698, c2929M4933, c2930);
            } else if (i == 187) {
                int i3 = this.f6692 + 1;
                if (i3 > this.f6693) {
                    this.f6693 = i3;
                }
                this.f6692 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m4041(int i, int i2) {
        C0493 c0493 = this.f6681;
        this.f6698 = c0493.f2147;
        if (i2 < 4 && i != 169) {
            c0493.m1915((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c0493.m1915(196);
            c0493.m1913(i, i2);
        } else {
            c0493.m1912(i, i2);
        }
        C1774 c1774 = this.f6691;
        int i3 = this.f6688;
        if (c1774 != null) {
            if (i3 == 4 || i3 == 3) {
                c1774.f5920.m3232(i, i2, null, null);
            } else if (i == 169) {
                c1774.f5913 = (short) (c1774.f5913 | 64);
                c1774.f5917 = (short) this.f6692;
                m4028();
            } else {
                int i4 = this.f6692 + f6672[i];
                if (i4 > this.f6693) {
                    this.f6693 = i4;
                }
                this.f6692 = i4;
            }
        }
        if (i3 != 0) {
            int i5 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i5 > this.f6680) {
                this.f6680 = i5;
            }
        }
        if (i < 54 || i3 != 4 || this.f6682 == null) {
            return;
        }
        m4036(new C1774());
    }
}
