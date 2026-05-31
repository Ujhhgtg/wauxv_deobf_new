package com.chad.library.adapter4.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC2537;
import p000.C2498;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class QuickGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public AbstractC2537 f596;

    public QuickGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C2498 c2498 = new C2498(this);
        c2498.f7922 = this.f327;
        this.f327 = c2498;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public final void mo265(AbstractC2537 abstractC2537) {
        this.f596 = abstractC2537;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final void mo759(RecyclerView recyclerView) {
        this.f596 = recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo161(RecyclerView recyclerView) {
        this.f596 = null;
    }
}
