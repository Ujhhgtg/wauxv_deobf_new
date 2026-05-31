package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0977 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Class f3592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f3593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC2634 f3594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2431 f3595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f3596;

    public C0977(Class cls, Class cls2, Class cls3, List list, InterfaceC2634 interfaceC2634, InterfaceC2431 interfaceC2431) {
        this.f3592 = cls;
        this.f3593 = list;
        this.f3594 = interfaceC2634;
        this.f3595 = interfaceC2431;
        this.f3596 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f3592 + ", decoders=" + this.f3593 + ", transcoder=" + this.f3594 + '}';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2624 m2634(int i, int i2, C0383 c0383, InterfaceC0966 interfaceC0966, C2336 c2336) {
        InterfaceC2624 interfaceC2624Mo1736;
        InterfaceC3484 interfaceC3484;
        int iMo1720;
        boolean z;
        boolean z2;
        boolean z3;
        Object c0956;
        String str;
        InterfaceC2431 interfaceC2431 = this.f3595;
        List list = (List) interfaceC2431.mo1458();
        AbstractC2727.m4693(list, "Argument must not be null");
        try {
            InterfaceC2624 interfaceC2624M2635 = m2635(interfaceC0966, i, i2, c2336, list);
            interfaceC2431.mo1457(list);
            RunnableC0976 runnableC0976 = (RunnableC0976) c0383.f1894;
            int i3 = c0383.f1893;
            C0974 c0974 = runnableC0976.f3559;
            Class<?> cls = interfaceC2624M2635.get().getClass();
            InterfaceC2630 interfaceC2630M2932 = null;
            if (i3 != 4) {
                InterfaceC3484 interfaceC3484M2618 = c0974.m2618(cls);
                interfaceC3484 = interfaceC3484M2618;
                interfaceC2624Mo1736 = interfaceC3484M2618.mo1736(runnableC0976.f3566, interfaceC2624M2635, runnableC0976.f3570, runnableC0976.f3571);
            } else {
                interfaceC2624Mo1736 = interfaceC2624M2635;
                interfaceC3484 = null;
            }
            if (!interfaceC2624M2635.equals(interfaceC2624Mo1736)) {
                interfaceC2624M2635.mo1352();
            }
            if (c0974.f3539.m3406().f8214.m2932(interfaceC2624Mo1736.mo1354()) != null) {
                interfaceC2630M2932 = c0974.f3539.m3406().f8214.m2932(interfaceC2624Mo1736.mo1354());
                if (interfaceC2630M2932 == null) {
                    throw new C2584(interfaceC2624Mo1736.mo1354());
                }
                iMo1720 = interfaceC2630M2932.mo1720(runnableC0976.f3573);
            } else {
                iMo1720 = 3;
            }
            InterfaceC2630 interfaceC2630 = interfaceC2630M2932;
            InterfaceC1772 interfaceC1772 = runnableC0976.f3581;
            ArrayList arrayListM2615 = c0974.m2615();
            int size = arrayListM2615.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((C2026) arrayListM2615.get(i4)).f6760.equals(interfaceC1772)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC0976.f3572.f3862) {
                default:
                    z2 = true;
                    if (((z || i3 != 3) && i3 != 1) || iMo1720 != 2) {
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (interfaceC2630 == null) {
                    throw new C2584(interfaceC2624Mo1736.get().getClass());
                }
                int iM4792 = AbstractC2844.m4792(iMo1720);
                if (iM4792 == 0) {
                    z3 = true;
                    c0956 = new C0956(runnableC0976.f3581, runnableC0976.f3567);
                } else {
                    if (iM4792 != 1) {
                        if (iMo1720 == 1) {
                            str = "SOURCE";
                        } else if (iMo1720 != 2) {
                            str = iMo1720 != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z3 = true;
                    c0956 = new C2626(c0974.f3539.f5237, runnableC0976.f3581, runnableC0976.f3567, runnableC0976.f3570, runnableC0976.f3571, interfaceC3484, cls, runnableC0976.f3573);
                }
                C1878 c1878 = (C1878) C1878.f6236.mo1458();
                c1878.f6240 = 0;
                c1878.f6239 = z3;
                c1878.f6238 = interfaceC2624Mo1736;
                C0253 c0253 = runnableC0976.f3564;
                c0253.f1478 = c0956;
                c0253.f1479 = interfaceC2630;
                c0253.f1480 = c1878;
                interfaceC2624Mo1736 = c1878;
            }
            return this.f3594.mo1460(interfaceC2624Mo1736, c2336);
        } catch (Throwable th) {
            interfaceC2431.mo1457(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2624 m2635(InterfaceC0966 interfaceC0966, int i, int i2, C2336 c2336, List list) throws C1474 {
        List list2 = this.f3593;
        int size = list2.size();
        InterfaceC2624 interfaceC2624Mo1356 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2627 interfaceC2627 = (InterfaceC2627) list2.get(i3);
            try {
                if (interfaceC2627.mo1355(interfaceC0966.mo754(), c2336)) {
                    interfaceC2624Mo1356 = interfaceC2627.mo1356(interfaceC0966.mo754(), i, i2, c2336);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC2627, e);
                }
                list.add(e);
            }
            if (interfaceC2624Mo1356 != null) {
                break;
            }
        }
        if (interfaceC2624Mo1356 != null) {
            return interfaceC2624Mo1356;
        }
        throw new C1474(this.f3596, new ArrayList(list));
    }
}
