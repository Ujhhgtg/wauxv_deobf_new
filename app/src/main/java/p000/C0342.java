package p000;

import bsh.AbstractC0009;
import bsh.C0006;
import bsh.C0007;
import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0342 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f1625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1627;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": static=" + this.f1626 + ", *=" + this.f1625 + ", super import=" + this.f1627;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        Class clsM344;
        C0007 c0007M1929 = c0550.m1929();
        if (this.f1627) {
            try {
                c0007M1929.m346().mo300();
            } catch (C3523 e) {
                throw e.mo4643(this, c0550);
            }
        } else {
            boolean zM5125 = false;
            C0326 c0326 = (C0326) this.f8721[0];
            if (!this.f1626) {
                String str = c0326.f1577;
                if (this.f1625) {
                    c0007M1929.mo312(str);
                } else {
                    c0007M1929.mo311(str);
                }
            } else {
                if (!this.f1625) {
                    String strM331 = C0006.m331(1, c0326.f1577);
                    Object objM1433 = null;
                    try {
                        String str2 = c0326.f1577;
                        clsM344 = c0007M1929.m344(C0006.m330(C0006.m327(str2) - 1, str2));
                        try {
                            objM1433 = AbstractC0009.m408(clsM344, strM331);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        clsM344 = null;
                    }
                    if (clsM344 != null && objM1433 == null) {
                        try {
                            objM1433 = AbstractC0009.m388(clsM344, strM331);
                        } catch (Exception unused3) {
                        }
                    }
                    if (objM1433 == null) {
                        try {
                            objM1433 = c0326.m1433(c0550, runnableC1668, false);
                        } catch (Exception unused4) {
                        }
                    }
                    if (objM1433 instanceof C0501) {
                        c0007M1929.mo313((C0501) objM1433);
                        return Primitive.VOID;
                    }
                    if (!(objM1433 instanceof C1751)) {
                        try {
                            objM1433 = c0550.m1929().m352(c0326.f1577).m338(c0550, runnableC1668);
                        } catch (C3523 e2) {
                            throw e2.mo4643(c0326, c0550);
                        }
                    }
                    if (objM1433 instanceof C1751) {
                        C1751 c1751 = (C1751) objM1433;
                        AbstractC1672 abstractC1672 = c1751.f5855;
                        if (abstractC1672 != null) {
                            zM5125 = abstractC1672.mo2348();
                        } else {
                            C3532 c3532 = c1751.f5858;
                            if (c3532 != null) {
                                zM5125 = c3532.m5125("static");
                            }
                        }
                        if (zM5125) {
                            c0007M1929.m368(c1751.m3500());
                            return Primitive.VOID;
                        }
                    }
                    throw new C1230(AbstractC2784.m4752(new StringBuilder(), c0326.f1577, " is not a static member of a class"), this, c0550);
                }
                c0007M1929.m359(c0326.m1432(c0550));
            }
        }
        return Primitive.VOID;
    }
}
