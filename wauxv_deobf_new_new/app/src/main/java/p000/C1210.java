package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᛸᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f4345;

    public C1210(int i) {
        switch (i) {
            case 1:
                this.f4345 = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            case 2:
                this.f4345 = new ArrayList();
                break;
            case 3:
                this.f4345 = new ArrayList();
                break;
            case 4:
                this.f4345 = new ArrayList();
                break;
            default:
                this.f4345 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public synchronized InterfaceC2630 m2932(Class cls) {
        int size = this.f4345.size();
        for (int i = 0; i < size; i++) {
            C2631 c2631 = (C2631) this.f4345.get(i);
            if (c2631.f8322.isAssignableFrom(cls)) {
                return c2631.f8323;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public List m2933() {
        ArrayList arrayList;
        if (this.f4345.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4345) {
            arrayList = new ArrayList(this.f4345);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public synchronized ArrayList m2934(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C3481 c3481 : this.f4345) {
            if ((c3481.f10956.isAssignableFrom(cls) && cls2.isAssignableFrom(c3481.f10957)) && !arrayList.contains(c3481.f10957)) {
                arrayList.add(c3481.f10957);
            }
        }
        return arrayList;
    }
}
