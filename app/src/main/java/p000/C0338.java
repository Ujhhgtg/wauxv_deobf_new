package p000;

import bsh.C0003;
import bsh.C0007;
import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0338 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f1607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public String f1611;

    public C0338() {
        super(35);
        this.f1607 = C0003.f470.incrementAndGet();
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1611 + ": " + this.f1608 + " ; " + this.f1609 + " ; " + this.f1610;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        InterfaceC2225 interfaceC2225;
        int i;
        InterfaceC2225 interfaceC2226;
        int i2;
        InterfaceC2225 interfaceC2227;
        String str;
        int i3 = 0;
        if (this.f1608) {
            interfaceC2225 = this.f8721[0];
            i3 = 1;
        } else {
            interfaceC2225 = null;
        }
        if (this.f1609) {
            i = i3 + 1;
            interfaceC2226 = this.f8721[i3];
        } else {
            i = i3;
            interfaceC2226 = null;
        }
        if (this.f1610) {
            i2 = i + 1;
            interfaceC2227 = this.f8721[i];
        } else {
            i2 = i;
            interfaceC2227 = null;
        }
        InterfaceC2225 interfaceC2228 = i2 < m4710().length ? this.f8721[i2] : null;
        C0007 c0007M1929 = c0550.m1929();
        c0550.m1928(new C0003(c0007M1929, this.f1607));
        try {
            if (this.f1608) {
                interfaceC2225.mo306(c0550, runnableC1668);
            }
            while (!Thread.interrupted() && (!this.f1609 || C0341.m1454(interfaceC2226, c0550, runnableC1668))) {
                if (interfaceC2228 != null) {
                    Object objM1448 = interfaceC2228 instanceof C0333 ? ((C0333) interfaceC2228).m1448(c0550, runnableC1668, null) : interfaceC2228.mo306(c0550, runnableC1668);
                    if (objM1448 instanceof C2588) {
                        C2588 c2588 = (C2588) objM1448;
                        String str2 = c2588.f8195;
                        if (str2 != null && ((str = this.f1611) == null || !str.equals(str2))) {
                            return objM1448;
                        }
                        int i4 = c2588.f8194;
                        if (i4 != 49) {
                            if (i4 == 13) {
                                break;
                            }
                        } else {
                            return objM1448;
                        }
                    }
                }
                if (this.f1610) {
                    interfaceC2227.mo306(c0550, runnableC1668);
                }
            }
            return Primitive.VOID;
        } finally {
            c0550.m1928(c0007M1929);
        }
    }
}
