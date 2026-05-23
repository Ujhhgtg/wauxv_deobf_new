package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2656 implements InterfaceC2654, InterfaceC0546 {

    public final String f8560;

    public final AbstractC1460 f8561;

    public final int f8562;

    public final HashSet f8563;

    public final String[] f8564;

    public final InterfaceC2654[] f8565;

    public final List[] f8566;

    public final boolean[] f8567;

    public final Map f8568;

    public final InterfaceC2654[] f8569;

    public final C2873 f8570;

    public C2656(String str, AbstractC1460 abstractC1460, int i, List list, C0708 c0708) {
        this.f8560 = str;
        this.f8561 = abstractC1460;
        this.f8562 = i;
        ArrayList arrayList = c0708.f2691;
        HashSet hashSet = new HashSet(AbstractC1898.m3693(AbstractC0746.m2214(arrayList, 12)));
        AbstractC0744.m2204(arrayList, hashSet);
        this.f8563 = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f8564 = strArr;
        this.f8565 = AbstractC2202.m3999(c0708.f2693);
        this.f8566 = (List[]) c0708.f2694.toArray(new List[0]);
        this.f8567 = AbstractC0744.m2202(c0708.f2695);
        C1630 c1630 = new C1630(0, new C0106(3, strArr));
        ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(c1630, 10));
        Iterator it = c1630.iterator();
        while (true) {
            C1112 c1112 = (C1112) it;
            if (!c1112.f4157.hasNext()) {
                this.f8568 = AbstractC1898.m3696(arrayList2);
                this.f8569 = AbstractC2202.m3999(list);
                this.f8570 = new C2873(new C2042(12, this));
                return;
            }
            C1629 c1629 = (C1629) c1112.next();
            arrayList2.add(new C2315(c1629.f5507, Integer.valueOf(c1629.f5506)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2656) {
            InterfaceC2654 interfaceC2654 = (InterfaceC2654) obj;
            if (this.f8560.equals(interfaceC2654.mo1342()) && Arrays.equals(this.f8569, ((C2656) obj).f8569)) {
                int iMo3473 = interfaceC2654.mo3473();
                int i = this.f8562;
                if (i == iMo3473) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC2654[] interfaceC2654Arr = this.f8565;
                        if (AbstractC2207.m4087(interfaceC2654Arr[i2].mo1342(), interfaceC2654.mo3476(i2).mo1342()) && AbstractC2207.m4087(interfaceC2654Arr[i2].mo3472(), interfaceC2654.mo3476(i2).mo3472())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2654
    public final List getAnnotations() {
        return C1189.f4329;
    }

    public final int hashCode() {
        return ((Number) this.f8570.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC1458.m3169(this);
    }

    @Override // p000.InterfaceC2654
    public final String mo1342() {
        return this.f8560;
    }

    @Override // p000.InterfaceC0546
    public final Set mo1920() {
        return this.f8563;
    }

    @Override // p000.InterfaceC2654
    public final int mo3471(String str) {
        Integer num = (Integer) this.f8568.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC2654
    public final AbstractC1460 mo3472() {
        return this.f8561;
    }

    @Override // p000.InterfaceC2654
    public final int mo3473() {
        return this.f8562;
    }

    @Override // p000.InterfaceC2654
    public final String mo3474(int i) {
        return this.f8564[i];
    }

    @Override // p000.InterfaceC2654
    public final List mo3475(int i) {
        return this.f8566[i];
    }

    @Override // p000.InterfaceC2654
    public final InterfaceC2654 mo3476(int i) {
        return this.f8565[i];
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3477(int i) {
        return this.f8567[i];
    }
}
