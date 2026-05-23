package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0705 extends AbstractC1460 {

    public C2837 f2683;

    public C0167 f2684;

    public C0180 f2685;

    public C1317 f2686;

    public C1984 f2687;

    public List f2688;

    public static void m2123(C0705 c0705, String str) {
        C0167 c0167 = c0705.f2684;
        if (c0167 == null) {
            c0167 = new C0167(1);
        }
        c0705.f2684 = c0167;
        C0705 c0706 = new C0705(4);
        c0706.f2683 = new C2837(str, 5, false);
        List arrayList = c0167.f1196;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c0167.f1196 = arrayList;
        arrayList.add(c0706);
    }

    public static void m2124(C0705 c0705, String str) {
        c0705.f2683 = new C2837(str, 5, false);
    }

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        int iM3071;
        C2837 c2837 = this.f2683;
        int iMo961 = c2837 != null ? c2837.mo961(c1353) : 0;
        C0167 c0167 = this.f2684;
        int iMo962 = c0167 != null ? c0167.mo961(c1353) : 0;
        C0180 c0180 = this.f2685;
        int iMo963 = c0180 != null ? c0180.mo961(c1353) : 0;
        C1317 c1317 = this.f2686;
        int iMo964 = c1317 != null ? c1317.mo961(c1353) : 0;
        C1984 c1984 = this.f2687;
        int iMo965 = c1984 != null ? c1984.mo961(c1353) : 0;
        List list = this.f2688;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2837) it.next()).mo961(c1353)));
            }
            iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
        } else {
            iM3071 = 0;
        }
        c1353.m3078(12);
        c1353.m3068(11, 0);
        c1353.m3068(10, 0);
        c1353.m3068(9, 0);
        c1353.m3068(8, iM3071);
        c1353.m3068(7, iMo965);
        c1353.m3068(6, iMo964);
        c1353.m3068(5, iMo963);
        c1353.m3068(4, iMo962);
        c1353.m3068(3, 0);
        c1353.m3068(2, 0);
        c1353.m3068(1, iMo961);
        c1353.m3068(0, 0);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }

    public final void m2125(InterfaceC1425 interfaceC1425) {
        C1317 c1317 = new C1317(4);
        interfaceC1425.invoke(c1317);
        this.f2686 = c1317;
    }

    public final void m2126(InterfaceC1425 interfaceC1425) {
        C1984 c1984 = new C1984(4);
        interfaceC1425.invoke(c1984);
        this.f2687 = c1984;
    }

    public final void m2127(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2837(str, 5, false));
        }
        this.f2688 = new ArrayList(arrayList);
    }
}
