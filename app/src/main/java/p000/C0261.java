package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0261 implements Set {

    public final /* synthetic */ C0264 f1452;

    public C0261(C0264 c0264) {
        this.f1452 = c0264;
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
        this.f1452.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1452.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f1452.m1365(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0264 c0264 = this.f1452;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c0264.f8716 == set.size() && c0264.m1365(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0264 c0264 = this.f1452;
        int iHashCode = 0;
        for (int i = c0264.f8716 - 1; i >= 0; i--) {
            Object objM4706 = c0264.m4706(i);
            iHashCode += objM4706 == null ? 0 : objM4706.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1452.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0260(this.f1452, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0264 c0264 = this.f1452;
        int iM4704 = c0264.m4704(obj);
        if (iM4704 < 0) {
            return false;
        }
        c0264.mo1918(iM4704);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f1452.m1366(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0264 c0264 = this.f1452;
        int i = c0264.f8716;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0264.m4706(i2))) {
                c0264.mo1918(i2);
            }
        }
        return i != c0264.f8716;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1452.f8716;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0264 c0264 = this.f1452;
        int i = c0264.f8716;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0264.m4706(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0264 c0264 = this.f1452;
        int i = c0264.f8716;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0264.m4706(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
