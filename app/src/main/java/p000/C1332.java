package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲀᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1332 extends AbstractC0375 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public List f4790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0705 f4791;

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int iM3071;
        List list = this.f4790;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c1353.m3070((String) it.next())));
            }
            iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
        } else {
            iM3071 = 0;
        }
        C0705 c0705 = this.f4791;
        int iMo961 = c0705 != null ? c0705.mo961(c1353) : 0;
        c1353.m3078(6);
        c1353.m3068(5, iMo961);
        c1353.m3068(3, 0);
        c1353.m3068(1, 0);
        c1353.m3068(0, iM3071);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m3050(InterfaceC1425 interfaceC1425) {
        C0705 c0705 = new C0705(4);
        interfaceC1425.invoke(c0705);
        this.f4791 = c0705;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m3051(String... strArr) {
        this.f4790 = AbstractC0270.m1389(strArr);
    }
}
