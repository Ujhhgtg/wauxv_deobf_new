package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p000.AbstractC2468;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaxLinearLayout extends LinearLayout {

    public final int f950;

    public final int f951;

    public int f952;

    public int f953;

    public int f954;

    public MaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f954 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2468.f7875);
            this.f950 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f951 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f952 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f953 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f952;
        this.f952 = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f953;
        this.f953 = i2 == 0 ? getMinimumHeight() : i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f954 == -1 && size2 != 0) {
            this.f954 = size2;
        }
        int i3 = this.f951;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.f950;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f953 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f952 = i;
        super.setMinimumWidth(i);
    }
}
