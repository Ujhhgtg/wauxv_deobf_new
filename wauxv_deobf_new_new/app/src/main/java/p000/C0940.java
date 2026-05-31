package p000;

import android.animation.ValueAnimator;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᲈᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0940 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0941 f3450;

    public /* synthetic */ C0940(C0941 c0941, int i) {
        this.f3449 = i;
        this.f3450 = c0941;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3449) {
            case 0:
                ((DialogXBaseRelativeLayout) ((C0776) this.f3450.f3452).f2879).m907(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((DialogXBaseRelativeLayout) ((C0776) this.f3450.f3452).f2879).m907(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
