package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0970 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f3521 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f3522 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1461 f3523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f3524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3526;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Class f3527;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1215 f3528;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2303 f3529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public Map f3530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Class f3531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f3532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f3533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public InterfaceC1749 f3534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public EnumC2401 f3535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C1063 f3536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f3537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f3538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList m2490() {
        boolean z = this.f3533;
        ArrayList arrayList = this.f3522;
        if (!z) {
            this.f3533 = true;
            arrayList.clear();
            ArrayList arrayListM2491 = m2491();
            int size = arrayListM2491.size();
            for (int i = 0; i < size; i++) {
                C1995 c1995 = (C1995) arrayListM2491.get(i);
                InterfaceC1749 interfaceC1749 = c1995.f6655;
                List list = c1995.f6656;
                if (!arrayList.contains(interfaceC1749)) {
                    arrayList.add(c1995.f6655);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC1749) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList m2491() {
        boolean z = this.f3532;
        ArrayList arrayList = this.f3521;
        if (!z) {
            this.f3532 = true;
            arrayList.clear();
            List listM4559 = this.f3523.m3229().m4559(this.f3524);
            int size = listM4559.size();
            for (int i = 0; i < size; i++) {
                C1995 c1995Mo1395 = ((InterfaceC1996) listM4559.get(i)).mo1395(this.f3524, this.f3525, this.f3526, this.f3529);
                if (c1995Mo1395 != null) {
                    arrayList.add(c1995Mo1395);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1824 m2492(Class cls) {
        C1824 c1824;
        Class cls2;
        Class cls3;
        Class cls4;
        C1824 c1825;
        ArrayList arrayList;
        InterfaceC2578 interfaceC2578;
        Class cls5 = cls;
        C2529 c2529M3229 = this.f3523.m3229();
        Class cls6 = this.f3527;
        Class cls7 = this.f3531;
        C1825 c1826 = c2529M3229.f8069;
        C2098 c2098 = (C2098) c1826.f6107.getAndSet(null);
        if (c2098 == null) {
            c2098 = new C2098();
        }
        c2098.f6914 = cls5;
        c2098.f6915 = cls6;
        c2098.f6916 = cls7;
        synchronized (c1826.f6106) {
            c1824 = (C1824) c1826.f6106.get(c2098);
        }
        c1826.f6107.set(c2098);
        
        if (C1825.f6105.equals(c1824)) {
            return null;
        }
        if (c1824 != null) {
            return c1824;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c2529M3229.f8063.m1893(cls5, cls6)) {
            for (Class cls9 : c2529M3229.f8066.m2812(cls8, cls7)) {
                C0542 c0542 = c2529M3229.f8063;
                synchronized (c0542) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c0542.f2252).iterator();
                    while (it.hasNext()) {
                        List<C2572> list = (List) ((HashMap) c0542.f2253).get((String) it.next());
                        if (list != null) {
                            for (C2572 c2572 : list) {
                                if (c2572.f8164.isAssignableFrom(cls5) && cls8.isAssignableFrom(c2572.f8165)) {
                                    arrayList.add(c2572.f8166);
                                }
                            }
                        }
                    }
                }
                C1209 c1209 = c2529M3229.f8066;
                synchronized (c1209) {
                    if (cls9.isAssignableFrom(cls8)) {
                        interfaceC2578 = C1133.f4217;
                    } else {
                        Iterator it2 = c1209.f4348.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            C3423 c3423 = (C3423) it2.next();
                            if (c3423.f10795.isAssignableFrom(cls8) && cls9.isAssignableFrom(c3423.f10796)) {
                                interfaceC2578 = c3423.f10797;
                                break;
                            }
                            cls5 = cls;
                        }
                    }
                }
                arrayList2.add(new C0973(cls5, cls8, cls9, arrayList, interfaceC2578, c2529M3229.f8070));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c1825 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c1825 = new C1824(cls2, cls3, cls4, arrayList2, c2529M3229.f8070);
        }
        C1825 c1827 = c2529M3229.f8069;
        synchronized (c1827.f6106) {
            c1827.f6106.put(new C2098(cls2, cls3, cls4), c1825 != null ? c1825 : C1825.f6105);
        }
        return c1825;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1207 m2493(Object obj) {
        InterfaceC1207 interfaceC1207;
        C1209 c1209 = this.f3523.m3229().f8062;
        Class<?> cls = obj.getClass();
        synchronized (c1209) {
            for (C1208 c1208 : c1209.f4348) {
                if (c1208.f4346.isAssignableFrom(cls)) {
                    interfaceC1207 = c1208.f4347;
                }
            }
            interfaceC1207 = null;
        }
        if (false) {
            return interfaceC1207;
        }
        throw new C2528(AbstractC1194.m2782(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC3427 m2494(Class cls) {
        InterfaceC3427 interfaceC3427 = (InterfaceC3427) this.f3530.get(cls);
        if (interfaceC3427 == null) {
            for (Map.Entry entry : this.f3530.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC3427 = (InterfaceC3427) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC3427 != null) {
            return interfaceC3427;
        }
        if (!this.f3530.isEmpty() || !this.f3537) {
            return C3500.f11002;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
