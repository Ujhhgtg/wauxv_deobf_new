package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0039Ujhhgtgfeyxiexzf implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f976Ujhhgtgfeyxiexzf;

    public ViewTreeObserverOnPreDrawListenerC0039Ujhhgtgfeyxiexzf(ClockFaceView clockFaceView) {
        this.f976Ujhhgtgfeyxiexzf = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f976Ujhhgtgfeyxiexzf;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f945Ujhhgtgfeyxiexzf.f963Ujhhgtgfeyxiexzf) - clockFaceView.f953feyxiexzfUjhhgtg;
        if (height != clockFaceView.f3156Ujhhgtgfeyxiexzf) {
            clockFaceView.f3156Ujhhgtgfeyxiexzf = height;
            clockFaceView.mo861Ujhhgtgfeyxiexzf();
            ClockHandView clockHandView = clockFaceView.f945Ujhhgtgfeyxiexzf;
            clockHandView.f971Ujhhgtgfeyxiexzf = clockFaceView.f3156Ujhhgtgfeyxiexzf;
            clockHandView.invalidate();
        }
        return true;
    }
}
