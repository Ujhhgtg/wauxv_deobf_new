package com.highcapable.betterandroid.ui.component.adapter.recycler.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import p000.C0810feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public RecyclerView f981feyxiexzfUjhhgtg;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ */
    public final void mo758feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f981feyxiexzfUjhhgtg = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ */
    public final void mo161Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
        this.f981feyxiexzfUjhhgtg = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ */
    public final void mo165Ujhhgtgfeyxiexzf(int i) {
        RecyclerView recyclerView = this.f981feyxiexzfUjhhgtg;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        super.mo165Ujhhgtgfeyxiexzf(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ */
    public final void mo167feyxiexzfUjhhgtg(RecyclerView recyclerView, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, int i) {
        RecyclerView recyclerView2 = this.f981feyxiexzfUjhhgtg;
        if (recyclerView2 != null) {
            recyclerView2.getAdapter();
        }
        super.mo167feyxiexzfUjhhgtg(recyclerView, c0810feyxiexzfUjhhgtg, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳ */
    public final int mo177Ujhhgtgfeyxiexzf() {
        int iMo177Ujhhgtgfeyxiexzf = super.mo177Ujhhgtgfeyxiexzf();
        RecyclerView recyclerView = this.f981feyxiexzfUjhhgtg;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        return iMo177Ujhhgtgfeyxiexzf;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲ */
    public final int mo178Ujhhgtgfeyxiexzf() {
        int iMo178Ujhhgtgfeyxiexzf = super.mo178Ujhhgtgfeyxiexzf();
        RecyclerView recyclerView = this.f981feyxiexzfUjhhgtg;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        return iMo178Ujhhgtgfeyxiexzf;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ */
    public final void mo190Ujhhgtgfeyxiexzf(int i, int i2) {
        RecyclerView recyclerView = this.f981feyxiexzfUjhhgtg;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        super.mo190Ujhhgtgfeyxiexzf(i, i2);
    }
}
