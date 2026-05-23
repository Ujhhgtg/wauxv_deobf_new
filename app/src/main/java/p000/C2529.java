package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2529 {

    public final C0542 f8061;

    public final C1209 f8062;

    public final C0542 f8063;

    public final C1209 f8064;

    public final C0963 f8065;

    public final C1209 f8066;

    public final C1209 f8067;

    public final C0542 f8068 = new C0542(19);

    public final C1825 f8069 = new C1825();

    public final C0243 f8070;

    public C2529() {
        C0243 c0243 = new C0243(new C2380(20), new C1227(4), new C1227(5));
        this.f8070 = c0243;
        this.f8061 = new C0542(c0243);
        this.f8062 = new C1209(0);
        this.f8063 = new C0542(24);
        this.f8064 = new C1209(3);
        this.f8065 = new C0963(0);
        this.f8066 = new C1209(4);
        this.f8067 = new C1209(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0542 c0542 = this.f8063;
        synchronized (c0542) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c0542.f2252);
                ((ArrayList) c0542.f2252).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c0542.f2252).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0542.f2252).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m4554(Class cls, InterfaceC1207 interfaceC1207) {
        C1209 c1209 = this.f8062;
        synchronized (c1209) {
            c1209.f4348.add(new C1208(cls, interfaceC1207));
        }
    }

    public final void m4555(Class cls, InterfaceC2574 interfaceC2574) {
        C1209 c1209 = this.f8064;
        synchronized (c1209) {
            c1209.f4348.add(new C2575(cls, interfaceC2574));
        }
    }

    public final void m4556(Class cls, Class cls2, InterfaceC1997 interfaceC1997) {
        C0542 c0542 = this.f8061;
        synchronized (c0542) {
            C2103 c2103 = (C2103) c0542.f2252;
            synchronized (c2103) {
                try {
                    C2101 c2101 = new C2101(cls, cls2, interfaceC1997);
                    ArrayList arrayList = (ArrayList) c2103.f6935;
                    arrayList.add(arrayList.size(), c2101);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((C0963) c0542.f2253).f3488.clear();
        }
    }

    public final void m4557(String str, Class cls, Class cls2, InterfaceC2571 interfaceC2571) {
        C0542 c0542 = this.f8063;
        synchronized (c0542) {
            c0542.m1892(str).add(new C2572(cls, cls2, interfaceC2571));
        }
    }

    public final ArrayList m4558() {
        ArrayList arrayList;
        C1209 c1209 = this.f8067;
        synchronized (c1209) {
            arrayList = c1209.f4348;
        }
        if (arrayList.isEmpty()) {
            throw new C2528("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List m4559(Object obj) {
        List listUnmodifiableList;
        C0542 c0542 = this.f8061;
        
        Class<?> cls = obj.getClass();
        synchronized (c0542) {
            C1998 c1998 = (C1998) ((C0963) c0542.f2253).f3488.get(cls);
            listUnmodifiableList = c1998 == null ? null : c1998.f6658;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C2103) c0542.f2252).m3912(cls));
                if (((C1998) ((C0963) c0542.f2253).f3488.put(cls, new C1998(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C2528(AbstractC1194.m2783(obj, new StringBuilder("Failed to find any ModelLoaders registered for model class: ")));
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC1996 interfaceC1996 = (InterfaceC1996) listUnmodifiableList.get(i);
            if (interfaceC1996.mo1394(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC1996);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C2528("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final InterfaceC0962 m4560(Object obj) {
        InterfaceC0962 interfaceC0962Mo1862;
        C0963 c0963 = this.f8065;
        synchronized (c0963) {
            try {
                AbstractC1460.m3209(obj);
                InterfaceC0961 interfaceC0961 = (InterfaceC0961) c0963.f3488.get(obj.getClass());
                if (interfaceC0961 == null) {
                    for (InterfaceC0961 interfaceC0962 : c0963.f3488.values()) {
                        if (interfaceC0962.mo1861().isAssignableFrom(obj.getClass())) {
                            interfaceC0961 = interfaceC0962;
                            break;
                        }
                    }
                }
                if (interfaceC0961 == null) {
                    interfaceC0961 = C0963.f3487;
                }
                interfaceC0962Mo1862 = interfaceC0961.mo1862(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0962Mo1862;
    }

    public final void m4561(InterfaceC0961 interfaceC0961) {
        C0963 c0963 = this.f8065;
        synchronized (c0963) {
            c0963.f3488.put(interfaceC0961.mo1861(), interfaceC0961);
        }
    }

    public final void m4562(Class cls, Class cls2, InterfaceC2578 interfaceC2578) {
        C1209 c1209 = this.f8066;
        synchronized (c1209) {
            c1209.f4348.add(new C3423(cls, cls2, interfaceC2578));
        }
    }
}
