package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0569 implements View.OnAttachStateChangeListener {

    public final /* synthetic */ int f2303;

    public final /* synthetic */ Object f2304;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0569(int i, Object obj) {
        this.f2303 = i;
        this.f2304 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f2303;
        Object obj = this.f2304;
        switch (i) {
            case 0:
                break;
            case 1:
                C1212 c1212 = (C1212) obj;
                AccessibilityManager accessibilityManager = c1212.f4370;
                if (c1212.f4371 != null && accessibilityManager != null) {
                    Field field = AbstractC3578.f11184;
                    if (c1212.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0079(c1212.f4371));
                    }
                    break;
                }
                break;
            case 2:
                break;
            default:
                InterfaceC2554 interfaceC2554Mo1624 = ((C0423) obj).mo1624();
                if (interfaceC2554Mo1624 != null && interfaceC2554Mo1624.mo2856()) {
                    interfaceC2554Mo1624.mo2857();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2303) {
            case 0:
                ViewOnKeyListenerC0572 viewOnKeyListenerC0572 = (ViewOnKeyListenerC0572) this.f2304;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0572.f2335;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0572.f2335 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0572.f2335.removeGlobalOnLayoutListener(viewOnKeyListenerC0572.f2320);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C1212 c1212 = (C1212) this.f2304;
                C0466 c0466 = c1212.f4371;
                if (c0466 != null && (accessibilityManager = c1212.f4370) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0079(c0466));
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC2808 viewOnKeyListenerC2808 = (ViewOnKeyListenerC2808) this.f2304;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2808.f8992;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2808.f8992 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2808.f8992.removeGlobalOnLayoutListener(viewOnKeyListenerC2808.f8986);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                C0423 c0423 = (C0423) this.f2304;
                InterfaceC2554 interfaceC2554Mo1624 = c0423.mo1624();
                if (interfaceC2554Mo1624 != null) {
                    c0423.f1976 = true;
                    interfaceC2554Mo1624.clear();
                    c0423.f1976 = false;
                }
                break;
        }
    }

    private final void m1965(View view) {
    }

    private final void m1966(View view) {
    }
}
