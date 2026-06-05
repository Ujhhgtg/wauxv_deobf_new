package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3723feyxiexzfUjhhgtg;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C1180feyxiexzfUjhhgtg;
import p000.C1900feyxiexzfUjhhgtg;
import p000.C2956feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC3723feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C1900feyxiexzfUjhhgtg f631Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f632Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f633Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f634Ujhhgtgfeyxiexzf = 2;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f635Ujhhgtgfeyxiexzf = 0.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f636Ujhhgtgfeyxiexzf = 0.5f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C1180feyxiexzfUjhhgtg f637Ujhhgtgfeyxiexzf = new C1180feyxiexzfUjhhgtg(this);

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public boolean mo761Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM69Ujhhgtgfeyxiexzf = this.f632Ujhhgtgfeyxiexzf;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM69Ujhhgtgfeyxiexzf = coordinatorLayout.m69Ujhhgtgfeyxiexzf(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f632Ujhhgtgfeyxiexzf = zM69Ujhhgtgfeyxiexzf;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f632Ujhhgtgfeyxiexzf = false;
        }
        if (zM69Ujhhgtgfeyxiexzf) {
            if (this.f631Ujhhgtgfeyxiexzf == null) {
                this.f631Ujhhgtgfeyxiexzf = new C1900feyxiexzfUjhhgtg(coordinatorLayout.getContext(), coordinatorLayout, this.f637Ujhhgtgfeyxiexzf);
            }
            if (!this.f633Ujhhgtgfeyxiexzf && this.f631Ujhhgtgfeyxiexzf.m3253Ujhhgtgfeyxiexzf(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo762Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, 1048576);
            AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
            if (mo777Ujhhgtgfeyxiexzf(view)) {
                AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9259Ujhhgtgfeyxiexzf, new C0709Ujhhgtgfeyxiexzf(this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final boolean mo770Ujhhgtgfeyxiexzf(View view, MotionEvent motionEvent) {
        if (this.f631Ujhhgtgfeyxiexzf == null) {
            return false;
        }
        if (this.f633Ujhhgtgfeyxiexzf && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f631Ujhhgtgfeyxiexzf.m3247Ujhhgtgfeyxiexzf(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo777Ujhhgtgfeyxiexzf(View view) {
        return true;
    }
}
