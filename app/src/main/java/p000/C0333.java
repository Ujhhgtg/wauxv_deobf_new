package p000;

import bsh.C0002;
import bsh.C0003;
import bsh.C0007;
import bsh.Primitive;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0333 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f1590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f1594;

    public C0333(int i) {
        super(i);
        this.f1591 = false;
        this.f1592 = false;
        this.f1593 = false;
        this.f1594 = true;
        this.f1590 = C0003.f470.incrementAndGet();
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": static=" + this.f1592 + ", synchronized=" + this.f1591;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        return m1448(c0550, runnableC1668, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m1448(C0550 c0550, RunnableC1668 runnableC1668, Boolean bool) {
        Object objM1449;
        if (!this.f1591) {
            return m1449(c0550, runnableC1668, bool, null);
        }
        synchronized (this.f8721[0].mo306(c0550, runnableC1668)) {
            objM1449 = m1449(c0550, runnableC1668, bool, null);
        }
        return objM1449;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object m1449(C0550 c0550, RunnableC1668 runnableC1668, Boolean bool, C0702 c0702) {
        C0007 c0007M1928;
        Object objMo306 = Primitive.VOID;
        ArrayList arrayList = null;
        int i = this.f1590;
        if (bool == null) {
            C0007 c0007M1929 = c0550.m1929();
            C1867 c1867 = C0003.f471;
            C0430 c0430 = new C0430();
            c0430.f1986 = c0007M1929;
            c0430.f1987 = i;
            C0003 c0003 = (C0003) c1867.m3641(c0430);
            c0003.clear();
            c0007M1928 = c0550.m1928(c0003);
        } else {
            c0007M1928 = !bool.booleanValue() ? c0550.m1928(new C0003(c0550.m1929(), i)) : null;
        }
        ?? r2 = this.f1591;
        int length = m4710().length;
        try {
            if (this.f1594 || this.f1593) {
                for (?? r5 = r2; r5 < length; r5++) {
                    InterfaceC2225 interfaceC2225 = this.f8721[r5];
                    if ((c0702 == null || c0702.m2122(interfaceC2225)) && (interfaceC2225 instanceof C0336)) {
                        this.f1593 = true;
                        ((C0336) interfaceC2225).mo306(c0550, runnableC1668);
                    }
                }
            }
            while (r2 < length) {
                InterfaceC2225 interfaceC2226 = this.f8721[r2];
                if (!(interfaceC2226 instanceof C0336) && (c0702 == null || c0702.m2122(interfaceC2226))) {
                    if (!(interfaceC2226 instanceof C0002)) {
                        objMo306 = interfaceC2226.mo306(c0550, runnableC1668);
                        if (objMo306 instanceof C2588) {
                            break;
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(interfaceC2226);
                    }
                }
                r2++;
            }
            if (arrayList != null) {
                while (!arrayList.isEmpty()) {
                    ((InterfaceC2225) arrayList.remove(0)).mo306(c0550, runnableC1668);
                }
            }
            return objMo306;
        } finally {
            this.f1594 = false;
            if (c0007M1928 != null) {
                c0550.m1928(c0007M1928);
            }
        }
    }
}
