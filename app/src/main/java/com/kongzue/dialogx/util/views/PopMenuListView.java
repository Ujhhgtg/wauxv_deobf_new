package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class PopMenuListView extends ListView {

    public final float f966;

    public PopMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f966 = -1.0f;
    }

    public float getMaxHeight() {
        return this.f966;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        try {
            super.layoutChildren();
        } catch (IllegalStateException unused) {
            ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            super.layoutChildren();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        float size = View.MeasureSpec.getSize(i2);
        float f = this.f966;
        if (f <= size && f > -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf(f).intValue(), -2147483648);
        }
        super.onMeasure(i, i2);
    }
}
