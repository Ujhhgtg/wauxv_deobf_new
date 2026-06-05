package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2408Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f7806Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f7807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f7808Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f7809Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f7810Ujhhgtgfeyxiexzf;

    public C2408Ujhhgtgfeyxiexzf(int i) {
        this.f7806Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7807Ujhhgtgfeyxiexzf < this.f7806Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM2536Ujhhgtgfeyxiexzf;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7807Ujhhgtgfeyxiexzf;
        switch (this.f7809Ujhhgtgfeyxiexzf) {
            case 0:
                objM2536Ujhhgtgfeyxiexzf = ((C2412Ujhhgtgfeyxiexzf) this.f7810Ujhhgtgfeyxiexzf).m2536Ujhhgtgfeyxiexzf(i);
                break;
            case 1:
                objM2536Ujhhgtgfeyxiexzf = ((C2412Ujhhgtgfeyxiexzf) this.f7810Ujhhgtgfeyxiexzf).m2540Ujhhgtgfeyxiexzf(i);
                break;
            default:
                objM2536Ujhhgtgfeyxiexzf = ((C2392Ujhhgtgfeyxiexzf) this.f7810Ujhhgtgfeyxiexzf).f7777Ujhhgtgfeyxiexzf[i];
                break;
        }
        this.f7807Ujhhgtgfeyxiexzf++;
        this.f7808Ujhhgtgfeyxiexzf = true;
        return objM2536Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7808Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f7807Ujhhgtgfeyxiexzf - 1;
        this.f7807Ujhhgtgfeyxiexzf = i;
        switch (this.f7809Ujhhgtgfeyxiexzf) {
            case 0:
                ((C2412Ujhhgtgfeyxiexzf) this.f7810Ujhhgtgfeyxiexzf).mo2538Ujhhgtgfeyxiexzf(i);
                break;
            case 1:
                ((C2412Ujhhgtgfeyxiexzf) this.f7810Ujhhgtgfeyxiexzf).mo2538Ujhhgtgfeyxiexzf(i);
                break;
            default:
                ((C2392Ujhhgtgfeyxiexzf) this.f7810Ujhhgtgfeyxiexzf).m3655Ujhhgtgfeyxiexzf(i);
                break;
        }
        this.f7806Ujhhgtgfeyxiexzf--;
        this.f7808Ujhhgtgfeyxiexzf = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2408Ujhhgtgfeyxiexzf(C2392Ujhhgtgfeyxiexzf c2392Ujhhgtgfeyxiexzf) {
        this(c2392Ujhhgtgfeyxiexzf.f7778Ujhhgtgfeyxiexzf);
        this.f7809Ujhhgtgfeyxiexzf = 2;
        this.f7810Ujhhgtgfeyxiexzf = c2392Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2408Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf, int i) {
        this(c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf);
        this.f7809Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                this.f7810Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
                this(c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf);
                break;
            default:
                this.f7810Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
                break;
        }
    }
}
