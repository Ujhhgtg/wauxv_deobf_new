package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.AbstractC0861;
import p000.AbstractC3578;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0861 {
    public ExpandableBehavior() {
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract void mo630(View view);

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo631(CoordinatorLayout coordinatorLayout, View view, View view2) {
        
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC3578.f11184;
        if (!view.isLaidOut()) {
            ArrayList arrayListM66 = coordinatorLayout.m66(view);
            int size = arrayListM66.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo630(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
