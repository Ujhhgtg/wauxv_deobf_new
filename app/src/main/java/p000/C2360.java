package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2360 implements InterfaceC2654, InterfaceC0546 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1443 f7569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f7570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7571 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String[] f7572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List[] f7573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean[] f7574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f7575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object f7576;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Object f7577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Object f7578;

    public C2360(String str, InterfaceC1443 interfaceC1443, int i) {
        this.f7568 = str;
        this.f7569 = interfaceC1443;
        this.f7570 = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f7572 = strArr;
        int i3 = this.f7570;
        this.f7573 = new List[i3];
        this.f7574 = new boolean[i3];
        this.f7575 = C1190.f4330;
        final int i4 = 0;
        this.f7576 = AbstractC1458.m3163(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᲇᛸᲈ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2360 f7567;

            {
                this.f7567 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return this.f7567.f7569.mo1541();
                    case 1:
                        return AbstractC2202.m3999(this.f7567.f7569 != null ? new ArrayList(0) : null);
                    default:
                        C2360 c2360 = this.f7567;
                        return Integer.valueOf(AbstractC1458.m3161(c2360, (InterfaceC2654[]) c2360.f7577.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f7577 = AbstractC1458.m3163(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᲇᛸᲈ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2360 f7567;

            {
                this.f7567 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f7567.f7569.mo1541();
                    case 1:
                        return AbstractC2202.m3999(this.f7567.f7569 != null ? new ArrayList(0) : null);
                    default:
                        C2360 c2360 = this.f7567;
                        return Integer.valueOf(AbstractC1458.m3161(c2360, (InterfaceC2654[]) c2360.f7577.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f7578 = AbstractC1458.m3163(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᲇᛸᲈ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2360 f7567;

            {
                this.f7567 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return this.f7567.f7569.mo1541();
                    case 1:
                        return AbstractC2202.m3999(this.f7567.f7569 != null ? new ArrayList(0) : null);
                    default:
                        C2360 c2360 = this.f7567;
                        return Integer.valueOf(AbstractC1458.m3161(c2360, (InterfaceC2654[]) c2360.f7577.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2360) {
            InterfaceC2654 interfaceC2654 = (InterfaceC2654) obj;
            if (AbstractC2207.m4087(this.f7568, interfaceC2654.mo1342()) && Arrays.equals((InterfaceC2654[]) this.f7577.getValue(), (InterfaceC2654[]) ((C2360) obj).f7577.getValue())) {
                int iMo3473 = interfaceC2654.mo3473();
                int i = this.f7570;
                if (i == iMo3473) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC2207.m4087(mo3476(i2).mo1342(), interfaceC2654.mo3476(i2).mo1342()) && AbstractC2207.m4087(mo3476(i2).mo3472(), interfaceC2654.mo3476(i2).mo3472())) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    public int hashCode() {
        return ((Number) this.f7578.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC1458.m3169(this);
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1342() {
        return this.f7568;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC0546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Set mo1920() {
        return this.f7575.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3471(String str) {
        Integer num = (Integer) this.f7575.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC1460 mo3472() {
        return C2851.f9111;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3473() {
        return this.f7570;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3474(int i) {
        return this.f7572[i];
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3475(int i) {
        List list = this.f7573[i];
        return list == null ? C1189.f4329 : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2654 mo3476(int i) {
        return ((InterfaceC1743[]) this.f7576.getValue())[i].mo1363();
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3477(int i) {
        return this.f7574[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4338(String str, boolean z) {
        int i = this.f7571 + 1;
        this.f7571 = i;
        String[] strArr = this.f7572;
        strArr[i] = str;
        this.f7574[i] = z;
        this.f7573[i] = null;
        if (i == this.f7570 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f7575 = map;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4339(InterfaceC2430 interfaceC2430) {
        int i = this.f7571;
        List[] listArr = this.f7573;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.f7571] = arrayList;
        }
        arrayList.add(interfaceC2430);
    }
}
