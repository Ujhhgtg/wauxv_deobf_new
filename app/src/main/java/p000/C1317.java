package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲈᲁᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1317 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public List f4763;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1663 f4764;

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int iM3071;
        List list = this.f4763;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C1303) it.next()).mo961(c1353)));
            }
            iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
        } else {
            iM3071 = 0;
        }
        C1663 c1663 = this.f4764;
        int iMo961 = c1663 != null ? c1663.mo961(c1353) : 0;
        c1353.m3078(3);
        c1353.m3068(2, iMo961);
        c1353.m3068(0, iM3071);
        c1353.m3066((byte) 0, 1);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m3041(Class cls) {
        C1303 c1303 = new C1303(4);
        C0705 c0705 = new C0705(4);
        C0705.m2124(c0705, AbstractC1028.m2601(cls));
        c1303.f4736 = c0705;
        List arrayList = this.f4763;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f4763 = arrayList;
        arrayList.add(c1303);
    }
}
