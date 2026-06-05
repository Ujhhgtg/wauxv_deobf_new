package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8794Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8795Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8794Ujhhgtgfeyxiexzf = i;
        this.f8795Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f8794Ujhhgtgfeyxiexzf;
        Object obj = this.f8795Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = (C3335feyxiexzfUjhhgtg) obj;
                AccessibilityManager accessibilityManager = c3335feyxiexzfUjhhgtg.f10409Ujhhgtgfeyxiexzf;
                if (c3335feyxiexzfUjhhgtg.f10410Ujhhgtgfeyxiexzf != null && accessibilityManager != null) {
                    Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    if (c3335feyxiexzfUjhhgtg.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg(c3335feyxiexzfUjhhgtg.f10410Ujhhgtgfeyxiexzf));
                    }
                    break;
                }
                break;
            case 3:
                break;
            default:
                InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf = ((C2509feyxiexzfUjhhgtg) obj).mo3337Ujhhgtgfeyxiexzf();
                if (interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf != null && interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf.mo2498Ujhhgtgfeyxiexzf()) {
                    interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf.mo2499Ujhhgtgfeyxiexzf();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f8794Ujhhgtgfeyxiexzf) {
            case 0:
                ViewOnKeyListenerC2787feyxiexzfUjhhgtg viewOnKeyListenerC2787feyxiexzfUjhhgtg = (ViewOnKeyListenerC2787feyxiexzfUjhhgtg) this.f8795Ujhhgtgfeyxiexzf;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8826feyxiexzfUjhhgtg;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8826feyxiexzfUjhhgtg = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8826feyxiexzfUjhhgtg.removeGlobalOnLayoutListener(viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8811Ujhhgtgfeyxiexzf);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                LinkedHashMap linkedHashMap = C2726Ujhhgtgfeyxiexzf.f8681Ujhhgtgfeyxiexzf;
                C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = (C1981Ujhhgtgfeyxiexzf) this.f8795Ujhhgtgfeyxiexzf;
                linkedHashMap.remove(Integer.valueOf(System.identityHashCode(c1981Ujhhgtgfeyxiexzf)));
                c1981Ujhhgtgfeyxiexzf.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = (C3335feyxiexzfUjhhgtg) this.f8795Ujhhgtgfeyxiexzf;
                C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf = c3335feyxiexzfUjhhgtg.f10410Ujhhgtgfeyxiexzf;
                if (c2579Ujhhgtgfeyxiexzf != null && (accessibilityManager = c3335feyxiexzfUjhhgtg.f10409Ujhhgtgfeyxiexzf) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg(c2579Ujhhgtgfeyxiexzf));
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC1124feyxiexzfUjhhgtg viewOnKeyListenerC1124feyxiexzfUjhhgtg = (ViewOnKeyListenerC1124feyxiexzfUjhhgtg) this.f8795Ujhhgtgfeyxiexzf;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1124feyxiexzfUjhhgtg.f4249Ujhhgtgfeyxiexzf;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1124feyxiexzfUjhhgtg.f4249Ujhhgtgfeyxiexzf = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1124feyxiexzfUjhhgtg.f4249Ujhhgtgfeyxiexzf.removeGlobalOnLayoutListener(viewOnKeyListenerC1124feyxiexzfUjhhgtg.f4243Ujhhgtgfeyxiexzf);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                C2509feyxiexzfUjhhgtg c2509feyxiexzfUjhhgtg = (C2509feyxiexzfUjhhgtg) this.f8795Ujhhgtgfeyxiexzf;
                InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf = c2509feyxiexzfUjhhgtg.mo3337Ujhhgtgfeyxiexzf();
                if (interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf != null) {
                    c2509feyxiexzfUjhhgtg.f8193Ujhhgtgfeyxiexzf = true;
                    interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf.clear();
                    c2509feyxiexzfUjhhgtg.f8193Ujhhgtgfeyxiexzf = false;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    private final void m4065Ujhhgtgfeyxiexzf(View view) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    private final void m4066Ujhhgtgfeyxiexzf(View view) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    private final void m4067Ujhhgtgfeyxiexzf(View view) {
    }
}
