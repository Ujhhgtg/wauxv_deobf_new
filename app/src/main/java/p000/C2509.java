package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2509 extends C0078 {

    public final C2510 f8025;

    public final WeakHashMap f8026 = new WeakHashMap();

    public C2509(C2510 c2510) {
        this.f8025 = c2510;
    }

    @Override // p000.C0078
    public final boolean mo962(View view, AccessibilityEvent accessibilityEvent) {
        C0078 c0078 = (C0078) this.f8026.get(view);
        return c0078 != null ? c0078.mo962(view, accessibilityEvent) : this.f1024.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C0078
    public final C0094 mo963(View view) {
        C0078 c0078 = (C0078) this.f8026.get(view);
        return c0078 != null ? c0078.mo963(view) : super.mo963(view);
    }

    @Override // p000.C0078
    public final void mo964(View view, AccessibilityEvent accessibilityEvent) {
        C0078 c0078 = (C0078) this.f8026.get(view);
        if (c0078 != null) {
            c0078.mo964(view, accessibilityEvent);
        } else {
            super.mo964(view, accessibilityEvent);
        }
    }

    @Override // p000.C0078
    public final void mo722(View view, C0092 c0092) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        C2510 c2510 = this.f8025;
        RecyclerView recyclerView = c2510.f8027;
        RecyclerView recyclerView2 = c2510.f8027;
        boolean zM234 = recyclerView.m234();
        View.AccessibilityDelegate accessibilityDelegate = this.f1024;
        if (zM234 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m4474(view, c0092);
        C0078 c0078 = (C0078) this.f8026.get(view);
        if (c0078 != null) {
            c0078.mo722(view, c0092);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C0078
    public final void mo965(View view, AccessibilityEvent accessibilityEvent) {
        C0078 c0078 = (C0078) this.f8026.get(view);
        if (c0078 != null) {
            c0078.mo965(view, accessibilityEvent);
        } else {
            super.mo965(view, accessibilityEvent);
        }
    }

    @Override // p000.C0078
    public final boolean mo966(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0078 c0078 = (C0078) this.f8026.get(viewGroup);
        return c0078 != null ? c0078.mo966(viewGroup, view, accessibilityEvent) : this.f1024.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C0078
    public final boolean mo723(View view, int i, Bundle bundle) {
        C2510 c2510 = this.f8025;
        RecyclerView recyclerView = c2510.f8027;
        RecyclerView recyclerView2 = c2510.f8027;
        if (recyclerView.m234() || recyclerView2.getLayoutManager() == null) {
            return super.mo723(view, i, bundle);
        }
        C0078 c0078 = (C0078) this.f8026.get(view);
        if (c0078 != null) {
            if (c0078.mo723(view, i, bundle)) {
                return true;
            }
        } else if (super.mo723(view, i, bundle)) {
            return true;
        }
        C2498 c2498 = recyclerView2.getLayoutManager().f7942.f358;
        return false;
    }

    @Override // p000.C0078
    public final void mo967(View view, int i) {
        C0078 c0078 = (C0078) this.f8026.get(view);
        if (c0078 != null) {
            c0078.mo967(view, i);
        } else {
            super.mo967(view, i);
        }
    }

    @Override // p000.C0078
    public final void mo968(View view, AccessibilityEvent accessibilityEvent) {
        C0078 c0078 = (C0078) this.f8026.get(view);
        if (c0078 != null) {
            c0078.mo968(view, accessibilityEvent);
        } else {
            super.mo968(view, accessibilityEvent);
        }
    }
}
