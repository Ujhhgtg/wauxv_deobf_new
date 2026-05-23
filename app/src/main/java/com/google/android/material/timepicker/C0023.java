package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import me.hd.wauxv.R;
import p000.C0078;
import p000.C0085;
import p000.C0091;
import p000.C0092;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0023 extends C0078 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f897;

    public C0023(ClockFaceView clockFaceView) {
        this.f897 = clockFaceView;
    }

    @Override // p000.C0078
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo722(View view, C0092 c0092) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        this.f1024.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f897.f869.get(iIntValue - 1));
        }
        c0092.m1096(C0091.m1085(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c0092.m1089(C0085.f1027);
    }

    @Override // p000.C0078
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean mo723(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo723(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f897;
        view.getHitRect(clockFaceView.f866);
        float fCenterX = clockFaceView.f866.centerX();
        float fCenterY = clockFaceView.f866.centerY();
        clockFaceView.f865.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f865.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
