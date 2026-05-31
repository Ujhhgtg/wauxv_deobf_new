package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0974 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f3537 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f3538 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1472 f3539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f3540;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Class f3543;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1216 f3544;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2336 f3545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public Map f3546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Class f3547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f3548;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f3549;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public InterfaceC1772 f3550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public EnumC2454 f3551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C1068 f3552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f3553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f3554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList m2614() {
        boolean z = this.f3549;
        ArrayList arrayList = this.f3538;
        if (!z) {
            this.f3549 = true;
            arrayList.clear();
            ArrayList arrayListM2615 = m2615();
            int size = arrayListM2615.size();
            for (int i = 0; i < size; i++) {
                C2026 c2026 = (C2026) arrayListM2615.get(i);
                InterfaceC1772 interfaceC1772 = c2026.f6760;
                List list = c2026.f6761;
                if (!arrayList.contains(interfaceC1772)) {
                    arrayList.add(c2026.f6760);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC1772) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList m2615() {
        boolean z = this.f3548;
        ArrayList arrayList = this.f3537;
        if (!z) {
            this.f3548 = true;
            arrayList.clear();
            List listM4581 = this.f3539.m3406().m4581(this.f3540);
            int size = listM4581.size();
            for (int i = 0; i < size; i++) {
                C2026 c2026Mo1541 = ((InterfaceC2027) listM4581.get(i)).mo1541(this.f3540, this.f3541, this.f3542, this.f3545);
                if (c2026Mo1541 != null) {
                    arrayList.add(c2026Mo1541);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1851 m2616(Class cls) {
        C1851 c1851;
        Class cls2;
        Class cls3;
        Class cls4;
        C1851 c1852;
        ArrayList arrayList;
        InterfaceC2634 interfaceC2634;
        Class cls5 = cls;
        C2585 c2585M3406 = this.f3539.m3406();
        Class cls6 = this.f3543;
        Class cls7 = this.f3547;
        C1852 c1853 = c2585M3406.f8219;
        C2131 c2131 = (C2131) c1853.f6182.getAndSet(null);
        if (c2131 == null) {
            c2131 = new C2131();
        }
        c2131.f7038 = cls5;
        c2131.f7039 = cls6;
        c2131.f7040 = cls7;
        synchronized (c1853.f6181) {
            c1851 = (C1851) c1853.f6181.get(c2131);
        }
        c1853.f6182.set(c2131);
        c2585M3406.f8219.getClass();
        if (C1852.f6180.equals(c1851)) {
            return null;
        }
        if (c1851 != null) {
            return c1851;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c2585M3406.f8213.m1987(cls5, cls6)) {
            for (Class cls9 : c2585M3406.f8216.m2934(cls8, cls7)) {
                C0519 c0519 = c2585M3406.f8213;
                synchronized (c0519) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c0519.f2208).iterator();
                    while (it.hasNext()) {
                        List<C2628> list = (List) ((HashMap) c0519.f2209).get((String) it.next());
                        if (list != null) {
                            for (C2628 c2628 : list) {
                                if (c2628.f8317.isAssignableFrom(cls5) && cls8.isAssignableFrom(c2628.f8318)) {
                                    arrayList.add(c2628.f8319);
                                }
                            }
                        }
                    }
                }
                C1210 c1210 = c2585M3406.f8216;
                synchronized (c1210) {
                    if (cls9.isAssignableFrom(cls8)) {
                        interfaceC2634 = C1139.f4229;
                    } else {
                        Iterator it2 = c1210.f4345.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            C3481 c3481 = (C3481) it2.next();
                            if (c3481.f10956.isAssignableFrom(cls8) && cls9.isAssignableFrom(c3481.f10957)) {
                                interfaceC2634 = c3481.f10958;
                                break;
                            }
                            cls5 = cls;
                        }
                    }
                }
                arrayList2.add(new C0977(cls5, cls8, cls9, arrayList, interfaceC2634, c2585M3406.f8220));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c1852 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c1852 = new C1851(cls2, cls3, cls4, arrayList2, c2585M3406.f8220);
        }
        C1852 c1854 = c2585M3406.f8219;
        synchronized (c1854.f6181) {
            c1854.f6181.put(new C2131(cls2, cls3, cls4), c1852 != null ? c1852 : C1852.f6180);
        }
        return c1852;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1208 m2617(Object obj) {
        InterfaceC1208 interfaceC1208;
        C1210 c1210 = this.f3539.m3406().f8212;
        Class<?> cls = obj.getClass();
        synchronized (c1210) {
            for (C1209 c1209 : c1210.f4345) {
                if (c1209.f4343.isAssignableFrom(cls)) {
                    interfaceC1208 = c1209.f4344;
                }
            }
            interfaceC1208 = null;
        }
        if (interfaceC1208 != null) {
            return interfaceC1208;
        }
        throw new C2584(AbstractC1095.m2797(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC3484 m2618(Class cls) {
        InterfaceC3484 interfaceC3484 = (InterfaceC3484) this.f3546.get(cls);
        if (interfaceC3484 == null) {
            for (Map.Entry entry : this.f3546.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC3484 = (InterfaceC3484) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC3484 != null) {
            return interfaceC3484;
        }
        if (!this.f3546.isEmpty() || !this.f3553) {
            return C3557.f11154;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
