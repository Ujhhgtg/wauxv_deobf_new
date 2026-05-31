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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1835 extends AbstractC0072 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object[] f6113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1835 f6116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1836 f6117;

    public C1835(Object[] objArr, int i, int i2, C1835 c1835, C1836 c1836) {
        this.f6113 = objArr;
        this.f6114 = i;
        this.f6115 = i2;
        this.f6116 = c1835;
        this.f6117 = c1836;
        ((AbstractList) this).modCount = ((AbstractList) c1836).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f6117.f6121) {
            return new C2720(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3739();
        m3738();
        m3737(this.f6114 + this.f6115, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3739();
        m3738();
        int size = collection.size();
        m3736(this.f6114 + this.f6115, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3739();
        m3738();
        m3741(this.f6114, this.f6115);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m3738();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f6113;
            int i = this.f6115;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC1469.m3322(objArr[this.f6114 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3738();
        int i2 = this.f6115;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return this.f6113[this.f6114 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m3738();
        Object[] objArr = this.f6113;
        int i = this.f6115;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f6114 + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m3738();
        for (int i = 0; i < this.f6115; i++) {
            if (AbstractC1469.m3322(this.f6113[this.f6114 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m3738();
        return this.f6115 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m3738();
        for (int i = this.f6115 - 1; i >= 0; i--) {
            if (AbstractC1469.m3322(this.f6113[this.f6114 + i], obj)) {
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
        m3739();
        m3738();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1092(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m3739();
        m3738();
        return m3742(this.f6114, this.f6115, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m3739();
        m3738();
        return m3742(this.f6114, this.f6115, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3739();
        m3738();
        int i2 = this.f6115;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        Object[] objArr = this.f6113;
        int i3 = this.f6114;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1468.m3301(i, i2, this.f6115);
        return new C1835(this.f6113, this.f6114 + i, i2 - i, this, this.f6117);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m3738();
        int length = objArr.length;
        int i = this.f6115;
        int i2 = this.f6114;
        if (length < i) {
            return Arrays.copyOfRange(this.f6113, i2, i + i2, objArr.getClass());
        }
        AbstractC0280.m1526(this.f6113, objArr, 0, i2, i + i2);
        int i3 = this.f6115;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m3738();
        return AbstractC0738.m2264(this.f6113, this.f6114, this.f6115, this);
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1091() {
        m3738();
        return this.f6115;
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1092(int i) {
        m3739();
        m3738();
        int i2 = this.f6115;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return m3740(this.f6114 + i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3736(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C1836 c1836 = this.f6117;
        C1835 c1835 = this.f6116;
        if (c1835 != null) {
            c1835.m3736(i, collection, i2);
        } else {
            C1836 c1837 = C1836.f6118;
            c1836.m3744(i, collection, i2);
        }
        this.f6113 = c1836.f6119;
        this.f6115 += i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3737(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C1836 c1836 = this.f6117;
        C1835 c1835 = this.f6116;
        if (c1835 != null) {
            c1835.m3737(i, obj);
        } else {
            C1836 c1837 = C1836.f6118;
            c1836.m3745(i, obj);
        }
        this.f6113 = c1836.f6119;
        this.f6115++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3738() {
        if (((AbstractList) this.f6117).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3739() {
        if (this.f6117.f6121) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m3740(int i) {
        Object objM3748;
        ((AbstractList) this).modCount++;
        C1835 c1835 = this.f6116;
        if (c1835 != null) {
            objM3748 = c1835.m3740(i);
        } else {
            C1836 c1836 = C1836.f6118;
            objM3748 = this.f6117.m3748(i);
        }
        this.f6115--;
        return objM3748;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3741(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C1835 c1835 = this.f6116;
        if (c1835 != null) {
            c1835.m3741(i, i2);
        } else {
            C1836 c1836 = C1836.f6118;
            this.f6117.m3749(i, i2);
        }
        this.f6115 -= i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m3742(int i, int i2, Collection collection, boolean z) {
        int iM3750;
        C1835 c1835 = this.f6116;
        if (c1835 != null) {
            iM3750 = c1835.m3742(i, i2, collection, z);
        } else {
            C1836 c1836 = C1836.f6118;
            iM3750 = this.f6117.m3750(i, i2, collection, z);
        }
        if (iM3750 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6115 -= iM3750;
        return iM3750;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m3738();
        int i2 = this.f6115;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return new C1834(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3739();
        m3738();
        int i2 = this.f6115;
        if (i >= 0 && i <= i2) {
            m3737(this.f6114 + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m3739();
        m3738();
        int i2 = this.f6115;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m3736(this.f6114 + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m3738();
        Object[] objArr = this.f6113;
        int i = this.f6115;
        int i2 = this.f6114;
        int i3 = i + i2;
        AbstractC3528.m5092(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }
}
