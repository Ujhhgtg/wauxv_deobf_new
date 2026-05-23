package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 extends AbstractC0064 implements RandomAccess, Serializable {

    public static final C1809 f6043;

    public Object[] f6044;

    public int f6045;

    public boolean f6046;

    static {
        C1809 c1809 = new C1809(0);
        c1809.f6046 = true;
        f6043 = c1809;
    }

    public C1809(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f6044 = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3568();
        int i = this.f6045;
        ((AbstractList) this).modCount++;
        m3569(i, 1);
        this.f6044[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3568();
        int size = collection.size();
        m3566(this.f6045, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3568();
        m3571(0, this.f6045);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f6044;
            int i = this.f6045;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC2207.m4087(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f6045;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return this.f6044[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f6044;
        int i = this.f6045;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f6045; i++) {
            if (AbstractC2207.m4087(this.f6044[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f6045 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f6045 - 1; i >= 0; i--) {
            if (AbstractC2207.m4087(this.f6044[i], obj)) {
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
        m3568();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo945(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m3568();
        return m3572(0, this.f6045, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m3568();
        return m3572(0, this.f6045, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3568();
        int i2 = this.f6045;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        Object[] objArr = this.f6044;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC2665.m4662(i, i2, this.f6045);
        return new C1808(this.f6044, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f6045;
        if (length < i) {
            return Arrays.copyOfRange(this.f6044, 0, i, objArr.getClass());
        }
        AbstractC0270.m1380(this.f6044, objArr, 0, 0, i);
        int i2 = this.f6045;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1574.m3287(this.f6044, 0, this.f6045, this);
    }

    @Override // p000.AbstractC0064
    public final int mo944() {
        return this.f6045;
    }

    @Override // p000.AbstractC0064
    public final Object mo945(int i) {
        m3568();
        int i2 = this.f6045;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return m3570(i);
    }

    public final void m3566(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m3569(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6044[i + i3] = it.next();
        }
    }

    public final void m3567(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m3569(i, 1);
        this.f6044[i] = obj;
    }

    public final void m3568() {
        if (this.f6046) {
            throw new UnsupportedOperationException();
        }
    }

    public final void m3569(int i, int i2) {
        int i3 = this.f6045 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f6044;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? 2147483647 : 2147483639;
            }
            this.f6044 = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f6044;
        AbstractC0270.m1380(objArr2, objArr2, i + i2, i, this.f6045);
        this.f6045 += i2;
    }

    public final Object m3570(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f6044;
        Object obj = objArr[i];
        AbstractC0270.m1380(objArr, objArr, i, i + 1, this.f6045);
        Object[] objArr2 = this.f6044;
        int i2 = this.f6045;
        objArr2[i2 - 1] = null;
        this.f6045 = i2 - 1;
        return obj;
    }

    public final void m3571(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f6044;
        AbstractC0270.m1380(objArr, objArr, i, i + i2, this.f6045);
        Object[] objArr2 = this.f6044;
        int i3 = this.f6045;
        AbstractC1574.m3307(objArr2, i3 - i2, i3);
        this.f6045 -= i2;
    }

    public final int m3572(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f6044[i5]) == z) {
                Object[] objArr = this.f6044;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f6044;
        AbstractC0270.m1380(objArr2, objArr2, i + i4, i2 + i, this.f6045);
        Object[] objArr3 = this.f6044;
        int i7 = this.f6045;
        AbstractC1574.m3307(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6045 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f6045;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return new C1807(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m3568();
        int i2 = this.f6045;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m3566(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3568();
        int i2 = this.f6045;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            m3569(i, 1);
            this.f6044[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f6044;
        int i = this.f6045;
        AbstractC0968.m2470(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }
}
