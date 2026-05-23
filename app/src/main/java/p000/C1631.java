package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1631 extends AnimatorListenerAdapter {

    public final /* synthetic */ int f5510;

    public final /* synthetic */ TextView f5511;

    public final /* synthetic */ int f5512;

    public final /* synthetic */ TextView f5513;

    public final /* synthetic */ C1633 f5514;

    public C1631(C1633 c1633, int i, TextView textView, int i2, TextView textView2) {
        this.f5514 = c1633;
        this.f5510 = i;
        this.f5511 = textView;
        this.f5512 = i2;
        this.f5513 = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0236 c0236;
        int i = this.f5510;
        C1633 c1633 = this.f5514;
        c1633.f5529 = i;
        c1633.f5527 = null;
        TextView textView = this.f5511;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f5512 == 1 && (c0236 = c1633.f5533) != null) {
                c0236.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f5513;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f5513;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
