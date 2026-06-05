package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛲᛱfeyxiexzfᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0698Ujhhgtgfeyxiexzf implements InterfaceC0832feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0708Ujhhgtgfeyxiexzf f2869Ujhhgtgfeyxiexzf;

    public C0698Ujhhgtgfeyxiexzf(C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf) {
        this.f2869Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0832feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo1977Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf = this.f2869Ujhhgtgfeyxiexzf;
        RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = c0708Ujhhgtgfeyxiexzf.f2934Ujhhgtgfeyxiexzf;
        c0708Ujhhgtgfeyxiexzf.f2939Ujhhgtgfeyxiexzf.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c0708Ujhhgtgfeyxiexzf.f2935Ujhhgtgfeyxiexzf;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf);
        if (iFindPointerIndex >= 0) {
            c0708Ujhhgtgfeyxiexzf.m2003Ujhhgtgfeyxiexzf(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf;
        if (abstractC0821feyxiexzfUjhhgtg == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c0708Ujhhgtgfeyxiexzf.m2011Ujhhgtgfeyxiexzf(c0708Ujhhgtgfeyxiexzf.f2930Ujhhgtgfeyxiexzf, iFindPointerIndex, motionEvent);
                    c0708Ujhhgtgfeyxiexzf.m2008Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
                    c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
                    runnableC3012feyxiexzfUjhhgtg.run();
                    c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf) {
                    c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c0708Ujhhgtgfeyxiexzf.m2011Ujhhgtgfeyxiexzf(c0708Ujhhgtgfeyxiexzf.f2930Ujhhgtgfeyxiexzf, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c0708Ujhhgtgfeyxiexzf.f2935Ujhhgtgfeyxiexzf;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c0708Ujhhgtgfeyxiexzf.m2010Ujhhgtgfeyxiexzf(null, 0);
        c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf = -1;
    }

    @Override // p000.InterfaceC0832feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean mo1978Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf = this.f2869Ujhhgtgfeyxiexzf;
        c0708Ujhhgtgfeyxiexzf.f2939Ujhhgtgfeyxiexzf.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = null;
        if (actionMasked == 0) {
            c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf = motionEvent.getPointerId(0);
            c0708Ujhhgtgfeyxiexzf.f2919Ujhhgtgfeyxiexzf = motionEvent.getX();
            c0708Ujhhgtgfeyxiexzf.f2920Ujhhgtgfeyxiexzf = motionEvent.getY();
            VelocityTracker velocityTracker = c0708Ujhhgtgfeyxiexzf.f2935Ujhhgtgfeyxiexzf;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c0708Ujhhgtgfeyxiexzf.f2935Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
            if (c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf == null) {
                ArrayList arrayList = c0708Ujhhgtgfeyxiexzf.f2931Ujhhgtgfeyxiexzf;
                if (!arrayList.isEmpty()) {
                    View viewM2006Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf.m2006Ujhhgtgfeyxiexzf(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf2 = (C0697Ujhhgtgfeyxiexzf) arrayList.get(size);
                        if (c0697Ujhhgtgfeyxiexzf2.f2857Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf == viewM2006Ujhhgtgfeyxiexzf) {
                            c0697Ujhhgtgfeyxiexzf = c0697Ujhhgtgfeyxiexzf2;
                            break;
                        }
                    }
                }
                if (c0697Ujhhgtgfeyxiexzf != null) {
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf;
                    c0708Ujhhgtgfeyxiexzf.f2919Ujhhgtgfeyxiexzf -= c0697Ujhhgtgfeyxiexzf.f2861Ujhhgtgfeyxiexzf;
                    c0708Ujhhgtgfeyxiexzf.f2920Ujhhgtgfeyxiexzf -= c0697Ujhhgtgfeyxiexzf.f2862Ujhhgtgfeyxiexzf;
                    c0708Ujhhgtgfeyxiexzf.m2005Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, true);
                    if (c0708Ujhhgtgfeyxiexzf.f2916Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf)) {
                        c0708Ujhhgtgfeyxiexzf.f2928Ujhhgtgfeyxiexzf.mo1986Ujhhgtgfeyxiexzf(c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf, abstractC0821feyxiexzfUjhhgtg);
                    }
                    c0708Ujhhgtgfeyxiexzf.m2010Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, c0697Ujhhgtgfeyxiexzf.f2858Ujhhgtgfeyxiexzf);
                    c0708Ujhhgtgfeyxiexzf.m2011Ujhhgtgfeyxiexzf(c0708Ujhhgtgfeyxiexzf.f2930Ujhhgtgfeyxiexzf, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf = -1;
            c0708Ujhhgtgfeyxiexzf.m2010Ujhhgtgfeyxiexzf(null, 0);
        } else {
            int i = c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c0708Ujhhgtgfeyxiexzf.m2003Ujhhgtgfeyxiexzf(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c0708Ujhhgtgfeyxiexzf.f2935Ujhhgtgfeyxiexzf;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf != null;
    }

    @Override // p000.InterfaceC0832feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo1979Ujhhgtgfeyxiexzf(boolean z) {
        if (z) {
            this.f2869Ujhhgtgfeyxiexzf.m2010Ujhhgtgfeyxiexzf(null, 0);
        }
    }
}
