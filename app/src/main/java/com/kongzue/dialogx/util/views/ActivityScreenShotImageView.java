package com.kongzue.dialogx.util.views;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import p000.C3015Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class ActivityScreenShotImageView extends ImageView {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f1006Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f1007Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f1008Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f1009Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f1010Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f1011Ujhhgtgfeyxiexzf;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1009Ujhhgtgfeyxiexzf = false;
        setLayerType(2, null);
    }

    private ViewGroup getDecorView() {
        Activity activityM4459Ujhhgtgfeyxiexzf = C3015Ujhhgtgfeyxiexzf.m4459Ujhhgtgfeyxiexzf();
        if (activityM4459Ujhhgtgfeyxiexzf != null) {
            return (ViewGroup) activityM4459Ujhhgtgfeyxiexzf.getWindow().getDecorView();
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
        if (!this.f1009Ujhhgtgfeyxiexzf) {
            super.onDraw(canvas);
        }
        float f = this.f1006Ujhhgtgfeyxiexzf;
        float f2 = this.f1008Ujhhgtgfeyxiexzf;
        if (f >= f2 && this.f1007Ujhhgtgfeyxiexzf > f2) {
            Path path = new Path();
            path.moveTo(this.f1008Ujhhgtgfeyxiexzf, 0.0f);
            path.lineTo(this.f1006Ujhhgtgfeyxiexzf - this.f1008Ujhhgtgfeyxiexzf, 0.0f);
            float f3 = this.f1006Ujhhgtgfeyxiexzf;
            path.quadTo(f3, 0.0f, f3, this.f1008Ujhhgtgfeyxiexzf);
            path.lineTo(this.f1006Ujhhgtgfeyxiexzf, this.f1007Ujhhgtgfeyxiexzf - this.f1008Ujhhgtgfeyxiexzf);
            float f4 = this.f1006Ujhhgtgfeyxiexzf;
            float f5 = this.f1007Ujhhgtgfeyxiexzf;
            path.quadTo(f4, f5, f4 - this.f1008Ujhhgtgfeyxiexzf, f5);
            path.lineTo(this.f1008Ujhhgtgfeyxiexzf, this.f1007Ujhhgtgfeyxiexzf);
            float f6 = this.f1007Ujhhgtgfeyxiexzf;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f1008Ujhhgtgfeyxiexzf);
            path.lineTo(0.0f, this.f1008Ujhhgtgfeyxiexzf);
            path.quadTo(0.0f, 0.0f, this.f1008Ujhhgtgfeyxiexzf, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1006Ujhhgtgfeyxiexzf != getWidth() || this.f1007Ujhhgtgfeyxiexzf != getHeight()) {
            m907Ujhhgtgfeyxiexzf();
        }
        this.f1006Ujhhgtgfeyxiexzf = getWidth();
        this.f1007Ujhhgtgfeyxiexzf = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m907Ujhhgtgfeyxiexzf();
    }

    public void setRadius(float f) {
        this.f1008Ujhhgtgfeyxiexzf = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f1009Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m907Ujhhgtgfeyxiexzf() {
        if (isAttachedToWindow()) {
            if (this.f1010Ujhhgtgfeyxiexzf == getMeasuredWidth() && this.f1011Ujhhgtgfeyxiexzf == getMeasuredHeight()) {
                return;
            }
            this.f1010Ujhhgtgfeyxiexzf = getMeasuredWidth();
            this.f1011Ujhhgtgfeyxiexzf = getMeasuredHeight();
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
