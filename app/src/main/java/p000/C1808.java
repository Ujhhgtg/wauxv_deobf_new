package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1808 extends AbstractC0064 implements RandomAccess, Serializable {

    public Object[] f6038;

    public final int f6039;

    public int f6040;

    public final C1808 f6041;

    public final C1809 f6042;

    public C1808(Object[] objArr, int i, int i2, C1808 c1808, C1809 c1809) {
        this.f6038 = objArr;
        this.f6039 = i;
        this.f6040 = i2;
        this.f6041 = c1808;
        this.f6042 = c1809;
        ((AbstractList) this).modCount = ((AbstractList) c1809).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3561();
        m3560();
        m3559(this.f6039 + this.f6040, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3561();
        m3560();
        int size = collection.size();
        m3558(this.f6039 + this.f6040, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3561();
        m3560();
        m3563(this.f6039, this.f6040);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m3560();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f6038;
            int i = this.f6040;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC2207.m4087(objArr[this.f6039 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3560();
        int i2 = this.f6040;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return this.f6038[this.f6039 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m3560();
        Object[] objArr = this.f6038;
        int i = this.f6040;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f6039 + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m3560();
        for (int i = 0; i < this.f6040; i++) {
            if (AbstractC2207.m4087(this.f6038[this.f6039 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m3560();
        return this.f6040 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m3560();
        for (int i = this.f6040 - 1; i >= 0; i--) {
            if (AbstractC2207.m4087(this.f6038[this.f6039 + i], obj)) {
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
        m3561();
        m3560();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo945(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m3561();
        m3560();
        return m3564(this.f6039, this.f6040, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m3561();
        m3560();
        return m3564(this.f6039, this.f6040, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3561();
        m3560();
        int i2 = this.f6040;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        Object[] objArr = this.f6038;
        int i3 = this.f6039;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC2665.m4662(i, i2, this.f6040);
        return new C1808(this.f6038, this.f6039 + i, i2 - i, this, this.f6042);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m3560();
        int length = objArr.length;
        int i = this.f6040;
        int i2 = this.f6039;
        if (length < i) {
            return Arrays.copyOfRange(this.f6038, i2, i + i2, objArr.getClass());
        }
        AbstractC0270.m1380(this.f6038, objArr, 0, i2, i + i2);
        int i3 = this.f6040;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m3560();
        return AbstractC1574.m3287(this.f6038, this.f6039, this.f6040, this);
    }

    @Override // p000.AbstractC0064
    public final int mo944() {
        m3560();
        return this.f6040;
    }

    @Override // p000.AbstractC0064
    public final Object mo945(int i) {
        m3561();
        m3560();
        int i2 = this.f6040;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return m3562(this.f6039 + i);
    }

    public final void m3558(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C1809 c1809 = this.f6042;
        C1808 c1808 = this.f6041;
        if (c1808 != null) {
            c1808.m3558(i, collection, i2);
        } else {
            C1809 c18010 = C1809.f6043;
            c1809.m3566(i, collection, i2);
        }
        this.f6038 = c1809.f6044;
        this.f6040 += i2;
    }

    public final void m3559(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C1809 c1809 = this.f6042;
        C1808 c1808 = this.f6041;
        if (c1808 != null) {
            c1808.m3559(i, obj);
        } else {
            C1809 c18010 = C1809.f6043;
            c1809.m3567(i, obj);
        }
        this.f6038 = c1809.f6044;
        this.f6040++;
    }

    public final void m3560() {
        if (((AbstractList) this.f6042).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void m3561() {
        if (this.f6042.f6046) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object m3562(int i) {
        Object objM3570;
        ((AbstractList) this).modCount++;
        C1808 c1808 = this.f6041;
        if (c1808 != null) {
            objM3570 = c1808.m3562(i);
        } else {
            C1809 c1809 = C1809.f6043;
            objM3570 = this.f6042.m3570(i);
        }
        this.f6040--;
        return objM3570;
    }

    public final void m3563(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C1808 c1808 = this.f6041;
        if (c1808 != null) {
            c1808.m3563(i, i2);
        } else {
            C1809 c1809 = C1809.f6043;
            this.f6042.m3571(i, i2);
        }
        this.f6040 -= i2;
    }

    public final int m3564(int i, int i2, Collection collection, boolean z) {
        int iM3572;
        C1808 c1808 = this.f6041;
        if (c1808 != null) {
            iM3572 = c1808.m3564(i, i2, collection, z);
        } else {
            C1809 c1809 = C1809.f6043;
            iM3572 = this.f6042.m3572(i, i2, collection, z);
        }
        if (iM3572 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6040 -= iM3572;
        return iM3572;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m3560();
        int i2 = this.f6040;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return new C1807(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3561();
        m3560();
        int i2 = this.f6040;
        if (i >= 0 && i <= i2) {
            m3559(this.f6039 + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m3561();
        m3560();
        int i2 = this.f6040;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m3558(this.f6039 + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m3560();
        Object[] objArr = this.f6038;
        int i = this.f6040;
        int i2 = this.f6039;
        int i3 = i + i2;
        AbstractC0968.m2470(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }
}
