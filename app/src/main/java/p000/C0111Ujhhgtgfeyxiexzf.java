package p000;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ要点脸ᛳᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0111Ujhhgtgfeyxiexzf extends AbstractC2935Ujhhgtgfeyxiexzf implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object[] f1236Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f1237Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1238Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0111Ujhhgtgfeyxiexzf f1239Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0094Ujhhgtgfeyxiexzf f1240Ujhhgtgfeyxiexzf;

    public C0111Ujhhgtgfeyxiexzf(Object[] objArr, int i, int i2, C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf, C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf) {
        this.f1236Ujhhgtgfeyxiexzf = objArr;
        this.f1237Ujhhgtgfeyxiexzf = i;
        this.f1238Ujhhgtgfeyxiexzf = i2;
        this.f1239Ujhhgtgfeyxiexzf = c0111Ujhhgtgfeyxiexzf;
        this.f1240Ujhhgtgfeyxiexzf = c0094Ujhhgtgfeyxiexzf;
        ((AbstractList) this).modCount = ((AbstractList) c0094Ujhhgtgfeyxiexzf).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f1240Ujhhgtgfeyxiexzf.f1203Ujhhgtgfeyxiexzf) {
            return new C1101feyxiexzfUjhhgtg(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        m1160Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf + this.f1238Ujhhgtgfeyxiexzf, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        int size = collection.size();
        m1159Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf + this.f1238Ujhhgtgfeyxiexzf, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        m1164Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf, this.f1238Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m1161Ujhhgtgfeyxiexzf();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1236Ujhhgtgfeyxiexzf;
            int i = this.f1238Ujhhgtgfeyxiexzf;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(objArr[this.f1237Ujhhgtgfeyxiexzf + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m1161Ujhhgtgfeyxiexzf();
        int i2 = this.f1238Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return this.f1236Ujhhgtgfeyxiexzf[this.f1237Ujhhgtgfeyxiexzf + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m1161Ujhhgtgfeyxiexzf();
        Object[] objArr = this.f1236Ujhhgtgfeyxiexzf;
        int i = this.f1238Ujhhgtgfeyxiexzf;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f1237Ujhhgtgfeyxiexzf + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m1161Ujhhgtgfeyxiexzf();
        for (int i = 0; i < this.f1238Ujhhgtgfeyxiexzf; i++) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1236Ujhhgtgfeyxiexzf[this.f1237Ujhhgtgfeyxiexzf + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m1161Ujhhgtgfeyxiexzf();
        return this.f1238Ujhhgtgfeyxiexzf == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m1161Ujhhgtgfeyxiexzf();
        for (int i = this.f1238Ujhhgtgfeyxiexzf - 1; i >= 0; i--) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1236Ujhhgtgfeyxiexzf[this.f1237Ujhhgtgfeyxiexzf + i], obj)) {
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
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1143Ujhhgtgfeyxiexzf(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        return m1165Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf, this.f1238Ujhhgtgfeyxiexzf, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        return m1165Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf, this.f1238Ujhhgtgfeyxiexzf, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        int i2 = this.f1238Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        Object[] objArr = this.f1236Ujhhgtgfeyxiexzf;
        int i3 = this.f1237Ujhhgtgfeyxiexzf;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3516feyxiexzfUjhhgtg.m5053Ujhhgtgfeyxiexzf(i, i2, this.f1238Ujhhgtgfeyxiexzf);
        return new C0111Ujhhgtgfeyxiexzf(this.f1236Ujhhgtgfeyxiexzf, this.f1237Ujhhgtgfeyxiexzf + i, i2 - i, this, this.f1240Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m1161Ujhhgtgfeyxiexzf();
        int length = objArr.length;
        int i = this.f1238Ujhhgtgfeyxiexzf;
        int i2 = this.f1237Ujhhgtgfeyxiexzf;
        if (length < i) {
            return Arrays.copyOfRange(this.f1236Ujhhgtgfeyxiexzf, i2, i + i2, objArr.getClass());
        }
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(this.f1236Ujhhgtgfeyxiexzf, objArr, 0, i2, i + i2);
        int i3 = this.f1238Ujhhgtgfeyxiexzf;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m1161Ujhhgtgfeyxiexzf();
        return AbstractC1243feyxiexzfUjhhgtg.m2728Ujhhgtgfeyxiexzf(this.f1236Ujhhgtgfeyxiexzf, this.f1237Ujhhgtgfeyxiexzf, this.f1238Ujhhgtgfeyxiexzf, this);
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1142Ujhhgtgfeyxiexzf() {
        m1161Ujhhgtgfeyxiexzf();
        return this.f1238Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1143Ujhhgtgfeyxiexzf(int i) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        int i2 = this.f1238Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return m1163Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf + i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1159Ujhhgtgfeyxiexzf(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = this.f1240Ujhhgtgfeyxiexzf;
        C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = this.f1239Ujhhgtgfeyxiexzf;
        if (c0111Ujhhgtgfeyxiexzf != null) {
            c0111Ujhhgtgfeyxiexzf.m1159Ujhhgtgfeyxiexzf(i, collection, i2);
        } else {
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf2 = C0094Ujhhgtgfeyxiexzf.f1200Ujhhgtgfeyxiexzf;
            c0094Ujhhgtgfeyxiexzf.m1144Ujhhgtgfeyxiexzf(i, collection, i2);
        }
        this.f1236Ujhhgtgfeyxiexzf = c0094Ujhhgtgfeyxiexzf.f1201Ujhhgtgfeyxiexzf;
        this.f1238Ujhhgtgfeyxiexzf += i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1160Ujhhgtgfeyxiexzf(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = this.f1240Ujhhgtgfeyxiexzf;
        C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = this.f1239Ujhhgtgfeyxiexzf;
        if (c0111Ujhhgtgfeyxiexzf != null) {
            c0111Ujhhgtgfeyxiexzf.m1160Ujhhgtgfeyxiexzf(i, obj);
        } else {
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf2 = C0094Ujhhgtgfeyxiexzf.f1200Ujhhgtgfeyxiexzf;
            c0094Ujhhgtgfeyxiexzf.m1145Ujhhgtgfeyxiexzf(i, obj);
        }
        this.f1236Ujhhgtgfeyxiexzf = c0094Ujhhgtgfeyxiexzf.f1201Ujhhgtgfeyxiexzf;
        this.f1238Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1161Ujhhgtgfeyxiexzf() {
        if (((AbstractList) this.f1240Ujhhgtgfeyxiexzf).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1162Ujhhgtgfeyxiexzf() {
        if (this.f1240Ujhhgtgfeyxiexzf.f1203Ujhhgtgfeyxiexzf) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Object m1163Ujhhgtgfeyxiexzf(int i) {
        Object objM1148Ujhhgtgfeyxiexzf;
        ((AbstractList) this).modCount++;
        C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = this.f1239Ujhhgtgfeyxiexzf;
        if (c0111Ujhhgtgfeyxiexzf != null) {
            objM1148Ujhhgtgfeyxiexzf = c0111Ujhhgtgfeyxiexzf.m1163Ujhhgtgfeyxiexzf(i);
        } else {
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = C0094Ujhhgtgfeyxiexzf.f1200Ujhhgtgfeyxiexzf;
            objM1148Ujhhgtgfeyxiexzf = this.f1240Ujhhgtgfeyxiexzf.m1148Ujhhgtgfeyxiexzf(i);
        }
        this.f1238Ujhhgtgfeyxiexzf--;
        return objM1148Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1164Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = this.f1239Ujhhgtgfeyxiexzf;
        if (c0111Ujhhgtgfeyxiexzf != null) {
            c0111Ujhhgtgfeyxiexzf.m1164Ujhhgtgfeyxiexzf(i, i2);
        } else {
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = C0094Ujhhgtgfeyxiexzf.f1200Ujhhgtgfeyxiexzf;
            this.f1240Ujhhgtgfeyxiexzf.m1149Ujhhgtgfeyxiexzf(i, i2);
        }
        this.f1238Ujhhgtgfeyxiexzf -= i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m1165Ujhhgtgfeyxiexzf(int i, int i2, Collection collection, boolean z) {
        int iM1150Ujhhgtgfeyxiexzf;
        C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = this.f1239Ujhhgtgfeyxiexzf;
        if (c0111Ujhhgtgfeyxiexzf != null) {
            iM1150Ujhhgtgfeyxiexzf = c0111Ujhhgtgfeyxiexzf.m1165Ujhhgtgfeyxiexzf(i, i2, collection, z);
        } else {
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = C0094Ujhhgtgfeyxiexzf.f1200Ujhhgtgfeyxiexzf;
            iM1150Ujhhgtgfeyxiexzf = this.f1240Ujhhgtgfeyxiexzf.m1150Ujhhgtgfeyxiexzf(i, i2, collection, z);
        }
        if (iM1150Ujhhgtgfeyxiexzf > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1238Ujhhgtgfeyxiexzf -= iM1150Ujhhgtgfeyxiexzf;
        return iM1150Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m1161Ujhhgtgfeyxiexzf();
        int i2 = this.f1238Ujhhgtgfeyxiexzf;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return new C0112Ujhhgtgfeyxiexzf(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        int i2 = this.f1238Ujhhgtgfeyxiexzf;
        if (i >= 0 && i <= i2) {
            m1160Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m1162Ujhhgtgfeyxiexzf();
        m1161Ujhhgtgfeyxiexzf();
        int i2 = this.f1238Ujhhgtgfeyxiexzf;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m1159Ujhhgtgfeyxiexzf(this.f1237Ujhhgtgfeyxiexzf + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m1161Ujhhgtgfeyxiexzf();
        Object[] objArr = this.f1236Ujhhgtgfeyxiexzf;
        int i = this.f1238Ujhhgtgfeyxiexzf;
        int i2 = this.f1237Ujhhgtgfeyxiexzf;
        int i3 = i + i2;
        AbstractC1245feyxiexzfUjhhgtg.m2748Ujhhgtgfeyxiexzf(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }
}
