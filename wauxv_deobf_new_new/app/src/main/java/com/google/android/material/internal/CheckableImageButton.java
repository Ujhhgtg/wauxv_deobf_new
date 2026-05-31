package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.AbstractC3638;
import p000.C0230;
import p000.C0675;
import p000.C0676;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0230 implements Checkable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final int[] f789 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f791;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f792;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.imageButtonStyle);
        this.f791 = true;
        this.f792 = true;
        AbstractC3638.m5183(this, new C0675(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f790;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f790 ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f789) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0676)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0676 c0676 = (C0676) parcelable;
        super.onRestoreInstanceState(c0676.f1051);
        setChecked(c0676.f2567);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0676 c0676 = new C0676(super.onSaveInstanceState());
        c0676.f2567 = this.f790;
        return c0676;
    }

    public void setCheckable(boolean z) {
        if (this.f791 != z) {
            this.f791 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f791 || this.f790 == z) {
            return;
        }
        this.f790 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f792 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f792) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f790);
    }
}
