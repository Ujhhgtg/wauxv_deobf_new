package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2585 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0519 f8211;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1210 f8212;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0519 f8213;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1210 f8214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0967 f8215;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1210 f8216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1210 f8217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0519 f8218 = new C0519(19);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1852 f8219 = new C1852();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0253 f8220;

    public C2585() {
        C0253 c0253 = new C0253(new C2433(20), new C1224(5), new C1224(6));
        this.f8220 = c0253;
        this.f8211 = new C0519(c0253);
        this.f8212 = new C1210(0);
        this.f8213 = new C0519(24);
        this.f8214 = new C1210(3);
        this.f8215 = new C0967(0);
        this.f8216 = new C1210(4);
        this.f8217 = new C1210(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0519 c0519 = this.f8213;
        synchronized (c0519) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c0519.f2208);
                ((ArrayList) c0519.f2208).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c0519.f2208).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0519.f2208).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4576(Class cls, InterfaceC1208 interfaceC1208) {
        C1210 c1210 = this.f8212;
        synchronized (c1210) {
            c1210.f4345.add(new C1209(cls, interfaceC1208));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4577(Class cls, InterfaceC2630 interfaceC2630) {
        C1210 c1210 = this.f8214;
        synchronized (c1210) {
            c1210.f4345.add(new C2631(cls, interfaceC2630));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4578(Class cls, Class cls2, InterfaceC2028 interfaceC2028) {
        C0519 c0519 = this.f8211;
        synchronized (c0519) {
            C2136 c2136 = (C2136) c0519.f2208;
            synchronized (c2136) {
                try {
                    C2134 c2134 = new C2134(cls, cls2, interfaceC2028);
                    ArrayList arrayList = (ArrayList) c2136.f7059;
                    arrayList.add(arrayList.size(), c2134);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((C0967) c0519.f2209).f3505.clear();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4579(String str, Class cls, Class cls2, InterfaceC2627 interfaceC2627) {
        C0519 c0519 = this.f8213;
        synchronized (c0519) {
            c0519.m1986(str).add(new C2628(cls, cls2, interfaceC2627));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList m4580() {
        ArrayList arrayList;
        C1210 c1210 = this.f8217;
        synchronized (c1210) {
            arrayList = c1210.f4345;
        }
        if (arrayList.isEmpty()) {
            throw new C2584("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List m4581(Object obj) {
        List listUnmodifiableList;
        C0519 c0519 = this.f8211;
        c0519.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0519) {
            C2029 c2029 = (C2029) ((C0967) c0519.f2209).f3505.get(cls);
            listUnmodifiableList = c2029 == null ? null : c2029.f6763;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C2136) c0519.f2208).m4096(cls));
                if (((C2029) ((C0967) c0519.f2209).f3505.put(cls, new C2029(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C2584(AbstractC1095.m2798(obj, new StringBuilder("Failed to find any ModelLoaders registered for model class: ")));
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC2027 interfaceC2027 = (InterfaceC2027) listUnmodifiableList.get(i);
            if (interfaceC2027.mo1540(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC2027);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C2584("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0966 m4582(Object obj) {
        InterfaceC0966 interfaceC0966Mo1956;
        C0967 c0967 = this.f8215;
        synchronized (c0967) {
            try {
                AbstractC2727.m4692(obj);
                InterfaceC0965 interfaceC0965 = (InterfaceC0965) c0967.f3505.get(obj.getClass());
                if (interfaceC0965 == null) {
                    for (InterfaceC0965 interfaceC0966 : c0967.f3505.values()) {
                        if (interfaceC0966.mo1955().isAssignableFrom(obj.getClass())) {
                            interfaceC0965 = interfaceC0966;
                            break;
                        }
                    }
                }
                if (interfaceC0965 == null) {
                    interfaceC0965 = C0967.f3504;
                }
                interfaceC0966Mo1956 = interfaceC0965.mo1956(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0966Mo1956;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4583(InterfaceC0965 interfaceC0965) {
        C0967 c0967 = this.f8215;
        synchronized (c0967) {
            c0967.f3505.put(interfaceC0965.mo1955(), interfaceC0965);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4584(Class cls, Class cls2, InterfaceC2634 interfaceC2634) {
        C1210 c1210 = this.f8216;
        synchronized (c1210) {
            c1210.f4345.add(new C3481(cls, cls2, interfaceC2634));
        }
    }
}
