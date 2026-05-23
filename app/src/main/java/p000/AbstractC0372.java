package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲁᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0372 extends ArrayList {
    public final Object first() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return get(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m1493() {
        if (super.size() == 0) {
            throw new C0761("No result found for query");
        }
        E e = get(0);
        int size = super.size();
        for (int i = 1; i < size; i++) {
            if (!AbstractC2207.m4087(e, get(i))) {
                throw new C0761(super.size());
            }
        }
        return e;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m1494(InterfaceC1425 interfaceC1425) {
        if (super.size() == 0) {
            throw new C0761("No result found for query");
        }
        Object obj = null;
        for (Object obj2 : this) {
            if (((Boolean) interfaceC1425.invoke(obj2)).booleanValue()) {
                if (obj != null && !obj.equals(obj2)) {
                    throw new C0761(super.size());
                }
                obj = obj2;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new C0761("No result found for query");
    }
}
