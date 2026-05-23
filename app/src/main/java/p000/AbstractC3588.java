package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3588 extends AbstractC0861 {

    public C0785 f11223;

    @Override // p000.AbstractC0861
    public boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo633(coordinatorLayout, view, i);
        if (this.f11223 == null) {
            this.f11223 = new C0785(view);
        }
        C0785 c0785 = this.f11223;
        View view2 = (View) c0785.f2972;
        c0785.f2970 = view2.getTop();
        c0785.f2971 = view2.getLeft();
        C0785 c0786 = this.f11223;
        View view3 = (View) c0786.f2972;
        int top = 0 - (view3.getTop() - c0786.f2970);
        Field field = AbstractC3578.f11184;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0786.f2971));
        return true;
    }

    public void mo633(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m71(view, i);
    }
}
