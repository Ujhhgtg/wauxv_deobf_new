package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC2505feyxiexzfUjhhgtg;
import p000.C2466feyxiexzfUjhhgtg;
import p000.C2962feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f859Ujhhgtgfeyxiexzf;

    public BaseTransientBottomBar$Behavior() {
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = new C2466feyxiexzfUjhhgtg(1);
        this.f635Ujhhgtgfeyxiexzf = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f636Ujhhgtgfeyxiexzf = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f634Ujhhgtgfeyxiexzf = 0;
        this.f859Ujhhgtgfeyxiexzf = c2466feyxiexzfUjhhgtg;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo761Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f859Ujhhgtgfeyxiexzf.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C2962feyxiexzfUjhhgtg.f9269Ujhhgtgfeyxiexzf == null) {
                    C2962feyxiexzfUjhhgtg.f9269Ujhhgtgfeyxiexzf = new C2962feyxiexzfUjhhgtg(4);
                }
                synchronized (C2962feyxiexzfUjhhgtg.f9269Ujhhgtgfeyxiexzf.f9271Ujhhgtgfeyxiexzf) {
                }
            }
        } else if (coordinatorLayout.m69Ujhhgtgfeyxiexzf(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C2962feyxiexzfUjhhgtg.f9269Ujhhgtgfeyxiexzf == null) {
                C2962feyxiexzfUjhhgtg.f9269Ujhhgtgfeyxiexzf = new C2962feyxiexzfUjhhgtg(4);
            }
            synchronized (C2962feyxiexzfUjhhgtg.f9269Ujhhgtgfeyxiexzf.f9271Ujhhgtgfeyxiexzf) {
            }
        }
        return super.mo761Ujhhgtgfeyxiexzf(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final boolean mo777Ujhhgtgfeyxiexzf(View view) {
        this.f859Ujhhgtgfeyxiexzf.getClass();
        return view instanceof AbstractC2505feyxiexzfUjhhgtg;
    }
}
