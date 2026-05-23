package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲇᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2608 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC3640 f8486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f8487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static long m4629(C1014 c1014, long j) {
        AbstractC3640 abstractC3640 = c1014.f3704;
        ArrayList arrayList = c1014.f3711;
        if (abstractC3640 instanceof C1531) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1012 interfaceC1012 = (InterfaceC1012) arrayList.get(i);
            if (interfaceC1012 instanceof C1014) {
                C1014 c1015 = (C1014) interfaceC1012;
                if (c1015.f3704 != abstractC3640) {
                    jMin = Math.min(jMin, m4629(c1015, ((long) c1015.f3706) + j));
                }
            }
        }
        C1014 c1016 = abstractC3640.f11394;
        C1014 c1017 = abstractC3640.f11393;
        if (c1014 != c1016) {
            return jMin;
        }
        long jMo2007 = j - abstractC3640.mo2007();
        return Math.min(Math.min(jMin, m4629(c1017, jMo2007)), jMo2007 - ((long) c1017.f3706));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static long m4630(C1014 c1014, long j) {
        AbstractC3640 abstractC3640 = c1014.f3704;
        ArrayList arrayList = c1014.f3711;
        if (abstractC3640 instanceof C1531) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1012 interfaceC1012 = (InterfaceC1012) arrayList.get(i);
            if (interfaceC1012 instanceof C1014) {
                C1014 c1015 = (C1014) interfaceC1012;
                if (c1015.f3704 != abstractC3640) {
                    jMax = Math.max(jMax, m4630(c1015, ((long) c1015.f3706) + j));
                }
            }
        }
        C1014 c1016 = abstractC3640.f11393;
        C1014 c1017 = abstractC3640.f11394;
        if (c1014 != c1016) {
            return jMax;
        }
        long jMo2007 = abstractC3640.mo2007() + j;
        return Math.max(Math.max(jMax, m4630(c1017, jMo2007)), jMo2007 - ((long) c1017.f3706));
    }
}
