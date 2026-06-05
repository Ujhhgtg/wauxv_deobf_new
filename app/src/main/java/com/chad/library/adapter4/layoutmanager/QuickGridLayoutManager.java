package com.chad.library.adapter4.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC0795feyxiexzfUjhhgtg;
import p000.C0774feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class QuickGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public AbstractC0795feyxiexzfUjhhgtg f610feyxiexzfUjhhgtg;

    public QuickGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C0774feyxiexzfUjhhgtg c0774feyxiexzfUjhhgtg = new C0774feyxiexzfUjhhgtg(this);
        c0774feyxiexzfUjhhgtg.f3065Ujhhgtgfeyxiexzf = this.f328feyxiexzfUjhhgtg;
        this.f328feyxiexzfUjhhgtg = c0774feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ */
    public final void mo265feyxiexzfUjhhgtg(AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg) {
        this.f610feyxiexzfUjhhgtg = abstractC0795feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo758feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f610feyxiexzfUjhhgtg = recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ */
    public final void mo161Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
        this.f610feyxiexzfUjhhgtg = null;
    }
}
