package p000;

import android.animation.ValueAnimator;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲ能不能ᛱfeyxiexzfᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3080Ujhhgtgfeyxiexzf implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9521Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3081Ujhhgtgfeyxiexzf f9522Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3080Ujhhgtgfeyxiexzf(C3081Ujhhgtgfeyxiexzf c3081Ujhhgtgfeyxiexzf, int i) {
        this.f9521Ujhhgtgfeyxiexzf = i;
        this.f9522Ujhhgtgfeyxiexzf = c3081Ujhhgtgfeyxiexzf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9521Ujhhgtgfeyxiexzf) {
            case 0:
                ((DialogXBaseRelativeLayout) ((C3639Ujhhgtgfeyxiexzf) this.f9522Ujhhgtgfeyxiexzf.f9524Ujhhgtgfeyxiexzf).f11369Ujhhgtgfeyxiexzf).m908Ujhhgtgfeyxiexzf(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((DialogXBaseRelativeLayout) ((C3639Ujhhgtgfeyxiexzf) this.f9522Ujhhgtgfeyxiexzf.f9524Ujhhgtgfeyxiexzf).f11369Ujhhgtgfeyxiexzf).m908Ujhhgtgfeyxiexzf(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
