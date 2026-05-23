package com.chad.library.adapter4.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC2482;
import p000.C2447;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class QuickGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public AbstractC2482 f544;

    public QuickGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C2447 c2447 = new C2447(this);
        c2447.f7779 = this.f327;
        this.f327 = c2447;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public final void mo265(AbstractC2482 abstractC2482) {
        this.f544 = abstractC2482;
    }

    @Override // p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final void mo616(RecyclerView recyclerView) {
        this.f544 = recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC2491
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo161(RecyclerView recyclerView) {
        this.f544 = null;
    }
}
