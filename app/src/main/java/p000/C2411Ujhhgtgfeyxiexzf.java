package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛳᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2411Ujhhgtgfeyxiexzf implements Collection {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2412Ujhhgtgfeyxiexzf f7816Ujhhgtgfeyxiexzf;

    public C2411Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        this.f7816Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
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
        this.f7816Ujhhgtgfeyxiexzf.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7816Ujhhgtgfeyxiexzf.m2531Ujhhgtgfeyxiexzf(obj) >= 0;
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
        return this.f7816Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2408Ujhhgtgfeyxiexzf(this.f7816Ujhhgtgfeyxiexzf, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7816Ujhhgtgfeyxiexzf;
        int iM2531Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf.m2531Ujhhgtgfeyxiexzf(obj);
        if (iM2531Ujhhgtgfeyxiexzf < 0) {
            return false;
        }
        c2412Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(iM2531Ujhhgtgfeyxiexzf);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7816Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i2))) {
                c2412Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(i2);
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
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7816Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i2))) {
                c2412Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(i2);
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
        return this.f7816Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7816Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7816Ujhhgtgfeyxiexzf;
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
