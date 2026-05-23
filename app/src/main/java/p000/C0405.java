package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲇᲁᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0405 implements InterfaceC0541 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0768 f1903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int[] f1904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int[] f1905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int[] f1906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1660[] f1907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0536[] f1908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f1909;

    public C0405(C0768 c0768) {
        this.f1903 = c0768;
        int i = ((C0516) c0768.f2867.f1495.f2252).f2191 + 1;
        this.f1904 = AbstractC1574.m3302(i);
        this.f1905 = AbstractC1574.m3302(i);
        this.f1906 = AbstractC1574.m3302(i);
        this.f1907 = new C1660[i];
        this.f1908 = new C0536[i];
        this.f1909 = -1;
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1577(int i, int i2, C0918 c0918, ArrayList arrayList) {
        m1599(i, i2, true);
        m1600(i, i2, true);
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1578(int i, int i2, int i3, int i4, C3448 c3448, int i5) {
        if (i != 169) {
            m1599(i2, i3, true);
        } else {
            m1599(i2, i3, false);
            this.f1907[i2] = C1660.f5608;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1598(int i, boolean z) {
        if (!AbstractC1574.m3297(this.f1905, i)) {
            AbstractC1574.m3310(this.f1904, i);
        }
        if (z) {
            AbstractC1574.m3310(this.f1906, i);
        }
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1580(int i, int i2, int i3, AbstractC0777 abstractC0777, int i4) {
        m1599(i2, i3, true);
        if ((abstractC0777 instanceof AbstractC0911) || (abstractC0777 instanceof C0918) || (abstractC0777 instanceof C0917) || (abstractC0777 instanceof C0905) || (abstractC0777 instanceof C0912) || (abstractC0777 instanceof C0915)) {
            m1600(i2, i3, true);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1599(int i, int i2, boolean z) {
        AbstractC1574.m3310(this.f1905, i);
        if (z) {
            m1598(i + i2, false);
        } else {
            AbstractC1574.m3310(this.f1906, i + i2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1600(int i, int i2, boolean z) {
        C0536 c0536;
        C1660 c1660M3381;
        int i3 = i2 + i;
        if (z) {
            m1598(i3, true);
        }
        C0536 c0537 = this.f1903.f2867.f1496;
        int length = c0537.f4836.length;
        C0535[] c0535Arr = new C0535[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            C0535 c0535 = (C0535) c0537.m3062(i5);
            if (i >= c0535.f2235 && i < c0535.f2236) {
                C0918 c0918 = c0535.f2238;
                if (c0918 == null) {
                    c0918 = C0918.f3381;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= i4) {
                        c0535Arr[i4] = c0535;
                        i4++;
                        break;
                    }
                    C0918 c0919 = c0535Arr[i6].f2238;
                    if (c0919 == null) {
                        c0919 = C0918.f3381;
                    }
                    if (c0919 == c0918 || c0919 == C0918.f3381) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        if (i4 == 0) {
            c0536 = C0536.f2239;
        } else {
            c0536 = new C0536(i4);
            for (int i7 = 0; i7 < i4; i7++) {
                C0535 c0538 = c0535Arr[i7];
                if (c0538 == null) {
                    throw new NullPointerException("item == null");
                }
                c0536.m3063(i7, c0538);
            }
            c0536.f6944 = false;
        }
        this.f1908[i] = c0536;
        if (!z) {
            i3 = -1;
        }
        c0536.getClass();
        if (i3 < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i8 = i3 < 0 ? 0 : 1;
        int length2 = c0536.f4836.length;
        if (length2 == 0) {
            c1660M3381 = i8 != 0 ? C1660.m3381(i3) : C1660.f5608;
        } else {
            C1660 c1660 = new C1660(length2 + i8);
            for (int i9 = 0; i9 < length2; i9++) {
                c1660.m3382(((C0535) c0536.m3062(i9)).f2237);
            }
            if (i8 != 0) {
                c1660.m3382(i3);
            }
            c1660.f6944 = false;
            c1660M3381 = c1660;
        }
        this.f1907[i] = c1660M3381;
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1585(int i, int i2) {
        m1599(i2, 1, true);
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1586(int i, int i2, C1242 c1242, int i3) {
        m1599(i, i2, false);
        C1660 c1660 = (C1660) c1242.f4509;
        m1598(c1660.m3384(c1242.f4507), true);
        int i4 = c1242.f4507;
        for (int i5 = 0; i5 < i4; i5++) {
            m1598(c1660.m3384(i5), true);
        }
        this.f1907[i] = c1660;
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1587() {
        return this.f1909;
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo1590(int i, int i2, int i3, int i4) {
        C1660[] c1660Arr = this.f1907;
        if (i != 167) {
            if (i == 168) {
                m1598(i2, true);
            }
            int i5 = i2 + i3;
            m1599(i2, i3, true);
            m1598(i5, true);
            C1660 c1660 = new C1660(2);
            c1660.m3382(i5);
            c1660.m3382(i4);
            c1660.f6944 = false;
            c1660Arr[i2] = c1660;
        } else {
            m1599(i2, i3, false);
            c1660Arr[i2] = C1660.m3381(i4);
        }
        m1598(i4, true);
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1591(int i, int i2, C3448 c3448) {
        if (i == 108 || i == 112) {
            m1599(i2, 1, true);
            if (c3448 == C3448.f10871 || c3448 == C3448.f10872) {
                m1600(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m1599(i2, 1, false);
            this.f1907[i2] = C1660.f5608;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m1599(i2, 1, false);
                m1600(i2, 1, false);
                return;
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case Opcodes.IALOAD /* 46 */:
                    case 47:
                    case 48:
                    case 49:
                    case Opcodes.AALOAD /* 50 */:
                    case Opcodes.BALOAD /* 51 */:
                    case 52:
                    case Opcodes.SALOAD /* 53 */:
                        break;
                    default:
                        switch (i) {
                            case Opcodes.IASTORE /* 79 */:
                            case 80:
                            case 81:
                            case 82:
                            case Opcodes.AASTORE /* 83 */:
                            case Opcodes.BASTORE /* 84 */:
                            case Opcodes.CASTORE /* 85 */:
                            case 86:
                                break;
                            default:
                                m1599(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m1599(i2, 1, true);
        m1600(i2, 1, true);
    }
}
