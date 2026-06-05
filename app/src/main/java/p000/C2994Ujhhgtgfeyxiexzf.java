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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2994Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9308Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f9309Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2994Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9308Ujhhgtgfeyxiexzf = i;
        this.f9309Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f9308Ujhhgtgfeyxiexzf) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f9309Ujhhgtgfeyxiexzf;
                actionBarOverlayLayout.f74Ujhhgtgfeyxiexzf = null;
                actionBarOverlayLayout.f63Ujhhgtgfeyxiexzf = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9308Ujhhgtgfeyxiexzf) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f9309Ujhhgtgfeyxiexzf;
                actionBarOverlayLayout.f74Ujhhgtgfeyxiexzf = null;
                actionBarOverlayLayout.f63Ujhhgtgfeyxiexzf = false;
                break;
            case 1:
                C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = (C3035Ujhhgtgfeyxiexzf) this.f9309Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList(c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0193Ujhhgtgfeyxiexzf) arrayList.get(i)).f1420Ujhhgtgfeyxiexzf.f745Ujhhgtgfeyxiexzf;
                    if (colorStateList != null) {
                        c3035Ujhhgtgfeyxiexzf.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                AbstractC2475feyxiexzfUjhhgtg abstractC2475feyxiexzfUjhhgtg = (AbstractC2475feyxiexzfUjhhgtg) this.f9309Ujhhgtgfeyxiexzf;
                ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(abstractC2475feyxiexzfUjhhgtg);
                C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = viewGroupM3280Ujhhgtgfeyxiexzf == null ? null : new C0709Ujhhgtgfeyxiexzf(viewGroupM3280Ujhhgtgfeyxiexzf);
                Iterator it = abstractC2475feyxiexzfUjhhgtg.f8038Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf).remove((C1759feyxiexzfUjhhgtg) it.next());
                }
                break;
            case 3:
                C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = (C3245feyxiexzfUjhhgtg) this.f9309Ujhhgtgfeyxiexzf;
                c3245feyxiexzfUjhhgtg.m4840Ujhhgtgfeyxiexzf();
                c3245feyxiexzfUjhhgtg.f10183Ujhhgtgfeyxiexzf.start();
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f9309Ujhhgtgfeyxiexzf).f630Ujhhgtgfeyxiexzf = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                InterfaceC3545feyxiexzfUjhhgtg onMenuClosed = ((AbstractC0384Ujhhgtgfeyxiexzf) this.f9309Ujhhgtgfeyxiexzf).getOnMenuClosed();
                if (onMenuClosed != null) {
                    onMenuClosed.invoke();
                }
                break;
            default:
                ((AbstractC1747feyxiexzfUjhhgtg) this.f9309Ujhhgtgfeyxiexzf).m3024Ujhhgtgfeyxiexzf();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9308Ujhhgtgfeyxiexzf) {
            case 1:
                C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = (C3035Ujhhgtgfeyxiexzf) this.f9309Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList(c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    MaterialCheckBox materialCheckBox = ((C0193Ujhhgtgfeyxiexzf) arrayList.get(i)).f1420Ujhhgtgfeyxiexzf;
                    ColorStateList colorStateList = materialCheckBox.f745Ujhhgtgfeyxiexzf;
                    if (colorStateList != null) {
                        c3035Ujhhgtgfeyxiexzf.setTint(colorStateList.getColorForState(materialCheckBox.f749Ujhhgtgfeyxiexzf, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
