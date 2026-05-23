package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0587 extends AbstractC3436 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final String[] f2383 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static final C0583 f2384 = new C0583(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final C0583 f2385 = new C0583(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final C0583 f2386 = new C0583(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final C0583 f2387 = new C0583(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static final C0583 f2388 = new C0583(PointF.class, "position", 4);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static void m2015(C3444 c3444) {
        View view = c3444.f10855;
        HashMap map = c3444.f10854;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1409(C3444 c3444) {
        m2015(c3444);
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo1411(C3444 c3444) {
        m2015(c3444);
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Animator mo2016(ViewGroup viewGroup, C3444 c3444, C3444 c3445) {
        int i;
        C0587 c0587;
        Animator animatorM4149;
        if (c3444 != null) {
            HashMap map = c3444.f10854;
            if (c3445 != null) {
                HashMap map2 = c3445.f10854;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c3445.f10855;
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
                        AbstractC3595.m5204(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c0587 = this;
                            if (i2 == i3 && i4 == i5) {
                                c0587.f10841.getClass();
                                animatorM4149 = AbstractC2243.m4149(view, f2386, C2102.m3895(i6, i8, i7, i9));
                            } else {
                                c0587.f10841.getClass();
                                animatorM4149 = AbstractC2243.m4149(view, f2387, C2102.m3895(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c0587 = this;
                            c0587.f10841.getClass();
                            animatorM4149 = AbstractC2243.m4149(view, f2388, C2102.m3895(i2, i4, i3, i5));
                        } else {
                            c0587 = this;
                            C0586 c0586 = new C0586(view);
                            c0587.f10841.getClass();
                            ObjectAnimator objectAnimatorM4149 = AbstractC2243.m4149(c0586, f2384, C2102.m3895(i2, i4, i3, i5));
                            c0587.f10841.getClass();
                            ObjectAnimator objectAnimatorM41410 = AbstractC2243.m4149(c0586, f2385, C2102.m3895(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM4149, objectAnimatorM41410);
                            animatorSet.addListener(new C0584(c0586));
                            animatorM4149 = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC1270.m2995(viewGroup4, true);
                            c0587.m4953().m4947(new C0585(viewGroup4));
                        }
                        return animatorM4149;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final String[] mo2017() {
        return f2383;
    }
}
