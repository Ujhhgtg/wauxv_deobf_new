package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛴ能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0707Ujhhgtgfeyxiexzf extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f2914Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0708Ujhhgtgfeyxiexzf f2915Ujhhgtgfeyxiexzf;

    public C0707Ujhhgtgfeyxiexzf(C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf) {
        this.f2915Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM2006Ujhhgtgfeyxiexzf;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg;
        C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf = this.f2915Ujhhgtgfeyxiexzf;
        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf.f2928Ujhhgtgfeyxiexzf;
        if (!this.f2914Ujhhgtgfeyxiexzf || (viewM2006Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf.m2006Ujhhgtgfeyxiexzf(motionEvent)) == null || (abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.m232feyxiexzfUjhhgtg(viewM2006Ujhhgtgfeyxiexzf)) == null) {
            return;
        }
        if ((AbstractC0699Ujhhgtgfeyxiexzf.m1980Ujhhgtgfeyxiexzf(abstractC0699Ujhhgtgfeyxiexzf.mo1987Ujhhgtgfeyxiexzf(), c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c0708Ujhhgtgfeyxiexzf.f2927Ujhhgtgfeyxiexzf;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c0708Ujhhgtgfeyxiexzf.f2919Ujhhgtgfeyxiexzf = x;
                c0708Ujhhgtgfeyxiexzf.f2920Ujhhgtgfeyxiexzf = y;
                c0708Ujhhgtgfeyxiexzf.f2924Ujhhgtgfeyxiexzf = 0.0f;
                c0708Ujhhgtgfeyxiexzf.f2923Ujhhgtgfeyxiexzf = 0.0f;
                abstractC0699Ujhhgtgfeyxiexzf.getClass();
                c0708Ujhhgtgfeyxiexzf.m2010Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg, 2);
            }
        }
    }
}
