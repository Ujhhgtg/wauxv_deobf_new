package com.highcapable.betterandroid.ui.component.adapter.recycler.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import p000.C2504;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public RecyclerView f900;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public final void mo616(RecyclerView recyclerView) {
        this.f900 = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo161(RecyclerView recyclerView) {
        this.f900 = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public final void mo165(int i) {
        RecyclerView recyclerView = this.f900;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        super.mo165(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ */
    public final void mo167(RecyclerView recyclerView, C2504 c2504, int i) {
        RecyclerView recyclerView2 = this.f900;
        if (recyclerView2 != null) {
            recyclerView2.getAdapter();
        }
        super.mo167(recyclerView, c2504, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ */
    public final int mo177() {
        int iMo177 = super.mo177();
        RecyclerView recyclerView = this.f900;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        return iMo177;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲇᲁ */
    public final int mo178() {
        int iMo178 = super.mo178();
        RecyclerView recyclerView = this.f900;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        return iMo178;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ */
    public final void mo190(int i, int i2) {
        RecyclerView recyclerView = this.f900;
        if (recyclerView != null) {
            recyclerView.getAdapter();
        }
        super.mo190(i, i2);
    }
}
