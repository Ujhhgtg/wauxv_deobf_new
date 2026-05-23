package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.AbstractC2467;
import p000.AbstractC3578;
import p000.AbstractC3588;
import p000.AbstractC3681;
import p000.C0864;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC3588 {

    public final int f550;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void m629(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p000.AbstractC0861
    public boolean mo631(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C0864) view2.getLayoutParams()).f3277 instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f550;
            int iM5318 = bottom - (i == 0 ? 0 : AbstractC3681.m5318((int) (0.0f * i), 0, i));
            Field field = AbstractC3578.f11184;
            view.offsetTopAndBottom(iM5318);
        }
        return false;
    }

    @Override // p000.AbstractC0861
    public final boolean mo621(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m629(coordinatorLayout.m66(view));
        return false;
    }

    @Override // p000.AbstractC0861
    public final void mo632(CoordinatorLayout coordinatorLayout, View view) {
        m629(coordinatorLayout.m66(view));
    }

    @Override // p000.AbstractC3588
    public final void mo633(CoordinatorLayout coordinatorLayout, View view, int i) {
        m629(coordinatorLayout.m66(view));
        coordinatorLayout.m71(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7861);
        this.f550 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.AbstractC0861
    public final void mo630(View view) {
    }
}
