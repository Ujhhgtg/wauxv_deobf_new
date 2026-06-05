package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3533Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11034Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC2999feyxiexzfUjhhgtg f11035Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3533Ujhhgtgfeyxiexzf(ViewOnTouchListenerC2999feyxiexzfUjhhgtg viewOnTouchListenerC2999feyxiexzfUjhhgtg, int i) {
        this.f11034Ujhhgtgfeyxiexzf = i;
        this.f11035Ujhhgtgfeyxiexzf = viewOnTouchListenerC2999feyxiexzfUjhhgtg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11034Ujhhgtgfeyxiexzf) {
            case 0:
                ViewParent parent = this.f11035Ujhhgtgfeyxiexzf.f9315Ujhhgtgfeyxiexzf.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ViewOnTouchListenerC2999feyxiexzfUjhhgtg viewOnTouchListenerC2999feyxiexzfUjhhgtg = this.f11035Ujhhgtgfeyxiexzf;
                viewOnTouchListenerC2999feyxiexzfUjhhgtg.m4453Ujhhgtgfeyxiexzf();
                View view = viewOnTouchListenerC2999feyxiexzfUjhhgtg.f9315Ujhhgtgfeyxiexzf;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC2999feyxiexzfUjhhgtg.m4455Ujhhgtgfeyxiexzf()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    viewOnTouchListenerC2999feyxiexzfUjhhgtg.f9318Ujhhgtgfeyxiexzf = true;
                    break;
                }
                break;
        }
    }
}
