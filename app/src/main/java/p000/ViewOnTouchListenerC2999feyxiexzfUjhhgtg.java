package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2999feyxiexzfUjhhgtg implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f9312Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f9313Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f9314Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final View f9315Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public RunnableC3533Ujhhgtgfeyxiexzf f9316Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public RunnableC3533Ujhhgtgfeyxiexzf f9317Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f9318Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f9319Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int[] f9320Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f9321Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ View f9322Ujhhgtgfeyxiexzf;

    public ViewOnTouchListenerC2999feyxiexzfUjhhgtg(View view) {
        this.f9320Ujhhgtgfeyxiexzf = new int[2];
        this.f9315Ujhhgtgfeyxiexzf = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9312Ujhhgtgfeyxiexzf = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9313Ujhhgtgfeyxiexzf = tapTimeout;
        this.f9314Ujhhgtgfeyxiexzf = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf;
        boolean z2;
        AbstractC0365Ujhhgtgfeyxiexzf abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf;
        AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg;
        boolean z3 = this.f9318Ujhhgtgfeyxiexzf;
        View view2 = this.f9315Ujhhgtgfeyxiexzf;
        if (z3) {
            AbstractC0365Ujhhgtgfeyxiexzf abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf2 = m4454Ujhhgtgfeyxiexzf();
            if (abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf2 == null || !abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf2.mo1415Ujhhgtgfeyxiexzf() || (abstractC3231feyxiexzfUjhhgtg = (AbstractC3231feyxiexzfUjhhgtg) abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf2.mo1417Ujhhgtgfeyxiexzf()) == null || !abstractC3231feyxiexzfUjhhgtg.isShown()) {
                switch (this.f9321Ujhhgtgfeyxiexzf) {
                    case 1:
                        c3007Ujhhgtgfeyxiexzf = ((C3004feyxiexzfUjhhgtg) this.f9322Ujhhgtgfeyxiexzf).f9329Ujhhgtgfeyxiexzf;
                        if (c3007Ujhhgtgfeyxiexzf.f9351Ujhhgtgfeyxiexzf != null) {
                            c3007Ujhhgtgfeyxiexzf.m4457Ujhhgtgfeyxiexzf();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        break;
                    default:
                        abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf = m4454Ujhhgtgfeyxiexzf();
                        if (abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf != null && abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf.mo1415Ujhhgtgfeyxiexzf()) {
                            abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf.dismiss();
                        }
                        z2 = true;
                        break;
                }
                if (z2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f9320Ujhhgtgfeyxiexzf;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC3231feyxiexzfUjhhgtg.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM4738Ujhhgtgfeyxiexzf = abstractC3231feyxiexzfUjhhgtg.m4738Ujhhgtgfeyxiexzf(motionEventObtainNoHistory, this.f9319Ujhhgtgfeyxiexzf);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM4738Ujhhgtgfeyxiexzf && z4) {
                    z = true;
                } else {
                    switch (this.f9321Ujhhgtgfeyxiexzf) {
                        case 1:
                            c3007Ujhhgtgfeyxiexzf = ((C3004feyxiexzfUjhhgtg) this.f9322Ujhhgtgfeyxiexzf).f9329Ujhhgtgfeyxiexzf;
                            if (c3007Ujhhgtgfeyxiexzf.f9351Ujhhgtgfeyxiexzf != null) {
                                c3007Ujhhgtgfeyxiexzf.m4457Ujhhgtgfeyxiexzf();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            break;
                        default:
                            abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf = m4454Ujhhgtgfeyxiexzf();
                            if (abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf != null) {
                                abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf.dismiss();
                            }
                            z2 = true;
                            break;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f9319Ujhhgtgfeyxiexzf = motionEvent.getPointerId(0);
                    if (this.f9316Ujhhgtgfeyxiexzf == null) {
                        this.f9316Ujhhgtgfeyxiexzf = new RunnableC3533Ujhhgtgfeyxiexzf(this, 0);
                    }
                    view2.postDelayed(this.f9316Ujhhgtgfeyxiexzf, this.f9313Ujhhgtgfeyxiexzf);
                    if (this.f9317Ujhhgtgfeyxiexzf == null) {
                        this.f9317Ujhhgtgfeyxiexzf = new RunnableC3533Ujhhgtgfeyxiexzf(this, 1);
                    }
                    view2.postDelayed(this.f9317Ujhhgtgfeyxiexzf, this.f9314Ujhhgtgfeyxiexzf);
                } else if (actionMasked2 == 1) {
                    m4453Ujhhgtgfeyxiexzf();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f9319Ujhhgtgfeyxiexzf);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f9312Ujhhgtgfeyxiexzf;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m4453Ujhhgtgfeyxiexzf();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = m4455Ujhhgtgfeyxiexzf();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m4453Ujhhgtgfeyxiexzf();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f9318Ujhhgtgfeyxiexzf = z;
        return z || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9318Ujhhgtgfeyxiexzf = false;
        this.f9319Ujhhgtgfeyxiexzf = -1;
        RunnableC3533Ujhhgtgfeyxiexzf runnableC3533Ujhhgtgfeyxiexzf = this.f9316Ujhhgtgfeyxiexzf;
        if (runnableC3533Ujhhgtgfeyxiexzf != null) {
            this.f9315Ujhhgtgfeyxiexzf.removeCallbacks(runnableC3533Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4453Ujhhgtgfeyxiexzf() {
        RunnableC3533Ujhhgtgfeyxiexzf runnableC3533Ujhhgtgfeyxiexzf = this.f9317Ujhhgtgfeyxiexzf;
        View view = this.f9315Ujhhgtgfeyxiexzf;
        if (runnableC3533Ujhhgtgfeyxiexzf != null) {
            view.removeCallbacks(runnableC3533Ujhhgtgfeyxiexzf);
        }
        RunnableC3533Ujhhgtgfeyxiexzf runnableC3533Ujhhgtgfeyxiexzf2 = this.f9316Ujhhgtgfeyxiexzf;
        if (runnableC3533Ujhhgtgfeyxiexzf2 != null) {
            view.removeCallbacks(runnableC3533Ujhhgtgfeyxiexzf2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AbstractC0365Ujhhgtgfeyxiexzf m4454Ujhhgtgfeyxiexzf() {
        C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf;
        switch (this.f9321Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC3000feyxiexzfUjhhgtg abstractC3000feyxiexzfUjhhgtg = ((ActionMenuItemView) this.f9322Ujhhgtgfeyxiexzf).f7Ujhhgtgfeyxiexzf;
                if (abstractC3000feyxiexzfUjhhgtg == null || (c3001Ujhhgtgfeyxiexzf = ((C3002Ujhhgtgfeyxiexzf) abstractC3000feyxiexzfUjhhgtg).f9325Ujhhgtgfeyxiexzf.f9350Ujhhgtgfeyxiexzf) == null) {
                    return null;
                }
                return c3001Ujhhgtgfeyxiexzf.m1575Ujhhgtgfeyxiexzf();
            default:
                C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf2 = ((C3004feyxiexzfUjhhgtg) this.f9322Ujhhgtgfeyxiexzf).f9329Ujhhgtgfeyxiexzf.f9349Ujhhgtgfeyxiexzf;
                if (c3001Ujhhgtgfeyxiexzf2 == null) {
                    return null;
                }
                return c3001Ujhhgtgfeyxiexzf2.m1575Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean m4455Ujhhgtgfeyxiexzf() {
        AbstractC0365Ujhhgtgfeyxiexzf abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf;
        switch (this.f9321Ujhhgtgfeyxiexzf) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f9322Ujhhgtgfeyxiexzf;
                InterfaceC0356Ujhhgtgfeyxiexzf interfaceC0356Ujhhgtgfeyxiexzf = actionMenuItemView.f5Ujhhgtgfeyxiexzf;
                return interfaceC0356Ujhhgtgfeyxiexzf != null && interfaceC0356Ujhhgtgfeyxiexzf.mo6Ujhhgtgfeyxiexzf(actionMenuItemView.f2Ujhhgtgfeyxiexzf) && (abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf = m4454Ujhhgtgfeyxiexzf()) != null && abstractC0365UjhhgtgfeyxiexzfM4454Ujhhgtgfeyxiexzf.mo1415Ujhhgtgfeyxiexzf();
            default:
                ((C3004feyxiexzfUjhhgtg) this.f9322Ujhhgtgfeyxiexzf).f9329Ujhhgtgfeyxiexzf.m4458Ujhhgtgfeyxiexzf();
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC2999feyxiexzfUjhhgtg(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f9321Ujhhgtgfeyxiexzf = 0;
        this.f9322Ujhhgtgfeyxiexzf = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC2999feyxiexzfUjhhgtg(C3004feyxiexzfUjhhgtg c3004feyxiexzfUjhhgtg, C3004feyxiexzfUjhhgtg c3004feyxiexzfUjhhgtg2) {
        this(c3004feyxiexzfUjhhgtg2);
        this.f9321Ujhhgtgfeyxiexzf = 1;
        this.f9322Ujhhgtgfeyxiexzf = c3004feyxiexzfUjhhgtg;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
