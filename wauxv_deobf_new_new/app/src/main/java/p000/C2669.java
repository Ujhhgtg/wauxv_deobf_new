package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᲈᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2669 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC3700 f8651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f8652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static long m4663(C1017 c1017, long j) {
        AbstractC3700 abstractC3700 = c1017.f3711;
        ArrayList arrayList = c1017.f3718;
        if (abstractC3700 instanceof C1543) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1015 interfaceC1015 = (InterfaceC1015) arrayList.get(i);
            if (interfaceC1015 instanceof C1017) {
                C1017 c1018 = (C1017) interfaceC1015;
                if (c1018.f3711 != abstractC3700) {
                    jMin = Math.min(jMin, m4663(c1018, ((long) c1018.f3713) + j));
                }
            }
        }
        C1017 c1019 = abstractC3700.f11543;
        C1017 c10110 = abstractC3700.f11542;
        if (c1017 != c1019) {
            return jMin;
        }
        long jMo2104 = j - abstractC3700.mo2104();
        return Math.min(Math.min(jMin, m4663(c10110, jMo2104)), jMo2104 - ((long) c10110.f3713));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static long m4664(C1017 c1017, long j) {
        AbstractC3700 abstractC3700 = c1017.f3711;
        ArrayList arrayList = c1017.f3718;
        if (abstractC3700 instanceof C1543) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1015 interfaceC1015 = (InterfaceC1015) arrayList.get(i);
            if (interfaceC1015 instanceof C1017) {
                C1017 c1018 = (C1017) interfaceC1015;
                if (c1018.f3711 != abstractC3700) {
                    jMax = Math.max(jMax, m4664(c1018, ((long) c1018.f3713) + j));
                }
            }
        }
        C1017 c1019 = abstractC3700.f11542;
        C1017 c10110 = abstractC3700.f11543;
        if (c1017 != c1019) {
            return jMax;
        }
        long jMo2104 = abstractC3700.mo2104() + j;
        return Math.max(Math.max(jMax, m4664(c10110, jMo2104)), jMo2104 - ((long) c10110.f3713));
    }
}
