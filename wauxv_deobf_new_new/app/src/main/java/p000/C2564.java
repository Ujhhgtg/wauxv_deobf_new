package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2564 extends C0086 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2565 f8176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final WeakHashMap f8177 = new WeakHashMap();

    public C2564(C2565 c2565) {
        this.f8176 = c2565;
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1107(View view, AccessibilityEvent accessibilityEvent) {
        C0086 c0086 = (C0086) this.f8177.get(view);
        return c0086 != null ? c0086.mo1107(view, accessibilityEvent) : this.f1092.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C0102 mo1108(View view) {
        C0086 c0086 = (C0086) this.f8177.get(view);
        return c0086 != null ? c0086.mo1108(view) : super.mo1108(view);
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1109(View view, AccessibilityEvent accessibilityEvent) {
        C0086 c0086 = (C0086) this.f8177.get(view);
        if (c0086 != null) {
            c0086.mo1109(view, accessibilityEvent);
        } else {
            super.mo1109(view, accessibilityEvent);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo866(View view, C0100 c0100) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
        C2565 c2565 = this.f8176;
        RecyclerView recyclerView = c2565.f8178;
        RecyclerView recyclerView2 = c2565.f8178;
        boolean zM234 = recyclerView.m234();
        View.AccessibilityDelegate accessibilityDelegate = this.f1092;
        if (zM234 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m4496(view, c0100);
        C0086 c0086 = (C0086) this.f8177.get(view);
        if (c0086 != null) {
            c0086.mo866(view, c0100);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo1110(View view, AccessibilityEvent accessibilityEvent) {
        C0086 c0086 = (C0086) this.f8177.get(view);
        if (c0086 != null) {
            c0086.mo1110(view, accessibilityEvent);
        } else {
            super.mo1110(view, accessibilityEvent);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo1111(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0086 c0086 = (C0086) this.f8177.get(viewGroup);
        return c0086 != null ? c0086.mo1111(viewGroup, view, accessibilityEvent) : this.f1092.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo867(View view, int i, Bundle bundle) {
        C2565 c2565 = this.f8176;
        RecyclerView recyclerView = c2565.f8178;
        RecyclerView recyclerView2 = c2565.f8178;
        if (recyclerView.m234() || recyclerView2.getLayoutManager() == null) {
            return super.mo867(view, i, bundle);
        }
        C0086 c0086 = (C0086) this.f8177.get(view);
        if (c0086 != null) {
            if (c0086.mo867(view, i, bundle)) {
                return true;
            }
        } else if (super.mo867(view, i, bundle)) {
            return true;
        }
        C2553 c2553 = recyclerView2.getLayoutManager().f8093.f358;
        return false;
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1112(View view, int i) {
        C0086 c0086 = (C0086) this.f8177.get(view);
        if (c0086 != null) {
            c0086.mo1112(view, i);
        } else {
            super.mo1112(view, i);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1113(View view, AccessibilityEvent accessibilityEvent) {
        C0086 c0086 = (C0086) this.f8177.get(view);
        if (c0086 != null) {
            c0086.mo1113(view, accessibilityEvent);
        } else {
            super.mo1113(view, accessibilityEvent);
        }
    }
}
