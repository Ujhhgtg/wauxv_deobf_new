package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ能不能要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0094Ujhhgtgfeyxiexzf extends AbstractC2935Ujhhgtgfeyxiexzf implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0094Ujhhgtgfeyxiexzf f1200Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object[] f1201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f1203Ujhhgtgfeyxiexzf;

    static {
        C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = new C0094Ujhhgtgfeyxiexzf(0);
        c0094Ujhhgtgfeyxiexzf.f1203Ujhhgtgfeyxiexzf = true;
        f1200Ujhhgtgfeyxiexzf = c0094Ujhhgtgfeyxiexzf;
    }

    public C0094Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f1201Ujhhgtgfeyxiexzf = new Object[i];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f1203Ujhhgtgfeyxiexzf) {
            return new C1101feyxiexzfUjhhgtg(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1146Ujhhgtgfeyxiexzf();
        int i = this.f1202Ujhhgtgfeyxiexzf;
        ((AbstractList) this).modCount++;
        m1147Ujhhgtgfeyxiexzf(i, 1);
        this.f1201Ujhhgtgfeyxiexzf[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1146Ujhhgtgfeyxiexzf();
        int size = collection.size();
        m1144Ujhhgtgfeyxiexzf(this.f1202Ujhhgtgfeyxiexzf, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m1146Ujhhgtgfeyxiexzf();
        m1149Ujhhgtgfeyxiexzf(0, this.f1202Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
            int i = this.f1202Ujhhgtgfeyxiexzf;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return this.f1201Ujhhgtgfeyxiexzf[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
        int i = this.f1202Ujhhgtgfeyxiexzf;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f1202Ujhhgtgfeyxiexzf; i++) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1201Ujhhgtgfeyxiexzf[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1202Ujhhgtgfeyxiexzf == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f1202Ujhhgtgfeyxiexzf - 1; i >= 0; i--) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1201Ujhhgtgfeyxiexzf[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m1146Ujhhgtgfeyxiexzf();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1143Ujhhgtgfeyxiexzf(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m1146Ujhhgtgfeyxiexzf();
        return m1150Ujhhgtgfeyxiexzf(0, this.f1202Ujhhgtgfeyxiexzf, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m1146Ujhhgtgfeyxiexzf();
        return m1150Ujhhgtgfeyxiexzf(0, this.f1202Ujhhgtgfeyxiexzf, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1146Ujhhgtgfeyxiexzf();
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3516feyxiexzfUjhhgtg.m5053Ujhhgtgfeyxiexzf(i, i2, this.f1202Ujhhgtgfeyxiexzf);
        return new C0111Ujhhgtgfeyxiexzf(this.f1201Ujhhgtgfeyxiexzf, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f1202Ujhhgtgfeyxiexzf;
        if (length < i) {
            return Arrays.copyOfRange(this.f1201Ujhhgtgfeyxiexzf, 0, i, objArr.getClass());
        }
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(this.f1201Ujhhgtgfeyxiexzf, objArr, 0, 0, i);
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1243feyxiexzfUjhhgtg.m2728Ujhhgtgfeyxiexzf(this.f1201Ujhhgtgfeyxiexzf, 0, this.f1202Ujhhgtgfeyxiexzf, this);
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int mo1142Ujhhgtgfeyxiexzf() {
        return this.f1202Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object mo1143Ujhhgtgfeyxiexzf(int i) {
        m1146Ujhhgtgfeyxiexzf();
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return m1148Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1144Ujhhgtgfeyxiexzf(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m1147Ujhhgtgfeyxiexzf(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1201Ujhhgtgfeyxiexzf[i + i3] = it.next();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1145Ujhhgtgfeyxiexzf(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m1147Ujhhgtgfeyxiexzf(i, 1);
        this.f1201Ujhhgtgfeyxiexzf[i] = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1146Ujhhgtgfeyxiexzf() {
        if (this.f1203Ujhhgtgfeyxiexzf) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1147Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3 = this.f1202Ujhhgtgfeyxiexzf + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f1201Ujhhgtgfeyxiexzf = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f1201Ujhhgtgfeyxiexzf;
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i + i2, i, this.f1202Ujhhgtgfeyxiexzf);
        this.f1202Ujhhgtgfeyxiexzf += i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Object m1148Ujhhgtgfeyxiexzf(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
        Object obj = objArr[i];
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i, i + 1, this.f1202Ujhhgtgfeyxiexzf);
        Object[] objArr2 = this.f1201Ujhhgtgfeyxiexzf;
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        objArr2[i2 - 1] = null;
        this.f1202Ujhhgtgfeyxiexzf = i2 - 1;
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1149Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i, i + i2, this.f1202Ujhhgtgfeyxiexzf);
        Object[] objArr2 = this.f1201Ujhhgtgfeyxiexzf;
        int i3 = this.f1202Ujhhgtgfeyxiexzf;
        AbstractC1243feyxiexzfUjhhgtg.m2742Ujhhgtgfeyxiexzf(objArr2, i3 - i2, i3);
        this.f1202Ujhhgtgfeyxiexzf -= i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m1150Ujhhgtgfeyxiexzf(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f1201Ujhhgtgfeyxiexzf[i5]) == z) {
                Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f1201Ujhhgtgfeyxiexzf;
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i + i4, i2 + i, this.f1202Ujhhgtgfeyxiexzf);
        Object[] objArr3 = this.f1201Ujhhgtgfeyxiexzf;
        int i7 = this.f1202Ujhhgtgfeyxiexzf;
        AbstractC1243feyxiexzfUjhhgtg.m2742Ujhhgtgfeyxiexzf(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1202Ujhhgtgfeyxiexzf -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return new C0112Ujhhgtgfeyxiexzf(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m1146Ujhhgtgfeyxiexzf();
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m1144Ujhhgtgfeyxiexzf(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m1146Ujhhgtgfeyxiexzf();
        int i2 = this.f1202Ujhhgtgfeyxiexzf;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            m1147Ujhhgtgfeyxiexzf(i, 1);
            this.f1201Ujhhgtgfeyxiexzf[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f1201Ujhhgtgfeyxiexzf;
        int i = this.f1202Ujhhgtgfeyxiexzf;
        AbstractC1245feyxiexzfUjhhgtg.m2748Ujhhgtgfeyxiexzf(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }
}
