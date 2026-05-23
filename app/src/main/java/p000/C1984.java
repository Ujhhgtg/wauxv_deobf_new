package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1984 extends AbstractC1460 {

    public List f6594;

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        int iM3071;
        List list = this.f6594;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C1981) it.next()).mo961(c1353)));
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

    public final void m3848(C1981 c1981) {
        List arrayList = this.f6594;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f6594 = arrayList;
        arrayList.add(c1981);
    }

    public final void m3849(InterfaceC1425 interfaceC1425) {
        C1981 c1981 = new C1981(4);
        interfaceC1425.invoke(c1981);
        m3848(c1981);
    }
}
