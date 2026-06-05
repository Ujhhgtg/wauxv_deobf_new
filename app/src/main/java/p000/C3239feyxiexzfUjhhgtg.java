package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛲ能不能ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3239feyxiexzfUjhhgtg implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10154Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Iterator f10155Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10156Ujhhgtgfeyxiexzf;

    public C3239feyxiexzfUjhhgtg(Iterator it) {
        this.f10155Ujhhgtgfeyxiexzf = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f10154Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                return this.f10155Ujhhgtgfeyxiexzf.hasNext();
        }
        while (true) {
            int i = this.f10156Ujhhgtgfeyxiexzf;
            it = this.f10155Ujhhgtgfeyxiexzf;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f10156Ujhhgtgfeyxiexzf--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f10154Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                int i = this.f10156Ujhhgtgfeyxiexzf;
                this.f10156Ujhhgtgfeyxiexzf = i + 1;
                if (i >= 0) {
                    return new C0643Ujhhgtgfeyxiexzf(i, this.f10155Ujhhgtgfeyxiexzf.next());
                }
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
        }
        while (true) {
            int i2 = this.f10156Ujhhgtgfeyxiexzf;
            it = this.f10155Ujhhgtgfeyxiexzf;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f10156Ujhhgtgfeyxiexzf--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10154Ujhhgtgfeyxiexzf) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3239feyxiexzfUjhhgtg(C3240feyxiexzfUjhhgtg c3240feyxiexzfUjhhgtg) {
        this.f10155Ujhhgtgfeyxiexzf = c3240feyxiexzfUjhhgtg.f10157Ujhhgtgfeyxiexzf.iterator();
        this.f10156Ujhhgtgfeyxiexzf = c3240feyxiexzfUjhhgtg.f10158Ujhhgtgfeyxiexzf;
    }
}
