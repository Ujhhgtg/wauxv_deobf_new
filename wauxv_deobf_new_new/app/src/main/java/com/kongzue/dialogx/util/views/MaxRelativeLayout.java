package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import p000.AbstractC1037;
import p000.AbstractC1469;
import p000.AbstractC2522;
import p000.C1952;
import p000.InterfaceC1041;
import p000.InterfaceC1953;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends RelativeLayout implements InterfaceC1041 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f1021 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1023;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f1024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f1025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f1026;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f1027;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f1028;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1029;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public View.OnTouchListener f1030;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f1031;

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1028 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2522.f8025);
            this.f1022 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f1023 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f1024 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f1025 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f1026 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f1027 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f1024;
        this.f1024 = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f1025;
        this.f1025 = i2 == 0 ? getMinimumHeight() : i2;
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new C1952());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f1030;
        if (onTouchListener != null) {
            this.f1031 = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p000.InterfaceC1041
    public int getDialogXSafetyMode() {
        return this.f1027;
    }

    public InterfaceC1953 getOnYChanged() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1029 != 0) {
            AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1031;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f1028 == -1 && size2 != 0) {
            this.f1028 = size2;
        }
        if (this.f1026) {
            this.f1022 = Math.min(this.f1022, Math.min(size2, this.f1028));
        }
        int i3 = this.f1023;
        if (size > i3 && i3 != 0) {
            size = getPaddingBottom() + i3 + getPaddingTop();
        }
        int i4 = this.f1022;
        if (size2 > i4 && i4 != 0) {
            size2 = getPaddingLeft() + i4 + getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f1025 = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f1024 = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f1029 = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f1030 = onTouchListener;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }

    public void setContentView(View view) {
    }
}
