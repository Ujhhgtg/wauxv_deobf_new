package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2405 implements InterfaceC2715, InterfaceC0523 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7698;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1451 f7699;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f7700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7701 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String[] f7702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List[] f7703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean[] f7704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f7705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object f7706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Object f7707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Object f7708;

    public C2405(String str, InterfaceC1451 interfaceC1451, int i) {
        this.f7698 = str;
        this.f7699 = interfaceC1451;
        this.f7700 = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f7702 = strArr;
        int i3 = this.f7700;
        this.f7703 = new List[i3];
        this.f7704 = new boolean[i3];
        this.f7705 = C1192.f4327;
        final int i4 = 0;
        this.f7706 = AbstractC2240.m4259(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᲇᛸᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C2405 f7697;

            {
                this.f7697 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return this.f7697.f7699.mo1647();
                    case 1:
                        return AbstractC1586.m3470(this.f7697.f7699 != null ? new ArrayList(0) : null);
                    default:
                        C2405 c2405 = this.f7697;
                        return Integer.valueOf(AbstractC2235.m4203(c2405, (InterfaceC2715[]) c2405.f7707.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f7707 = AbstractC2240.m4259(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᲇᛸᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C2405 f7697;

            {
                this.f7697 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f7697.f7699.mo1647();
                    case 1:
                        return AbstractC1586.m3470(this.f7697.f7699 != null ? new ArrayList(0) : null);
                    default:
                        C2405 c2405 = this.f7697;
                        return Integer.valueOf(AbstractC2235.m4203(c2405, (InterfaceC2715[]) c2405.f7707.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f7708 = AbstractC2240.m4259(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᲇᛸᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C2405 f7697;

            {
                this.f7697 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return this.f7697.f7699.mo1647();
                    case 1:
                        return AbstractC1586.m3470(this.f7697.f7699 != null ? new ArrayList(0) : null);
                    default:
                        C2405 c2405 = this.f7697;
                        return Integer.valueOf(AbstractC2235.m4203(c2405, (InterfaceC2715[]) c2405.f7707.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2405) {
            InterfaceC2715 interfaceC2715 = (InterfaceC2715) obj;
            if (AbstractC1469.m3322(this.f7698, interfaceC2715.mo1488()) && Arrays.equals((InterfaceC2715[]) this.f7707.getValue(), (InterfaceC2715[]) ((C2405) obj).f7707.getValue())) {
                int iMo3641 = interfaceC2715.mo3641();
                int i = this.f7700;
                if (i == iMo3641) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC1469.m3322(mo3644(i2).mo1488(), interfaceC2715.mo3644(i2).mo1488()) && AbstractC1469.m3322(mo3644(i2).mo3640(), interfaceC2715.mo3644(i2).mo3640())) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    public int hashCode() {
        return ((Number) this.f7708.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC2235.m4217(this);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1488() {
        return this.f7698;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC0523
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Set mo2015() {
        return this.f7705.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3639(String str) {
        Integer num = (Integer) this.f7705.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC2236 mo3640() {
        return C2911.f9280;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3641() {
        return this.f7700;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3642(int i) {
        return this.f7702[i];
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3643(int i) {
        List list = this.f7703[i];
        return list == null ? C1191.f4326 : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2715 mo3644(int i) {
        return ((InterfaceC1767[]) this.f7706.getValue())[i].mo1509();
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3645(int i) {
        return this.f7704[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4350(String str, boolean z) {
        int i = this.f7701 + 1;
        this.f7701 = i;
        String[] strArr = this.f7702;
        strArr[i] = str;
        this.f7704[i] = z;
        this.f7703[i] = null;
        if (i == this.f7700 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f7705 = map;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4351(InterfaceC2483 interfaceC2483) {
        int i = this.f7701;
        List[] listArr = this.f7703;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.f7701] = arrayList;
        }
        arrayList.add(interfaceC2483);
    }
}
