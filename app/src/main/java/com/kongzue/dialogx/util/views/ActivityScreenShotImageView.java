package com.kongzue.dialogx.util.views;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import p000.C0144;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class ActivityScreenShotImageView extends ImageView {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f926;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f927;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f928;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f931;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f929 = false;
        setLayerType(2, null);
    }

    private ViewGroup getDecorView() {
        Activity activityM1149 = C0144.m1149();
        if (activityM1149 != null) {
            return (ViewGroup) activityM1149.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentViewVisibility(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.f929) {
            super.onDraw(canvas);
        }
        float f = this.f926;
        float f2 = this.f928;
        if (f >= f2 && this.f927 > f2) {
            Path path = new Path();
            path.moveTo(this.f928, 0.0f);
            path.lineTo(this.f926 - this.f928, 0.0f);
            float f3 = this.f926;
            path.quadTo(f3, 0.0f, f3, this.f928);
            path.lineTo(this.f926, this.f927 - this.f928);
            float f4 = this.f926;
            float f5 = this.f927;
            path.quadTo(f4, f5, f4 - this.f928, f5);
            path.lineTo(this.f928, this.f927);
            float f6 = this.f927;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f928);
            path.lineTo(0.0f, this.f928);
            path.quadTo(0.0f, 0.0f, this.f928, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f926 != getWidth() || this.f927 != getHeight()) {
            m762();
        }
        this.f926 = getWidth();
        this.f927 = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m762();
    }

    public void setRadius(float f) {
        this.f928 = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f929 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m762() {
        if (isAttachedToWindow()) {
            if (this.f930 == getMeasuredWidth() && this.f931 == getMeasuredHeight()) {
                return;
            }
            this.f930 = getMeasuredWidth();
            this.f931 = getMeasuredHeight();
            ViewGroup decorView = getDecorView();
            if (decorView == null) {
                return;
            }
            if (decorView.getWidth() != 0 && decorView.getHeight() != 0) {
                throw null;
            }
            setVisibility(0);
        }
    }

    public void setContentViewVisibility(boolean z) {
    }
}
