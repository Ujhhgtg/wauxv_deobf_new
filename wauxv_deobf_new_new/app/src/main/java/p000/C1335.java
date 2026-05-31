package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᤞᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1335 extends AbstractC0350 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f4792;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public List f4793;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C2012 f4794;

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        int iM3176;
        List list = this.f4792;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c1353.m3173((String) it.next())));
            }
            iM3174 = c1353.m3174(AbstractC0739.m2304(arrayList));
        } else {
            iM3174 = 0;
        }
        List<C0694> list2 = this.f4793;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list2, 10));
            for (C0694 c0694 : list2) {
                int i = c0694.f1724;
                if (i < 0) {
                    throw new IllegalStateException("not has id");
                }
                arrayList2.add(Long.valueOf((((long) c0694.f1725) << 32) | ((long) i)));
            }
            long[] jArrM2306 = AbstractC0739.m2306(arrayList2);
            c1353.m3182(8, jArrM2306.length, 8);
            for (int length = jArrM2306.length - 1; -1 < length; length--) {
                long j = jArrM2306[length];
                c1353.m3179(8, 0);
                ByteBuffer byteBuffer = c1353.f4834;
                int i2 = c1353.f4835 - 8;
                c1353.f4835 = i2;
                byteBuffer.putLong(i2, j);
            }
            iM3176 = c1353.m3176();
        } else {
            iM3176 = 0;
        }
        C2012 c2012 = this.f4794;
        int iMo1106 = c2012 != null ? c2012.mo1106(c1353) : 0;
        c1353.m3181(7);
        c1353.m3171(6, iMo1106);
        c1353.m3171(4, 0);
        c1353.m3171(3, iM3176);
        c1353.m3171(1, 0);
        c1353.m3171(0, iM3174);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m3155(InterfaceC1433 interfaceC1433) {
        C2012 c2012 = new C2012();
        interfaceC1433.invoke(c2012);
        this.f4794 = c2012;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m3156(String... strArr) {
        this.f4792 = AbstractC0280.m1535(strArr);
    }
}
