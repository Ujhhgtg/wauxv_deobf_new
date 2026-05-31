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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0131 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1149;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1150;

    public /* synthetic */ C0131(Object obj, int i) {
        this.f1149 = i;
        this.f1150 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1149) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1150;
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
        switch (this.f1149) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1150;
                actionBarOverlayLayout.f73 = null;
                actionBarOverlayLayout.f62 = false;
                break;
            case 1:
                C0171 c0171 = (C0171) this.f1150;
                ArrayList arrayList = new ArrayList(c0171.f1251);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1942) arrayList.get(i)).f6415.f731;
                    if (colorStateList != null) {
                        c0171.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                AbstractC0364 abstractC0364 = (AbstractC0364) this.f1150;
                ViewGroup viewGroupM3389 = AbstractC1471.m3389(abstractC0364);
                C1681 c1681 = viewGroupM3389 == null ? null : new C1681(viewGroupM3389);
                Iterator it = abstractC0364.f1781.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) c1681.f5660).remove((C3478) it.next());
                }
                break;
            case 3:
                C1124 c1124 = (C1124) this.f1150;
                c1124.m2952();
                c1124.f4189.start();
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f1150).f616 = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                InterfaceC1422 onMenuClosed = ((AbstractC1997) this.f1150).getOnMenuClosed();
                if (onMenuClosed != null) {
                    onMenuClosed.invoke();
                }
                break;
            default:
                ((AbstractC3493) this.f1150).m5013();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1149) {
            case 1:
                C0171 c0171 = (C0171) this.f1150;
                ArrayList arrayList = new ArrayList(c0171.f1251);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    MaterialCheckBox materialCheckBox = ((C1942) arrayList.get(i)).f6415;
                    ColorStateList colorStateList = materialCheckBox.f731;
                    if (colorStateList != null) {
                        c0171.setTint(colorStateList.getColorForState(materialCheckBox.f735, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
