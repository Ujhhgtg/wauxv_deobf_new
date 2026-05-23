package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3431 extends AnimatorListenerAdapter {

    public final /* synthetic */ int f10806 = 0;

    public final /* synthetic */ Object f10807;

    public final /* synthetic */ Object f10808;

    public C3431(C3647 c3647, View view) {
        this.f10807 = c3647;
        this.f10808 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (0) {
            case 0:
                ((C0264) this.f10807).remove(animator);
                ((AbstractC3436) this.f10808).f10833.remove(animator);
                break;
            default:
                C3647 c3647 = (C3647) this.f10807;
                c3647.f11416.mo5243(1.0f);
                C3643.m5233(c3647, (View) this.f10808);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (0) {
            case 0:
                ((AbstractC3436) this.f10808).f10833.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C3431(AbstractC3436 abstractC3436, C0264 c0264) {
        this.f10808 = abstractC3436;
        this.f10807 = c0264;
    }
}
