package p000;

import bsh.C0003;
import bsh.C0007;
import bsh.Primitive;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0337 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f1603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String f1604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public String f1605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1606;

    public C0337() {
        super(36);
        this.f1606 = false;
        this.f1603 = C0003.f470.incrementAndGet();
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1605 + ": " + this.f1604 + ", final=" + this.f1606;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        InterfaceC2225 interfaceC2225;
        Class cls;
        String str;
        C2000 c2000 = new C2000(4);
        if (this.f1606) {
            c2000.m3860("final");
        }
        C0007 c0007M1929 = c0550.m1929();
        InterfaceC2225 interfaceC2226 = this.f8721[0];
        int length = m4710().length;
        if (interfaceC2226 instanceof C0356) {
            Class clsM1467 = ((C0356) interfaceC2226).m1467(c0550, runnableC1668);
            InterfaceC2225[] interfaceC2225Arr = this.f8721;
            InterfaceC2225 interfaceC2227 = interfaceC2225Arr[1];
            interfaceC2225 = length > 2 ? interfaceC2225Arr[2] : null;
            cls = clsM1467;
            interfaceC2226 = interfaceC2227;
        } else {
            interfaceC2225 = length > 1 ? this.f8721[1] : null;
            cls = null;
        }
        Object objMo306 = interfaceC2226.mo306(c0550, runnableC1668);
        synchronized (AbstractC0743.class) {
        }
        Iterator itM2181 = AbstractC0743.m2181(objMo306);
        try {
            int i = this.f1603;
            C1867 c1867 = C0003.f471;
            C0430 c0430 = new C0430();
            c0430.f1986 = c0007M1929;
            c0430.f1987 = i;
            C0003 c0003 = (C0003) c1867.m3641(c0430);
            c0003.clear();
            c0550.m1928(c0003);
            while (!Thread.interrupted() && itM2181.hasNext()) {
                try {
                    Object next = itM2181.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    c0003.clear();
                    c0003.m367(this.f1604, cls, next, c2000);
                    if (interfaceC2225 != null) {
                        Object objM1448 = interfaceC2225 instanceof C0333 ? ((C0333) interfaceC2225).m1448(c0550, runnableC1668, null) : interfaceC2225.mo306(c0550, runnableC1668);
                        if (objM1448 instanceof C2588) {
                            C2588 c2588 = (C2588) objM1448;
                            String str2 = c2588.f8195;
                            if (str2 != null && ((str = this.f1605) == null || !str.equals(str2))) {
                                c0550.m1928(c0007M1929);
                                return objM1448;
                            }
                            int i2 = c2588.f8194;
                            if (i2 == 49) {
                                c0550.m1928(c0007M1929);
                                return objM1448;
                            }
                            if (i2 == 13) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (C3523 e) {
                    throw e.mo4644("for loop iterator variable:" + this.f1604, this, c0550);
                }
            }
            Primitive primitive = Primitive.VOID;
            c0550.m1928(c0007M1929);
            return primitive;
        } catch (Throwable th) {
            c0550.m1928(c0007M1929);
            throw th;
        }
    }
}
