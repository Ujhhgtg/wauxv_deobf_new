package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2234feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public AbstractC2235feyxiexzfUjhhgtg f7273Ujhhgtgfeyxiexzf;

    public C2234feyxiexzfUjhhgtg(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7273Ujhhgtgfeyxiexzf = new C2232feyxiexzfUjhhgtg(AbstractC2955feyxiexzfUjhhgtg.m4384Ujhhgtgfeyxiexzf(i, interpolator, j));
        } else {
            this.f7273Ujhhgtgfeyxiexzf = new C2237feyxiexzfUjhhgtg(i, interpolator, j);
        }
    }
}
