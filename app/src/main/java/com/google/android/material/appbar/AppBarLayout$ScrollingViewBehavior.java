package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC2299feyxiexzfUjhhgtg;
import p000.AbstractC3611Ujhhgtgfeyxiexzf;
import p000.C3726feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC2299feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f616Ujhhgtgfeyxiexzf;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static void m771Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean mo773Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C3726feyxiexzfUjhhgtg) view2.getLayoutParams()).f11774Ujhhgtgfeyxiexzf instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f616Ujhhgtgfeyxiexzf;
            int iM5212Ujhhgtgfeyxiexzf = bottom - (i == 0 ? 0 : AbstractC3611Ujhhgtgfeyxiexzf.m5212Ujhhgtgfeyxiexzf((int) (0.0f * i), 0, i));
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            view.offsetTopAndBottom(iM5212Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo763Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m771Ujhhgtgfeyxiexzf(coordinatorLayout.m66Ujhhgtgfeyxiexzf(view));
        return false;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo774Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view) {
        m771Ujhhgtgfeyxiexzf(coordinatorLayout.m66Ujhhgtgfeyxiexzf(view));
    }

    @Override // p000.AbstractC2299feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo775Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        m771Ujhhgtgfeyxiexzf(coordinatorLayout.m66Ujhhgtgfeyxiexzf(view));
        coordinatorLayout.m71Ujhhgtgfeyxiexzf(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3142feyxiexzfUjhhgtg);
        this.f616Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo772Ujhhgtgfeyxiexzf(View view) {
    }
}
