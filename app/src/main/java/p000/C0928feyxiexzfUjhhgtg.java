package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ要点脸能不能ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0928feyxiexzfUjhhgtg implements ListIterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ListIterator f3757Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0929feyxiexzfUjhhgtg f3758Ujhhgtgfeyxiexzf;

    public C0928feyxiexzfUjhhgtg(C0929feyxiexzfUjhhgtg c0929feyxiexzfUjhhgtg, int i) {
        this.f3758Ujhhgtgfeyxiexzf = c0929feyxiexzfUjhhgtg;
        this.f3757Ujhhgtgfeyxiexzf = c0929feyxiexzfUjhhgtg.f3759Ujhhgtgfeyxiexzf.listIterator(AbstractC2856feyxiexzfUjhhgtg.m4236feyxiexzfUjhhgtg(c0929feyxiexzfUjhhgtg, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f3757Ujhhgtgfeyxiexzf;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3757Ujhhgtgfeyxiexzf.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3757Ujhhgtgfeyxiexzf.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f3757Ujhhgtgfeyxiexzf.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(this.f3758Ujhhgtgfeyxiexzf) - this.f3757Ujhhgtgfeyxiexzf.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f3757Ujhhgtgfeyxiexzf.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(this.f3758Ujhhgtgfeyxiexzf) - this.f3757Ujhhgtgfeyxiexzf.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f3757Ujhhgtgfeyxiexzf.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f3757Ujhhgtgfeyxiexzf.set(obj);
    }
}
