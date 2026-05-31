package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲈᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0266 extends AbstractC0072 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Object[] f1504 = new Object[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object[] f1506 = f1504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f1507;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f1507;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m1500();
        m1495(this.f1507 + 1);
        int iM1499 = m1499(this.f1505 + i);
        int i3 = this.f1507;
        if (i < ((i3 + 1) >> 1)) {
            int length = iM1499 == 0 ? this.f1506.length - 1 : iM1499 - 1;
            int i4 = this.f1505;
            int length2 = i4 == 0 ? this.f1506.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.f1506;
                objArr[length2] = objArr[i4];
                AbstractC0280.m1526(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                Object[] objArr2 = this.f1506;
                AbstractC0280.m1526(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f1506;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0280.m1526(objArr3, objArr3, 0, 1, length + 1);
            }
            this.f1506[length] = obj;
            this.f1505 = length2;
        } else {
            int iM14910 = m1499(i3 + this.f1505);
            if (iM1499 < iM14910) {
                Object[] objArr4 = this.f1506;
                AbstractC0280.m1526(objArr4, objArr4, iM1499 + 1, iM1499, iM14910);
            } else {
                Object[] objArr5 = this.f1506;
                AbstractC0280.m1526(objArr5, objArr5, 1, 0, iM14910);
                Object[] objArr6 = this.f1506;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0280.m1526(objArr6, objArr6, iM1499 + 1, iM1499, objArr6.length - 1);
            }
            this.f1506[iM1499] = obj;
        }
        this.f1507++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f1507;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f1507) {
            return addAll(collection);
        }
        m1500();
        m1495(collection.size() + this.f1507);
        int iM1499 = m1499(this.f1507 + this.f1505);
        int iM14910 = m1499(this.f1505 + i);
        int size = collection.size();
        if (i >= ((this.f1507 + 1) >> 1)) {
            int i3 = iM14910 + size;
            if (iM14910 < iM1499) {
                int i4 = size + iM1499;
                Object[] objArr = this.f1506;
                if (i4 <= objArr.length) {
                    AbstractC0280.m1526(objArr, objArr, i3, iM14910, iM1499);
                } else if (i3 >= objArr.length) {
                    AbstractC0280.m1526(objArr, objArr, i3 - objArr.length, iM14910, iM1499);
                } else {
                    int length = iM1499 - (i4 - objArr.length);
                    AbstractC0280.m1526(objArr, objArr, 0, length, iM1499);
                    Object[] objArr2 = this.f1506;
                    AbstractC0280.m1526(objArr2, objArr2, i3, iM14910, length);
                }
            } else {
                Object[] objArr3 = this.f1506;
                AbstractC0280.m1526(objArr3, objArr3, size, 0, iM1499);
                Object[] objArr4 = this.f1506;
                if (i3 >= objArr4.length) {
                    AbstractC0280.m1526(objArr4, objArr4, i3 - objArr4.length, iM14910, objArr4.length);
                } else {
                    AbstractC0280.m1526(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f1506;
                    AbstractC0280.m1526(objArr5, objArr5, i3, iM14910, objArr5.length - size);
                }
            }
            m1494(iM14910, collection);
            return true;
        }
        int i5 = this.f1505;
        int length2 = i5 - size;
        if (iM14910 < i5) {
            Object[] objArr6 = this.f1506;
            AbstractC0280.m1526(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM14910) {
                Object[] objArr7 = this.f1506;
                AbstractC0280.m1526(objArr7, objArr7, objArr7.length - size, 0, iM14910);
            } else {
                Object[] objArr8 = this.f1506;
                AbstractC0280.m1526(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f1506;
                AbstractC0280.m1526(objArr9, objArr9, 0, size, iM14910);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f1506;
            AbstractC0280.m1526(objArr10, objArr10, length2, i5, iM14910);
        } else {
            Object[] objArr11 = this.f1506;
            length2 += objArr11.length;
            int i6 = iM14910 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                AbstractC0280.m1526(objArr11, objArr11, length2, i5, iM14910);
            } else {
                AbstractC0280.m1526(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f1506;
                AbstractC0280.m1526(objArr12, objArr12, 0, this.f1505 + length3, iM14910);
            }
        }
        this.f1505 = length2;
        m1494(m1497(iM14910 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m1500();
        m1495(this.f1507 + 1);
        int length = this.f1505;
        if (length == 0) {
            length = this.f1506.length;
        }
        int i = length - 1;
        this.f1505 = i;
        this.f1506[i] = obj;
        this.f1507++;
    }

    public final void addLast(Object obj) {
        m1500();
        m1495(mo1091() + 1);
        this.f1506[m1499(mo1091() + this.f1505)] = obj;
        this.f1507 = mo1091() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m1500();
            m1498(this.f1505, m1499(mo1091() + this.f1505));
        }
        this.f1505 = 0;
        this.f1507 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo1091 = mo1091();
        if (i < 0 || i >= iMo1091) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", iMo1091));
        }
        return this.f1506[m1499(this.f1505 + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM1499 = m1499(mo1091() + this.f1505);
        int length = this.f1505;
        if (length < iM1499) {
            while (length < iM1499) {
                if (AbstractC1469.m3322(obj, this.f1506[length])) {
                    i = this.f1505;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f1505) < iM1499) {
            return -1;
        }
        int length2 = this.f1506.length;
        while (length < length2) {
            if (AbstractC1469.m3322(obj, this.f1506[length])) {
                i = this.f1505;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM1499; i2++) {
            if (AbstractC1469.m3322(obj, this.f1506[i2])) {
                length = i2 + this.f1506.length;
                i = this.f1505;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo1091() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM1499 = m1499(mo1091() + this.f1505);
        int i2 = this.f1505;
        if (i2 < iM1499) {
            length = iM1499 - 1;
            if (i2 <= length) {
                while (!AbstractC1469.m3322(obj, this.f1506[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1505;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f1505 >= iM1499) {
            for (int i3 = iM1499 - 1; -1 < i3; i3--) {
                if (AbstractC1469.m3322(obj, this.f1506[i3])) {
                    length = i3 + this.f1506.length;
                    i = this.f1505;
                    return length - i;
                }
            }
            length = this.f1506.length - 1;
            int i4 = this.f1505;
            if (i4 <= length) {
                while (!AbstractC1469.m3322(obj, this.f1506[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f1505;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo1092(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1499;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1506.length != 0) {
            int iM14910 = m1499(mo1091() + this.f1505);
            int i = this.f1505;
            if (i < iM14910) {
                iM1499 = i;
                while (i < iM14910) {
                    Object obj = this.f1506[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f1506[iM1499] = obj;
                        iM1499++;
                    }
                    i++;
                }
                Arrays.fill(this.f1506, iM1499, iM14910, (Object) null);
            } else {
                int length = this.f1506.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1506;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f1506[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM1499 = m1499(i2);
                for (int i3 = 0; i3 < iM14910; i3++) {
                    Object[] objArr2 = this.f1506;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f1506[iM1499] = obj3;
                        iM1499 = m1496(iM1499);
                    }
                }
                z = z2;
            }
            if (z) {
                m1500();
                this.f1507 = m1497(iM1499 - this.f1505);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1500();
        Object[] objArr = this.f1506;
        int i = this.f1505;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1505 = m1496(i);
        this.f1507 = mo1091() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1500();
        int iM1499 = m1499(AbstractC0740.m2310(this) + this.f1505);
        Object[] objArr = this.f1506;
        Object obj = objArr[iM1499];
        objArr[iM1499] = null;
        this.f1507 = mo1091() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC1468.m3301(i, i2, this.f1507);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f1507) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo1092(i);
            return;
        }
        m1500();
        if (i < this.f1507 - i2) {
            int iM1499 = m1499(this.f1505 + (i - 1));
            int iM14910 = m1499(this.f1505 + (i2 - 1));
            while (i > 0) {
                int i4 = iM1499 + 1;
                int iMin = Math.min(i, Math.min(i4, iM14910 + 1));
                Object[] objArr = this.f1506;
                int i5 = iM14910 - iMin;
                int i6 = iM1499 - iMin;
                AbstractC0280.m1526(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM1499 = m1497(i6);
                iM14910 = m1497(i5);
                i -= iMin;
            }
            int iM14911 = m1499(this.f1505 + i3);
            m1498(this.f1505, iM14911);
            this.f1505 = iM14911;
        } else {
            int iM14912 = m1499(this.f1505 + i2);
            int iM14913 = m1499(this.f1505 + i);
            int i7 = this.f1507;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1506;
                i2 = Math.min(i7, Math.min(objArr2.length - iM14912, objArr2.length - iM14913));
                Object[] objArr3 = this.f1506;
                int i8 = iM14912 + i2;
                AbstractC0280.m1526(objArr3, objArr3, iM14913, iM14912, i8);
                iM14912 = m1499(i8);
                iM14913 = m1499(iM14913 + i2);
            }
            int iM14914 = m1499(this.f1507 + this.f1505);
            m1498(m1497(iM14914 - i3), iM14914);
        }
        this.f1507 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1499;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1506.length != 0) {
            int iM14910 = m1499(mo1091() + this.f1505);
            int i = this.f1505;
            if (i < iM14910) {
                iM1499 = i;
                while (i < iM14910) {
                    Object obj = this.f1506[i];
                    if (collection.contains(obj)) {
                        this.f1506[iM1499] = obj;
                        iM1499++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.f1506, iM1499, iM14910, (Object) null);
            } else {
                int length = this.f1506.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1506;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1506[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM1499 = m1499(i2);
                for (int i3 = 0; i3 < iM14910; i3++) {
                    Object[] objArr2 = this.f1506;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1506[iM1499] = obj3;
                        iM1499 = m1496(iM1499);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m1500();
                this.f1507 = m1497(iM1499 - this.f1505);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo1091 = mo1091();
        if (i < 0 || i >= iMo1091) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", iMo1091));
        }
        int iM1499 = m1499(this.f1505 + i);
        Object[] objArr = this.f1506;
        Object obj2 = objArr[iM1499];
        objArr[iM1499] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1091()]);
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1091() {
        return this.f1507;
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1092(int i) {
        int i2 = this.f1507;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        if (i == AbstractC0740.m2310(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m1500();
        int iM1499 = m1499(this.f1505 + i);
        Object[] objArr = this.f1506;
        Object obj = objArr[iM1499];
        if (i < (this.f1507 >> 1)) {
            int i3 = this.f1505;
            if (iM1499 >= i3) {
                AbstractC0280.m1526(objArr, objArr, i3 + 1, i3, iM1499);
            } else {
                AbstractC0280.m1526(objArr, objArr, 1, 0, iM1499);
                Object[] objArr2 = this.f1506;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f1505;
                AbstractC0280.m1526(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1506;
            int i5 = this.f1505;
            objArr3[i5] = null;
            this.f1505 = m1496(i5);
        } else {
            int iM14910 = m1499(AbstractC0740.m2310(this) + this.f1505);
            if (iM1499 <= iM14910) {
                Object[] objArr4 = this.f1506;
                AbstractC0280.m1526(objArr4, objArr4, iM1499, iM1499 + 1, iM14910 + 1);
            } else {
                Object[] objArr5 = this.f1506;
                AbstractC0280.m1526(objArr5, objArr5, iM1499, iM1499 + 1, objArr5.length);
                Object[] objArr6 = this.f1506;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0280.m1526(objArr6, objArr6, 0, 1, iM14910 + 1);
            }
            this.f1506[iM14910] = null;
        }
        this.f1507--;
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1494(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1506.length;
        while (i < length && it.hasNext()) {
            this.f1506[i] = it.next();
            i++;
        }
        int i2 = this.f1505;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f1506[i3] = it.next();
        }
        this.f1507 = collection.size() + this.f1507;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m1495(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1506;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f1504) {
            if (i < 10) {
                i = 10;
            }
            this.f1506 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0280.m1526(objArr, objArr2, 0, this.f1505, objArr.length);
        Object[] objArr3 = this.f1506;
        int length2 = objArr3.length;
        int i3 = this.f1505;
        AbstractC0280.m1526(objArr3, objArr2, length2 - i3, 0, i3);
        this.f1505 = 0;
        this.f1506 = objArr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m1496(int i) {
        if (i == this.f1506.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m1497(int i) {
        return i < 0 ? i + this.f1506.length : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1498(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.f1506, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.f1506;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.f1506, 0, i2, (Object) null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m1499(int i) {
        Object[] objArr = this.f1506;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1500() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f1507;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM1499 = m1499(this.f1507 + this.f1505);
        int i2 = this.f1505;
        if (i2 < iM1499) {
            AbstractC0280.m1529(this.f1506, objArr, i2, iM1499, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1506;
            AbstractC0280.m1526(objArr2, objArr, 0, this.f1505, objArr2.length);
            Object[] objArr3 = this.f1506;
            AbstractC0280.m1526(objArr3, objArr, objArr3.length - this.f1505, 0, iM1499);
        }
        int i3 = this.f1507;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m1500();
        m1495(collection.size() + mo1091());
        m1494(m1499(mo1091() + this.f1505), collection);
        return true;
    }
}
