package com.kongzue.dialogx.util.views;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import p000.C0152;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class ActivityScreenShotImageView extends ImageView {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f992;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f993;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f994;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f995;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f996;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f997;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f995 = false;
        setLayerType(2, null);
    }

    private ViewGroup getDecorView() {
        Activity activityM1295 = C0152.m1295();
        if (activityM1295 != null) {
            return (ViewGroup) activityM1295.getWindow().getDecorView();
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
        if (!this.f995) {
            super.onDraw(canvas);
        }
        float f = this.f992;
        float f2 = this.f994;
        if (f >= f2 && this.f993 > f2) {
            Path path = new Path();
            path.moveTo(this.f994, 0.0f);
            path.lineTo(this.f992 - this.f994, 0.0f);
            float f3 = this.f992;
            path.quadTo(f3, 0.0f, f3, this.f994);
            path.lineTo(this.f992, this.f993 - this.f994);
            float f4 = this.f992;
            float f5 = this.f993;
            path.quadTo(f4, f5, f4 - this.f994, f5);
            path.lineTo(this.f994, this.f993);
            float f6 = this.f993;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f994);
            path.lineTo(0.0f, this.f994);
            path.quadTo(0.0f, 0.0f, this.f994, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f992 != getWidth() || this.f993 != getHeight()) {
            m906();
        }
        this.f992 = getWidth();
        this.f993 = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m906();
    }

    public void setRadius(float f) {
        this.f994 = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f995 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m906() {
        if (isAttachedToWindow()) {
            if (this.f996 == getMeasuredWidth() && this.f997 == getMeasuredHeight()) {
                return;
            }
            this.f996 = getMeasuredWidth();
            this.f997 = getMeasuredHeight();
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
