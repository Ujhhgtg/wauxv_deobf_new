package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0022 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f896;

    public ViewTreeObserverOnPreDrawListenerC0022(ClockFaceView clockFaceView) {
        this.f896 = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f896;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f865.f883) - clockFaceView.f873;
        if (height != clockFaceView.f7900) {
            clockFaceView.f7900 = height;
            clockFaceView.mo718();
            ClockHandView clockHandView = clockFaceView.f865;
            clockHandView.f891 = clockFaceView.f7900;
            clockHandView.invalidate();
        }
        return true;
    }
}
