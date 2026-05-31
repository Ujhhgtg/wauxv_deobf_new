package p000;

import android.animation.ValueAnimator;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲁᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1823 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6066;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1830 f6067;

    public /* synthetic */ C1823(C1830 c1830, int i) {
        this.f6066 = i;
        this.f6067 = c1830;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6066) {
            case 0:
                C1830.m3722(this.f6067, valueAnimator);
                break;
            default:
                Object animatedValue = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Float";
                float fFloatValue = ((Float) animatedValue).floatValue();
                C1830 c1830 = this.f6067;
                c1830.f6092 = fFloatValue;
                c1830.m3731();
                break;
        }
    }
}
