package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0167 extends AbstractC1460 {

    public final /* synthetic */ int f1195;

    public List f1196;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0167(int i) {
        super(4);
        this.f1195 = i;
    }

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        int iM3071;
        int iM3072;
        switch (this.f1195) {
            case 0:
                List list = this.f1196;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C0166) it.next()).mo961(c1353)));
                    }
                    iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
                } else {
                    iM3071 = 0;
                }
                c1353.m3078(3);
                c1353.m3068(2, 0);
                c1353.m3068(0, iM3071);
                c1353.m3066((byte) 0, 1);
                int iM3073 = c1353.m3072();
                c1353.m3074(iM3073);
                return iM3073;
            default:
                List list2 = this.f1196;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((C0705) it2.next()).mo961(c1353)));
                    }
                    iM3072 = c1353.m3071(AbstractC0744.m2205(arrayList2));
                } else {
                    iM3072 = 0;
                }
                c1353.m3078(3);
                c1353.m3068(2, 0);
                c1353.m3068(0, iM3072);
                c1353.m3066((byte) 0, 1);
                int iM3074 = c1353.m3072();
                c1353.m3074(iM3074);
                return iM3074;
        }
    }
}
