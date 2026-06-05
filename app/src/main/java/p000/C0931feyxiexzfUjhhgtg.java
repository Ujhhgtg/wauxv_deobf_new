package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0931feyxiexzfUjhhgtg extends AbstractC0939feyxiexzfUjhhgtg implements Iterator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0930feyxiexzfUjhhgtg f3764Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f3765Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0938feyxiexzfUjhhgtg f3766Ujhhgtgfeyxiexzf;

    public C0931feyxiexzfUjhhgtg(C0938feyxiexzfUjhhgtg c0938feyxiexzfUjhhgtg) {
        this.f3766Ujhhgtgfeyxiexzf = c0938feyxiexzfUjhhgtg;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3765Ujhhgtgfeyxiexzf) {
            return this.f3766Ujhhgtgfeyxiexzf.f3779Ujhhgtgfeyxiexzf != null;
        }
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = this.f3764Ujhhgtgfeyxiexzf;
        return (c0930feyxiexzfUjhhgtg == null || c0930feyxiexzfUjhhgtg.f3762Ujhhgtgfeyxiexzf == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3765Ujhhgtgfeyxiexzf) {
            this.f3765Ujhhgtgfeyxiexzf = false;
            this.f3764Ujhhgtgfeyxiexzf = this.f3766Ujhhgtgfeyxiexzf.f3779Ujhhgtgfeyxiexzf;
        } else {
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = this.f3764Ujhhgtgfeyxiexzf;
            this.f3764Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg != null ? c0930feyxiexzfUjhhgtg.f3762Ujhhgtgfeyxiexzf : null;
        }
        return this.f3764Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0939feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo2429Ujhhgtgfeyxiexzf(C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg) {
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg2 = this.f3764Ujhhgtgfeyxiexzf;
        if (c0930feyxiexzfUjhhgtg == c0930feyxiexzfUjhhgtg2) {
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg3 = c0930feyxiexzfUjhhgtg2.f3763Ujhhgtgfeyxiexzf;
            this.f3764Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg3;
            this.f3765Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg3 == null;
        }
    }
}
