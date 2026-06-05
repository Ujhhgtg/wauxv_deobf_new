package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import me.hd.wauxv.R;
import p000.C2949feyxiexzfUjhhgtg;
import p000.C2956feyxiexzfUjhhgtg;
import p000.C2962feyxiexzfUjhhgtg;
import p000.C2963feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: com.google.android.material.timepicker.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0040Ujhhgtgfeyxiexzf extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f977Ujhhgtgfeyxiexzf;

    public C0040Ujhhgtgfeyxiexzf(ClockFaceView clockFaceView) {
        this.f977Ujhhgtgfeyxiexzf = clockFaceView;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f977Ujhhgtgfeyxiexzf.f949feyxiexzfUjhhgtg.get(iIntValue - 1));
        }
        c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9254Ujhhgtgfeyxiexzf);
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean mo866Ujhhgtgfeyxiexzf(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo866Ujhhgtgfeyxiexzf(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f977Ujhhgtgfeyxiexzf;
        view.getHitRect(clockFaceView.f946Ujhhgtgfeyxiexzf);
        float fCenterX = clockFaceView.f946Ujhhgtgfeyxiexzf.centerX();
        float fCenterY = clockFaceView.f946Ujhhgtgfeyxiexzf.centerY();
        clockFaceView.f945Ujhhgtgfeyxiexzf.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f945Ujhhgtgfeyxiexzf.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
