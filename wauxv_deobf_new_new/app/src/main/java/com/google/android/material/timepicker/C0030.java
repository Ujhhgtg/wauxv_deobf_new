package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import me.hd.wauxv.R;
import p000.C0086;
import p000.C0093;
import p000.C0099;
import p000.C0100;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0030 extends C0086 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f963;

    public C0030(ClockFaceView clockFaceView) {
        this.f963 = clockFaceView;
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo866(View view, C0100 c0100) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
        this.f1092.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f963.f935.get(iIntValue - 1));
        }
        c0100.m1242(C0099.m1231(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c0100.m1235(C0093.f1095);
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean mo867(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo867(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f963;
        view.getHitRect(clockFaceView.f932);
        float fCenterX = clockFaceView.f932.centerX();
        float fCenterY = clockFaceView.f932.centerY();
        clockFaceView.f931.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f931.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
