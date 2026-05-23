package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0392;
import p000.C0091;
import p000.C0373;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0373 f779;

    public BaseTransientBottomBar$Behavior() {
        C0373 c0373 = new C0373(1);
        this.f569 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f570 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f568 = 0;
        this.f779 = c0373;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo619(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f779.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0091.f1042 == null) {
                    C0091.f1042 = new C0091(3);
                }
                synchronized (C0091.f1042.f1044) {
                }
            }
        } else if (coordinatorLayout.m69(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0091.f1042 == null) {
                C0091.f1042 = new C0091(3);
            }
            synchronized (C0091.f1042.f1044) {
            }
        }
        return super.mo619(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final boolean mo635(View view) {
        this.f779.getClass();
        return view instanceof AbstractC0392;
    }
}
