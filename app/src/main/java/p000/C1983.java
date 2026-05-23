package p000;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1983 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f6567 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2870 f6569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f6572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f6573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0243 f6577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0516 f6579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int f6580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int[] f6581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int f6582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f6583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C1752 f6584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C1752 f6585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C1752 f6586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f6587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f6588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int[] f6589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int[] f6590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f6591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f6592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f6593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1983 f6568 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0516 f6576 = new C0516();

    public C1983(C2870 c2870, int i, String str, String str2, String str3, String[] strArr, int i2) {
        this.f6569 = c2870;
        this.f6570 = "<init>".equals(str) ? 262144 | i : i;
        this.f6571 = c2870.m4871(str);
        this.f6572 = c2870.m4871(str2);
        this.f6573 = str2;
        this.f6582 = str3 == null ? 0 : c2870.m4871(str3);
        if (strArr == null || strArr.length <= 0) {
            this.f6580 = 0;
            this.f6581 = null;
        } else {
            int length = strArr.length;
            this.f6580 = length;
            this.f6581 = new int[length];
            for (int i3 = 0; i3 < this.f6580; i3++) {
                this.f6581[i3] = c2870.m4872(7, strArr[i3]).f9191;
            }
        }
        this.f6583 = i2;
        if (i2 != 0) {
            int iM4976 = C3449.m4976(str2) >> 2;
            this.f6575 = (i & 8) != 0 ? iM4976 - 1 : iM4976;
            C1752 c1752 = new C1752();
            this.f6584 = c1752;
            m3842(c1752);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3833(int i, C1752 c1752) {
        C1752 c1753 = this.f6586;
        c1753.f5869 = new C0221(i, c1752, c1753.f5869);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3834() {
        int i = this.f6583;
        if (i != 4) {
            if (i == 1) {
                this.f6586.f5865 = (short) this.f6588;
                this.f6586 = null;
                return;
            }
            return;
        }
        C1752 c1752 = new C1752();
        c1752.f5867 = new C1412(c1752);
        C0516 c0516 = this.f6576;
        c1752.m3505(c0516.f2190, c0516.f2191);
        this.f6585.f5868 = c1752;
        this.f6585 = c1752;
        this.f6586 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3835(int i, int i2) {
        while (i < i2) {
            int i3 = this.f6590[i];
            C0516 c0516 = this.f6579;
            int i4 = ((-268435456) & i3) >> 28;
            C2870 c2870 = this.f6569;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 251658240;
                if (i6 == 16777216) {
                    c0516.m1821(i5);
                } else if (i6 == 33554432) {
                    c0516.m1821(7);
                    c0516.m1824(c2870.m4872(7, c2870.f9207[i5].f9195).f9191);
                } else {
                    if (i6 != 50331648) {
                        throw new AssertionError();
                    }
                    c0516.m1821(8);
                    c0516.m1824((int) c2870.f9207[i5].f9196);
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
                            sb.append(c2870.f9207[i3 & 1048575].f9195);
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
                        c0516.m1821(7);
                        c0516.m1824(c2870.m4872(7, sb.toString()).f9191);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3836(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        C2870 c2870 = this.f6569;
        C2869 c2869M4870 = c2870.m4870(9, str, str2, str3);
        c0516.m1819(i, c2869M4870.f9191);
        C1752 c1752 = this.f6586;
        if (c1752 != null) {
            int i4 = this.f6583;
            if (i4 == 4 || i4 == 3) {
                c1752.f5867.m3124(i, 0, c2869M4870, c2870);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case Opcodes.GETSTATIC /* 178 */:
                    i2 = this.f6587 + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case Opcodes.PUTSTATIC /* 179 */:
                    i3 = this.f6587;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case Opcodes.GETFIELD /* 180 */:
                    i2 = this.f6587 + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.f6587;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.f6588) {
                this.f6588 = i2;
            }
            this.f6587 = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3837() {
        char c;
        int i;
        int[] iArr = this.f6589;
        if (iArr != null) {
            if (this.f6579 == null) {
                this.f6579 = new C0516();
            }
            int[] iArr2 = this.f6590;
            boolean z = true;
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            int i4 = 0;
            int i5 = 3;
            if (this.f6569.f9200 < 50) {
                C0516 c0516 = this.f6579;
                c0516.m1824(iArr2[0]);
                c0516.m1824(i2);
                int i6 = i2 + 3;
                m3835(3, i6);
                this.f6579.m1824(i3);
                m3835(i6, i3 + i6);
            } else {
                int i7 = this.f6578 == 0 ? iArr2[0] : (iArr2[0] - iArr[0]) - 1;
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
                            if (this.f6590[i10] != this.f6589[i10]) {
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
                    this.f6579.m1821(i7);
                } else if (c == '@') {
                    this.f6579.m1821(i7 + 64);
                    m3835(i2 + 3, i2 + 4);
                } else if (c == 247) {
                    C0516 c0517 = this.f6579;
                    c0517.m1821(247);
                    c0517.m1824(i7);
                    m3835(i2 + 3, i2 + 4);
                } else if (c == 248) {
                    C0516 c0518 = this.f6579;
                    c0518.m1821(i9 + 251);
                    c0518.m1824(i7);
                } else if (c == 251) {
                    C0516 c0519 = this.f6579;
                    c0519.m1821(251);
                    c0519.m1824(i7);
                } else if (c != 252) {
                    C0516 c05110 = this.f6579;
                    c05110.m1821(255);
                    c05110.m1824(i7);
                    c05110.m1824(i2);
                    int i11 = i2 + 3;
                    m3835(i, i11);
                    this.f6579.m1824(i3);
                    m3835(i11, i3 + i11);
                } else {
                    int i12 = i;
                    C0516 c05111 = this.f6579;
                    c05111.m1821(i9 + 251);
                    c05111.m1824(i7);
                    m3835(i8 + i12, i2 + i12);
                }
            }
            this.f6578++;
        }
        this.f6589 = this.f6590;
        this.f6590 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3838(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f6590;
        if (iArr == null || iArr.length < i4) {
            this.f6590 = new int[i4];
        }
        int[] iArr2 = this.f6590;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3839(int i) {
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        c0516.m1821(i);
        C1752 c1752 = this.f6586;
        if (c1752 != null) {
            int i2 = this.f6583;
            if (i2 == 4 || i2 == 3) {
                c1752.f5867.m3124(i, 0, null, null);
            } else {
                int i3 = this.f6587 + f6567[i];
                if (i3 > this.f6588) {
                    this.f6588 = i3;
                }
                this.f6587 = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m3834();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3840(int i, int i2) {
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        if (i == 17) {
            c0516.m1819(i, i2);
        } else {
            c0516.m1818(i, i2);
        }
        C1752 c1752 = this.f6586;
        if (c1752 != null) {
            int i3 = this.f6583;
            if (i3 == 4 || i3 == 3) {
                c1752.f5867.m3124(i, i2, null, null);
            } else if (i != 188) {
                int i4 = this.f6587 + 1;
                if (i4 > this.f6588) {
                    this.f6588 = i4;
                }
                this.f6587 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3841(int i, C1752 c1752) {
        boolean z;
        C0516 c0516 = this.f6576;
        int i2 = c0516.f2191;
        this.f6593 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c1752.f5860 & 4) == 0 || c1752.f5861 - i2 >= -32768) {
            if (i3 != i) {
                c0516.m1821(i);
                c1752.m3504(c0516, c0516.f2191 - 1, true);
            } else {
                c0516.m1821(i3);
                c1752.m3504(c0516, c0516.f2191 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c0516.m1821(200);
            } else {
                if (i3 == 168) {
                    c0516.m1821(201);
                } else {
                    c0516.m1821(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                    c0516.m1824(8);
                    c0516.m1821(220);
                    this.f6592 = true;
                    z = true;
                }
                c1752.m3504(c0516, c0516.f2191 - 1, true);
            }
            z = false;
            c1752.m3504(c0516, c0516.f2191 - 1, true);
        }
        C1752 c1753 = this.f6586;
        if (c1753 != null) {
            C1752 c1754 = null;
            int i4 = this.f6583;
            if (i4 == 4) {
                c1753.f5867.m3124(i3, 0, null, null);
                C1752 c1752M3502 = c1752.m3502();
                c1752M3502.f5860 = (short) (c1752M3502.f5860 | 2);
                m3833(0, c1752);
                if (i3 != 167) {
                    c1754 = new C1752();
                }
            } else if (i4 == 3) {
                c1753.f5867.m3124(i3, 0, null, null);
            } else {
                int[] iArr = f6567;
                if (i4 == 2) {
                    this.f6587 += iArr[i3];
                } else if (i3 == 168) {
                    short s = c1752.f5860;
                    if ((s & 32) == 0) {
                        c1752.f5860 = (short) (s | 32);
                        this.f6591 = true;
                    }
                    c1753.f5860 = (short) (c1753.f5860 | 16);
                    m3833(this.f6587 + 1, c1752);
                    c1754 = new C1752();
                } else {
                    int i5 = this.f6587 + iArr[i3];
                    this.f6587 = i5;
                    m3833(i5, c1752);
                }
            }
            if (c1754 != null) {
                if (z) {
                    c1754.f5860 = (short) (c1754.f5860 | 2);
                }
                m3842(c1754);
            }
            if (i3 == 167) {
                m3834();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3842(C1752 c1752) {
        boolean z = this.f6592;
        C0516 c0516 = this.f6576;
        this.f6592 = z | c1752.m3505(c0516.f2190, c0516.f2191);
        short s = c1752.f5860;
        if ((s & 1) != 0) {
            return;
        }
        int i = this.f6583;
        if (i == 4) {
            C1752 c1753 = this.f6586;
            if (c1753 != null) {
                if (c1752.f5861 == c1753.f5861) {
                    c1753.f5860 = (short) ((s & 2) | c1753.f5860);
                    c1752.f5867 = c1753.f5867;
                    return;
                }
                m3833(0, c1752);
            }
            C1752 c1754 = this.f6585;
            if (c1754 != null) {
                if (c1752.f5861 == c1754.f5861) {
                    c1754.f5860 = (short) (c1754.f5860 | (c1752.f5860 & 2));
                    c1752.f5867 = c1754.f5867;
                    this.f6586 = c1754;
                    return;
                }
                c1754.f5868 = c1752;
            }
            this.f6585 = c1752;
            this.f6586 = c1752;
            c1752.f5867 = new C1412(c1752);
            return;
        }
        if (i == 3) {
            C1752 c1755 = this.f6586;
            if (c1755 == null) {
                this.f6586 = c1752;
                return;
            } else {
                c1755.f5867.f5085 = c1752;
                return;
            }
        }
        if (i != 1) {
            if (i == 2 && this.f6586 == null) {
                this.f6586 = c1752;
                return;
            }
            return;
        }
        C1752 c1756 = this.f6586;
        if (c1756 != null) {
            c1756.f5865 = (short) this.f6588;
            m3833(this.f6587, c1752);
        }
        this.f6586 = c1752;
        this.f6587 = 0;
        this.f6588 = 0;
        C1752 c1757 = this.f6585;
        if (c1757 != null) {
            c1757.f5868 = c1752;
        }
        this.f6585 = c1752;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3843(Object obj) {
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        C2870 c2870 = this.f6569;
        C2869 c2869M4867 = c2870.m4867(obj);
        int i = c2869M4867.f9191;
        int i2 = c2869M4867.f9192;
        boolean z = i2 == 5 || i2 == 6;
        if (z) {
            c0516.m1819(20, i);
        } else if (i >= 256) {
            c0516.m1819(19, i);
        } else {
            c0516.m1818(18, i);
        }
        C1752 c1752 = this.f6586;
        if (c1752 != null) {
            int i3 = this.f6583;
            if (i3 == 4 || i3 == 3) {
                c1752.f5867.m3124(18, 0, c2869M4867, c2870);
                return;
            }
            int i4 = this.f6587 + (z ? 2 : 1);
            if (i4 > this.f6588) {
                this.f6588 = i4;
            }
            this.f6587 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0270  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:287:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178 A[PHI: r3
      0x0178: PHI (r3v70 int) = (r3v69 int), (r3v69 int), (r3v72 int), (r3v72 int) binds: [B:89:0x018a, B:93:0x0194, B:79:0x0169, B:83:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3844() {
        int i;
        int i2;
        String str;
        int i3;
        char c;
        char c2;
        boolean zM3122;
        boolean zM3123;
        char c3;
        int iM3125;
        int i4;
        int i5;
        int i6;
        int i7;
        C1752 c1752 = this.f6584;
        C1752 c1753 = C1752.f5859;
        int i8 = this.f6583;
        if (i8 != 4) {
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f6574 = this.f6588;
                    return;
                } else {
                    this.f6574 = 0;
                    this.f6575 = 0;
                    return;
                }
            }
            for (C0243 c0243 = this.f6577; c0243 != null; c0243 = (C0243) c0243.f1406) {
                C1752 c1754 = (C1752) c0243.f1405;
                for (C1752 c1755 = (C1752) c0243.f1404; c1755 != c1754; c1755 = c1755.f5868) {
                    if ((c1755.f5860 & 16) == 0) {
                        c1755.f5869 = new C0221(Integer.MAX_VALUE, (C1752) null, c1755.f5869);
                    } else {
                        C0221 c0221 = (C0221) c1755.f5869.f1353;
                        c0221.f1353 = new C0221(Integer.MAX_VALUE, (C1752) null, (C0221) c0221.f1353);
                    }
                }
            }
            if (this.f6591) {
                c1752.f5870 = c1753;
                C1752 c1752M3503 = c1752;
                while (c1752M3503 != c1753) {
                    C1752 c1756 = c1752M3503.f5870;
                    c1752M3503.f5870 = null;
                    if (c1752M3503.f5866 == 0) {
                        c1752M3503.f5866 = (short) 1;
                        c1752M3503 = c1752M3503.m3503(c1756);
                    } else {
                        c1752M3503 = c1756;
                    }
                }
                i = 1;
                short s = 1;
                for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
                    for (C1752 c1757 = c1752; c1757 != null; c1757 = c1757.f5868) {
                        if ((c1757.f5860 & 16) != 0 && c1757.f5866 == s2) {
                            C1752 c1752M3504 = (C1752) ((C0221) c1757.f5869.f1353).f1352;
                            if (c1752M3504.f5866 == 0) {
                                s = (short) (s + 1);
                                c1752M3504.f5870 = c1753;
                                while (c1752M3504 != c1753) {
                                    C1752 c1758 = c1752M3504.f5870;
                                    c1752M3504.f5870 = null;
                                    if (c1752M3504.f5866 == 0) {
                                        c1752M3504.f5866 = s;
                                        c1752M3504 = c1752M3504.m3503(c1758);
                                    } else {
                                        c1752M3504 = c1758;
                                    }
                                }
                            }
                        }
                    }
                }
                for (C1752 c1759 = c1752; c1759 != null; c1759 = c1759.f5868) {
                    if ((c1759.f5860 & 16) != 0) {
                        C1752 c1752M3505 = (C1752) ((C0221) c1759.f5869.f1353).f1352;
                        c1752M3505.f5870 = c1753;
                        C1752 c17510 = c1753;
                        while (c1752M3505 != c1753) {
                            C1752 c17511 = c1752M3505.f5870;
                            c1752M3505.f5870 = c17510;
                            if ((c1752M3505.f5860 & 64) != 0 && c1752M3505.f5866 != c1759.f5866) {
                                c1752M3505.f5869 = new C0221(c1752M3505.f5864, (C1752) c1759.f5869.f1352, c1752M3505.f5869);
                            }
                            c17510 = c1752M3505;
                            c1752M3505 = c1752M3505.m3503(c17511);
                        }
                        while (c17510 != c1753) {
                            C1752 c17512 = c17510.f5870;
                            c17510.f5870 = null;
                            c17510 = c17512;
                        }
                    }
                }
            } else {
                i = 1;
            }
            c1752.f5870 = c1753;
            int i9 = this.f6574;
            while (c1752 != c1753) {
                C1752 c17513 = c1752.f5870;
                short s3 = c1752.f5863;
                int i10 = c1752.f5865 + s3;
                if (i10 > i9) {
                    i9 = i10;
                }
                C0221 c0222 = c1752.f5869;
                if ((c1752.f5860 & 16) != 0) {
                    c0222 = (C0221) c0222.f1353;
                }
                c1752 = c17513;
                while (c0222 != null) {
                    C1752 c17514 = (C1752) c0222.f1352;
                    if (c17514.f5870 == null) {
                        int i11 = c0222.f1351;
                        c17514.f5863 = (short) (i11 == Integer.MAX_VALUE ? i : i11 + s3);
                        c17514.f5870 = c1752;
                        c1752 = c17514;
                    }
                    c0222 = (C0221) c0222.f1353;
                }
            }
            this.f6574 = i9;
            return;
        }
        C0243 c0244 = this.f6577;
        C2870 c2870 = this.f6569;
        if (c0244 != null) {
            c2870.m4874("java/lang/Throwable");
            throw null;
        }
        C1412 c1412 = c1752.f5867;
        int i12 = this.f6575;
        c1412.getClass();
        int[] iArr = new int[i12];
        c1412.f5086 = iArr;
        c1412.f5087 = new int[0];
        int i13 = this.f6570;
        int i14 = 33554432;
        if ((i13 & 8) == 0) {
            if ((i13 & 262144) == 0) {
                iArr[0] = c2870.m4874(c2870.f9201) | 33554432;
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
            str = this.f6573;
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
        C3449[] c3449Arr = new C3449[i15];
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
            c3449Arr[i19] = C3449.m4979(i18, i21, str);
            i18 = i21;
            i19++;
            c2 = ')';
            c = '[';
        }
        for (int i22 = 0; i22 < i15; i22++) {
            int iM3121 = C1412.m3121(c2870, c3449Arr[i22].m4982(), 0);
            int[] iArr2 = c1412.f5086;
            int i23 = i2 + 1;
            iArr2[i2] = iM3121;
            if (iM3121 == 16777220 || iM3121 == 16777219) {
                i2 += 2;
                iArr2[i23] = 16777216;
            } else {
                i2 = i23;
            }
        }
        while (i2 < i12) {
            c1412.f5086[i2] = 16777216;
            i2++;
        }
        c1412.m3123(this);
        c1752.f5870 = c1753;
        C1752 c17515 = c1752;
        int iMax = 0;
        while (c17515 != c1753) {
            C1752 c17516 = c17515.f5870;
            c17515.f5870 = null;
            c17515.f5860 = (short) (c17515.f5860 | 8);
            int length = c17515.f5867.f5087.length + c17515.f5865;
            if (length > iMax) {
                iMax = length;
            }
            C0221 c0223 = c17515.f5869;
            while (c0223 != null) {
                C1752 c1752M3502 = ((C1752) c0223.f1352).m3502();
                C1412 c1413 = c17515.f5867;
                C1412 c1414 = c1752M3502.f5867;
                int i24 = c0223.f1351;
                int length2 = c1413.f5086.length;
                int length3 = c1413.f5087.length;
                if (c1414.f5086 == null) {
                    c1414.f5086 = new int[length2];
                    zM3122 = true;
                } else {
                    zM3122 = false;
                }
                int i25 = iMax;
                C1752 c17517 = c17515;
                int i26 = 0;
                while (i26 < length2) {
                    int[] iArr3 = c1413.f5088;
                    int i27 = length3;
                    if (iArr3 == null || i26 >= iArr3.length || (i4 = iArr3[i26]) == 0) {
                        iM3125 = c1413.f5086[i26];
                    } else {
                        int i28 = i4 & (-268435456);
                        int i29 = i4 & 251658240;
                        if (i29 == 67108864) {
                            i5 = i28 + c1413.f5086[i4 & 1048575];
                            if ((i4 & 1048576) == 0 || !(i5 == 16777220 || i5 == 16777219)) {
                                iM3125 = i5;
                            } else {
                                iM3125 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                            }
                        } else if (i29 == 83886080) {
                            i5 = i28 + c1413.f5087[i27 - (i4 & 1048575)];
                            if ((i4 & 1048576) == 0 || !(i5 == 16777220 || i5 == 16777219)) {
                                iM3125 = i5;
                            } else {
                                iM3125 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                            }
                        } else {
                            iM3125 = i4;
                        }
                    }
                    if (c1413.f5093 != null) {
                        iM3125 = c1413.m3125(c2870, iM3125);
                    }
                    zM3122 |= C1412.m3122(c2870, iM3125, c1414.f5086, i26);
                    i26++;
                    length3 = i27;
                }
                int i30 = length3;
                if (i24 > 0) {
                    for (int i31 = 0; i31 < length2; i31++) {
                        zM3122 |= C1412.m3122(c2870, c1413.f5086[i31], c1414.f5086, i31);
                    }
                    if (c1414.f5087 == null) {
                        c1414.f5087 = new int[1];
                        zM3122 = true;
                    }
                    zM3123 = C1412.m3122(c2870, i24, c1414.f5087, 0) | zM3122;
                } else {
                    int length4 = c1413.f5087.length + c1413.f5090;
                    if (c1414.f5087 == null) {
                        c1414.f5087 = new int[c1413.f5091 + length4];
                        zM3122 = true;
                    }
                    for (int i32 = 0; i32 < length4; i32++) {
                        int iM3126 = c1413.f5087[i32];
                        if (c1413.f5093 != null) {
                            iM3126 = c1413.m3125(c2870, iM3126);
                        }
                        zM3122 |= C1412.m3122(c2870, iM3126, c1414.f5087, i32);
                    }
                    int i33 = 0;
                    while (i33 < c1413.f5091) {
                        int iM3127 = c1413.f5089[i33];
                        int i34 = iM3127 & (-268435456);
                        int i35 = iM3127 & 251658240;
                        int i36 = length4;
                        if (i35 == 67108864) {
                            int i37 = i34 + c1413.f5086[iM3127 & 1048575];
                            iM3127 = ((iM3127 & 1048576) == 0 || !(i37 == 16777220 || i37 == 16777219)) ? i37 : Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        } else {
                            if (i35 == 83886080) {
                                int i38 = i34 + c1413.f5087[i30 - (iM3127 & 1048575)];
                                if ((iM3127 & 1048576) != 0) {
                                    c3 = 3;
                                    if (i38 == 16777220 || i38 == 16777219) {
                                        iM3127 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                                    }
                                } else {
                                    c3 = 3;
                                }
                                iM3127 = i38;
                            }
                            if (c1413.f5093 != null) {
                                iM3127 = c1413.m3125(c2870, iM3127);
                            }
                            zM3122 |= C1412.m3122(c2870, iM3127, c1414.f5087, i36 + i33);
                            i33++;
                            length4 = i36;
                        }
                        if (c1413.f5093 != null) {
                            iM3127 = c1413.m3125(c2870, iM3127);
                        }
                        zM3122 |= C1412.m3122(c2870, iM3127, c1414.f5087, i36 + i33);
                        i33++;
                        length4 = i36;
                    }
                    zM3123 = zM3122;
                }
                if (zM3123 && c1752M3502.f5870 == null) {
                    c1752M3502.f5870 = c17516;
                    c17516 = c1752M3502;
                }
                c0223 = (C0221) c0223.f1353;
                iMax = i25;
                c17515 = c17517;
            }
            c17515 = c17516;
        }
        while (c1752 != null) {
            if ((c1752.f5860 & 10) == 10) {
                c1752.f5867.m3123(this);
            }
            if ((c1752.f5860 & 8) == 0) {
                C1752 c17518 = c1752.f5868;
                int i39 = c1752.f5861;
                C0516 c0516 = this.f6576;
                int i40 = (c17518 == null ? c0516.f2191 : c17518.f5861) - 1;
                if (i40 >= i39) {
                    for (int i41 = i39; i41 < i40; i41++) {
                        c0516.f2190[i41] = 0;
                    }
                    c0516.f2190[i40] = JSONB.Constants.BC_INT64_INT;
                    m3838(i39, 0, 1);
                    this.f6590[3] = c2870.m4874("java/lang/Throwable") | i3;
                    m3837();
                    this.f6577 = C0243.m1308(this.f6577, c1752, c17518);
                    iMax = Math.max(iMax, 1);
                }
            }
            c1752 = c1752.f5868;
        }
        this.f6574 = iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3845(int i, String str, String str2, String str3) {
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        C2870 c2870 = this.f6569;
        C2869 c2869M4870 = c2870.m4870(10, str, str2, str3);
        String str4 = c2869M4870.f9195;
        int i2 = c2869M4870.f9191;
        if (i == 185) {
            c0516.m1819(Opcodes.INVOKEINTERFACE, i2);
            if (c2869M4870.f9197 == 0) {
                c2869M4870.f9197 = C3449.m4976(str4);
            }
            c0516.m1818(c2869M4870.f9197 >> 2, 0);
        } else {
            c0516.m1819(i, i2);
        }
        C1752 c1752 = this.f6586;
        if (c1752 != null) {
            int i3 = this.f6583;
            if (i3 == 4 || i3 == 3) {
                c1752.f5867.m3124(i, 0, c2869M4870, c2870);
                return;
            }
            if (c2869M4870.f9197 == 0) {
                c2869M4870.f9197 = C3449.m4976(str4);
            }
            int i4 = c2869M4870.f9197;
            int i5 = (i4 & 3) - (i4 >> 2);
            int i6 = i == 184 ? this.f6587 + i5 + 1 : this.f6587 + i5;
            if (i6 > this.f6588) {
                this.f6588 = i6;
            }
            this.f6587 = i6;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3846(int i, String str) {
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        C2870 c2870 = this.f6569;
        C2869 c2869M4872 = c2870.m4872(7, str);
        c0516.m1819(i, c2869M4872.f9191);
        C1752 c1752 = this.f6586;
        if (c1752 != null) {
            int i2 = this.f6583;
            if (i2 == 4 || i2 == 3) {
                c1752.f5867.m3124(i, this.f6593, c2869M4872, c2870);
            } else if (i == 187) {
                int i3 = this.f6587 + 1;
                if (i3 > this.f6588) {
                    this.f6588 = i3;
                }
                this.f6587 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3847(int i, int i2) {
        C0516 c0516 = this.f6576;
        this.f6593 = c0516.f2191;
        if (i2 < 4 && i != 169) {
            c0516.m1821((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c0516.m1821(196);
            c0516.m1819(i, i2);
        } else {
            c0516.m1818(i, i2);
        }
        C1752 c1752 = this.f6586;
        int i3 = this.f6583;
        if (c1752 != null) {
            if (i3 == 4 || i3 == 3) {
                c1752.f5867.m3124(i, i2, null, null);
            } else if (i == 169) {
                c1752.f5860 = (short) (c1752.f5860 | 64);
                c1752.f5864 = (short) this.f6587;
                m3834();
            } else {
                int i4 = this.f6587 + f6567[i];
                if (i4 > this.f6588) {
                    this.f6588 = i4;
                }
                this.f6587 = i4;
            }
        }
        if (i3 != 0) {
            int i5 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i5 > this.f6575) {
                this.f6575 = i5;
            }
        }
        if (i < 54 || i3 != 4 || this.f6577 == null) {
            return;
        }
        m3842(new C1752());
    }
}
