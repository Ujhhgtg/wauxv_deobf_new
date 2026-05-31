package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class PopMenuListView extends ListView {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f1032;

    public PopMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1032 = -1.0f;
    }

    public float getMaxHeight() {
        return this.f1032;
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
        float f = this.f1032;
        if (f <= size && f > -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf(f).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
