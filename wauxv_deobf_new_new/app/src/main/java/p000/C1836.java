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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᤝᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1836 extends AbstractC0072 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1836 f6118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object[] f6119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f6121;

    static {
        C1836 c1836 = new C1836(0);
        c1836.f6121 = true;
        f6118 = c1836;
    }

    public C1836(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f6119 = new Object[i];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f6121) {
            return new C2720(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3746();
        int i = this.f6120;
        ((AbstractList) this).modCount++;
        m3747(i, 1);
        this.f6119[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3746();
        int size = collection.size();
        m3744(this.f6120, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3746();
        m3749(0, this.f6120);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f6119;
            int i = this.f6120;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC1469.m3322(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f6120;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return this.f6119[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f6119;
        int i = this.f6120;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f6120; i++) {
            if (AbstractC1469.m3322(this.f6119[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f6120 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f6120 - 1; i >= 0; i--) {
            if (AbstractC1469.m3322(this.f6119[i], obj)) {
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
        m3746();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1092(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m3746();
        return m3750(0, this.f6120, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m3746();
        return m3750(0, this.f6120, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3746();
        int i2 = this.f6120;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        Object[] objArr = this.f6119;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1468.m3301(i, i2, this.f6120);
        return new C1835(this.f6119, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f6120;
        if (length < i) {
            return Arrays.copyOfRange(this.f6119, 0, i, objArr.getClass());
        }
        AbstractC0280.m1526(this.f6119, objArr, 0, 0, i);
        int i2 = this.f6120;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0738.m2264(this.f6119, 0, this.f6120, this);
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1091() {
        return this.f6120;
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1092(int i) {
        m3746();
        int i2 = this.f6120;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return m3748(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3744(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m3747(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6119[i + i3] = it.next();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3745(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m3747(i, 1);
        this.f6119[i] = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3746() {
        if (this.f6121) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3747(int i, int i2) {
        int i3 = this.f6120 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f6119;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f6119 = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f6119;
        AbstractC0280.m1526(objArr2, objArr2, i + i2, i, this.f6120);
        this.f6120 += i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m3748(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f6119;
        Object obj = objArr[i];
        AbstractC0280.m1526(objArr, objArr, i, i + 1, this.f6120);
        Object[] objArr2 = this.f6119;
        int i2 = this.f6120;
        objArr2[i2 - 1] = null;
        this.f6120 = i2 - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3749(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f6119;
        AbstractC0280.m1526(objArr, objArr, i, i + i2, this.f6120);
        Object[] objArr2 = this.f6119;
        int i3 = this.f6120;
        AbstractC0738.m2279(objArr2, i3 - i2, i3);
        this.f6120 -= i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m3750(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f6119[i5]) == z) {
                Object[] objArr = this.f6119;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f6119;
        AbstractC0280.m1526(objArr2, objArr2, i + i4, i2 + i, this.f6120);
        Object[] objArr3 = this.f6119;
        int i7 = this.f6120;
        AbstractC0738.m2279(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6120 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f6120;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return new C1834(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m3746();
        int i2 = this.f6120;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m3744(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3746();
        int i2 = this.f6120;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            m3747(i, 1);
            this.f6119[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f6119;
        int i = this.f6120;
        AbstractC3528.m5092(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }
}
