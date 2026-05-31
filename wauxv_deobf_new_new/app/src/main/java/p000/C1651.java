package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲇᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1651 extends C2405 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean f5583;

    public C1651(String str, C1652 c1652) {
        super(str, c1652, 1);
        this.f5583 = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    @Override // p000.C2405
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1651) {
            InterfaceC2715 interfaceC2715 = (InterfaceC2715) obj;
            if (AbstractC1469.m3322(this.f7698, interfaceC2715.mo1488())) {
                C1651 c1651 = (C1651) obj;
                if (c1651.f5583 && Arrays.equals((InterfaceC2715[]) this.f7707.getValue(), (InterfaceC2715[]) c1651.f7707.getValue())) {
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
        }
        return false;
    }

    @Override // p000.C2405
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean mo3522() {
        return this.f5583;
    }
}
