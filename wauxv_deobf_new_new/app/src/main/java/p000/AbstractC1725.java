package p000;

import com.umeng.analytics.pro.g;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲁᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1725 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1724 f5841 = new C1724(new C1732(false, false, true, "    ", g.y, true, 3, true), AbstractC2727.f8748);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1732 f5842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2135 f5843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0102 f5844 = new C0102(15);

    public AbstractC1725(C1732 c1732, C2135 c2135) {
        this.f5842 = c1732;
        this.f5843 = c2135;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m3636(C0268 c0268, String str) {
        C0154 c0154 = new C0154(str, this.f5842);
        Object objMo2639 = new C2888(this, EnumC3732.OBJ, c0154, (C0264) c0268.f1519).mo2639(c0268);
        if (c0154.m1305() == 10) {
            return objMo2639;
        }
        C0154.m1298(c0154, "Expected EOF after parsing, but had " + ((String) c0154.f1222).charAt(c0154.f1217 - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m3637(C0268 c0268, ArrayList arrayList) {
        char[] cArr;
        C0383 c0383 = new C0383((byte) 0, 7);
        C0572 c0572 = C0572.f2364;
        synchronized (c0572) {
            C0266 c0266 = (C0266) c0572.f2366;
            cArr = null;
            char[] cArr2 = (char[]) (c0266.isEmpty() ? null : c0266.removeLast());
            if (cArr2 != null) {
                c0572.f2365 -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0383.f1894 = cArr;
        try {
            new C2889(this.f5842.f5861 ? new C0763(c0383, this) : new C0427(c0383), this, EnumC3732.OBJ, new C2889[EnumC3732.f11615.mo1087()]).mo2920(c0268, arrayList);
            return c0383.toString();
        } finally {
            c0383.m1713();
        }
    }
}
