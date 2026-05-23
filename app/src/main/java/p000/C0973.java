package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0973 {

    public final Class f3576;

    public final List f3577;

    public final InterfaceC2578 f3578;

    public final InterfaceC2378 f3579;

    public final String f3580;

    public C0973(Class cls, Class cls2, Class cls3, List list, InterfaceC2578 interfaceC2578, InterfaceC2378 interfaceC2378) {
        this.f3576 = cls;
        this.f3577 = list;
        this.f3578 = interfaceC2578;
        this.f3579 = interfaceC2378;
        this.f3580 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f3576 + ", decoders=" + this.f3577 + ", transcoder=" + this.f3578 + '}';
    }

    public final InterfaceC2568 m2510(int i, int i2, C0408 c0408, InterfaceC0962 interfaceC0962, C2303 c2303) {
        InterfaceC2568 interfaceC2568Mo1630;
        InterfaceC3427 interfaceC3427;
        int iMo1614;
        boolean z;
        boolean z2;
        boolean z3;
        Object c0953;
        String str;
        InterfaceC2378 interfaceC2378 = this.f3579;
        List list = (List) interfaceC2378.mo1312();
        AbstractC1460.m3210(list, "Argument must not be null");
        try {
            InterfaceC2568 interfaceC2568M2511 = m2511(interfaceC0962, i, i2, c2303, list);
            interfaceC2378.mo1311(list);
            RunnableC0972 runnableC0972 = (RunnableC0972) c0408.f1922;
            int i3 = c0408.f1921;
            C0970 c0970 = runnableC0972.f3543;
            Class<?> cls = interfaceC2568M2511.get().getClass();
            InterfaceC2574 interfaceC2574M2810 = null;
            if (i3 != 4) {
                InterfaceC3427 interfaceC3427M2494 = c0970.m2494(cls);
                interfaceC3427 = interfaceC3427M2494;
                interfaceC2568Mo1630 = interfaceC3427M2494.mo1630(runnableC0972.f3550, interfaceC2568M2511, runnableC0972.f3554, runnableC0972.f3555);
            } else {
                interfaceC2568Mo1630 = interfaceC2568M2511;
                interfaceC3427 = null;
            }
            if (!interfaceC2568M2511.equals(interfaceC2568Mo1630)) {
                interfaceC2568M2511.mo1206();
            }
            if (c0970.f3523.m3229().f8064.m2810(interfaceC2568Mo1630.mo1208()) != null) {
                interfaceC2574M2810 = c0970.f3523.m3229().f8064.m2810(interfaceC2568Mo1630.mo1208());
                if (interfaceC2574M2810 == null) {
                    throw new C2528(interfaceC2568Mo1630.mo1208());
                }
                iMo1614 = interfaceC2574M2810.mo1614(runnableC0972.f3557);
            } else {
                iMo1614 = 3;
            }
            InterfaceC2574 interfaceC2574 = interfaceC2574M2810;
            InterfaceC1749 interfaceC1749 = runnableC0972.f3565;
            ArrayList arrayListM2491 = c0970.m2491();
            int size = arrayListM2491.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((C1995) arrayListM2491.get(i4)).f6655.equals(interfaceC1749)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC0972.f3556.f3851) {
                default:
                    z2 = true;
                    if (((z || i3 != 3) && i3 != 1) || iMo1614 != 2) {
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (false) {
                if (interfaceC2574 == null) {
                    throw new C2528(interfaceC2568Mo1630.get().getClass());
                }
                int iM4759 = AbstractC2784.m4759(iMo1614);
                if (iM4759 == 0) {
                    z3 = true;
                    c0953 = new C0953(runnableC0972.f3565, runnableC0972.f3551);
                } else {
                    if (iM4759 != 1) {
                        if (iMo1614 == 1) {
                            str = "SOURCE";
                        } else if (iMo1614 != 2) {
                            str = iMo1614 != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z3 = true;
                    c0953 = new C2570(c0970.f3523.f5205, runnableC0972.f3565, runnableC0972.f3551, runnableC0972.f3554, runnableC0972.f3555, interfaceC3427, cls, runnableC0972.f3557);
                }
                C1852 c1852 = (C1852) C1852.f6162.mo1312();
                c1852.f6166 = 0;
                c1852.f6165 = z3;
                c1852.f6164 = interfaceC2568Mo1630;
                C0243 c0243 = runnableC0972.f3548;
                c0243.f1404 = c0953;
                c0243.f1405 = interfaceC2574;
                c0243.f1406 = c1852;
                interfaceC2568Mo1630 = c1852;
            }
            return this.f3578.mo1314(interfaceC2568Mo1630, c2303);
        } catch (Throwable th) {
            interfaceC2378.mo1311(list);
            throw th;
        }
    }

    public final InterfaceC2568 m2511(InterfaceC0962 interfaceC0962, int i, int i2, C2303 c2303, List list) throws C1463 {
        List list2 = this.f3577;
        int size = list2.size();
        InterfaceC2568 interfaceC2568Mo1210 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2571 interfaceC2571 = (InterfaceC2571) list2.get(i3);
            try {
                if (interfaceC2571.mo1209(interfaceC0962.mo611(), c2303)) {
                    interfaceC2568Mo1210 = interfaceC2571.mo1210(interfaceC0962.mo611(), i, i2, c2303);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC2571, e);
                }
                list.add(e);
            }
            if (interfaceC2568Mo1210 != null) {
                break;
            }
        }
        if (interfaceC2568Mo1210 != null) {
            return interfaceC2568Mo1210;
        }
        throw new C1463(this.f3580, new ArrayList(list));
    }
}
