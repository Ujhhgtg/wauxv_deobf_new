package p000;

import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸ᛲᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0085Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public AbstractC3387feyxiexzfUjhhgtg f1160Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f1161Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f1162Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f1163Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f1164Ujhhgtgfeyxiexzf;

    public C0085Ujhhgtgfeyxiexzf() {
        m1135Ujhhgtgfeyxiexzf();
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1161Ujhhgtgfeyxiexzf + ", mCoordinate=" + this.f1162Ujhhgtgfeyxiexzf + ", mLayoutFromEnd=" + this.f1163Ujhhgtgfeyxiexzf + ", mValid=" + this.f1164Ujhhgtgfeyxiexzf + '}';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1132Ujhhgtgfeyxiexzf() {
        this.f1162Ujhhgtgfeyxiexzf = this.f1163Ujhhgtgfeyxiexzf ? this.f1160Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() : this.f1160Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1133Ujhhgtgfeyxiexzf(View view, int i) {
        if (this.f1163Ujhhgtgfeyxiexzf) {
            int iMo2974Ujhhgtgfeyxiexzf = this.f1160Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view);
            AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f1160Ujhhgtgfeyxiexzf;
            this.f1162Ujhhgtgfeyxiexzf = (Integer.MIN_VALUE == abstractC3387feyxiexzfUjhhgtg.f10586Ujhhgtgfeyxiexzf ? 0 : abstractC3387feyxiexzfUjhhgtg.mo2984Ujhhgtgfeyxiexzf() - abstractC3387feyxiexzfUjhhgtg.f10586Ujhhgtgfeyxiexzf) + iMo2974Ujhhgtgfeyxiexzf;
        } else {
            this.f1162Ujhhgtgfeyxiexzf = this.f1160Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view);
        }
        this.f1161Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1134Ujhhgtgfeyxiexzf(View view, int i) {
        AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f1160Ujhhgtgfeyxiexzf;
        int iMo2984Ujhhgtgfeyxiexzf = Integer.MIN_VALUE == abstractC3387feyxiexzfUjhhgtg.f10586Ujhhgtgfeyxiexzf ? 0 : abstractC3387feyxiexzfUjhhgtg.mo2984Ujhhgtgfeyxiexzf() - abstractC3387feyxiexzfUjhhgtg.f10586Ujhhgtgfeyxiexzf;
        if (iMo2984Ujhhgtgfeyxiexzf >= 0) {
            m1133Ujhhgtgfeyxiexzf(view, i);
            return;
        }
        this.f1161Ujhhgtgfeyxiexzf = i;
        if (!this.f1163Ujhhgtgfeyxiexzf) {
            int iMo2977Ujhhgtgfeyxiexzf = this.f1160Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view);
            int iMo2983Ujhhgtgfeyxiexzf = iMo2977Ujhhgtgfeyxiexzf - this.f1160Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
            this.f1162Ujhhgtgfeyxiexzf = iMo2977Ujhhgtgfeyxiexzf;
            if (iMo2983Ujhhgtgfeyxiexzf > 0) {
                int iMo2979Ujhhgtgfeyxiexzf = (this.f1160Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - Math.min(0, (this.f1160Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - iMo2984Ujhhgtgfeyxiexzf) - this.f1160Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view))) - (this.f1160Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + iMo2977Ujhhgtgfeyxiexzf);
                if (iMo2979Ujhhgtgfeyxiexzf < 0) {
                    this.f1162Ujhhgtgfeyxiexzf -= Math.min(iMo2983Ujhhgtgfeyxiexzf, -iMo2979Ujhhgtgfeyxiexzf);
                    return;
                }
                return;
            }
            return;
        }
        int iMo2979Ujhhgtgfeyxiexzf2 = (this.f1160Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - iMo2984Ujhhgtgfeyxiexzf) - this.f1160Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view);
        this.f1162Ujhhgtgfeyxiexzf = this.f1160Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - iMo2979Ujhhgtgfeyxiexzf2;
        if (iMo2979Ujhhgtgfeyxiexzf2 > 0) {
            int iMo2975Ujhhgtgfeyxiexzf = this.f1162Ujhhgtgfeyxiexzf - this.f1160Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
            int iMo2983Ujhhgtgfeyxiexzf2 = this.f1160Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
            int iMin = iMo2975Ujhhgtgfeyxiexzf - (Math.min(this.f1160Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view) - iMo2983Ujhhgtgfeyxiexzf2, 0) + iMo2983Ujhhgtgfeyxiexzf2);
            if (iMin < 0) {
                this.f1162Ujhhgtgfeyxiexzf = Math.min(iMo2979Ujhhgtgfeyxiexzf2, -iMin) + this.f1162Ujhhgtgfeyxiexzf;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1135Ujhhgtgfeyxiexzf() {
        this.f1161Ujhhgtgfeyxiexzf = -1;
        this.f1162Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f1163Ujhhgtgfeyxiexzf = false;
        this.f1164Ujhhgtgfeyxiexzf = false;
    }
}
