package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ要点脸能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0929feyxiexzfUjhhgtg extends AbstractC2935Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f3759Ujhhgtgfeyxiexzf;

    public C0929feyxiexzfUjhhgtg(List list) {
        this.f3759Ujhhgtgfeyxiexzf = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f3759Ujhhgtgfeyxiexzf.add(AbstractC2856feyxiexzfUjhhgtg.m4236feyxiexzfUjhhgtg(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f3759Ujhhgtgfeyxiexzf.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f3759Ujhhgtgfeyxiexzf.get(AbstractC2856feyxiexzfUjhhgtg.m4235feyxiexzfUjhhgtg(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0928feyxiexzfUjhhgtg(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C0928feyxiexzfUjhhgtg(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f3759Ujhhgtgfeyxiexzf.set(AbstractC2856feyxiexzfUjhhgtg.m4235feyxiexzfUjhhgtg(this, i), obj);
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1142Ujhhgtgfeyxiexzf() {
        return this.f3759Ujhhgtgfeyxiexzf.size();
    }

    @Override // p000.AbstractC2935Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1143Ujhhgtgfeyxiexzf(int i) {
        return this.f3759Ujhhgtgfeyxiexzf.remove(AbstractC2856feyxiexzfUjhhgtg.m4235feyxiexzfUjhhgtg(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0928feyxiexzfUjhhgtg(this, i);
    }
}
