package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0029 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f962;

    public ViewTreeObserverOnPreDrawListenerC0029(ClockFaceView clockFaceView) {
        this.f962 = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f962;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f931.f949) - clockFaceView.f939;
        if (height != clockFaceView.f8049) {
            clockFaceView.f8049 = height;
            clockFaceView.mo862();
            ClockHandView clockHandView = clockFaceView.f931;
            clockHandView.f957 = clockFaceView.f8049;
            clockHandView.invalidate();
        }
        return true;
    }
}
