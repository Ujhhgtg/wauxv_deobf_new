package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2015 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f6699;

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        List list = this.f6699;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2012) it.next()).mo1106(c1353)));
            }
            iM3174 = c1353.m3174(AbstractC0739.m2304(arrayList));
        } else {
            iM3174 = 0;
        }
        c1353.m3181(3);
        c1353.m3171(2, 0);
        c1353.m3171(0, iM3174);
        c1353.m3169((byte) 0, 1);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void m4042(C2012 c2012) {
        List arrayList = this.f6699;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f6699 = arrayList;
        arrayList.add(c2012);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m4043(InterfaceC1433 interfaceC1433) {
        C2012 c2012 = new C2012();
        interfaceC1433.invoke(c2012);
        m4042(c2012);
    }
}
