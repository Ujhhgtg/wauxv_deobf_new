package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲇᤝᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2885 implements InterfaceC1103, InterfaceC2306 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f9234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f9235;

    public /* synthetic */ C2885(Object obj, int i, Object obj2) {
        this.f9233 = i;
        this.f9234 = obj;
        this.f9235 = obj2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4832(C0173 c0173, C1026 c1026) {
        C2008 c2008 = c1026.f3749;
        C2008 c2009 = c1026.f3748;
        c2008.m4003(c0173.f1258);
        for (C2152 c2152 : Collections.unmodifiableCollection(c0173.f1260.values())) {
            c2009.m4005(c2152.f7102);
            m4833(c1026, c2152.f7103);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4833(C1026 c1026, AbstractC0775 abstractC0775) {
        if (abstractC0775 instanceof C0887) {
            m4832(((C0887) abstractC0775).f3335, c1026);
            return;
        }
        if (!(abstractC0775 instanceof C0889)) {
            c1026.m2719(abstractC0775);
            return;
        }
        C0888 c0888 = ((C0889) abstractC0775).f3336;
        int length = c0888.f4833.length;
        for (int i = 0; i < length; i++) {
            m4833(c1026, (AbstractC0775) c0888.m3165(i));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m4834(AbstractC0775 abstractC0775) {
        if (m4835(abstractC0775) == 30) {
            return "null";
        }
        return abstractC0775.mo2371() + ' ' + abstractC0775.mo1360();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static int m4835(AbstractC0775 abstractC0775) {
        if (abstractC0775 instanceof C0892) {
            return 0;
        }
        if (abstractC0775 instanceof C0915) {
            return 2;
        }
        if (abstractC0775 instanceof C0895) {
            return 3;
        }
        if (abstractC0775 instanceof C0902) {
            return 4;
        }
        if (abstractC0775 instanceof C0909) {
            return 6;
        }
        if (abstractC0775 instanceof C0899) {
            return 16;
        }
        if (abstractC0775 instanceof C0896) {
            return 17;
        }
        if (abstractC0775 instanceof C0914) {
            return 21;
        }
        if (abstractC0775 instanceof C0911) {
            return 22;
        }
        if (abstractC0775 instanceof C0916) {
            return 23;
        }
        if (abstractC0775 instanceof C0917) {
            return 24;
        }
        if (abstractC0775 instanceof C0898) {
            return 25;
        }
        if (abstractC0775 instanceof C0912) {
            return 26;
        }
        if (abstractC0775 instanceof C0897) {
            return 27;
        }
        if (abstractC0775 instanceof C0889) {
            return 28;
        }
        if (abstractC0775 instanceof C0887) {
            return 29;
        }
        if (abstractC0775 instanceof C0905) {
            return 30;
        }
        if (abstractC0775 instanceof C0891) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public String toString() {
        switch (this.f9233) {
            case 6:
                return "Bounds{lower=" + ((C1660) this.f9234) + " upper=" + ((C1660) this.f9235) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m4836(AbstractC2563 abstractC2563, C2173 c2173) {
        C2767 c2767 = (C2767) this.f9234;
        C3644 c3644M5208 = (C3644) c2767.get(abstractC2563);
        if (c3644M5208 == null) {
            c3644M5208 = C3644.m5208();
            c2767.put(abstractC2563, c3644M5208);
        }
        c3644M5208.f11367 = c2173;
        c3644M5208.f11365 |= 8;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public View m4837(int i, int i2, int i3, int i4) {
        View viewM4488;
        C3624 c3624 = (C3624) this.f9235;
        C2544 c2544 = (C2544) this.f9234;
        int iM4473 = c2544.m4473();
        int iM4472 = c2544.m4472();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c2544.f8086) {
                case 0:
                    viewM4488 = c2544.f8087.m4488(i);
                    break;
                default:
                    viewM4488 = c2544.f8087.m4488(i);
                    break;
            }
            int iM4471 = c2544.m4471(viewM4488);
            int iM4470 = c2544.m4470(viewM4488);
            c3624.f11324 = iM4473;
            c3624.f11325 = iM4472;
            c3624.f11326 = iM4471;
            c3624.f11327 = iM4470;
            if (i3 != 0) {
                c3624.f11323 = i3;
                if (c3624.m5153()) {
                    return viewM4488;
                }
            }
            if (i4 != 0) {
                c3624.f11323 = i4;
                if (c3624.m5153()) {
                    view = viewM4488;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean m4838(View view) {
        C3624 c3624 = (C3624) this.f9235;
        C2544 c2544 = (C2544) this.f9234;
        int iM4473 = c2544.m4473();
        int iM4472 = c2544.m4472();
        int iM4471 = c2544.m4471(view);
        int iM4470 = c2544.m4470(view);
        c3624.f11324 = iM4473;
        c3624.f11325 = iM4472;
        c3624.f11326 = iM4471;
        c3624.f11327 = iM4470;
        c3624.f11323 = 24579;
        return c3624.m5153();
    }

    @Override // p000.InterfaceC1103
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo1613() {
        C2534 c2534 = (C2534) this.f9234;
        synchronized (c2534) {
            c2534.f8070 = c2534.f8068.length;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2173 m4839(AbstractC2563 abstractC2563, int i) {
        C3644 c3644;
        C2173 c2173;
        C2767 c2767 = (C2767) this.f9234;
        int iM4741 = c2767.m4741(abstractC2563);
        if (iM4741 >= 0 && (c3644 = (C3644) c2767.m4744(iM4741)) != null) {
            int i2 = c3644.f11365;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c3644.f11365 = i3;
                if (i == 4) {
                    c2173 = c3644.f11366;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c2173 = c3644.f11367;
                }
                if ((i3 & 12) == 0) {
                    c2767.mo2013(iM4741);
                    c3644.f11365 = 0;
                    c3644.f11366 = null;
                    c3644.f11367 = null;
                    C3644.f11364.mo1457(c3644);
                }
                return c2173;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m4840(AbstractC2563 abstractC2563) {
        C3644 c3644 = (C3644) ((C2767) this.f9234).get(abstractC2563);
        if (c3644 == null) {
            return;
        }
        c3644.f11365 &= -2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m4841(AbstractC2563 abstractC2563) {
        C1889 c1889 = (C1889) this.f9235;
        for (int iM3812 = c1889.m3812() - 1; iM3812 >= 0; iM3812--) {
            if (abstractC2563 == c1889.m3813(iM3812)) {
                Object[] objArr = c1889.f6263;
                Object obj = objArr[iM3812];
                Object obj2 = AbstractC1468.f5217;
                if (obj == obj2) {
                    break;
                }
                objArr[iM3812] = obj2;
                c1889.f6261 = true;
                break;
            }
        }
        C3644 c3644 = (C3644) ((C2767) this.f9234).remove(abstractC2563);
        if (c3644 != null) {
            c3644.f11365 = 0;
            c3644.f11366 = null;
            c3644.f11367 = null;
            C3644.f11364.mo1457(c3644);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m4842(C0173 c0173, boolean z) {
        C0496 c0496 = (C0496) this.f9235;
        boolean z2 = z && c0496.m1927();
        C1026 c1026 = (C1026) this.f9234;
        C2008 c2008 = c1026.f3748;
        C2008 c2009 = c1026.f3749;
        C0917 c0917 = c0173.f1258;
        int iM4000 = c2009.m4000(c0917);
        if (z2) {
            c0496.m1926("  type_idx: " + AbstractC2902.m4907(iM4000) + " // " + c0917.f3408.mo1360());
        }
        c0496.m1936(c2009.m4000(c0173.f1258));
        Collection<C2152> collectionUnmodifiableCollection = Collections.unmodifiableCollection(c0173.f1260.values());
        int size = collectionUnmodifiableCollection.size();
        if (z2) {
            c0496.m1926("  size: ".concat(AbstractC2902.m4907(size)));
        }
        c0496.m1936(size);
        int i = 0;
        for (C2152 c2152 : collectionUnmodifiableCollection) {
            C0916 c0916 = c2152.f7102;
            int iM3999 = c2008.m3999(c0916);
            AbstractC0775 abstractC0775 = c2152.f7103;
            if (z2) {
                c0496.m1925(0, "  elements[" + i + "]:");
                i++;
                c0496.m1926("    name_idx: " + AbstractC2902.m4907(iM3999) + " // " + c0916.mo1360());
            }
            c0496.m1936(iM3999);
            if (z2) {
                c0496.m1926("    value: " + m4834(abstractC0775));
            }
            m4844(abstractC0775);
        }
        if (z2) {
            c0496.m1928();
        }
    }

    @Override // p000.InterfaceC1103
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public void mo1617(InterfaceC0399 interfaceC0399, Bitmap bitmap) throws IOException {
        IOException iOException = ((C1239) this.f9235).f4469;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0399.mo1609(bitmap);
            throw iOException;
        }
    }

    @Override // p000.InterfaceC2306
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public C3729 mo1254(View view, C3729 c3729) {
        InterfaceC3654 interfaceC3654 = (InterfaceC3654) this.f9234;
        C1348 c1348 = (C1348) this.f9235;
        C1348 c1349 = new C1348();
        c1349.f4819 = c1348.f4819;
        c1349.f4820 = c1348.f4820;
        c1349.f4821 = c1348.f4821;
        c1349.f4822 = c1348.f4822;
        return interfaceC3654.mo1606(view, c3729, c1349);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m4843(C0889 c0889, boolean z) {
        C0496 c0496 = (C0496) this.f9235;
        boolean z2 = z && c0496.m1927();
        C0888 c0888 = c0889.f3336;
        int length = c0888.f4833.length;
        if (z2) {
            c0496.m1926("  size: ".concat(AbstractC2902.m4907(length)));
        }
        c0496.m1936(length);
        for (int i = 0; i < length; i++) {
            AbstractC0775 abstractC0775 = (AbstractC0775) c0888.m3165(i);
            if (z2) {
                c0496.m1926("  [" + Integer.toHexString(i) + "] " + m4834(abstractC0775));
            }
            m4844(abstractC0775);
        }
        if (z2) {
            c0496.m1928();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m4844(AbstractC0775 abstractC0775) {
        C1026 c1026 = (C1026) this.f9234;
        C0496 c0496 = (C0496) this.f9235;
        int iM4835 = m4835(abstractC0775);
        if (iM4835 != 0 && iM4835 != 6 && iM4835 != 2) {
            if (iM4835 == 3) {
                AbstractC3744.m5350(c0496, iM4835, ((AbstractC0908) abstractC0775).mo2542());
                return;
            }
            if (iM4835 != 4) {
                if (iM4835 == 16) {
                    AbstractC3744.m5349(c0496, iM4835, ((long) ((C0899) abstractC0775).f3371) << 32);
                    return;
                }
                if (iM4835 == 17) {
                    AbstractC3744.m5349(c0496, iM4835, ((C0896) abstractC0775).f3372);
                    return;
                }
                switch (iM4835) {
                    case Opcodes.ILOAD /* 21 */:
                        AbstractC3744.m5350(c0496, iM4835, c1026.f3750.m4001(((C0914) abstractC0775).f3383));
                        return;
                    case Opcodes.LLOAD /* 22 */:
                        AbstractC3744.m5350(c0496, iM4835, ((C2007) ((TreeMap) c1026.f3756.f6655).get((C0911) abstractC0775)).m3509());
                        return;
                    case Opcodes.FLOAD /* 23 */:
                        AbstractC3744.m5350(c0496, iM4835, c1026.f3748.m3999((C0916) abstractC0775));
                        return;
                    case Opcodes.DLOAD /* 24 */:
                        AbstractC3744.m5350(c0496, iM4835, c1026.f3749.m4000((C0917) abstractC0775));
                        return;
                    case Opcodes.ALOAD /* 25 */:
                        AbstractC3744.m5350(c0496, iM4835, c1026.f3751.m3120((C0898) abstractC0775));
                        return;
                    case 26:
                        AbstractC3744.m5350(c0496, iM4835, c1026.f3752.m4008((C0912) abstractC0775));
                        return;
                    case 27:
                        AbstractC3744.m5350(c0496, iM4835, c1026.f3751.m3120(((C0897) abstractC0775).m2529()));
                        return;
                    case 28:
                        c0496.m1932(iM4835);
                        m4843((C0889) abstractC0775, false);
                        return;
                    case 29:
                        c0496.m1932(iM4835);
                        m4842(((C0887) abstractC0775).f3335, false);
                        return;
                    case 30:
                        c0496.m1932(iM4835);
                        return;
                    case 31:
                        c0496.m1932((((C0891) abstractC0775).f3371 << 5) | iM4835);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo2542 = ((AbstractC0908) abstractC0775).mo2542();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo2542 >> 63) ^ jMo2542)) >> 3;
        c0496.m1932(((iNumberOfLeadingZeros - 1) << 5) | iM4835);
        while (iNumberOfLeadingZeros > 0) {
            c0496.m1932((byte) jMo2542);
            jMo2542 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    public C2885() {
        this.f9233 = 4;
        this.f9234 = new C2767(0);
        this.f9235 = new C1889();
    }

    public C2885(C2342 c2342, C0102 c0102) {
        this.f9233 = 7;
        this.f9234 = c2342;
        new LinkedHashSet();
        this.f9235 = new LinkedHashMap();
    }

    public C2885(C1026 c1026, C0496 c0496) {
        this.f9233 = 2;
        if (c1026 != null) {
            this.f9234 = c1026;
            this.f9235 = c0496;
            return;
        }
        throw new NullPointerException("file == null");
    }

    public C2885(C2544 c2544) {
        this.f9233 = 3;
        this.f9234 = c2544;
        C3624 c3624 = new C3624();
        c3624.f11323 = 0;
        this.f9235 = c3624;
    }

    public C2885(WindowInsetsAnimation.Bounds bounds) {
        this.f9233 = 6;
        this.f9234 = C1660.m3540(bounds.getLowerBound());
        this.f9235 = C1660.m3540(bounds.getUpperBound());
    }
}
