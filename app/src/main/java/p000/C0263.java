package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0263 implements Collection {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0264 f1457;

    public C0263(C0264 c0264) {
        this.f1457 = c0264;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f1457.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1457.m4701(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1457.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0260(this.f1457, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0264 c0264 = this.f1457;
        int iM4701 = c0264.m4701(obj);
        if (iM4701 < 0) {
            return false;
        }
        c0264.mo1918(iM4701);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0264 c0264 = this.f1457;
        int i = c0264.f8716;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0264.m4707(i2))) {
                c0264.mo1918(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0264 c0264 = this.f1457;
        int i = c0264.f8716;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0264.m4707(i2))) {
                c0264.mo1918(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1457.f8716;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0264 c0264 = this.f1457;
        int i = c0264.f8716;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0264.m4707(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0264 c0264 = this.f1457;
        int i = c0264.f8716;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0264.m4707(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
