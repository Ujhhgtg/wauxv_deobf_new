package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲ能不能ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0689Ujhhgtgfeyxiexzf extends AbstractC2684Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final View f2822Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f2823Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f2824Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int[] f2825Ujhhgtgfeyxiexzf;

    public C0689Ujhhgtgfeyxiexzf(View view) {
        super(0);
        this.f2825Ujhhgtgfeyxiexzf = new int[2];
        this.f2822Ujhhgtgfeyxiexzf = view;
    }

    @Override // p000.AbstractC2684Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final void mo1959feyxiexzfUjhhgtg() {
        this.f2822Ujhhgtgfeyxiexzf.setTranslationY(0.0f);
    }

    @Override // p000.AbstractC2684Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void mo1960feyxiexzfUjhhgtg() {
        View view = this.f2822Ujhhgtgfeyxiexzf;
        int[] iArr = this.f2825Ujhhgtgfeyxiexzf;
        view.getLocationOnScreen(iArr);
        this.f2823Ujhhgtgfeyxiexzf = iArr[1];
    }

    @Override // p000.AbstractC2684Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final C2256feyxiexzfUjhhgtg mo1961feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg = (C2234feyxiexzfUjhhgtg) it.next();
            if ((c2234feyxiexzfUjhhgtg.f7273Ujhhgtgfeyxiexzf.mo3399Ujhhgtgfeyxiexzf() & 8) != 0) {
                this.f2822Ujhhgtgfeyxiexzf.setTranslationY(AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf(this.f2824Ujhhgtgfeyxiexzf, 0, c2234feyxiexzfUjhhgtg.f7273Ujhhgtgfeyxiexzf.mo3398Ujhhgtgfeyxiexzf()));
                break;
            }
        }
        return c2256feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2684Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final C2073feyxiexzfUjhhgtg mo1962feyxiexzfUjhhgtg(C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg) {
        View view = this.f2822Ujhhgtgfeyxiexzf;
        int[] iArr = this.f2825Ujhhgtgfeyxiexzf;
        view.getLocationOnScreen(iArr);
        int i = this.f2823Ujhhgtgfeyxiexzf - iArr[1];
        this.f2824Ujhhgtgfeyxiexzf = i;
        view.setTranslationY(i);
        return c2073feyxiexzfUjhhgtg;
    }
}
