package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1924feyxiexzfUjhhgtg implements Collection, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int[] f6394Ujhhgtgfeyxiexzf;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C1916Ujhhgtgfeyxiexzf)) {
            return false;
        }
        int i = ((C1916Ujhhgtgfeyxiexzf) obj).f6384Ujhhgtgfeyxiexzf;
        int[] iArr = this.f6394Ujhhgtgfeyxiexzf;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C1916Ujhhgtgfeyxiexzf) {
                    int i = ((C1916Ujhhgtgfeyxiexzf) obj).f6384Ujhhgtgfeyxiexzf;
                    int[] iArr = this.f6394Ujhhgtgfeyxiexzf;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (i == iArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C1924feyxiexzfUjhhgtg) {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6394Ujhhgtgfeyxiexzf, ((C1924feyxiexzfUjhhgtg) obj).f6394Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f6394Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f6394Ujhhgtgfeyxiexzf.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2930Ujhhgtgfeyxiexzf(4, this.f6394Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f6394Ujhhgtgfeyxiexzf.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3612feyxiexzfUjhhgtg.m5244Ujhhgtgfeyxiexzf(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f6394Ujhhgtgfeyxiexzf) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3612feyxiexzfUjhhgtg.m5245Ujhhgtgfeyxiexzf(this, objArr);
    }
}
