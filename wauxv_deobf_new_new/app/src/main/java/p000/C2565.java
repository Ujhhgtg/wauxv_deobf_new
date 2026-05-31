package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2565 extends C0086 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final RecyclerView f8178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2564 f8179;

    public C2565(RecyclerView recyclerView) {
        this.f8178 = recyclerView;
        C2564 c2564 = this.f8179;
        if (c2564 != null) {
            this.f8179 = c2564;
        } else {
            this.f8179 = new C2564(this);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1109(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1109(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f8178.m234()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo162(accessibilityEvent);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo866(View view, C0100 c0100) {
        this.f1092.onInitializeAccessibilityNodeInfo(view, c0100.f1113);
        RecyclerView recyclerView = this.f8178;
        if (recyclerView.m234() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC2546 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f8093;
        layoutManager.mo118(recyclerView2.f358, recyclerView2.f411, c0100);
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo867(View view, int i, Bundle bundle) {
        if (super.mo867(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f8178;
        if (recyclerView.m234() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo127(i, bundle);
    }
}
