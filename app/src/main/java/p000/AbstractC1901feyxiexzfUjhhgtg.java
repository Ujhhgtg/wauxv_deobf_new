package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.reflect.Field;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳᛱfeyxiexzfᛱ要点脸能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1901feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Field f6355Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean f6356Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f6357Ujhhgtgfeyxiexzf = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C1913feyxiexzfUjhhgtg f6358Ujhhgtgfeyxiexzf = new C1913feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf f6359Ujhhgtgfeyxiexzf = new ViewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3255Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        WindowInsets windowInsetsM3453Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.m3453Ujhhgtgfeyxiexzf();
        if (windowInsetsM3453Ujhhgtgfeyxiexzf != null) {
            WindowInsets windowInsetsM3235Ujhhgtgfeyxiexzf = Build.VERSION.SDK_INT >= 30 ? AbstractC1899feyxiexzfUjhhgtg.m3235Ujhhgtgfeyxiexzf(view, windowInsetsM3453Ujhhgtgfeyxiexzf) : AbstractC1911feyxiexzfUjhhgtg.m3269Ujhhgtgfeyxiexzf(view, windowInsetsM3453Ujhhgtgfeyxiexzf);
            if (windowInsetsM3235Ujhhgtgfeyxiexzf.equals(windowInsetsM3453Ujhhgtgfeyxiexzf)) {
                return;
            }
            C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(view, windowInsetsM3235Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m3256Ujhhgtgfeyxiexzf(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1891Ujhhgtgfeyxiexzf.m3222Ujhhgtgfeyxiexzf(view);
        }
        if (f6356Ujhhgtgfeyxiexzf) {
            return null;
        }
        if (f6355Ujhhgtgfeyxiexzf == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6355Ujhhgtgfeyxiexzf = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6356Ujhhgtgfeyxiexzf = true;
                return null;
            }
        }
        try {
            Object obj = f6355Ujhhgtgfeyxiexzf.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6356Ujhhgtgfeyxiexzf = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static CharSequence m3257Ujhhgtgfeyxiexzf(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC1890Ujhhgtgfeyxiexzf.m3218Ujhhgtgfeyxiexzf(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static ArrayList m3258Ujhhgtgfeyxiexzf(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static String[] m3259Ujhhgtgfeyxiexzf(AbstractC2346Ujhhgtgfeyxiexzf abstractC2346Ujhhgtgfeyxiexzf) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1898feyxiexzfUjhhgtg.m3233Ujhhgtgfeyxiexzf(abstractC2346Ujhhgtgfeyxiexzf) : (String[]) abstractC2346Ujhhgtgfeyxiexzf.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m3260Ujhhgtgfeyxiexzf(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m3257Ujhhgtgfeyxiexzf(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m3257Ujhhgtgfeyxiexzf(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m3257Ujhhgtgfeyxiexzf(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static C3699feyxiexzfUjhhgtg m3261Ujhhgtgfeyxiexzf(View view, C3699feyxiexzfUjhhgtg c3699feyxiexzfUjhhgtg) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c3699feyxiexzfUjhhgtg + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1898feyxiexzfUjhhgtg.m3234Ujhhgtgfeyxiexzf(view, c3699feyxiexzfUjhhgtg);
        }
        C2004feyxiexzfUjhhgtg c2004feyxiexzfUjhhgtg = (C2004feyxiexzfUjhhgtg) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC1330feyxiexzfUjhhgtg interfaceC1330feyxiexzfUjhhgtg = f6358Ujhhgtgfeyxiexzf;
        if (c2004feyxiexzfUjhhgtg == null) {
            if (view instanceof InterfaceC1330feyxiexzfUjhhgtg) {
                interfaceC1330feyxiexzfUjhhgtg = (InterfaceC1330feyxiexzfUjhhgtg) view;
            }
            return interfaceC1330feyxiexzfUjhhgtg.mo2855Ujhhgtgfeyxiexzf(c3699feyxiexzfUjhhgtg);
        }
        C3699feyxiexzfUjhhgtg c3699feyxiexzfUjhhgtgM3347Ujhhgtgfeyxiexzf = C2004feyxiexzfUjhhgtg.m3347Ujhhgtgfeyxiexzf(view, c3699feyxiexzfUjhhgtg);
        if (c3699feyxiexzfUjhhgtgM3347Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        if (view instanceof InterfaceC1330feyxiexzfUjhhgtg) {
            interfaceC1330feyxiexzfUjhhgtg = (InterfaceC1330feyxiexzfUjhhgtg) view;
        }
        return interfaceC1330feyxiexzfUjhhgtg.mo2855Ujhhgtgfeyxiexzf(c3699feyxiexzfUjhhgtgM3347Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m3262Ujhhgtgfeyxiexzf(View view, int i) {
        ArrayList arrayListM3258Ujhhgtgfeyxiexzf = m3258Ujhhgtgfeyxiexzf(view);
        for (int i2 = 0; i2 < arrayListM3258Ujhhgtgfeyxiexzf.size(); i2++) {
            if (((C2956feyxiexzfUjhhgtg) arrayListM3258Ujhhgtgfeyxiexzf.get(i2)).m4404Ujhhgtgfeyxiexzf() == i) {
                arrayListM3258Ujhhgtgfeyxiexzf.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static void m3263Ujhhgtgfeyxiexzf(View view, C2956feyxiexzfUjhhgtg c2956feyxiexzfUjhhgtg, InterfaceC2973feyxiexzfUjhhgtg interfaceC2973feyxiexzfUjhhgtg) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg;
        C2956feyxiexzfUjhhgtg c2956feyxiexzfUjhhgtg2 = new C2956feyxiexzfUjhhgtg(null, c2956feyxiexzfUjhhgtg.f9266Ujhhgtgfeyxiexzf, null, interfaceC2973feyxiexzfUjhhgtg, c2956feyxiexzfUjhhgtg.f9267Ujhhgtgfeyxiexzf);
        View.AccessibilityDelegate accessibilityDelegateM3256Ujhhgtgfeyxiexzf = m3256Ujhhgtgfeyxiexzf(view);
        if (accessibilityDelegateM3256Ujhhgtgfeyxiexzf == null) {
            c2949feyxiexzfUjhhgtg = null;
        } else {
            c2949feyxiexzfUjhhgtg = accessibilityDelegateM3256Ujhhgtgfeyxiexzf instanceof C2948feyxiexzfUjhhgtg ? ((C2948feyxiexzfUjhhgtg) accessibilityDelegateM3256Ujhhgtgfeyxiexzf).f9249Ujhhgtgfeyxiexzf : new C2949feyxiexzfUjhhgtg(accessibilityDelegateM3256Ujhhgtgfeyxiexzf);
        }
        if (c2949feyxiexzfUjhhgtg == null) {
            c2949feyxiexzfUjhhgtg = new C2949feyxiexzfUjhhgtg();
        }
        m3265Ujhhgtgfeyxiexzf(view, c2949feyxiexzfUjhhgtg);
        m3262Ujhhgtgfeyxiexzf(view, c2956feyxiexzfUjhhgtg2.m4404Ujhhgtgfeyxiexzf());
        m3258Ujhhgtgfeyxiexzf(view).add(c2956feyxiexzfUjhhgtg2);
        m3260Ujhhgtgfeyxiexzf(view, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m3264Ujhhgtgfeyxiexzf(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1891Ujhhgtgfeyxiexzf.m3223Ujhhgtgfeyxiexzf(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static void m3265Ujhhgtgfeyxiexzf(View view, C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg) {
        if (c2949feyxiexzfUjhhgtg == null && (m3256Ujhhgtgfeyxiexzf(view) instanceof C2948feyxiexzfUjhhgtg)) {
            c2949feyxiexzfUjhhgtg = new C2949feyxiexzfUjhhgtg();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2949feyxiexzfUjhhgtg == null ? null : c2949feyxiexzfUjhhgtg.f9252Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m3266Ujhhgtgfeyxiexzf(View view, CharSequence charSequence) {
        new C1909Ujhhgtgfeyxiexzf(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).m1231Ujhhgtgfeyxiexzf(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf = f6359Ujhhgtgfeyxiexzf;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf.f6371Ujhhgtgfeyxiexzf.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf.f6371Ujhhgtgfeyxiexzf.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1908Ujhhgtgfeyxiexzf);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static void m3267Ujhhgtgfeyxiexzf(View view, AbstractC2684Ujhhgtgfeyxiexzf abstractC2684Ujhhgtgfeyxiexzf) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new C2233feyxiexzfUjhhgtg(abstractC2684Ujhhgtgfeyxiexzf));
            return;
        }
        PathInterpolator pathInterpolator = C2237feyxiexzfUjhhgtg.f7280Ujhhgtgfeyxiexzf;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg = new ViewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg(view, abstractC2684Ujhhgtgfeyxiexzf);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg);
        }
    }
}
