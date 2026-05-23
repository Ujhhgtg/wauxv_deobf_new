package bsh;

import p000.AbstractC2707;
import p000.C0327;
import p000.C0333;
import p000.C0550;
import p000.C2000;
import p000.InterfaceC2225;
import p000.RunnableC1668;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0002 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2000 f467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String f468;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Object[] f469;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f467 + " " + Enum.class + " " + this.f468;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        C0007 c0007M1929 = c0550.m1929();
        if (!this.f468.equals("" + c0007M1929.f512)) {
            return Primitive.VOID;
        }
        if (m308(c0550, runnableC1668) != null) {
            This.CONTEXT_ARGS.get().put(c0007M1929.f512.toString(), m308(c0550, runnableC1668));
        }
        for (int i = 0; i < m4710().length; i++) {
            InterfaceC2225 interfaceC2225 = this.f8721[i];
            if (interfaceC2225 instanceof C0333) {
                ((C0333) interfaceC2225).m1448(c0550, runnableC1668, Boolean.TRUE);
            }
        }
        return Primitive.VOID;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object[] m308(C0550 c0550, RunnableC1668 runnableC1668) {
        if (this.f469 == null && m4710().length > 0) {
            InterfaceC2225 interfaceC2225 = this.f8721[0];
            if (interfaceC2225 instanceof C0327) {
                this.f469 = ((C0327) interfaceC2225).m1434(c0550, runnableC1668);
            }
        }
        return this.f469;
    }
}
