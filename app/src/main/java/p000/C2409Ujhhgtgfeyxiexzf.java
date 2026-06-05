package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2409Ujhhgtgfeyxiexzf implements Set {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2412Ujhhgtgfeyxiexzf f7811Ujhhgtgfeyxiexzf;

    public C2409Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        this.f7811Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
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
        this.f7811Ujhhgtgfeyxiexzf.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7811Ujhhgtgfeyxiexzf.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7811Ujhhgtgfeyxiexzf.m3663Ujhhgtgfeyxiexzf(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7811Ujhhgtgfeyxiexzf;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf == set.size() && c2412Ujhhgtgfeyxiexzf.m3663Ujhhgtgfeyxiexzf(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7811Ujhhgtgfeyxiexzf;
        int iHashCode = 0;
        for (int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf - 1; i >= 0; i--) {
            Object objM2536Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i);
            iHashCode += objM2536Ujhhgtgfeyxiexzf == null ? 0 : objM2536Ujhhgtgfeyxiexzf.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7811Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2408Ujhhgtgfeyxiexzf(this.f7811Ujhhgtgfeyxiexzf, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7811Ujhhgtgfeyxiexzf;
        int iM2534Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf.m2534Ujhhgtgfeyxiexzf(obj);
        if (iM2534Ujhhgtgfeyxiexzf < 0) {
            return false;
        }
        c2412Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7811Ujhhgtgfeyxiexzf.m3664Ujhhgtgfeyxiexzf(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7811Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i2))) {
                c2412Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(i2);
            }
        }
        return i != c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7811Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7811Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7811Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
