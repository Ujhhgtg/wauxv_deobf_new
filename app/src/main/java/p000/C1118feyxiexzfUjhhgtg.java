package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸能不能ᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1118feyxiexzfUjhhgtg implements Iterator, InterfaceC3704Ujhhgtgfeyxiexzf, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f4220Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f4221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Iterator f4222Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC3704Ujhhgtgfeyxiexzf f4223Ujhhgtgfeyxiexzf;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f4220Ujhhgtgfeyxiexzf;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m2587Ujhhgtgfeyxiexzf();
                }
                if (this.f4222Ujhhgtgfeyxiexzf.hasNext()) {
                    this.f4220Ujhhgtgfeyxiexzf = 2;
                    return true;
                }
                this.f4222Ujhhgtgfeyxiexzf = null;
            }
            this.f4220Ujhhgtgfeyxiexzf = 5;
            InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this.f4223Ujhhgtgfeyxiexzf;
            this.f4223Ujhhgtgfeyxiexzf = null;
            interfaceC3704Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4220Ujhhgtgfeyxiexzf;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f4220Ujhhgtgfeyxiexzf = 1;
            return this.f4222Ujhhgtgfeyxiexzf.next();
        }
        if (i != 3) {
            throw m2587Ujhhgtgfeyxiexzf();
        }
        this.f4220Ujhhgtgfeyxiexzf = 0;
        Object obj = this.f4221Ujhhgtgfeyxiexzf;
        this.f4221Ujhhgtgfeyxiexzf = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final RuntimeException m2587Ujhhgtgfeyxiexzf() {
        int i = this.f4220Ujhhgtgfeyxiexzf;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f4220Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3704Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo2588Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
        this.f4220Ujhhgtgfeyxiexzf = 4;
    }

    @Override // p000.InterfaceC3704Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final InterfaceC3739feyxiexzfUjhhgtg mo2414Ujhhgtgfeyxiexzf() {
        return C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf;
    }
}
