package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0256 extends AbstractC0064 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final Object[] f1430 = new Object[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object[] f1432 = f1430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f1433;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f1433;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m1354();
        m1349(this.f1433 + 1);
        int iM1353 = m1353(this.f1431 + i);
        int i3 = this.f1433;
        if (i < ((i3 + 1) >> 1)) {
            int length = iM1353 == 0 ? this.f1432.length - 1 : iM1353 - 1;
            int i4 = this.f1431;
            int length2 = i4 == 0 ? this.f1432.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.f1432;
                objArr[length2] = objArr[i4];
                AbstractC0270.m1380(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                Object[] objArr2 = this.f1432;
                AbstractC0270.m1380(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f1432;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0270.m1380(objArr3, objArr3, 0, 1, length + 1);
            }
            this.f1432[length] = obj;
            this.f1431 = length2;
        } else {
            int iM1354 = m1353(i3 + this.f1431);
            if (iM1353 < iM1354) {
                Object[] objArr4 = this.f1432;
                AbstractC0270.m1380(objArr4, objArr4, iM1353 + 1, iM1353, iM1354);
            } else {
                Object[] objArr5 = this.f1432;
                AbstractC0270.m1380(objArr5, objArr5, 1, 0, iM1354);
                Object[] objArr6 = this.f1432;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0270.m1380(objArr6, objArr6, iM1353 + 1, iM1353, objArr6.length - 1);
            }
            this.f1432[iM1353] = obj;
        }
        this.f1433++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f1433;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f1433) {
            return addAll(collection);
        }
        m1354();
        m1349(collection.size() + this.f1433);
        int iM1353 = m1353(this.f1433 + this.f1431);
        int iM1354 = m1353(this.f1431 + i);
        int size = collection.size();
        if (i >= ((this.f1433 + 1) >> 1)) {
            int i3 = iM1354 + size;
            if (iM1354 < iM1353) {
                int i4 = size + iM1353;
                Object[] objArr = this.f1432;
                if (i4 <= objArr.length) {
                    AbstractC0270.m1380(objArr, objArr, i3, iM1354, iM1353);
                } else if (i3 >= objArr.length) {
                    AbstractC0270.m1380(objArr, objArr, i3 - objArr.length, iM1354, iM1353);
                } else {
                    int length = iM1353 - (i4 - objArr.length);
                    AbstractC0270.m1380(objArr, objArr, 0, length, iM1353);
                    Object[] objArr2 = this.f1432;
                    AbstractC0270.m1380(objArr2, objArr2, i3, iM1354, length);
                }
            } else {
                Object[] objArr3 = this.f1432;
                AbstractC0270.m1380(objArr3, objArr3, size, 0, iM1353);
                Object[] objArr4 = this.f1432;
                if (i3 >= objArr4.length) {
                    AbstractC0270.m1380(objArr4, objArr4, i3 - objArr4.length, iM1354, objArr4.length);
                } else {
                    AbstractC0270.m1380(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f1432;
                    AbstractC0270.m1380(objArr5, objArr5, i3, iM1354, objArr5.length - size);
                }
            }
            m1348(iM1354, collection);
            return true;
        }
        int i5 = this.f1431;
        int length2 = i5 - size;
        if (iM1354 < i5) {
            Object[] objArr6 = this.f1432;
            AbstractC0270.m1380(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM1354) {
                Object[] objArr7 = this.f1432;
                AbstractC0270.m1380(objArr7, objArr7, objArr7.length - size, 0, iM1354);
            } else {
                Object[] objArr8 = this.f1432;
                AbstractC0270.m1380(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f1432;
                AbstractC0270.m1380(objArr9, objArr9, 0, size, iM1354);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f1432;
            AbstractC0270.m1380(objArr10, objArr10, length2, i5, iM1354);
        } else {
            Object[] objArr11 = this.f1432;
            length2 += objArr11.length;
            int i6 = iM1354 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                AbstractC0270.m1380(objArr11, objArr11, length2, i5, iM1354);
            } else {
                AbstractC0270.m1380(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f1432;
                AbstractC0270.m1380(objArr12, objArr12, 0, this.f1431 + length3, iM1354);
            }
        }
        this.f1431 = length2;
        m1348(m1351(iM1354 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m1354();
        m1349(this.f1433 + 1);
        int length = this.f1431;
        if (length == 0) {
            length = this.f1432.length;
        }
        int i = length - 1;
        this.f1431 = i;
        this.f1432[i] = obj;
        this.f1433++;
    }

    public final void addLast(Object obj) {
        m1354();
        m1349(mo944() + 1);
        this.f1432[m1353(mo944() + this.f1431)] = obj;
        this.f1433 = mo944() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m1354();
            m1352(this.f1431, m1353(mo944() + this.f1431));
        }
        this.f1431 = 0;
        this.f1433 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo944 = mo944();
        if (i < 0 || i >= iMo944) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", iMo944));
        }
        return this.f1432[m1353(this.f1431 + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM1353 = m1353(mo944() + this.f1431);
        int length = this.f1431;
        if (length < iM1353) {
            while (length < iM1353) {
                if (AbstractC2207.m4087(obj, this.f1432[length])) {
                    i = this.f1431;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f1431) < iM1353) {
            return -1;
        }
        int length2 = this.f1432.length;
        while (length < length2) {
            if (AbstractC2207.m4087(obj, this.f1432[length])) {
                i = this.f1431;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM1353; i2++) {
            if (AbstractC2207.m4087(obj, this.f1432[i2])) {
                length = i2 + this.f1432.length;
                i = this.f1431;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo944() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM1353 = m1353(mo944() + this.f1431);
        int i2 = this.f1431;
        if (i2 < iM1353) {
            length = iM1353 - 1;
            if (i2 <= length) {
                while (!AbstractC2207.m4087(obj, this.f1432[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1431;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && true) {
            for (int i3 = iM1353 - 1; -1 < i3; i3--) {
                if (AbstractC2207.m4087(obj, this.f1432[i3])) {
                    length = i3 + this.f1432.length;
                    i = this.f1431;
                    return length - i;
                }
            }
            length = this.f1432.length - 1;
            int i4 = this.f1431;
            if (i4 <= length) {
                while (!AbstractC2207.m4087(obj, this.f1432[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f1431;
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
        mo945(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1353;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1432.length != 0) {
            int iM1354 = m1353(mo944() + this.f1431);
            int i = this.f1431;
            if (i < iM1354) {
                iM1353 = i;
                while (i < iM1354) {
                    Object obj = this.f1432[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f1432[iM1353] = obj;
                        iM1353++;
                    }
                    i++;
                }
                Arrays.fill(this.f1432, iM1353, iM1354, (Object) null);
            } else {
                int length = this.f1432.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1432;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f1432[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM1353 = m1353(i2);
                for (int i3 = 0; i3 < iM1354; i3++) {
                    Object[] objArr2 = this.f1432;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f1432[iM1353] = obj3;
                        iM1353 = m1350(iM1353);
                    }
                }
                z = z2;
            }
            if (z) {
                m1354();
                this.f1433 = m1351(iM1353 - this.f1431);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1354();
        Object[] objArr = this.f1432;
        int i = this.f1431;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1431 = m1350(i);
        this.f1433 = mo944() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1354();
        int iM1353 = m1353(AbstractC0745.m2211(this) + this.f1431);
        Object[] objArr = this.f1432;
        Object obj = objArr[iM1353];
        objArr[iM1353] = null;
        this.f1433 = mo944() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC2665.m4662(i, i2, this.f1433);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f1433) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo945(i);
            return;
        }
        m1354();
        if (i < this.f1433 - i2) {
            int iM1353 = m1353(this.f1431 + (i - 1));
            int iM1354 = m1353(this.f1431 + (i2 - 1));
            while (i > 0) {
                int i4 = iM1353 + 1;
                int iMin = Math.min(i, Math.min(i4, iM1354 + 1));
                Object[] objArr = this.f1432;
                int i5 = iM1354 - iMin;
                int i6 = iM1353 - iMin;
                AbstractC0270.m1380(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM1353 = m1351(i6);
                iM1354 = m1351(i5);
                i -= iMin;
            }
            int iM1355 = m1353(this.f1431 + i3);
            m1352(this.f1431, iM1355);
            this.f1431 = iM1355;
        } else {
            int iM1356 = m1353(this.f1431 + i2);
            int iM1357 = m1353(this.f1431 + i);
            int i7 = this.f1433;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1432;
                i2 = Math.min(i7, Math.min(objArr2.length - iM1356, objArr2.length - iM1357));
                Object[] objArr3 = this.f1432;
                int i8 = iM1356 + i2;
                AbstractC0270.m1380(objArr3, objArr3, iM1357, iM1356, i8);
                iM1356 = m1353(i8);
                iM1357 = m1353(iM1357 + i2);
            }
            int iM1358 = m1353(this.f1433 + this.f1431);
            m1352(m1351(iM1358 - i3), iM1358);
        }
        this.f1433 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1353;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1432.length != 0) {
            int iM1354 = m1353(mo944() + this.f1431);
            int i = this.f1431;
            if (i < iM1354) {
                iM1353 = i;
                while (i < iM1354) {
                    Object obj = this.f1432[i];
                    if (collection.contains(obj)) {
                        this.f1432[iM1353] = obj;
                        iM1353++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.f1432, iM1353, iM1354, (Object) null);
            } else {
                int length = this.f1432.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1432;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1432[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM1353 = m1353(i2);
                for (int i3 = 0; i3 < iM1354; i3++) {
                    Object[] objArr2 = this.f1432;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1432[iM1353] = obj3;
                        iM1353 = m1350(iM1353);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m1354();
                this.f1433 = m1351(iM1353 - this.f1431);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo944 = mo944();
        if (i < 0 || i >= iMo944) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", iMo944));
        }
        int iM1353 = m1353(this.f1431 + i);
        Object[] objArr = this.f1432;
        Object obj2 = objArr[iM1353];
        objArr[iM1353] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo944()]);
    }

    @Override // p000.AbstractC0064
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo944() {
        return this.f1433;
    }

    @Override // p000.AbstractC0064
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo945(int i) {
        int i2 = this.f1433;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        if (i == AbstractC0745.m2211(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m1354();
        int iM1353 = m1353(this.f1431 + i);
        Object[] objArr = this.f1432;
        Object obj = objArr[iM1353];
        if (i < (this.f1433 >> 1)) {
            int i3 = this.f1431;
            if (iM1353 >= i3) {
                AbstractC0270.m1380(objArr, objArr, i3 + 1, i3, iM1353);
            } else {
                AbstractC0270.m1380(objArr, objArr, 1, 0, iM1353);
                Object[] objArr2 = this.f1432;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f1431;
                AbstractC0270.m1380(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1432;
            int i5 = this.f1431;
            objArr3[i5] = null;
            this.f1431 = m1350(i5);
        } else {
            int iM1354 = m1353(AbstractC0745.m2211(this) + this.f1431);
            if (iM1353 <= iM1354) {
                Object[] objArr4 = this.f1432;
                AbstractC0270.m1380(objArr4, objArr4, iM1353, iM1353 + 1, iM1354 + 1);
            } else {
                Object[] objArr5 = this.f1432;
                AbstractC0270.m1380(objArr5, objArr5, iM1353, iM1353 + 1, objArr5.length);
                Object[] objArr6 = this.f1432;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0270.m1380(objArr6, objArr6, 0, 1, iM1354 + 1);
            }
            this.f1432[iM1354] = null;
        }
        this.f1433--;
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1348(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1432.length;
        while (i < length && it.hasNext()) {
            this.f1432[i] = it.next();
            i++;
        }
        int i2 = this.f1431;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f1432[i3] = it.next();
        }
        this.f1433 = collection.size() + this.f1433;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m1349(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1432;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f1430) {
            if (i < 10) {
                i = 10;
            }
            this.f1432 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? 2147483647 : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0270.m1380(objArr, objArr2, 0, this.f1431, objArr.length);
        Object[] objArr3 = this.f1432;
        int length2 = objArr3.length;
        int i3 = this.f1431;
        AbstractC0270.m1380(objArr3, objArr2, length2 - i3, 0, i3);
        this.f1431 = 0;
        this.f1432 = objArr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m1350(int i) {
        if (i == this.f1432.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m1351(int i) {
        return i < 0 ? i + this.f1432.length : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1352(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.f1432, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.f1432;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.f1432, 0, i2, (Object) null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m1353(int i) {
        Object[] objArr = this.f1432;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1354() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f1433;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM1353 = m1353(this.f1433 + this.f1431);
        int i2 = this.f1431;
        if (i2 < iM1353) {
            AbstractC0270.m1383(this.f1432, objArr, i2, iM1353, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1432;
            AbstractC0270.m1380(objArr2, objArr, 0, this.f1431, objArr2.length);
            Object[] objArr3 = this.f1432;
            AbstractC0270.m1380(objArr3, objArr, objArr3.length - this.f1431, 0, iM1353);
        }
        int i3 = this.f1433;
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
        m1354();
        m1349(collection.size() + mo944());
        m1348(m1353(mo944() + this.f1431), collection);
        return true;
    }
}
