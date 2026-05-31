package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0367;
import p000.C0099;
import p000.C0348;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0348 f845;

    public BaseTransientBottomBar$Behavior() {
        C0348 c0348 = new C0348(1);
        this.f621 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f622 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f620 = 0;
        this.f845 = c0348;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo762(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f845.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0099.f1110 == null) {
                    C0099.f1110 = new C0099(4);
                }
                synchronized (C0099.f1110.f1112) {
                }
            }
        } else if (coordinatorLayout.m69(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0099.f1110 == null) {
                C0099.f1110 = new C0099(4);
            }
            synchronized (C0099.f1110.f1112) {
            }
        }
        return super.mo762(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final boolean mo778(View view) {
        this.f845.getClass();
        return view instanceof AbstractC0367;
    }
}
