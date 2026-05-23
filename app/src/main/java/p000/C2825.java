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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᲁᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2825 implements InterfaceC1097, InterfaceC2274 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f9072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f9073;

    public /* synthetic */ C2825(Object obj, int i, Object obj2) {
        this.f9071 = i;
        this.f9072 = obj;
        this.f9073 = obj2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4799(C0165 c0165, C1023 c1023) {
        C1977 c1977 = c1023.f3742;
        C1977 c1978 = c1023.f3741;
        c1977.m3809(c0165.f1190);
        for (C2119 c2119 : Collections.unmodifiableCollection(c0165.f1192.values())) {
            c1978.m3811(c2119.f6978);
            m4800(c1023, c2119.f6979);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4800(C1023 c1023, AbstractC0777 abstractC0777) {
        if (abstractC0777 instanceof C0888) {
            m4799(((C0888) abstractC0777).f3328, c1023);
            return;
        }
        if (!(abstractC0777 instanceof C0890)) {
            c1023.m2595(abstractC0777);
            return;
        }
        C0889 c0889 = ((C0890) abstractC0777).f3329;
        int length = c0889.f4836.length;
        for (int i = 0; i < length; i++) {
            m4800(c1023, (AbstractC0777) c0889.m3062(i));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m4801(AbstractC0777 abstractC0777) {
        if (m4802(abstractC0777) == 30) {
            return "null";
        }
        return abstractC0777.mo2269() + ' ' + abstractC0777.mo1214();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static int m4802(AbstractC0777 abstractC0777) {
        if (abstractC0777 instanceof C0893) {
            return 0;
        }
        if (abstractC0777 instanceof C0916) {
            return 2;
        }
        if (abstractC0777 instanceof C0896) {
            return 3;
        }
        if (abstractC0777 instanceof C0903) {
            return 4;
        }
        if (abstractC0777 instanceof C0910) {
            return 6;
        }
        if (abstractC0777 instanceof C0900) {
            return 16;
        }
        if (abstractC0777 instanceof C0897) {
            return 17;
        }
        if (abstractC0777 instanceof C0915) {
            return 21;
        }
        if (abstractC0777 instanceof C0912) {
            return 22;
        }
        if (abstractC0777 instanceof C0917) {
            return 23;
        }
        if (abstractC0777 instanceof C0918) {
            return 24;
        }
        if (abstractC0777 instanceof C0899) {
            return 25;
        }
        if (abstractC0777 instanceof C0913) {
            return 26;
        }
        if (abstractC0777 instanceof C0898) {
            return 27;
        }
        if (abstractC0777 instanceof C0890) {
            return 28;
        }
        if (abstractC0777 instanceof C0888) {
            return 29;
        }
        if (abstractC0777 instanceof C0906) {
            return 30;
        }
        if (abstractC0777 instanceof C0892) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public String toString() {
        switch (this.f9071) {
            case 6:
                return "Bounds{lower=" + ((C1646) this.f9072) + " upper=" + ((C1646) this.f9073) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m4803(AbstractC2508 abstractC2508, C2139 c2139) {
        C2705 c2705 = (C2705) this.f9072;
        C3584 c3584M5202 = (C3584) c2705.get(abstractC2508);
        if (c3584M5202 == null) {
            c3584M5202 = C3584.m5202();
            c2705.put(abstractC2508, c3584M5202);
        }
        c3584M5202.f11218 = c2139;
        c3584M5202.f11216 |= 8;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public View m4804(int i, int i2, int i3, int i4) {
        View viewM4466;
        C3564 c3564 = (C3564) this.f9073;
        C2489 c2489 = (C2489) this.f9072;
        int iM4451 = c2489.m4451();
        int iM4450 = c2489.m4450();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c2489.f7935) {
                case 0:
                    viewM4466 = c2489.f7936.m4466(i);
                    break;
                default:
                    viewM4466 = c2489.f7936.m4466(i);
                    break;
            }
            int iM4449 = c2489.m4449(viewM4466);
            int iM4448 = c2489.m4448(viewM4466);
            c3564.f11175 = iM4451;
            c3564.f11176 = iM4450;
            c3564.f11177 = iM4449;
            c3564.f11178 = iM4448;
            if (i3 != 0) {
                c3564.f11174 = i3;
                if (c3564.m5147()) {
                    return viewM4466;
                }
            }
            if (i4 != 0) {
                c3564.f11174 = i4;
                if (c3564.m5147()) {
                    view = viewM4466;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean m4805(View view) {
        C3564 c3564 = (C3564) this.f9073;
        C2489 c2489 = (C2489) this.f9072;
        int iM4451 = c2489.m4451();
        int iM4450 = c2489.m4450();
        int iM4449 = c2489.m4449(view);
        int iM4448 = c2489.m4448(view);
        c3564.f11175 = iM4451;
        c3564.f11176 = iM4450;
        c3564.f11177 = iM4449;
        c3564.f11178 = iM4448;
        c3564.f11174 = 24579;
        return c3564.m5147();
    }

    @Override // p000.InterfaceC1097
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo1508() {
        C2479 c2479 = (C2479) this.f9072;
        synchronized (c2479) {
            c2479.f7919 = c2479.f7917.length;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2139 m4806(AbstractC2508 abstractC2508, int i) {
        C3584 c3584;
        C2139 c2139;
        C2705 c2705 = (C2705) this.f9072;
        int iM4704 = c2705.m4704(abstractC2508);
        if (iM4704 >= 0 && (c3584 = (C3584) c2705.m4707(iM4704)) != null) {
            int i2 = c3584.f11216;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c3584.f11216 = i3;
                if (i == 4) {
                    c2139 = c3584.f11217;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c2139 = c3584.f11218;
                }
                if ((i3 & 12) == 0) {
                    c2705.mo1918(iM4704);
                    c3584.f11216 = 0;
                    c3584.f11217 = null;
                    c3584.f11218 = null;
                    C3584.f11215.mo1311(c3584);
                }
                return c2139;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m4807(AbstractC2508 abstractC2508) {
        C3584 c3584 = (C3584) ((C2705) this.f9072).get(abstractC2508);
        if (c3584 == null) {
            return;
        }
        c3584.f11216 &= -2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m4808(AbstractC2508 abstractC2508) {
        C1863 c1863 = (C1863) this.f9073;
        for (int iM3634 = c1863.m3634() - 1; iM3634 >= 0; iM3634--) {
            if (abstractC2508 == c1863.m3635(iM3634)) {
                Object[] objArr = c1863.f6189;
                Object obj = objArr[iM3634];
                Object obj2 = AbstractC1460.f5198;
                if (obj == obj2) {
                    break;
                }
                objArr[iM3634] = obj2;
                c1863.f6187 = true;
                break;
            }
        }
        C3584 c3584 = (C3584) ((C2705) this.f9072).remove(abstractC2508);
        if (c3584 != null) {
            c3584.f11216 = 0;
            c3584.f11217 = null;
            c3584.f11218 = null;
            C3584.f11215.mo1311(c3584);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m4809(C0165 c0165, boolean z) {
        C0519 c0519 = (C0519) this.f9073;
        boolean z2 = z && c0519.m1833();
        C1023 c1023 = (C1023) this.f9072;
        C1977 c1977 = c1023.f3741;
        C1977 c1978 = c1023.f3742;
        C0918 c0918 = c0165.f1190;
        int iM3806 = c1978.m3806(c0918);
        if (z2) {
            c0519.m1832("  type_idx: " + AbstractC1460.m3224(iM3806) + " // " + c0918.f3401.mo1214());
        }
        c0519.m1842(c1978.m3806(c0165.f1190));
        Collection<C2119> collectionUnmodifiableCollection = Collections.unmodifiableCollection(c0165.f1192.values());
        int size = collectionUnmodifiableCollection.size();
        if (z2) {
            c0519.m1832("  size: ".concat(AbstractC1460.m3224(size)));
        }
        c0519.m1842(size);
        int i = 0;
        for (C2119 c2119 : collectionUnmodifiableCollection) {
            C0917 c0917 = c2119.f6978;
            int iM3805 = c1977.m3805(c0917);
            AbstractC0777 abstractC0777 = c2119.f6979;
            if (z2) {
                c0519.m1831(0, "  elements[" + i + "]:");
                i++;
                c0519.m1832("    name_idx: " + AbstractC1460.m3224(iM3805) + " // " + c0917.mo1214());
            }
            c0519.m1842(iM3805);
            if (z2) {
                c0519.m1832("    value: " + m4801(abstractC0777));
            }
            m4811(abstractC0777);
        }
        if (z2) {
            c0519.m1834();
        }
    }

    @Override // p000.InterfaceC1097
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public void mo1512(InterfaceC0424 interfaceC0424, Bitmap bitmap) throws IOException {
        IOException iOException = ((C1237) this.f9073).f4470;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0424.mo1504(bitmap);
            throw iOException;
        }
    }

    @Override // p000.InterfaceC2274
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public C3669 mo1108(View view, C3669 c3669) {
        InterfaceC3594 interfaceC3594 = (InterfaceC3594) this.f9072;
        C1348 c1348 = (C1348) this.f9073;
        C1348 c1349 = new C1348();
        c1349.f4822 = c1348.f4822;
        c1349.f4823 = c1348.f4823;
        c1349.f4824 = c1348.f4824;
        c1349.f4825 = c1348.f4825;
        return interfaceC3594.mo1501(view, c3669, c1349);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m4810(C0890 c0890, boolean z) {
        C0519 c0519 = (C0519) this.f9073;
        boolean z2 = z && c0519.m1833();
        C0889 c0889 = c0890.f3329;
        int length = c0889.f4836.length;
        if (z2) {
            c0519.m1832("  size: ".concat(AbstractC1460.m3224(length)));
        }
        c0519.m1842(length);
        for (int i = 0; i < length; i++) {
            AbstractC0777 abstractC0777 = (AbstractC0777) c0889.m3062(i);
            if (z2) {
                c0519.m1832("  [" + Integer.toHexString(i) + "] " + m4801(abstractC0777));
            }
            m4811(abstractC0777);
        }
        if (z2) {
            c0519.m1834();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m4811(AbstractC0777 abstractC0777) {
        C1023 c1023 = (C1023) this.f9072;
        C0519 c0519 = (C0519) this.f9073;
        int iM4802 = m4802(abstractC0777);
        if (iM4802 != 0 && iM4802 != 6 && iM4802 != 2) {
            if (iM4802 == 3) {
                AbstractC2665.m4675(c0519, 3, ((AbstractC0909) abstractC0777).mo2425());
                return;
            }
            if (iM4802 != 4) {
                if (iM4802 == 16) {
                    AbstractC2665.m4674(c0519, 16, ((long) ((C0900) abstractC0777).f3364) << 32);
                    return;
                }
                if (iM4802 == 17) {
                    AbstractC2665.m4674(c0519, 17, ((C0897) abstractC0777).f3365);
                    return;
                }
                switch (iM4802) {
                    case 21 /* 21 */:
                        AbstractC2665.m4675(c0519, 21, c1023.f3743.m3807(((C0915) abstractC0777).f3376));
                        return;
                    case 22 /* 22 */:
                        AbstractC2665.m4675(c0519, 22, ((C1976) ((TreeMap) c1023.f3749.f6550).get((C0912) abstractC0777)).m3345());
                        return;
                    case 23 /* 23 */:
                        AbstractC2665.m4675(c0519, 23, c1023.f3741.m3805((C0917) abstractC0777));
                        return;
                    case 24 /* 24 */:
                        AbstractC2665.m4675(c0519, 24, c1023.f3742.m3806((C0918) abstractC0777));
                        return;
                    case 25 /* 25 */:
                        AbstractC2665.m4675(c0519, 25, c1023.f3744.m3017((C0899) abstractC0777));
                        return;
                    case 26:
                        AbstractC2665.m4675(c0519, 26, c1023.f3745.m3814((C0913) abstractC0777));
                        return;
                    case 27:
                        AbstractC2665.m4675(c0519, 27, c1023.f3744.m3017(((C0898) abstractC0777).m2412()));
                        return;
                    case 28:
                        c0519.m1838(28);
                        m4810((C0890) abstractC0777, false);
                        return;
                    case 29:
                        c0519.m1838(29);
                        m4809(((C0888) abstractC0777).f3328, false);
                        return;
                    case 30:
                        c0519.m1838(30);
                        return;
                    case 31:
                        c0519.m1838((((C0892) abstractC0777).f3364 << 5) | 31);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo2425 = ((AbstractC0909) abstractC0777).mo2425();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo2425 >> 63) ^ jMo2425)) >> 3;
        c0519.m1838(((iNumberOfLeadingZeros - 1) << 5) | iM4802);
        while (iNumberOfLeadingZeros > 0) {
            c0519.m1838((byte) jMo2425);
            jMo2425 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    public C2825() {
        this.f9071 = 4;
        this.f9072 = new C2705(0);
        this.f9073 = new C1863();
    }

    public C2825(C2309 c2309, C0094 c0094) {
        this.f9071 = 7;
        this.f9072 = c2309;
        new LinkedHashSet();
        this.f9073 = new LinkedHashMap();
    }

    public C2825(C1023 c1023, C0519 c0519) {
        this.f9071 = 2;
        if (c1023 != null) {
            this.f9072 = c1023;
            this.f9073 = c0519;
            return;
        }
        throw new NullPointerException("file == null");
    }

    public C2825(C2489 c2489) {
        this.f9071 = 3;
        this.f9072 = c2489;
        C3564 c3564 = new C3564();
        c3564.f11174 = 0;
        this.f9073 = c3564;
    }

    public C2825(WindowInsetsAnimation.Bounds bounds) {
        this.f9071 = 6;
        this.f9072 = C1646.m3376(bounds.getLowerBound());
        this.f9073 = C1646.m3376(bounds.getUpperBound());
    }
}
