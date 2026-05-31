package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲁᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0380 implements InterfaceC0518 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0766 f1875;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int[] f1876;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int[] f1877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int[] f1878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1676[] f1879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0513[] f1880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f1881;

    public C0380(C0766 c0766) {
        this.f1875 = c0766;
        int i = ((C0493) c0766.f2869.f1569.f2208).f2147 + 1;
        this.f1876 = AbstractC1467.m3279(i);
        this.f1877 = AbstractC1467.m3279(i);
        this.f1878 = AbstractC1467.m3279(i);
        this.f1879 = new C1676[i];
        this.f1880 = new C0513[i];
        this.f1881 = -1;
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1683(int i, int i2, C0917 c0917, ArrayList arrayList) {
        m1705(i, i2, true);
        m1706(i, i2, true);
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1684(int i, int i2, int i3, int i4, C3505 c3505, int i5) {
        if (i != 169) {
            m1705(i2, i3, true);
        } else {
            m1705(i2, i3, false);
            this.f1879[i2] = C1676.f5646;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1704(int i, boolean z) {
        if (!AbstractC1467.m3271(this.f1877, i)) {
            AbstractC1467.m3287(this.f1876, i);
        }
        if (z) {
            AbstractC1467.m3287(this.f1878, i);
        }
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1686(int i, int i2, int i3, AbstractC0775 abstractC0775, int i4) {
        m1705(i2, i3, true);
        if ((abstractC0775 instanceof AbstractC0910) || (abstractC0775 instanceof C0917) || (abstractC0775 instanceof C0916) || (abstractC0775 instanceof C0904) || (abstractC0775 instanceof C0911) || (abstractC0775 instanceof C0914)) {
            m1706(i2, i3, true);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1705(int i, int i2, boolean z) {
        AbstractC1467.m3287(this.f1877, i);
        if (z) {
            m1704(i + i2, false);
        } else {
            AbstractC1467.m3287(this.f1878, i + i2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1706(int i, int i2, boolean z) {
        C0513 c0513;
        C1676 c1676M3545;
        int i3 = i2 + i;
        if (z) {
            m1704(i3, true);
        }
        C0513 c0514 = this.f1875.f2869.f1570;
        int length = c0514.f4833.length;
        C0512[] c0512Arr = new C0512[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            C0512 c0512 = (C0512) c0514.m3165(i5);
            if (i >= c0512.f2191 && i < c0512.f2192) {
                C0917 c0917 = c0512.f2194;
                if (c0917 == null) {
                    c0917 = C0917.f3388;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= i4) {
                        c0512Arr[i4] = c0512;
                        i4++;
                        break;
                    }
                    C0917 c0918 = c0512Arr[i6].f2194;
                    if (c0918 == null) {
                        c0918 = C0917.f3388;
                    }
                    if (c0918 == c0917 || c0918 == C0917.f3388) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        if (i4 == 0) {
            c0513 = C0513.f2195;
        } else {
            c0513 = new C0513(i4);
            for (int i7 = 0; i7 < i4; i7++) {
                C0512 c0515 = c0512Arr[i7];
                if (c0515 == null) {
                    throw new NullPointerException("item == null");
                }
                c0513.m3166(i7, c0515);
            }
            c0513.f7068 = false;
        }
        this.f1880[i] = c0513;
        if (!z) {
            i3 = -1;
        }
        c0513.getClass();
        if (i3 < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i8 = i3 < 0 ? 0 : 1;
        int length2 = c0513.f4833.length;
        if (length2 == 0) {
            c1676M3545 = i8 != 0 ? C1676.m3545(i3) : C1676.f5646;
        } else {
            C1676 c1676 = new C1676(length2 + i8);
            for (int i9 = 0; i9 < length2; i9++) {
                c1676.m3546(((C0512) c0513.m3165(i9)).f2193);
            }
            if (i8 != 0) {
                c1676.m3546(i3);
            }
            c1676.f7068 = false;
            c1676M3545 = c1676;
        }
        this.f1879[i] = c1676M3545;
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1691(int i, int i2) {
        m1705(i2, 1, true);
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1692(int i, int i2, C1244 c1244, int i3) {
        m1705(i, i2, false);
        C1676 c1676 = (C1676) c1244.f4508;
        m1704(c1676.m3548(c1244.f4506), true);
        int i4 = c1244.f4506;
        for (int i5 = 0; i5 < i4; i5++) {
            m1704(c1676.m3548(i5), true);
        }
        this.f1879[i] = c1676;
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1693() {
        return this.f1881;
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo1696(int i, int i2, int i3, int i4) {
        C1676[] c1676Arr = this.f1879;
        if (i != 167) {
            if (i == 168) {
                m1704(i2, true);
            }
            int i5 = i2 + i3;
            m1705(i2, i3, true);
            m1704(i5, true);
            C1676 c1676 = new C1676(2);
            c1676.m3546(i5);
            c1676.m3546(i4);
            c1676.f7068 = false;
            c1676Arr[i2] = c1676;
        } else {
            m1705(i2, i3, false);
            c1676Arr[i2] = C1676.m3545(i4);
        }
        m1704(i4, true);
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1697(int i, int i2, C3505 c3505) {
        if (i == 108 || i == 112) {
            m1705(i2, 1, true);
            if (c3505 == C3505.f11031 || c3505 == C3505.f11032) {
                m1706(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m1705(i2, 1, false);
            this.f1879[i2] = C1676.f5646;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m1705(i2, 1, false);
                m1706(i2, 1, false);
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
                                m1705(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m1705(i2, 1, true);
        m1706(i2, 1, true);
    }
}
