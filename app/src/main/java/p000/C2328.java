package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2328 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public List f7469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1663 f7470;

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int iM3071;
        List<C2325> list = this.f7469;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            for (C2325 c2325 : list) {
                if (c2325 == null) {
                    c2325 = new C2325(4);
                }
                arrayList.add(Integer.valueOf(c2325.mo961(c1353)));
            }
            iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
        } else {
            iM3071 = 0;
        }
        C1663 c1663 = this.f7470;
        int iMo961 = c1663 != null ? c1663.mo961(c1353) : 0;
        c1353.m3078(2);
        c1353.m3068(1, iMo961);
        c1353.m3068(0, iM3071);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
