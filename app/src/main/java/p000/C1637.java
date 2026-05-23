package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲁᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1637 extends C2360 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean f5548;

    public C1637(String str, C1638 c1638) {
        super(str, c1638, 1);
        this.f5548 = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    @Override // p000.C2360
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1637) {
            InterfaceC2654 interfaceC2654 = (InterfaceC2654) obj;
            if (AbstractC2207.m4087(this.f7568, interfaceC2654.mo1342())) {
                C1637 c1637 = (C1637) obj;
                if (c1637.f5548 && Arrays.equals((InterfaceC2654[]) this.f7577.getValue(), (InterfaceC2654[]) c1637.f7577.getValue())) {
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
        }
        return false;
    }

    @Override // p000.C2360
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean mo3358() {
        return this.f5548;
    }
}
