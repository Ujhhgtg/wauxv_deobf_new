package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.C2341Ujhhgtgfeyxiexzf;
import p000.C2913feyxiexzfUjhhgtg;
import p000.C2914feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C2341Ujhhgtgfeyxiexzf implements Checkable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final int[] f803Ujhhgtgfeyxiexzf = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f804Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f805Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f806Ujhhgtgfeyxiexzf;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.imageButtonStyle);
        this.f805Ujhhgtgfeyxiexzf = true;
        this.f806Ujhhgtgfeyxiexzf = true;
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, new C2913feyxiexzfUjhhgtg(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f804Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f804Ujhhgtgfeyxiexzf ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f803Ujhhgtgfeyxiexzf) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2914feyxiexzfUjhhgtg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2914feyxiexzfUjhhgtg c2914feyxiexzfUjhhgtg = (C2914feyxiexzfUjhhgtg) parcelable;
        super.onRestoreInstanceState(c2914feyxiexzfUjhhgtg.f9210Ujhhgtgfeyxiexzf);
        setChecked(c2914feyxiexzfUjhhgtg.f9198Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2914feyxiexzfUjhhgtg c2914feyxiexzfUjhhgtg = new C2914feyxiexzfUjhhgtg(super.onSaveInstanceState());
        c2914feyxiexzfUjhhgtg.f9198Ujhhgtgfeyxiexzf = this.f804Ujhhgtgfeyxiexzf;
        return c2914feyxiexzfUjhhgtg;
    }

    public void setCheckable(boolean z) {
        if (this.f805Ujhhgtgfeyxiexzf != z) {
            this.f805Ujhhgtgfeyxiexzf = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f805Ujhhgtgfeyxiexzf || this.f804Ujhhgtgfeyxiexzf == z) {
            return;
        }
        this.f804Ujhhgtgfeyxiexzf = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f806Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f806Ujhhgtgfeyxiexzf) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f804Ujhhgtgfeyxiexzf);
    }
}
