package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3447Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Iterator f10727Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f10728Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f10729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3455feyxiexzfUjhhgtg f10730Ujhhgtgfeyxiexzf;

    public C3447Ujhhgtgfeyxiexzf(C3455feyxiexzfUjhhgtg c3455feyxiexzfUjhhgtg) {
        this.f10730Ujhhgtgfeyxiexzf = c3455feyxiexzfUjhhgtg;
        this.f10727Ujhhgtgfeyxiexzf = c3455feyxiexzfUjhhgtg.f10743Ujhhgtgfeyxiexzf.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10728Ujhhgtgfeyxiexzf == -1) {
            m4949Ujhhgtgfeyxiexzf();
        }
        return this.f10728Ujhhgtgfeyxiexzf == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10728Ujhhgtgfeyxiexzf == -1) {
            m4949Ujhhgtgfeyxiexzf();
        }
        if (this.f10728Ujhhgtgfeyxiexzf == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f10729Ujhhgtgfeyxiexzf;
        this.f10729Ujhhgtgfeyxiexzf = null;
        this.f10728Ujhhgtgfeyxiexzf = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4949Ujhhgtgfeyxiexzf() {
        Object next;
        boolean zBooleanValue;
        do {
            Iterator it = this.f10727Ujhhgtgfeyxiexzf;
            if (!it.hasNext()) {
                this.f10728Ujhhgtgfeyxiexzf = 0;
                return;
            }
            next = it.next();
            C3455feyxiexzfUjhhgtg c3455feyxiexzfUjhhgtg = this.f10730Ujhhgtgfeyxiexzf;
            zBooleanValue = ((Boolean) c3455feyxiexzfUjhhgtg.f10744Ujhhgtgfeyxiexzf.invoke(next)).booleanValue();
            c3455feyxiexzfUjhhgtg.getClass();
        } while (!zBooleanValue);
        this.f10729Ujhhgtgfeyxiexzf = next;
        this.f10728Ujhhgtgfeyxiexzf = 1;
    }
}
