package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2677Ujhhgtgfeyxiexzf extends AbstractC1747feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static final String[] f8549feyxiexzfUjhhgtg = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f8550feyxiexzfUjhhgtg = new C2700Ujhhgtgfeyxiexzf(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f8551feyxiexzfUjhhgtg = new C2700Ujhhgtgfeyxiexzf(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f8552feyxiexzfUjhhgtg = new C2700Ujhhgtgfeyxiexzf(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f8553feyxiexzfUjhhgtg = new C2700Ujhhgtgfeyxiexzf(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f8554feyxiexzfUjhhgtg = new C2700Ujhhgtgfeyxiexzf(PointF.class, "position", 4);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static void m4024feyxiexzfUjhhgtg(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        HashMap map = c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3015Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        m4024feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3018Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        m4024feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final Animator mo3022Ujhhgtgfeyxiexzf(ViewGroup viewGroup, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg2) {
        int i;
        C2677Ujhhgtgfeyxiexzf c2677Ujhhgtgfeyxiexzf;
        Animator animatorM2846Ujhhgtgfeyxiexzf;
        if (c1787feyxiexzfUjhhgtg != null) {
            HashMap map = c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf;
            if (c1787feyxiexzfUjhhgtg2 != null) {
                HashMap map2 = c1787feyxiexzfUjhhgtg2.f6028Ujhhgtgfeyxiexzf;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c1787feyxiexzfUjhhgtg2.f6029Ujhhgtgfeyxiexzf;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        AbstractC2306Ujhhgtgfeyxiexzf.m3510Ujhhgtgfeyxiexzf(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c2677Ujhhgtgfeyxiexzf = this;
                            if (i2 == i3 && i4 == i5) {
                                c2677Ujhhgtgfeyxiexzf.f5880Ujhhgtgfeyxiexzf.getClass();
                                animatorM2846Ujhhgtgfeyxiexzf = AbstractC1280feyxiexzfUjhhgtg.m2846Ujhhgtgfeyxiexzf(view, f8552feyxiexzfUjhhgtg, C0420Ujhhgtgfeyxiexzf.m1733Ujhhgtgfeyxiexzf(i6, i8, i7, i9));
                            } else {
                                c2677Ujhhgtgfeyxiexzf.f5880Ujhhgtgfeyxiexzf.getClass();
                                animatorM2846Ujhhgtgfeyxiexzf = AbstractC1280feyxiexzfUjhhgtg.m2846Ujhhgtgfeyxiexzf(view, f8553feyxiexzfUjhhgtg, C0420Ujhhgtgfeyxiexzf.m1733Ujhhgtgfeyxiexzf(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c2677Ujhhgtgfeyxiexzf = this;
                            c2677Ujhhgtgfeyxiexzf.f5880Ujhhgtgfeyxiexzf.getClass();
                            animatorM2846Ujhhgtgfeyxiexzf = AbstractC1280feyxiexzfUjhhgtg.m2846Ujhhgtgfeyxiexzf(view, f8554feyxiexzfUjhhgtg, C0420Ujhhgtgfeyxiexzf.m1733Ujhhgtgfeyxiexzf(i2, i4, i3, i5));
                        } else {
                            c2677Ujhhgtgfeyxiexzf = this;
                            C2678Ujhhgtgfeyxiexzf c2678Ujhhgtgfeyxiexzf = new C2678Ujhhgtgfeyxiexzf(view);
                            c2677Ujhhgtgfeyxiexzf.f5880Ujhhgtgfeyxiexzf.getClass();
                            ObjectAnimator objectAnimatorM2846Ujhhgtgfeyxiexzf = AbstractC1280feyxiexzfUjhhgtg.m2846Ujhhgtgfeyxiexzf(c2678Ujhhgtgfeyxiexzf, f8550feyxiexzfUjhhgtg, C0420Ujhhgtgfeyxiexzf.m1733Ujhhgtgfeyxiexzf(i2, i4, i3, i5));
                            c2677Ujhhgtgfeyxiexzf.f5880Ujhhgtgfeyxiexzf.getClass();
                            ObjectAnimator objectAnimatorM2846Ujhhgtgfeyxiexzf2 = AbstractC1280feyxiexzfUjhhgtg.m2846Ujhhgtgfeyxiexzf(c2678Ujhhgtgfeyxiexzf, f8551feyxiexzfUjhhgtg, C0420Ujhhgtgfeyxiexzf.m1733Ujhhgtgfeyxiexzf(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM2846Ujhhgtgfeyxiexzf, objectAnimatorM2846Ujhhgtgfeyxiexzf2);
                            animatorSet.addListener(new C2681Ujhhgtgfeyxiexzf(c2678Ujhhgtgfeyxiexzf));
                            animatorM2846Ujhhgtgfeyxiexzf = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC1252feyxiexzfUjhhgtg.m2790Ujhhgtgfeyxiexzf(viewGroup4, true);
                            c2677Ujhhgtgfeyxiexzf.m3026Ujhhgtgfeyxiexzf().m3014Ujhhgtgfeyxiexzf(new C2682Ujhhgtgfeyxiexzf(viewGroup4));
                        }
                        return animatorM2846Ujhhgtgfeyxiexzf;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final String[] mo3027Ujhhgtgfeyxiexzf() {
        return f8549feyxiexzfUjhhgtg;
    }
}
