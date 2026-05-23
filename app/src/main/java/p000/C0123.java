package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0123 extends AnimatorListenerAdapter {

    public final /* synthetic */ int f1081;

    public final /* synthetic */ Object f1082;

    public /* synthetic */ C0123(int i, Object obj) {
        this.f1081 = i;
        this.f1082 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1081) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1082;
                actionBarOverlayLayout.f73 = null;
                actionBarOverlayLayout.f62 = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1081) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1082;
                actionBarOverlayLayout.f73 = null;
                actionBarOverlayLayout.f62 = false;
                break;
            case 1:
                C0163 c0163 = (C0163) this.f1082;
                ArrayList arrayList = new ArrayList(c0163.f1183);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1912) arrayList.get(i)).f6310.f672;
                    if (colorStateList != null) {
                        c0163.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                AbstractC0389 abstractC0389 = (AbstractC0389) this.f1082;
                ViewGroup viewGroupM3185 = AbstractC1459.m3185(abstractC0389);
                C1744 c1744 = viewGroupM3185 == null ? null : new C1744(viewGroupM3185);
                Iterator it = abstractC0389.f1810.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) c1744.f5843).remove((C3420) it.next());
                }
                break;
            case 3:
                C1118 c1118 = (C1118) this.f1082;
                c1118.m2830();
                c1118.f4178.start();
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f1082).f564 = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                InterfaceC1414 onMenuClosed = ((AbstractC1966) this.f1082).getOnMenuClosed();
                if (onMenuClosed != null) {
                    onMenuClosed.invoke();
                }
                break;
            default:
                ((AbstractC3436) this.f1082).m4951();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1081) {
            case 1:
                C0163 c0163 = (C0163) this.f1082;
                ArrayList arrayList = new ArrayList(c0163.f1183);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    MaterialCheckBox materialCheckBox = ((C1912) arrayList.get(i)).f6310;
                    ColorStateList colorStateList = materialCheckBox.f672;
                    if (colorStateList != null) {
                        c0163.setTint(colorStateList.getColorForState(materialCheckBox.f676, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
