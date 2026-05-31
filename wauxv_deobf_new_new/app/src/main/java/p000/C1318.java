package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1318 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f4762;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0083 f4763;

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        List list = this.f4762;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C1304) it.next()).mo1106(c1353)));
            }
            iM3174 = c1353.m3174(AbstractC0739.m2304(arrayList));
        } else {
            iM3174 = 0;
        }
        C0083 c0083 = this.f4763;
        int iMo1106 = c0083 != null ? c0083.mo1106(c1353) : 0;
        c1353.m3181(3);
        c1353.m3171(2, iMo1106);
        c1353.m3171(0, iM3174);
        c1353.m3169((byte) 0, 1);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void m3144(Class cls) {
        C1304 c1304 = new C1304();
        C0700 c0700 = new C0700();
        C0700.m2217(c0700, AbstractC1031.m2725(cls));
        c1304.f4735 = c0700;
        List arrayList = this.f4762;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f4762 = arrayList;
        arrayList.add(c1304);
    }
}
