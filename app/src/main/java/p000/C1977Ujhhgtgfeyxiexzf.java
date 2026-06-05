package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛴᛳ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1977Ujhhgtgfeyxiexzf extends AbstractC1747feyxiexzfUjhhgtg {
    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3015Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        if (view instanceof TextView) {
            c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3018Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        if (view instanceof TextView) {
            c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final Animator mo3022Ujhhgtgfeyxiexzf(ViewGroup viewGroup, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg2) {
        if (c1787feyxiexzfUjhhgtg == null || c1787feyxiexzfUjhhgtg2 == null || !(c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf instanceof TextView)) {
            return null;
        }
        View view = c1787feyxiexzfUjhhgtg2.f6029Ujhhgtgfeyxiexzf;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf;
        HashMap map2 = c1787feyxiexzfUjhhgtg2.f6028Ujhhgtgfeyxiexzf;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C2478feyxiexzfUjhhgtg(6, textView));
        return valueAnimatorOfFloat;
    }
}
