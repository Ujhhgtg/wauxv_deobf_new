package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0273 implements Collection {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0274 f1531;

    public C0273(C0274 c0274) {
        this.f1531 = c0274;
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
        this.f1531.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1531.m4738(obj) >= 0;
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
        return this.f1531.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0270(this.f1531, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0274 c0274 = this.f1531;
        int iM4738 = c0274.m4738(obj);
        if (iM4738 < 0) {
            return false;
        }
        c0274.mo2013(iM4738);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0274 c0274 = this.f1531;
        int i = c0274.f8887;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0274.m4744(i2))) {
                c0274.mo2013(i2);
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
        C0274 c0274 = this.f1531;
        int i = c0274.f8887;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0274.m4744(i2))) {
                c0274.mo2013(i2);
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
        return this.f1531.f8887;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0274 c0274 = this.f1531;
        int i = c0274.f8887;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0274.m4744(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0274 c0274 = this.f1531;
        int i = c0274.f8887;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0274.m4744(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
