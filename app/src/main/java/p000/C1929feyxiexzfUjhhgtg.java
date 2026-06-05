package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛳᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1929feyxiexzfUjhhgtg implements Collection, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final short[] f6402Ujhhgtgfeyxiexzf;

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
        if (!(obj instanceof C1926Ujhhgtgfeyxiexzf)) {
            return false;
        }
        short s = ((C1926Ujhhgtgfeyxiexzf) obj).f6397Ujhhgtgfeyxiexzf;
        short[] sArr = this.f6402Ujhhgtgfeyxiexzf;
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            if (s == sArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C1926Ujhhgtgfeyxiexzf) {
                    short s = ((C1926Ujhhgtgfeyxiexzf) obj).f6397Ujhhgtgfeyxiexzf;
                    short[] sArr = this.f6402Ujhhgtgfeyxiexzf;
                    int length = sArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (s == sArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C1929feyxiexzfUjhhgtg) {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6402Ujhhgtgfeyxiexzf, ((C1929feyxiexzfUjhhgtg) obj).f6402Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f6402Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f6402Ujhhgtgfeyxiexzf.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2930Ujhhgtgfeyxiexzf(6, this.f6402Ujhhgtgfeyxiexzf);
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
        return this.f6402Ujhhgtgfeyxiexzf.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3612feyxiexzfUjhhgtg.m5244Ujhhgtgfeyxiexzf(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f6402Ujhhgtgfeyxiexzf) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3612feyxiexzfUjhhgtg.m5245Ujhhgtgfeyxiexzf(this, objArr);
    }
}
