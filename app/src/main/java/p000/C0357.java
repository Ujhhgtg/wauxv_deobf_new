package p000;

import bsh.AbstractC0009;
import bsh.C0007;
import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0357 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2000 f1671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0359[] f1672;

    public C0357(int i) {
        super(i);
        this.f1671 = new C2000(3);
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1671;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᛸᲀᲇ -> 0x003b, ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ -> 0x0069, TRY_LEAVE, TryCatch #0 {ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ -> 0x0069, blocks: (B:16:0x004e, B:18:0x0052, B:21:0x0058, B:22:0x0064, B:27:0x006d, B:36:0x008d, B:38:0x0091, B:43:0x00c2, B:45:0x00c6, B:40:0x00a4, B:42:0x00b2, B:28:0x0072, B:29:0x007e, B:32:0x0084), top: B:54:0x004e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        C1751 c1751;
        boolean z;
        AbstractC1672 abstractC1672M404;
        AbstractC1672 abstractC1672M405;
        Object objM356 = Primitive.VOID;
        try {
            C0007 c0007M1929 = c0550.m1929();
            C0356 c0356 = (C0356) this.f8721[0];
            Class clsM1467 = c0356.m1467(c0550, runnableC1668);
            InterfaceC2225 interfaceC2225 = c0356.f8721[0];
            if ((interfaceC2225 instanceof C0326) && "val".equals(((C0326) interfaceC2225).f1577) && !this.f1671.m3864("final")) {
                this.f1671.m3860("final");
            }
            for (C0359 c0359 : m1469()) {
                Object objM1471 = c0359.m1471(c0356, this.f1671, c0550, runnableC1668);
                try {
                    if (c0007M1929.f508) {
                        Object obj = c0007M1929.f512;
                        if (obj != null) {
                            try {
                                abstractC1672M405 = AbstractC0009.m404(c0007M1929.f511, c0359.f1675, this.f1671.m3864("static"));
                            } catch (C2518 unused) {
                                abstractC1672M405 = null;
                            }
                            c1751 = new C1751(abstractC1672M405, obj);
                        } else {
                            Class cls = c0007M1929.f511;
                            try {
                                abstractC1672M404 = AbstractC0009.m404(cls, c0359.f1675, this.f1671.m3864("static"));
                            } catch (C2518 unused2) {
                                abstractC1672M404 = null;
                            }
                            c1751 = new C1751(abstractC1672M404, (Object) cls);
                        }
                    } else {
                        c1751 = null;
                    }
                    if (c1751 == null || c1751.f5855 == null) {
                        
                        c0007M1929.m367(c0359.f1675, clsM1467, objM1471, this.f1671);
                        if (!c0007M1929.f507) {
                            z = false;
                            runnableC1668.f5634.m346().mo296(c0007M1929.m357(c0359.f1675, false));
                        }
                        if (c0007M1929.f508) {
                            objM356 = objM1471;
                        } else {
                            objM356 = c0007M1929.m356(c0359.f1675, true);
                        }
                    } else {
                        C3532 c3532 = new C3532(c0359.f1675, clsM1467, c1751);
                        c3532.f11064 = this.f1671;
                        c3532.m5126(1, objM1471);
                        c0007M1929.m368(c3532);
                    }
                    z = false;
                    if (c0007M1929.f508) {
                        objM356 = c0007M1929.m356(c0359.f1675, true);
                    } else {
                        objM356 = objM1471;
                    }
                } catch (C3523 e) {
                    throw e.mo4643(this, c0550);
                }
            }
            return objM356;
        } catch (C1229 e2) {
            throw e2.mo2865("Typed variable declaration");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0359[] m1469() {
        C0359[] c0359Arr = this.f1672;
        if (c0359Arr != null) {
            return c0359Arr;
        }
        int length = m4710().length;
        this.f1672 = new C0359[length - 1];
        for (int i = 1; i < length; i++) {
            this.f1672[i - 1] = (C0359) this.f8721[i];
        }
        return this.f1672;
    }
}
