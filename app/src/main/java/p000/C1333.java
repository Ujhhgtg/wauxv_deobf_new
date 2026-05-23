package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1333 extends AbstractC0375 {

    public List f4792;

    public List f4793;

    public C1981 f4794;

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        int iM3071;
        int iM3073;
        List list = this.f4792;
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
        List<C0698> list2 = this.f4793;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list2, 10));
            for (C0698 c0698 : list2) {
                int i = c0698.f1753;
                if (i < 0) {
                    throw new IllegalStateException("not has id");
                }
                arrayList2.add(Long.valueOf((((long) c0698.f1754) << 32) | ((long) i)));
            }
            long[] jArrM2207 = AbstractC0744.m2207(arrayList2);
            c1353.m3079(8, jArrM2207.length, 8);
            for (int length = jArrM2207.length - 1; -1 < length; length--) {
                long j = jArrM2207[length];
                c1353.m3076(8, 0);
                ByteBuffer byteBuffer = c1353.f4837;
                int i2 = c1353.f4838 - 8;
                c1353.f4838 = i2;
                byteBuffer.putLong(i2, j);
            }
            iM3073 = c1353.m3073();
        } else {
            iM3073 = 0;
        }
        C1981 c1981 = this.f4794;
        int iMo961 = c1981 != null ? c1981.mo961(c1353) : 0;
        c1353.m3078(7);
        c1353.m3068(6, iMo961);
        c1353.m3068(4, 0);
        c1353.m3068(3, iM3073);
        c1353.m3068(1, 0);
        c1353.m3068(0, iM3071);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }

    public final void m3052(InterfaceC1425 interfaceC1425) {
        C1981 c1981 = new C1981(4);
        interfaceC1425.invoke(c1981);
        this.f4794 = c1981;
    }

    public final void m3053(String... strArr) {
        this.f4792 = AbstractC0270.m1389(strArr);
    }
}
