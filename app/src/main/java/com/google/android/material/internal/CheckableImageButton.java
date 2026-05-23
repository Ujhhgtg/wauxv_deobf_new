package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.AbstractC3578;
import p000.C0220;
import p000.C0684;
import p000.C0685;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0220 implements Checkable {

    public static final int[] f723 = {16842912};

    public boolean f724;

    public boolean f725;

    public boolean f726;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.imageButtonStyle);
        this.f725 = true;
        this.f726 = true;
        AbstractC3578.m5177(this, new C0684(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f724;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f724 ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f723) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0685)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0685 c0685 = (C0685) parcelable;
        super.onRestoreInstanceState(c0685.f986);
        setChecked(c0685.f2569);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0685 c0685 = new C0685(super.onSaveInstanceState());
        c0685.f2569 = this.f724;
        return c0685;
    }

    public void setCheckable(boolean z) {
        if (this.f725 != z) {
            this.f725 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f725 || this.f724 == z) {
            return;
        }
        this.f724 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f726 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f726) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f724);
    }
}
