package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2368 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f7607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0083 f7608;

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        List<C2365> list = this.f7607;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            for (C2365 c2365 : list) {
                if (c2365 == null) {
                    c2365 = new C2365();
                }
                arrayList.add(Integer.valueOf(c2365.mo1106(c1353)));
            }
            iM3174 = c1353.m3174(AbstractC0739.m2304(arrayList));
        } else {
            iM3174 = 0;
        }
        C0083 c0083 = this.f7608;
        int iMo1106 = c0083 != null ? c0083.mo1106(c1353) : 0;
        c1353.m3181(2);
        c1353.m3171(1, iMo1106);
        c1353.m3171(0, iM3174);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
