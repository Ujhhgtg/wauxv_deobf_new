package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2569 implements InterfaceC0957, InterfaceC0954 {

    public final RunnableC0972 f8145;

    public final C0970 f8146;

    public int f8147;

    public int f8148 = -1;

    public InterfaceC1749 f8149;

    public List f8150;

    public int f8151;

    public volatile C1995 f8152;

    public File f8153;

    public C2570 f8154;

    public C2569(C0970 c0970, RunnableC0972 runnableC0972) {
        this.f8146 = c0970;
        this.f8145 = runnableC0972;
    }

    @Override // p000.InterfaceC0957
    public final void cancel() {
        C1995 c1995 = this.f8152;
        if (c1995 != null) {
            c1995.f6657.cancel();
        }
    }

    @Override // p000.InterfaceC0957
    public final boolean mo2447() {
        List list;
        ArrayList arrayListM3915;
        ArrayList arrayListM2490 = this.f8146.m2490();
        boolean z = false;
        if (!arrayListM2490.isEmpty()) {
            C0970 c0970 = this.f8146;
            C2529 c2529M3229 = c0970.f3523.m3229();
            Class<?> cls = c0970.f3524.getClass();
            Class cls2 = c0970.f3527;
            Class cls3 = c0970.f3531;
            C0542 c0542 = c2529M3229.f8068;
            C2098 c2098 = (C2098) ((AtomicReference) c0542.f2252).getAndSet(null);
            if (c2098 == null) {
                c2098 = new C2098(cls, cls2, cls3);
            } else {
                c2098.f6914 = cls;
                c2098.f6915 = cls2;
                c2098.f6916 = cls3;
            }
            synchronized (((C0264) c0542.f2253)) {
                list = (List) ((C0264) c0542.f2253).get(c2098);
            }
            ((AtomicReference) c0542.f2252).set(c2098);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C0542 c0543 = c2529M3229.f8061;
                synchronized (c0543) {
                    arrayListM3915 = ((C2103) c0543.f2252).m3915(cls);
                }
                Iterator it = arrayListM3915.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c2529M3229.f8063.m1893((Class) it.next(), cls2)) {
                        if (!c2529M3229.f8066.m2812(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C0542 c0544 = c2529M3229.f8068;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0264) c0544.f2253)) {
                    ((C0264) c0544.f2253).put(new C2098(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f8150;
                    if (list3 != null && this.f8151 < list3.size()) {
                        this.f8152 = null;
                        while (!z && this.f8151 < this.f8150.size()) {
                            List list4 = this.f8150;
                            int i = this.f8151;
                            this.f8151 = i + 1;
                            InterfaceC1996 interfaceC1996 = (InterfaceC1996) list4.get(i);
                            File file = this.f8153;
                            C0970 c0971 = this.f8146;
                            this.f8152 = interfaceC1996.mo1395(file, c0971.f3525, c0971.f3526, c0971.f3529);
                            if (this.f8152 != null && this.f8146.m2492(this.f8152.f6657.mo1391()) != null) {
                                this.f8152.f6657.mo1856(this.f8146.f3535, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f8148 + 1;
                    this.f8148 = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f8147 + 1;
                        this.f8147 = i3;
                        if (i3 >= arrayListM2490.size()) {
                            break;
                        }
                        this.f8148 = 0;
                    }
                    InterfaceC1749 interfaceC1749 = (InterfaceC1749) arrayListM2490.get(this.f8147);
                    Class cls5 = (Class) list2.get(this.f8148);
                    InterfaceC3427 interfaceC3427M2494 = this.f8146.m2494(cls5);
                    C0970 c0972 = this.f8146;
                    this.f8154 = new C2570(c0972.f3523.f5205, interfaceC1749, c0972.f3534, c0972.f3525, c0972.f3526, interfaceC3427M2494, cls5, c0972.f3529);
                    File fileMo1511 = c0972.f3528.m2831().mo1511(this.f8154);
                    this.f8153 = fileMo1511;
                    if (fileMo1511 != null) {
                        this.f8149 = interfaceC1749;
                        this.f8150 = this.f8146.f3523.m3229().m4559(fileMo1511);
                        this.f8151 = 0;
                    }
                }
            } else if (!File.class.equals(this.f8146.f3531)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f8146.f3524.getClass() + " to " + this.f8146.f3531);
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0954
    public final void mo1882(Exception exc) {
        this.f8145.mo2449(this.f8154, exc, this.f8152.f6657, 4);
    }

    @Override // p000.InterfaceC0954
    public final void mo1883(Object obj) {
        this.f8145.mo2448(this.f8149, obj, this.f8152.f6657, 4, this.f8154);
    }
}
