package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2563Ujhhgtgfeyxiexzf implements ListIterator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f8305Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f8306Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C2566Ujhhgtgfeyxiexzf f8307Ujhhgtgfeyxiexzf;

    public C2563Ujhhgtgfeyxiexzf(C2566Ujhhgtgfeyxiexzf c2566Ujhhgtgfeyxiexzf, ListIterator listIterator) {
        this.f8307Ujhhgtgfeyxiexzf = c2566Ujhhgtgfeyxiexzf;
        this.f8306Ujhhgtgfeyxiexzf = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f8305Ujhhgtgfeyxiexzf;
        C2566Ujhhgtgfeyxiexzf c2566Ujhhgtgfeyxiexzf = this.f8307Ujhhgtgfeyxiexzf;
        c2566Ujhhgtgfeyxiexzf.add(i, obj);
        this.f8306Ujhhgtgfeyxiexzf.add((Integer) c2566Ujhhgtgfeyxiexzf.f8311Ujhhgtgfeyxiexzf.get(this.f8305Ujhhgtgfeyxiexzf));
        this.f8305Ujhhgtgfeyxiexzf = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8306Ujhhgtgfeyxiexzf.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8306Ujhhgtgfeyxiexzf.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f8306Ujhhgtgfeyxiexzf;
        listIterator.next();
        int iPreviousIndex = listIterator.previousIndex();
        this.f8305Ujhhgtgfeyxiexzf = iPreviousIndex;
        return this.f8307Ujhhgtgfeyxiexzf.get(iPreviousIndex);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8306Ujhhgtgfeyxiexzf.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f8306Ujhhgtgfeyxiexzf;
        listIterator.previous();
        int iNextIndex = listIterator.nextIndex();
        this.f8305Ujhhgtgfeyxiexzf = iNextIndex;
        return this.f8307Ujhhgtgfeyxiexzf.get(iNextIndex);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8306Ujhhgtgfeyxiexzf.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f8307Ujhhgtgfeyxiexzf.remove(this.f8305Ujhhgtgfeyxiexzf);
        this.f8306Ujhhgtgfeyxiexzf.remove();
        this.f8305Ujhhgtgfeyxiexzf = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f8307Ujhhgtgfeyxiexzf.set(this.f8305Ujhhgtgfeyxiexzf, obj);
    }
}
