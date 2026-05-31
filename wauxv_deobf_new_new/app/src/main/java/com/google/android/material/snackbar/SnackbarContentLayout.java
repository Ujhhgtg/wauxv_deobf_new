package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import me.hd.wauxv.R;
import p000.AbstractC0172;
import p000.AbstractC3638;
import p000.AbstractC3744;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public TextView f846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Button f847;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f848;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3744.m5342(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1254);
    }

    public Button getActionView() {
        return this.f847;
    }

    public TextView getMessageView() {
        return this.f846;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f846 = (TextView) findViewById(R.id.snackbar_text);
        this.f847 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f846.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f848 <= 0 || this.f847.getMeasuredWidth() <= this.f848) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m835(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m835(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f848 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m835(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f846.getPaddingTop() == i2 && this.f846.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f846;
        Field field = AbstractC3638.f11333;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
