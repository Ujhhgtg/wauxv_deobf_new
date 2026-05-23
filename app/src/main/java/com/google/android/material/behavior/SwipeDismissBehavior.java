package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import p000.AbstractC0861;
import p000.AbstractC3578;
import p000.C0085;
import p000.C1744;
import p000.C2863;
import p000.C3579;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0861 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C3579 f565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f568 = 2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f569 = 0.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f570 = 0.5f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2863 f571 = new C2863(this);

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo619(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM69 = this.f566;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM69 = coordinatorLayout.m69(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f566 = zM69;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f566 = false;
        }
        if (zM69) {
            if (this.f565 == null) {
                this.f565 = new C3579(coordinatorLayout.getContext(), coordinatorLayout, this.f571);
            }
            if (!this.f567 && this.f565.m5195(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC3578.f11184;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC3578.m5174(view, 1048576);
            AbstractC3578.m5172(view, 0);
            if (mo635(view)) {
                AbstractC3578.m5175(view, C0085.f1032, new C1744(this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final boolean mo628(View view, MotionEvent motionEvent) {
        if (this.f565 == null) {
            return false;
        }
        if (this.f567 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f565.m5189(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean mo635(View view) {
        return true;
    }
}
