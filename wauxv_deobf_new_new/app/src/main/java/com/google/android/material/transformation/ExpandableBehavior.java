package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.AbstractC0860;
import p000.AbstractC3638;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0860 {
    public ExpandableBehavior() {
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract void mo773(View view);

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo774(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo763(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC3638.f11333;
        if (!view.isLaidOut()) {
            ArrayList arrayListM66 = coordinatorLayout.m66(view);
            int size = arrayListM66.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo773(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
