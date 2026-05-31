package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import p000.AbstractC0860;
import p000.AbstractC3638;
import p000.C0093;
import p000.C1681;
import p000.C2923;
import p000.C3639;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0860 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C3639 f617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f618;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f620 = 2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f621 = 0.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f622 = 0.5f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2923 f623 = new C2923(this);

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo762(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM69 = this.f618;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM69 = coordinatorLayout.m69(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f618 = zM69;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f618 = false;
        }
        if (zM69) {
            if (this.f617 == null) {
                this.f617 = new C3639(coordinatorLayout.getContext(), coordinatorLayout, this.f623);
            }
            if (!this.f619 && this.f617.m5201(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo763(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC3638.f11333;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC3638.m5180(view, 1048576);
            AbstractC3638.m5178(view, 0);
            if (mo778(view)) {
                AbstractC3638.m5181(view, C0093.f1100, new C1681(this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final boolean mo771(View view, MotionEvent motionEvent) {
        if (this.f617 == null) {
            return false;
        }
        if (this.f619 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f617.m5195(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean mo778(View view) {
        return true;
    }
}
