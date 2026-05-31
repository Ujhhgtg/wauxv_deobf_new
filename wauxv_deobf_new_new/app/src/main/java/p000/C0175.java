package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0175 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public List f1264;

    public /* synthetic */ C0175(int i) {
        this.f1263 = i;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        int iM3175;
        switch (this.f1263) {
            case 0:
                List list = this.f1264;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C0174) it.next()).mo1106(c1353)));
                    }
                    iM3174 = c1353.m3174(AbstractC0739.m2304(arrayList));
                } else {
                    iM3174 = 0;
                }
                c1353.m3181(3);
                c1353.m3171(2, 0);
                c1353.m3171(0, iM3174);
                c1353.m3169((byte) 0, 1);
                int iM3176 = c1353.m3175();
                c1353.m3177(iM3176);
                return iM3176;
            default:
                List list2 = this.f1264;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((C0700) it2.next()).mo1106(c1353)));
                    }
                    iM3175 = c1353.m3174(AbstractC0739.m2304(arrayList2));
                } else {
                    iM3175 = 0;
                }
                c1353.m3181(3);
                c1353.m3171(2, 0);
                c1353.m3171(0, iM3175);
                c1353.m3169((byte) 0, 1);
                int iM3177 = c1353.m3175();
                c1353.m3177(iM3177);
                return iM3177;
        }
    }
}
