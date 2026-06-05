package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲᛴ能不能要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1035feyxiexzfUjhhgtg implements InterfaceC1436feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0272Ujhhgtgfeyxiexzf f4047Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f4048Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Bitmap.Config f4049Ujhhgtgfeyxiexzf;

    public C1035feyxiexzfUjhhgtg(C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf) {
        this.f4047Ujhhgtgfeyxiexzf = c0272Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1035feyxiexzfUjhhgtg) {
            C1035feyxiexzfUjhhgtg c1035feyxiexzfUjhhgtg = (C1035feyxiexzfUjhhgtg) obj;
            if (this.f4048Ujhhgtgfeyxiexzf == c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf && AbstractC1860Ujhhgtgfeyxiexzf.m3193Ujhhgtgfeyxiexzf(this.f4049Ujhhgtgfeyxiexzf, c1035feyxiexzfUjhhgtg.f4049Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4048Ujhhgtgfeyxiexzf * 31;
        Bitmap.Config config = this.f4049Ujhhgtgfeyxiexzf;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C1034feyxiexzfUjhhgtg.m2526Ujhhgtgfeyxiexzf(this.f4048Ujhhgtgfeyxiexzf, this.f4049Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1436feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1477Ujhhgtgfeyxiexzf() {
        this.f4047Ujhhgtgfeyxiexzf.m3694Ujhhgtgfeyxiexzf(this);
    }
}
