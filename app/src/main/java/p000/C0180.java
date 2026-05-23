package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0180 extends AbstractC1460 {

    public List f1230;

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        int iM3071;
        List list = this.f1230;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C0173) it.next()).mo961(c1353)));
            }
            iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
        } else {
            iM3071 = 0;
        }
        c1353.m3078(3);
        c1353.m3068(2, 0);
        c1353.m3068(0, iM3071);
        c1353.m3066((byte) 0, 1);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
