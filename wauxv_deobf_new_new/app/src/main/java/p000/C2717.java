package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲈᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2717 implements InterfaceC2715, InterfaceC0523 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f8725;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC2236 f8726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f8727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final HashSet f8728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String[] f8729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC2715[] f8730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List[] f8731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean[] f8732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Map f8733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final InterfaceC2715[] f8734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2933 f8735;

    public C2717(String str, AbstractC2236 abstractC2236, int i, List list, C0703 c0703) {
        this.f8725 = str;
        this.f8726 = abstractC2236;
        this.f8727 = i;
        ArrayList arrayList = c0703.f2685;
        HashSet hashSet = new HashSet(AbstractC1924.m3872(AbstractC0741.m2313(arrayList, 12)));
        AbstractC0739.m2303(arrayList, hashSet);
        this.f8728 = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f8729 = strArr;
        this.f8730 = AbstractC1586.m3470(c0703.f2687);
        this.f8731 = (List[]) c0703.f2688.toArray(new List[0]);
        this.f8732 = AbstractC0739.m2301(c0703.f2689);
        C1643 c1643 = new C1643(new C0114(strArr, 3), 0);
        ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(c1643, 10));
        Iterator it = c1643.iterator();
        while (true) {
            C1118 c1118 = (C1118) it;
            if (!c1118.f4168.hasNext()) {
                this.f8733 = AbstractC1924.m3875(arrayList2);
                this.f8734 = AbstractC1586.m3470(list);
                this.f8735 = new C2933(new C2070(this, 13));
                return;
            }
            C1642 c1642 = (C1642) c1118.next();
            arrayList2.add(new C2348(c1642.f5541, Integer.valueOf(c1642.f5540)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2717) {
            InterfaceC2715 interfaceC2715 = (InterfaceC2715) obj;
            if (this.f8725.equals(interfaceC2715.mo1488()) && Arrays.equals(this.f8734, ((C2717) obj).f8734)) {
                int iMo3641 = interfaceC2715.mo3641();
                int i = this.f8727;
                if (i == iMo3641) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC2715[] interfaceC2715Arr = this.f8730;
                        if (AbstractC1469.m3322(interfaceC2715Arr[i2].mo1488(), interfaceC2715.mo3644(i2).mo1488()) && AbstractC1469.m3322(interfaceC2715Arr[i2].mo3640(), interfaceC2715.mo3644(i2).mo3640())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2715
    public final List getAnnotations() {
        return C1191.f4326;
    }

    public final int hashCode() {
        return ((Number) this.f8735.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC2235.m4217(this);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1488() {
        return this.f8725;
    }

    @Override // p000.InterfaceC0523
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Set mo2015() {
        return this.f8728;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3639(String str) {
        Integer num = (Integer) this.f8733.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC2236 mo3640() {
        return this.f8726;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3641() {
        return this.f8727;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3642(int i) {
        return this.f8729[i];
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3643(int i) {
        return this.f8731[i];
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2715 mo3644(int i) {
        return this.f8730[i];
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3645(int i) {
        return this.f8732[i];
    }
}
