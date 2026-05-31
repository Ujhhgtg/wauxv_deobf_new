package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤞᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3648 extends AbstractC0860 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C0784 f11372;

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public boolean mo763(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo776(coordinatorLayout, view, i);
        if (this.f11372 == null) {
            this.f11372 = new C0784(view);
        }
        C0784 c0784 = this.f11372;
        View view2 = (View) c0784.f2979;
        c0784.f2977 = view2.getTop();
        c0784.f2978 = view2.getLeft();
        C0784 c0785 = this.f11372;
        View view3 = (View) c0785.f2979;
        int top = 0 - (view3.getTop() - c0785.f2977);
        Field field = AbstractC3638.f11333;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0785.f2978));
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public void mo776(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m71(view, i);
    }
}
