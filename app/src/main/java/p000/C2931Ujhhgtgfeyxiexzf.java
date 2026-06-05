package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2931Ujhhgtgfeyxiexzf extends C2930Ujhhgtgfeyxiexzf implements ListIterator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2933Ujhhgtgfeyxiexzf f9219Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2931Ujhhgtgfeyxiexzf(AbstractC2933Ujhhgtgfeyxiexzf abstractC2933Ujhhgtgfeyxiexzf, int i) {
        super(0, abstractC2933Ujhhgtgfeyxiexzf);
        this.f9219Ujhhgtgfeyxiexzf = abstractC2933Ujhhgtgfeyxiexzf;
        int iMo1287Ujhhgtgfeyxiexzf = abstractC2933Ujhhgtgfeyxiexzf.mo1287Ujhhgtgfeyxiexzf();
        if (i < 0 || i > iMo1287Ujhhgtgfeyxiexzf) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", iMo1287Ujhhgtgfeyxiexzf));
        }
        this.f9217Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9217Ujhhgtgfeyxiexzf > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9217Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f9217Ujhhgtgfeyxiexzf - 1;
        this.f9217Ujhhgtgfeyxiexzf = i;
        return this.f9219Ujhhgtgfeyxiexzf.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9217Ujhhgtgfeyxiexzf - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
