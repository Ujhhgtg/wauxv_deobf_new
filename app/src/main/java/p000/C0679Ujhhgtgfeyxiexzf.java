package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛴᛱfeyxiexzfᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0679Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f2801Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2802Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f2803Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f2804Ujhhgtgfeyxiexzf;

    public C0679Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        this.f2801Ujhhgtgfeyxiexzf = i3;
        this.f2802Ujhhgtgfeyxiexzf = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f2803Ujhhgtgfeyxiexzf = z;
        this.f2804Ujhhgtgfeyxiexzf = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2803Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f2804Ujhhgtgfeyxiexzf;
        if (i != this.f2802Ujhhgtgfeyxiexzf) {
            this.f2804Ujhhgtgfeyxiexzf = this.f2801Ujhhgtgfeyxiexzf + i;
            return i;
        }
        if (!this.f2803Ujhhgtgfeyxiexzf) {
            throw new NoSuchElementException();
        }
        this.f2803Ujhhgtgfeyxiexzf = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
