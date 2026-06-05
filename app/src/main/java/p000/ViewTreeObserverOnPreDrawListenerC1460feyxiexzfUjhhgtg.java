package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛱUjhhgtgᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final View f5076Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ViewTreeObserver f5077Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Runnable f5078Ujhhgtgfeyxiexzf;

    public ViewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg(View view, Runnable runnable) {
        this.f5076Ujhhgtgfeyxiexzf = view;
        this.f5077Ujhhgtgfeyxiexzf = view.getViewTreeObserver();
        this.f5078Ujhhgtgfeyxiexzf = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f5077Ujhhgtgfeyxiexzf.isAlive();
        View view = this.f5076Ujhhgtgfeyxiexzf;
        if (zIsAlive) {
            this.f5077Ujhhgtgfeyxiexzf.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f5078Ujhhgtgfeyxiexzf.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5077Ujhhgtgfeyxiexzf = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f5077Ujhhgtgfeyxiexzf.isAlive();
        View view2 = this.f5076Ujhhgtgfeyxiexzf;
        if (zIsAlive) {
            this.f5077Ujhhgtgfeyxiexzf.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
