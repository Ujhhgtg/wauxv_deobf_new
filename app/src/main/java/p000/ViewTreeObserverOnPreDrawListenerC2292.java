package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2292 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    public final View f7385;

    public ViewTreeObserver f7386;

    public final Runnable f7387;

    public ViewTreeObserverOnPreDrawListenerC2292(View view, Runnable runnable) {
        this.f7385 = view;
        this.f7386 = view.getViewTreeObserver();
        this.f7387 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f7386.isAlive();
        View view = this.f7385;
        if (zIsAlive) {
            this.f7386.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f7387.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7386 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f7386.isAlive();
        View view2 = this.f7385;
        if (zIsAlive) {
            this.f7386.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
