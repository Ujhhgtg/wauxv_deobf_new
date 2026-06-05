package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p000.AbstractC0318Ujhhgtgfeyxiexzf;
import p000.AbstractC1856Ujhhgtgfeyxiexzf;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.C0196Ujhhgtgfeyxiexzf;
import p000.C0224Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f783Ujhhgtgfeyxiexzf;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC1856Ujhhgtgfeyxiexzf.m3191Ujhhgtgfeyxiexzf(null);
        if (C0224Ujhhgtgfeyxiexzf.m1354Ujhhgtgfeyxiexzf(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(me.hd.wauxv.R.id.cancel_button);
            setNextFocusRightId(me.hd.wauxv.R.id.confirm_button);
        }
        this.f783Ujhhgtgfeyxiexzf = C0224Ujhhgtgfeyxiexzf.m1354Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.nestedScrollable);
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, new C0196Ujhhgtgfeyxiexzf(0));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ((AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            ((AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter()).getClass();
            throw null;
        }
        if (i != 130) {
            super.onFocusChanged(true, i, rect);
        } else {
            ((AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter()).getClass();
            throw null;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1) {
            return true;
        }
        getSelectedItemPosition();
        ((AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f783Ujhhgtgfeyxiexzf) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        ((AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (AbstractC0318Ujhhgtgfeyxiexzf) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof AbstractC0318Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), AbstractC0318Ujhhgtgfeyxiexzf.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
