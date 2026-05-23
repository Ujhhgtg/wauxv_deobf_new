package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2510 extends C0078 {

    public final RecyclerView f8027;

    public final C2509 f8028;

    public C2510(RecyclerView recyclerView) {
        this.f8027 = recyclerView;
        C2509 c2509 = this.f8028;
        if (c2509 != null) {
            this.f8028 = c2509;
        } else {
            this.f8028 = new C2509(this);
        }
    }

    @Override // p000.C0078
    public final void mo964(View view, AccessibilityEvent accessibilityEvent) {
        super.mo964(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f8027.m234()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo162(accessibilityEvent);
        }
    }

    @Override // p000.C0078
    public final void mo722(View view, C0092 c0092) {
        this.f1024.onInitializeAccessibilityNodeInfo(view, c0092.f1045);
        RecyclerView recyclerView = this.f8027;
        if (recyclerView.m234() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC2491 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7942;
        layoutManager.mo118(recyclerView2.f358, recyclerView2.f411, c0092);
    }

    @Override // p000.C0078
    public final boolean mo723(View view, int i, Bundle bundle) {
        if (super.mo723(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f8027;
        if (recyclerView.m234() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo127(i, bundle);
    }
}
