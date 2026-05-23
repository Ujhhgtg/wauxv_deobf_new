package p000;

import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲇᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0351 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f1660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String f1661;

    @Override // p000.AbstractC2707
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(InterfaceC2335.f7500[this.f1660]);
        sb.append(" ");
        return AbstractC2784.m4752(sb, this.f1661, ":");
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        String str = this.f1661;
        if (str != null) {
            int i = this.f1660;
            C2588 c2588 = new C2588();
            c2588.f8195 = null;
            c2588.f8196 = Primitive.VOID;
            c2588.f8194 = i;
            c2588.f8195 = str;
            c2588.f8197 = this;
            return c2588;
        }
        Object objMo306 = m4710().length > 0 ? this.f8721[0].mo306(c0550, runnableC1668) : Primitive.VOID;
        int i2 = this.f1660;
        C2588 c2589 = new C2588();
        c2589.f8195 = null;
        Primitive primitive = Primitive.TRUE;
        c2589.f8194 = i2;
        c2589.f8196 = objMo306;
        c2589.f8197 = this;
        return c2589;
    }
}
