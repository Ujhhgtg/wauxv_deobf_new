package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2912 extends AbstractC3436 {
    @Override // p000.AbstractC3436
    public final void mo1409(C3444 c3444) {
        View view = c3444.f10855;
        if (view instanceof TextView) {
            c3444.f10854.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p000.AbstractC3436
    public final void mo1411(C3444 c3444) {
        View view = c3444.f10855;
        if (view instanceof TextView) {
            c3444.f10854.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p000.AbstractC3436
    public final Animator mo2016(ViewGroup viewGroup, C3444 c3444, C3444 c3445) {
        if (c3444 == null || c3445 == null || !(c3444.f10855 instanceof TextView)) {
            return null;
        }
        View view = c3445.f10855;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = c3444.f10854;
        HashMap map2 = c3445.f10854;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C0385(6, textView));
        return valueAnimatorOfFloat;
    }
}
