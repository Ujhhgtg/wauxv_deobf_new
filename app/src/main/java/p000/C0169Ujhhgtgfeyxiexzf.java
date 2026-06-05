package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0169Ujhhgtgfeyxiexzf extends AbstractCollection implements Collection, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0174Ujhhgtgfeyxiexzf f1353Ujhhgtgfeyxiexzf;

    public C0169Ujhhgtgfeyxiexzf(C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf) {
        this.f1353Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f1353Ujhhgtgfeyxiexzf.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1353Ujhhgtgfeyxiexzf.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f1353Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1353Ujhhgtgfeyxiexzf;
        c0174Ujhhgtgfeyxiexzf.getClass();
        return new C0164Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1353Ujhhgtgfeyxiexzf;
        c0174Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        int i2 = c0174Ujhhgtgfeyxiexzf.f1370Ujhhgtgfeyxiexzf;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (c0174Ujhhgtgfeyxiexzf.f1367Ujhhgtgfeyxiexzf[i2] >= 0 && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        c0174Ujhhgtgfeyxiexzf.m1243Ujhhgtgfeyxiexzf(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f1353Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f1353Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f1353Ujhhgtgfeyxiexzf.f1373Ujhhgtgfeyxiexzf;
    }
}
