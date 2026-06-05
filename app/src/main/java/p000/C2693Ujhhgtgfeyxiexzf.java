package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2693Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8590Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f8591Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f8592Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f8593Ujhhgtgfeyxiexzf;

    public C2693Ujhhgtgfeyxiexzf(char c, int i) {
        this.f8590Ujhhgtgfeyxiexzf = i;
        this.f8591Ujhhgtgfeyxiexzf = c;
        boolean z = false;
        if (i <= 0 ? C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(1, c) >= 0 : C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(1, c) <= 0) {
            z = true;
        }
        this.f8592Ujhhgtgfeyxiexzf = z;
        this.f8593Ujhhgtgfeyxiexzf = z ? (char) 1 : c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8592Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8593Ujhhgtgfeyxiexzf;
        if (i != this.f8591Ujhhgtgfeyxiexzf) {
            this.f8593Ujhhgtgfeyxiexzf = this.f8590Ujhhgtgfeyxiexzf + i;
        } else {
            if (!this.f8592Ujhhgtgfeyxiexzf) {
                throw new NoSuchElementException();
            }
            this.f8592Ujhhgtgfeyxiexzf = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
