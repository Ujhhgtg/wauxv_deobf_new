package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0546 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2265;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2266;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0546(Object obj, int i) {
        this.f2265 = i;
        this.f2266 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f2265;
        Object obj = this.f2266;
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                C1213 c1213 = (C1213) obj;
                AccessibilityManager accessibilityManager = c1213.f4367;
                if (c1213.f4368 != null && accessibilityManager != null) {
                    Field field = AbstractC3638.f11333;
                    if (c1213.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0087(c1213.f4368));
                    }
                    break;
                }
                break;
            case 3:
                break;
            default:
                InterfaceC2610 interfaceC2610Mo1730 = ((C0398) obj).mo1730();
                if (interfaceC2610Mo1730 != null && interfaceC2610Mo1730.mo2982()) {
                    interfaceC2610Mo1730.mo2983();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2265) {
            case 0:
                ViewOnKeyListenerC0549 viewOnKeyListenerC0549 = (ViewOnKeyListenerC0549) this.f2266;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0549.f2297;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0549.f2297 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0549.f2297.removeGlobalOnLayoutListener(viewOnKeyListenerC0549.f2282);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                LinkedHashMap linkedHashMap = C0615.f2457;
                C2950 c2950 = (C2950) this.f2266;
                linkedHashMap.remove(Integer.valueOf(System.identityHashCode(c2950)));
                c2950.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                C1213 c1213 = (C1213) this.f2266;
                C0441 c0441 = c1213.f4368;
                if (c0441 != null && (accessibilityManager = c1213.f4367) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0087(c0441));
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC2867 viewOnKeyListenerC2867 = (ViewOnKeyListenerC2867) this.f2266;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2867.f9153;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2867.f9153 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2867.f9153.removeGlobalOnLayoutListener(viewOnKeyListenerC2867.f9147);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                C0398 c0398 = (C0398) this.f2266;
                InterfaceC2610 interfaceC2610Mo1730 = c0398.mo1730();
                if (interfaceC2610Mo1730 != null) {
                    c0398.f1948 = true;
                    interfaceC2610Mo1730.clear();
                    c0398.f1948 = false;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m2061(View view) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m2062(View view) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    private final void m2063(View view) {
    }
}
