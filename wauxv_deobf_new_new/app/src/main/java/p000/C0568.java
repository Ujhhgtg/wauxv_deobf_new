package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0568 extends AbstractC3493 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final String[] f2349 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final C0564 f2350 = new C0564(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static final C0564 f2351 = new C0564(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final C0564 f2352 = new C0564(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final C0564 f2353 = new C0564(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final C0564 f2354 = new C0564(PointF.class, "position", 4);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static void m2112(C3501 c3501) {
        View view = c3501.f11015;
        HashMap map = c3501.f11014;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1555(C3501 c3501) {
        m2112(c3501);
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo1557(C3501 c3501) {
        m2112(c3501);
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Animator mo2113(ViewGroup viewGroup, C3501 c3501, C3501 c3502) {
        int i;
        C0568 c0568;
        Animator animatorM4278;
        if (c3501 != null) {
            HashMap map = c3501.f11014;
            if (c3502 != null) {
                HashMap map2 = c3502.f11014;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c3502.f11015;
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
                        AbstractC3655.m5210(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c0568 = this;
                            if (i2 == i3 && i4 == i5) {
                                c0568.f11001.getClass();
                                animatorM4278 = AbstractC2274.m4278(view, f2352, C2135.m4078(i6, i8, i7, i9));
                            } else {
                                c0568.f11001.getClass();
                                animatorM4278 = AbstractC2274.m4278(view, f2353, C2135.m4078(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c0568 = this;
                            c0568.f11001.getClass();
                            animatorM4278 = AbstractC2274.m4278(view, f2354, C2135.m4078(i2, i4, i3, i5));
                        } else {
                            c0568 = this;
                            C0567 c0567 = new C0567(view);
                            c0568.f11001.getClass();
                            ObjectAnimator objectAnimatorM4278 = AbstractC2274.m4278(c0567, f2350, C2135.m4078(i2, i4, i3, i5));
                            c0568.f11001.getClass();
                            ObjectAnimator objectAnimatorM4279 = AbstractC2274.m4278(c0567, f2351, C2135.m4078(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM4278, objectAnimatorM4279);
                            animatorSet.addListener(new C0565(c0567));
                            animatorM4278 = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC1469.m3351(viewGroup4, true);
                            c0568.m5015().m5009(new C0566(viewGroup4));
                        }
                        return animatorM4278;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final String[] mo2114() {
        return f2349;
    }
}
