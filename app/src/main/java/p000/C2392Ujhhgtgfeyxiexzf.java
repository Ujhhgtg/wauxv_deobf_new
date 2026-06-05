package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2392Ujhhgtgfeyxiexzf implements Collection, Set, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int[] f7776Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object[] f7777Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f7778Ujhhgtgfeyxiexzf;

    public C2392Ujhhgtgfeyxiexzf(int i) {
        this.f7776Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11180Ujhhgtgfeyxiexzf;
        this.f7777Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11181Ujhhgtgfeyxiexzf;
        if (i > 0) {
            this.f7776Ujhhgtgfeyxiexzf = new int[i];
            this.f7777Ujhhgtgfeyxiexzf = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM2739Ujhhgtgfeyxiexzf;
        int i2 = this.f7778Ujhhgtgfeyxiexzf;
        if (obj == null) {
            iM2739Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2739Ujhhgtgfeyxiexzf(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2739Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2739Ujhhgtgfeyxiexzf(this, obj, iHashCode);
        }
        if (iM2739Ujhhgtgfeyxiexzf >= 0) {
            return false;
        }
        int i3 = ~iM2739Ujhhgtgfeyxiexzf;
        int[] iArr = this.f7776Ujhhgtgfeyxiexzf;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f7777Ujhhgtgfeyxiexzf;
            int[] iArr2 = new int[i4];
            this.f7776Ujhhgtgfeyxiexzf = iArr2;
            this.f7777Ujhhgtgfeyxiexzf = new Object[i4];
            if (i2 != this.f7778Ujhhgtgfeyxiexzf) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC2391Ujhhgtgfeyxiexzf.m3645feyxiexzfUjhhgtg(iArr.length, 6, iArr, iArr2);
                AbstractC2391Ujhhgtgfeyxiexzf.m3647feyxiexzfUjhhgtg(objArr, this.f7777Ujhhgtgfeyxiexzf, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f7776Ujhhgtgfeyxiexzf;
            int i5 = i3 + 1;
            AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr3, i5, i3, i2, iArr3);
            Object[] objArr2 = this.f7777Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f7778Ujhhgtgfeyxiexzf;
        if (i2 == i6) {
            int[] iArr4 = this.f7776Ujhhgtgfeyxiexzf;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f7777Ujhhgtgfeyxiexzf[i3] = obj;
                this.f7778Ujhhgtgfeyxiexzf = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f7778Ujhhgtgfeyxiexzf;
        int i = this.f7778Ujhhgtgfeyxiexzf;
        int[] iArr = this.f7776Ujhhgtgfeyxiexzf;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7777Ujhhgtgfeyxiexzf;
            int[] iArr2 = new int[size];
            this.f7776Ujhhgtgfeyxiexzf = iArr2;
            this.f7777Ujhhgtgfeyxiexzf = new Object[size];
            if (i > 0) {
                AbstractC2391Ujhhgtgfeyxiexzf.m3645feyxiexzfUjhhgtg(i, 6, iArr, iArr2);
                AbstractC2391Ujhhgtgfeyxiexzf.m3647feyxiexzfUjhhgtg(objArr, this.f7777Ujhhgtgfeyxiexzf, 0, this.f7778Ujhhgtgfeyxiexzf, 6);
            }
        }
        if (this.f7778Ujhhgtgfeyxiexzf != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f7778Ujhhgtgfeyxiexzf != 0) {
            this.f7776Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11180Ujhhgtgfeyxiexzf;
            this.f7777Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11181Ujhhgtgfeyxiexzf;
            this.f7778Ujhhgtgfeyxiexzf = 0;
        }
        if (this.f7778Ujhhgtgfeyxiexzf != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1243feyxiexzfUjhhgtg.m2739Ujhhgtgfeyxiexzf(this, null, 0) : AbstractC1243feyxiexzfUjhhgtg.m2739Ujhhgtgfeyxiexzf(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f7778Ujhhgtgfeyxiexzf != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f7778Ujhhgtgfeyxiexzf;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f7777Ujhhgtgfeyxiexzf[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7776Ujhhgtgfeyxiexzf;
        int i = this.f7778Ujhhgtgfeyxiexzf;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7778Ujhhgtgfeyxiexzf <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2408Ujhhgtgfeyxiexzf(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2739Ujhhgtgfeyxiexzf = obj == null ? AbstractC1243feyxiexzfUjhhgtg.m2739Ujhhgtgfeyxiexzf(this, null, 0) : AbstractC1243feyxiexzfUjhhgtg.m2739Ujhhgtgfeyxiexzf(this, obj, obj.hashCode());
        if (iM2739Ujhhgtgfeyxiexzf < 0) {
            return false;
        }
        m3655Ujhhgtgfeyxiexzf(iM2739Ujhhgtgfeyxiexzf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f7778Ujhhgtgfeyxiexzf - 1; -1 < i; i--) {
            if (!AbstractC2856feyxiexzfUjhhgtg.m4237feyxiexzfUjhhgtg(collection, this.f7777Ujhhgtgfeyxiexzf[i])) {
                m3655Ujhhgtgfeyxiexzf(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7778Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f7777Ujhhgtgfeyxiexzf;
        int i = this.f7778Ujhhgtgfeyxiexzf;
        AbstractC1245feyxiexzfUjhhgtg.m2748Ujhhgtgfeyxiexzf(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7778Ujhhgtgfeyxiexzf * 14);
        sb.append('{');
        int i = this.f7778Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7777Ujhhgtgfeyxiexzf[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object m3655Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f7778Ujhhgtgfeyxiexzf;
        Object[] objArr = this.f7777Ujhhgtgfeyxiexzf;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f7776Ujhhgtgfeyxiexzf;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr, i, i4, i2, iArr);
                Object[] objArr2 = this.f7777Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i, i4, i2);
            }
            this.f7777Ujhhgtgfeyxiexzf[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f7776Ujhhgtgfeyxiexzf = iArr2;
            this.f7777Ujhhgtgfeyxiexzf = new Object[i5];
            if (i > 0) {
                AbstractC2391Ujhhgtgfeyxiexzf.m3645feyxiexzfUjhhgtg(i, 6, iArr, iArr2);
                AbstractC2391Ujhhgtgfeyxiexzf.m3647feyxiexzfUjhhgtg(objArr, this.f7777Ujhhgtgfeyxiexzf, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr, i, i6, i2, this.f7776Ujhhgtgfeyxiexzf);
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, this.f7777Ujhhgtgfeyxiexzf, i, i6, i2);
            }
        }
        if (i2 != this.f7778Ujhhgtgfeyxiexzf) {
            throw new ConcurrentModificationException();
        }
        this.f7778Ujhhgtgfeyxiexzf = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f7778Ujhhgtgfeyxiexzf;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(this.f7777Ujhhgtgfeyxiexzf, objArr, 0, 0, this.f7778Ujhhgtgfeyxiexzf);
        return objArr;
    }
}
