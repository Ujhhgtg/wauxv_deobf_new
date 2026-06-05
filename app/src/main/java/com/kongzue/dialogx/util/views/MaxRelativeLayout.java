package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import p000.AbstractC0798feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3177feyxiexzfUjhhgtg;
import p000.C0230Ujhhgtgfeyxiexzf;
import p000.InterfaceC0229Ujhhgtgfeyxiexzf;
import p000.InterfaceC3161feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends RelativeLayout implements InterfaceC3161feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ int f1035Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f1036Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1037Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1038Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f1039Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean f1040Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f1041Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f1042Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1043Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public View.OnTouchListener f1044Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1045Ujhhgtgfeyxiexzf;

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1042Ujhhgtgfeyxiexzf = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0798feyxiexzfUjhhgtg.f3115Ujhhgtgfeyxiexzf);
            this.f1036Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f1037Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f1038Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f1039Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f1040Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f1041Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f1038Ujhhgtgfeyxiexzf;
        this.f1038Ujhhgtgfeyxiexzf = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f1039Ujhhgtgfeyxiexzf;
        this.f1039Ujhhgtgfeyxiexzf = i2 == 0 ? getMinimumHeight() : i2;
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new C0230Ujhhgtgfeyxiexzf());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f1044Ujhhgtgfeyxiexzf;
        if (onTouchListener != null) {
            this.f1045Ujhhgtgfeyxiexzf = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p000.InterfaceC3161feyxiexzfUjhhgtg
    public int getDialogXSafetyMode() {
        return this.f1041Ujhhgtgfeyxiexzf;
    }

    public InterfaceC0229Ujhhgtgfeyxiexzf getOnYChanged() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1043Ujhhgtgfeyxiexzf != 0) {
            AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1045Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f1042Ujhhgtgfeyxiexzf == -1 && size2 != 0) {
            this.f1042Ujhhgtgfeyxiexzf = size2;
        }
        if (this.f1040Ujhhgtgfeyxiexzf) {
            this.f1036Ujhhgtgfeyxiexzf = Math.min(this.f1036Ujhhgtgfeyxiexzf, Math.min(size2, this.f1042Ujhhgtgfeyxiexzf));
        }
        int i3 = this.f1037Ujhhgtgfeyxiexzf;
        if (size > i3 && i3 != 0) {
            size = getPaddingBottom() + i3 + getPaddingTop();
        }
        int i4 = this.f1036Ujhhgtgfeyxiexzf;
        if (size2 > i4 && i4 != 0) {
            size2 = getPaddingLeft() + i4 + getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f1039Ujhhgtgfeyxiexzf = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f1038Ujhhgtgfeyxiexzf = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f1043Ujhhgtgfeyxiexzf = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f1044Ujhhgtgfeyxiexzf = onTouchListener;
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
