package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p000.AbstractC0798feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaxLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f1030Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f1031Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1032Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f1033Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f1034Ujhhgtgfeyxiexzf;

    public MaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1034Ujhhgtgfeyxiexzf = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0798feyxiexzfUjhhgtg.f3115Ujhhgtgfeyxiexzf);
            this.f1030Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f1031Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f1032Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f1033Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f1032Ujhhgtgfeyxiexzf;
        this.f1032Ujhhgtgfeyxiexzf = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f1033Ujhhgtgfeyxiexzf;
        this.f1033Ujhhgtgfeyxiexzf = i2 == 0 ? getMinimumHeight() : i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f1034Ujhhgtgfeyxiexzf == -1 && size2 != 0) {
            this.f1034Ujhhgtgfeyxiexzf = size2;
        }
        int i3 = this.f1031Ujhhgtgfeyxiexzf;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.f1030Ujhhgtgfeyxiexzf;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f1033Ujhhgtgfeyxiexzf = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f1032Ujhhgtgfeyxiexzf = i;
        super.setMinimumWidth(i);
    }
}
