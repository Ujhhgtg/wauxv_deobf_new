package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0271 implements Set {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0274 f1526;

    public C0271(C0274 c0274) {
        this.f1526 = c0274;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1526.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1526.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f1526.m1511(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0274 c0274 = this.f1526;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c0274.f8887 == set.size() && c0274.m1511(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0274 c0274 = this.f1526;
        int iHashCode = 0;
        for (int i = c0274.f8887 - 1; i >= 0; i--) {
            Object objM4743 = c0274.m4743(i);
            iHashCode += objM4743 == null ? 0 : objM4743.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1526.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0270(this.f1526, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0274 c0274 = this.f1526;
        int iM4741 = c0274.m4741(obj);
        if (iM4741 < 0) {
            return false;
        }
        c0274.mo2013(iM4741);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f1526.m1512(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0274 c0274 = this.f1526;
        int i = c0274.f8887;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0274.m4743(i2))) {
                c0274.mo2013(i2);
            }
        }
        return i != c0274.f8887;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1526.f8887;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0274 c0274 = this.f1526;
        int i = c0274.f8887;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0274.m4743(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0274 c0274 = this.f1526;
        int i = c0274.f8887;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0274.m4743(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
