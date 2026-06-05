package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2377Ujhhgtgfeyxiexzf extends AbstractC2935Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Object[] f7733Ujhhgtgfeyxiexzf = new Object[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f7734Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object[] f7735Ujhhgtgfeyxiexzf = f7733Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f7736Ujhhgtgfeyxiexzf;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f7736Ujhhgtgfeyxiexzf;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m3627Ujhhgtgfeyxiexzf();
        m3622Ujhhgtgfeyxiexzf(this.f7736Ujhhgtgfeyxiexzf + 1);
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i);
        int i3 = this.f7736Ujhhgtgfeyxiexzf;
        if (i < ((i3 + 1) >> 1)) {
            int length = iM3626Ujhhgtgfeyxiexzf == 0 ? this.f7735Ujhhgtgfeyxiexzf.length - 1 : iM3626Ujhhgtgfeyxiexzf - 1;
            int i4 = this.f7734Ujhhgtgfeyxiexzf;
            int length2 = i4 == 0 ? this.f7735Ujhhgtgfeyxiexzf.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
                objArr[length2] = objArr[i4];
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f7735Ujhhgtgfeyxiexzf;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr3, objArr3, 0, 1, length + 1);
            }
            this.f7735Ujhhgtgfeyxiexzf[length] = obj;
            this.f7734Ujhhgtgfeyxiexzf = length2;
        } else {
            int iM3626Ujhhgtgfeyxiexzf2 = m3626Ujhhgtgfeyxiexzf(i3 + this.f7734Ujhhgtgfeyxiexzf);
            if (iM3626Ujhhgtgfeyxiexzf < iM3626Ujhhgtgfeyxiexzf2) {
                Object[] objArr4 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr4, objArr4, iM3626Ujhhgtgfeyxiexzf + 1, iM3626Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf2);
            } else {
                Object[] objArr5 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr5, objArr5, 1, 0, iM3626Ujhhgtgfeyxiexzf2);
                Object[] objArr6 = this.f7735Ujhhgtgfeyxiexzf;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr6, objArr6, iM3626Ujhhgtgfeyxiexzf + 1, iM3626Ujhhgtgfeyxiexzf, objArr6.length - 1);
            }
            this.f7735Ujhhgtgfeyxiexzf[iM3626Ujhhgtgfeyxiexzf] = obj;
        }
        this.f7736Ujhhgtgfeyxiexzf++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f7736Ujhhgtgfeyxiexzf;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f7736Ujhhgtgfeyxiexzf) {
            return addAll(collection);
        }
        m3627Ujhhgtgfeyxiexzf();
        m3622Ujhhgtgfeyxiexzf(collection.size() + this.f7736Ujhhgtgfeyxiexzf);
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(this.f7736Ujhhgtgfeyxiexzf + this.f7734Ujhhgtgfeyxiexzf);
        int iM3626Ujhhgtgfeyxiexzf2 = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i);
        int size = collection.size();
        if (i >= ((this.f7736Ujhhgtgfeyxiexzf + 1) >> 1)) {
            int i3 = iM3626Ujhhgtgfeyxiexzf2 + size;
            if (iM3626Ujhhgtgfeyxiexzf2 < iM3626Ujhhgtgfeyxiexzf) {
                int i4 = size + iM3626Ujhhgtgfeyxiexzf;
                Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
                if (i4 <= objArr.length) {
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i3, iM3626Ujhhgtgfeyxiexzf2, iM3626Ujhhgtgfeyxiexzf);
                } else if (i3 >= objArr.length) {
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i3 - objArr.length, iM3626Ujhhgtgfeyxiexzf2, iM3626Ujhhgtgfeyxiexzf);
                } else {
                    int length = iM3626Ujhhgtgfeyxiexzf - (i4 - objArr.length);
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, 0, length, iM3626Ujhhgtgfeyxiexzf);
                    Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i3, iM3626Ujhhgtgfeyxiexzf2, length);
                }
            } else {
                Object[] objArr3 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr3, objArr3, size, 0, iM3626Ujhhgtgfeyxiexzf);
                Object[] objArr4 = this.f7735Ujhhgtgfeyxiexzf;
                if (i3 >= objArr4.length) {
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr4, objArr4, i3 - objArr4.length, iM3626Ujhhgtgfeyxiexzf2, objArr4.length);
                } else {
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f7735Ujhhgtgfeyxiexzf;
                    AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr5, objArr5, i3, iM3626Ujhhgtgfeyxiexzf2, objArr5.length - size);
                }
            }
            m3621Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf2, collection);
            return true;
        }
        int i5 = this.f7734Ujhhgtgfeyxiexzf;
        int length2 = i5 - size;
        if (iM3626Ujhhgtgfeyxiexzf2 < i5) {
            Object[] objArr6 = this.f7735Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM3626Ujhhgtgfeyxiexzf2) {
                Object[] objArr7 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr7, objArr7, objArr7.length - size, 0, iM3626Ujhhgtgfeyxiexzf2);
            } else {
                Object[] objArr8 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr9, objArr9, 0, size, iM3626Ujhhgtgfeyxiexzf2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f7735Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr10, objArr10, length2, i5, iM3626Ujhhgtgfeyxiexzf2);
        } else {
            Object[] objArr11 = this.f7735Ujhhgtgfeyxiexzf;
            length2 += objArr11.length;
            int i6 = iM3626Ujhhgtgfeyxiexzf2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr11, objArr11, length2, i5, iM3626Ujhhgtgfeyxiexzf2);
            } else {
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr12, objArr12, 0, this.f7734Ujhhgtgfeyxiexzf + length3, iM3626Ujhhgtgfeyxiexzf2);
            }
        }
        this.f7734Ujhhgtgfeyxiexzf = length2;
        m3621Ujhhgtgfeyxiexzf(m3624Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m3627Ujhhgtgfeyxiexzf();
        m3622Ujhhgtgfeyxiexzf(this.f7736Ujhhgtgfeyxiexzf + 1);
        int length = this.f7734Ujhhgtgfeyxiexzf;
        if (length == 0) {
            length = this.f7735Ujhhgtgfeyxiexzf.length;
        }
        int i = length - 1;
        this.f7734Ujhhgtgfeyxiexzf = i;
        this.f7735Ujhhgtgfeyxiexzf[i] = obj;
        this.f7736Ujhhgtgfeyxiexzf++;
    }

    public final void addLast(Object obj) {
        m3627Ujhhgtgfeyxiexzf();
        m3622Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + 1);
        this.f7735Ujhhgtgfeyxiexzf[m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf)] = obj;
        this.f7736Ujhhgtgfeyxiexzf = mo1142Ujhhgtgfeyxiexzf() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m3627Ujhhgtgfeyxiexzf();
            m3625Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf, m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf));
        }
        this.f7734Ujhhgtgfeyxiexzf = 0;
        this.f7736Ujhhgtgfeyxiexzf = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo1142Ujhhgtgfeyxiexzf = mo1142Ujhhgtgfeyxiexzf();
        if (i < 0 || i >= iMo1142Ujhhgtgfeyxiexzf) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", iMo1142Ujhhgtgfeyxiexzf));
        }
        return this.f7735Ujhhgtgfeyxiexzf[m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf);
        int length = this.f7734Ujhhgtgfeyxiexzf;
        if (length < iM3626Ujhhgtgfeyxiexzf) {
            while (length < iM3626Ujhhgtgfeyxiexzf) {
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f7735Ujhhgtgfeyxiexzf[length])) {
                    i = this.f7734Ujhhgtgfeyxiexzf;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f7734Ujhhgtgfeyxiexzf) < iM3626Ujhhgtgfeyxiexzf) {
            return -1;
        }
        int length2 = this.f7735Ujhhgtgfeyxiexzf.length;
        while (length < length2) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f7735Ujhhgtgfeyxiexzf[length])) {
                i = this.f7734Ujhhgtgfeyxiexzf;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM3626Ujhhgtgfeyxiexzf; i2++) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f7735Ujhhgtgfeyxiexzf[i2])) {
                length = i2 + this.f7735Ujhhgtgfeyxiexzf.length;
                i = this.f7734Ujhhgtgfeyxiexzf;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo1142Ujhhgtgfeyxiexzf() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf);
        int i2 = this.f7734Ujhhgtgfeyxiexzf;
        if (i2 < iM3626Ujhhgtgfeyxiexzf) {
            length = iM3626Ujhhgtgfeyxiexzf - 1;
            if (i2 <= length) {
                while (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f7735Ujhhgtgfeyxiexzf[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f7734Ujhhgtgfeyxiexzf;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f7734Ujhhgtgfeyxiexzf >= iM3626Ujhhgtgfeyxiexzf) {
            for (int i3 = iM3626Ujhhgtgfeyxiexzf - 1; -1 < i3; i3--) {
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f7735Ujhhgtgfeyxiexzf[i3])) {
                    length = i3 + this.f7735Ujhhgtgfeyxiexzf.length;
                    i = this.f7734Ujhhgtgfeyxiexzf;
                    return length - i;
                }
            }
            length = this.f7735Ujhhgtgfeyxiexzf.length - 1;
            int i4 = this.f7734Ujhhgtgfeyxiexzf;
            if (i4 <= length) {
                while (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f7735Ujhhgtgfeyxiexzf[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f7734Ujhhgtgfeyxiexzf;
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
        mo1143Ujhhgtgfeyxiexzf(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM3626Ujhhgtgfeyxiexzf;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f7735Ujhhgtgfeyxiexzf.length != 0) {
            int iM3626Ujhhgtgfeyxiexzf2 = m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf);
            int i = this.f7734Ujhhgtgfeyxiexzf;
            if (i < iM3626Ujhhgtgfeyxiexzf2) {
                iM3626Ujhhgtgfeyxiexzf = i;
                while (i < iM3626Ujhhgtgfeyxiexzf2) {
                    Object obj = this.f7735Ujhhgtgfeyxiexzf[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f7735Ujhhgtgfeyxiexzf[iM3626Ujhhgtgfeyxiexzf] = obj;
                        iM3626Ujhhgtgfeyxiexzf++;
                    }
                    i++;
                }
                Arrays.fill(this.f7735Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf2, (Object) null);
            } else {
                int length = this.f7735Ujhhgtgfeyxiexzf.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f7735Ujhhgtgfeyxiexzf[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(i2);
                for (int i3 = 0; i3 < iM3626Ujhhgtgfeyxiexzf2; i3++) {
                    Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f7735Ujhhgtgfeyxiexzf[iM3626Ujhhgtgfeyxiexzf] = obj3;
                        iM3626Ujhhgtgfeyxiexzf = m3623Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf);
                    }
                }
                z = z2;
            }
            if (z) {
                m3627Ujhhgtgfeyxiexzf();
                this.f7736Ujhhgtgfeyxiexzf = m3624Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf - this.f7734Ujhhgtgfeyxiexzf);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m3627Ujhhgtgfeyxiexzf();
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        int i = this.f7734Ujhhgtgfeyxiexzf;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f7734Ujhhgtgfeyxiexzf = m3623Ujhhgtgfeyxiexzf(i);
        this.f7736Ujhhgtgfeyxiexzf = mo1142Ujhhgtgfeyxiexzf() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m3627Ujhhgtgfeyxiexzf();
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(this) + this.f7734Ujhhgtgfeyxiexzf);
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        Object obj = objArr[iM3626Ujhhgtgfeyxiexzf];
        objArr[iM3626Ujhhgtgfeyxiexzf] = null;
        this.f7736Ujhhgtgfeyxiexzf = mo1142Ujhhgtgfeyxiexzf() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC3516feyxiexzfUjhhgtg.m5053Ujhhgtgfeyxiexzf(i, i2, this.f7736Ujhhgtgfeyxiexzf);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f7736Ujhhgtgfeyxiexzf) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo1143Ujhhgtgfeyxiexzf(i);
            return;
        }
        m3627Ujhhgtgfeyxiexzf();
        if (i < this.f7736Ujhhgtgfeyxiexzf - i2) {
            int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + (i - 1));
            int iM3626Ujhhgtgfeyxiexzf2 = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + (i2 - 1));
            while (i > 0) {
                int i4 = iM3626Ujhhgtgfeyxiexzf + 1;
                int iMin = Math.min(i, Math.min(i4, iM3626Ujhhgtgfeyxiexzf2 + 1));
                Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
                int i5 = iM3626Ujhhgtgfeyxiexzf2 - iMin;
                int i6 = iM3626Ujhhgtgfeyxiexzf - iMin;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM3626Ujhhgtgfeyxiexzf = m3624Ujhhgtgfeyxiexzf(i6);
                iM3626Ujhhgtgfeyxiexzf2 = m3624Ujhhgtgfeyxiexzf(i5);
                i -= iMin;
            }
            int iM3626Ujhhgtgfeyxiexzf3 = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i3);
            m3625Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf3);
            this.f7734Ujhhgtgfeyxiexzf = iM3626Ujhhgtgfeyxiexzf3;
        } else {
            int iM3626Ujhhgtgfeyxiexzf4 = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i2);
            int iM3626Ujhhgtgfeyxiexzf5 = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i);
            int i7 = this.f7736Ujhhgtgfeyxiexzf;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
                i2 = Math.min(i7, Math.min(objArr2.length - iM3626Ujhhgtgfeyxiexzf4, objArr2.length - iM3626Ujhhgtgfeyxiexzf5));
                Object[] objArr3 = this.f7735Ujhhgtgfeyxiexzf;
                int i8 = iM3626Ujhhgtgfeyxiexzf4 + i2;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr3, objArr3, iM3626Ujhhgtgfeyxiexzf5, iM3626Ujhhgtgfeyxiexzf4, i8);
                iM3626Ujhhgtgfeyxiexzf4 = m3626Ujhhgtgfeyxiexzf(i8);
                iM3626Ujhhgtgfeyxiexzf5 = m3626Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf5 + i2);
            }
            int iM3626Ujhhgtgfeyxiexzf6 = m3626Ujhhgtgfeyxiexzf(this.f7736Ujhhgtgfeyxiexzf + this.f7734Ujhhgtgfeyxiexzf);
            m3625Ujhhgtgfeyxiexzf(m3624Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf6 - i3), iM3626Ujhhgtgfeyxiexzf6);
        }
        this.f7736Ujhhgtgfeyxiexzf -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM3626Ujhhgtgfeyxiexzf;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f7735Ujhhgtgfeyxiexzf.length != 0) {
            int iM3626Ujhhgtgfeyxiexzf2 = m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf);
            int i = this.f7734Ujhhgtgfeyxiexzf;
            if (i < iM3626Ujhhgtgfeyxiexzf2) {
                iM3626Ujhhgtgfeyxiexzf = i;
                while (i < iM3626Ujhhgtgfeyxiexzf2) {
                    Object obj = this.f7735Ujhhgtgfeyxiexzf[i];
                    if (collection.contains(obj)) {
                        this.f7735Ujhhgtgfeyxiexzf[iM3626Ujhhgtgfeyxiexzf] = obj;
                        iM3626Ujhhgtgfeyxiexzf++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.f7735Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf2, (Object) null);
            } else {
                int length = this.f7735Ujhhgtgfeyxiexzf.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f7735Ujhhgtgfeyxiexzf[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(i2);
                for (int i3 = 0; i3 < iM3626Ujhhgtgfeyxiexzf2; i3++) {
                    Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f7735Ujhhgtgfeyxiexzf[iM3626Ujhhgtgfeyxiexzf] = obj3;
                        iM3626Ujhhgtgfeyxiexzf = m3623Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m3627Ujhhgtgfeyxiexzf();
                this.f7736Ujhhgtgfeyxiexzf = m3624Ujhhgtgfeyxiexzf(iM3626Ujhhgtgfeyxiexzf - this.f7734Ujhhgtgfeyxiexzf);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo1142Ujhhgtgfeyxiexzf = mo1142Ujhhgtgfeyxiexzf();
        if (i < 0 || i >= iMo1142Ujhhgtgfeyxiexzf) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", iMo1142Ujhhgtgfeyxiexzf));
        }
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i);
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        Object obj2 = objArr[iM3626Ujhhgtgfeyxiexzf];
        objArr[iM3626Ujhhgtgfeyxiexzf] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1142Ujhhgtgfeyxiexzf()]);
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1142Ujhhgtgfeyxiexzf() {
        return this.f7736Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1143Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f7736Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        if (i == AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m3627Ujhhgtgfeyxiexzf();
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(this.f7734Ujhhgtgfeyxiexzf + i);
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        Object obj = objArr[iM3626Ujhhgtgfeyxiexzf];
        if (i < (this.f7736Ujhhgtgfeyxiexzf >> 1)) {
            int i3 = this.f7734Ujhhgtgfeyxiexzf;
            if (iM3626Ujhhgtgfeyxiexzf >= i3) {
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, i3 + 1, i3, iM3626Ujhhgtgfeyxiexzf);
            } else {
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr, 1, 0, iM3626Ujhhgtgfeyxiexzf);
                Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f7734Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f7735Ujhhgtgfeyxiexzf;
            int i5 = this.f7734Ujhhgtgfeyxiexzf;
            objArr3[i5] = null;
            this.f7734Ujhhgtgfeyxiexzf = m3623Ujhhgtgfeyxiexzf(i5);
        } else {
            int iM3626Ujhhgtgfeyxiexzf2 = m3626Ujhhgtgfeyxiexzf(AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(this) + this.f7734Ujhhgtgfeyxiexzf);
            if (iM3626Ujhhgtgfeyxiexzf <= iM3626Ujhhgtgfeyxiexzf2) {
                Object[] objArr4 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr4, objArr4, iM3626Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf + 1, iM3626Ujhhgtgfeyxiexzf2 + 1);
            } else {
                Object[] objArr5 = this.f7735Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr5, objArr5, iM3626Ujhhgtgfeyxiexzf, iM3626Ujhhgtgfeyxiexzf + 1, objArr5.length);
                Object[] objArr6 = this.f7735Ujhhgtgfeyxiexzf;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr6, objArr6, 0, 1, iM3626Ujhhgtgfeyxiexzf2 + 1);
            }
            this.f7735Ujhhgtgfeyxiexzf[iM3626Ujhhgtgfeyxiexzf2] = null;
        }
        this.f7736Ujhhgtgfeyxiexzf--;
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3621Ujhhgtgfeyxiexzf(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7735Ujhhgtgfeyxiexzf.length;
        while (i < length && it.hasNext()) {
            this.f7735Ujhhgtgfeyxiexzf[i] = it.next();
            i++;
        }
        int i2 = this.f7734Ujhhgtgfeyxiexzf;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f7735Ujhhgtgfeyxiexzf[i3] = it.next();
        }
        this.f7736Ujhhgtgfeyxiexzf = collection.size() + this.f7736Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3622Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f7733Ujhhgtgfeyxiexzf) {
            if (i < 10) {
                i = 10;
            }
            this.f7735Ujhhgtgfeyxiexzf = new Object[i];
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
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, objArr2, 0, this.f7734Ujhhgtgfeyxiexzf, objArr.length);
        Object[] objArr3 = this.f7735Ujhhgtgfeyxiexzf;
        int length2 = objArr3.length;
        int i3 = this.f7734Ujhhgtgfeyxiexzf;
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr3, objArr2, length2 - i3, 0, i3);
        this.f7734Ujhhgtgfeyxiexzf = 0;
        this.f7735Ujhhgtgfeyxiexzf = objArr2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m3623Ujhhgtgfeyxiexzf(int i) {
        if (i == this.f7735Ujhhgtgfeyxiexzf.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m3624Ujhhgtgfeyxiexzf(int i) {
        return i < 0 ? i + this.f7735Ujhhgtgfeyxiexzf.length : i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3625Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.f7735Ujhhgtgfeyxiexzf, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.f7735Ujhhgtgfeyxiexzf, 0, i2, (Object) null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m3626Ujhhgtgfeyxiexzf(int i) {
        Object[] objArr = this.f7735Ujhhgtgfeyxiexzf;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3627Ujhhgtgfeyxiexzf() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f7736Ujhhgtgfeyxiexzf;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM3626Ujhhgtgfeyxiexzf = m3626Ujhhgtgfeyxiexzf(this.f7736Ujhhgtgfeyxiexzf + this.f7734Ujhhgtgfeyxiexzf);
        int i2 = this.f7734Ujhhgtgfeyxiexzf;
        if (i2 < iM3626Ujhhgtgfeyxiexzf) {
            AbstractC2391Ujhhgtgfeyxiexzf.m3647feyxiexzfUjhhgtg(this.f7735Ujhhgtgfeyxiexzf, objArr, i2, iM3626Ujhhgtgfeyxiexzf, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f7735Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr, 0, this.f7734Ujhhgtgfeyxiexzf, objArr2.length);
            Object[] objArr3 = this.f7735Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr3, objArr, objArr3.length - this.f7734Ujhhgtgfeyxiexzf, 0, iM3626Ujhhgtgfeyxiexzf);
        }
        int i3 = this.f7736Ujhhgtgfeyxiexzf;
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
        m3627Ujhhgtgfeyxiexzf();
        m3622Ujhhgtgfeyxiexzf(collection.size() + mo1142Ujhhgtgfeyxiexzf());
        m3621Ujhhgtgfeyxiexzf(m3626Ujhhgtgfeyxiexzf(mo1142Ujhhgtgfeyxiexzf() + this.f7734Ujhhgtgfeyxiexzf), collection);
        return true;
    }
}
