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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3578 {

    public static Field f11184 = null;

    public static boolean f11185 = false;

    public static final int[] f11186 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    public static final C3565 f11187 = new C3565();

    public static final ViewTreeObserverOnGlobalLayoutListenerC3567 f11188 = new ViewTreeObserverOnGlobalLayoutListenerC3567();

    public static void m5167(View view, C3669 c3669) {
        WindowInsets windowInsetsM5302 = c3669.m5302();
        if (windowInsetsM5302 != null) {
            WindowInsets windowInsetsM5162 = Build.VERSION.SDK_INT >= 30 ? AbstractC3576.m5162(view, windowInsetsM5302) : AbstractC3568.m5148(view, windowInsetsM5302);
            if (windowInsetsM5162.equals(windowInsetsM5302)) {
                return;
            }
            C3669.m5299(view, windowInsetsM5162);
        }
    }

    public static View.AccessibilityDelegate m5168(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC3575.m5160(view);
        }
        if (f11185) {
            return null;
        }
        if (f11184 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f11184 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f11185 = true;
                return null;
            }
        }
        try {
            Object obj = f11184.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f11185 = true;
            return null;
        }
    }

    public static CharSequence m5169(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC3574.m5156(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList m5170(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] m5171(AbstractC0218 abstractC0218) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC3577.m5165(abstractC0218) : (String[]) abstractC0218.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void m5172(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m5169(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m5169(view));
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
            accessibilityEventObtain2.setContentChangeTypes(32);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m5169(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0837 m5173(View view, C0837 c0837) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0837 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3577.m5166(view, c0837);
        }
        C2914 c2914 = (C2914) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2285 interfaceC2285 = f11187;
        if (c2914 == null) {
            if (view instanceof InterfaceC2285) {
                interfaceC2285 = (InterfaceC2285) view;
            }
            return interfaceC2285.mo1253(c0837);
        }
        C0837 c0837M4916 = C2914.m4916(view, c0837);
        if (c0837M4916 == null) {
            return null;
        }
        if (view instanceof InterfaceC2285) {
            interfaceC2285 = (InterfaceC2285) view;
        }
        return interfaceC2285.mo1253(c0837M4916);
    }

    public static void m5174(View view, int i) {
        ArrayList arrayListM5170 = m5170(view);
        for (int i2 = 0; i2 < arrayListM5170.size(); i2++) {
            if (((C0085) arrayListM5170.get(i2)).m1062() == i) {
                arrayListM5170.remove(i2);
                return;
            }
        }
    }

    public static void m5175(View view, C0085 c0085, InterfaceC0102 interfaceC0102) {
        C0078 c0078;
        C0085 c0086 = new C0085(null, c0085.f1039, null, interfaceC0102, c0085.f1040);
        View.AccessibilityDelegate accessibilityDelegateM5168 = m5168(view);
        if (accessibilityDelegateM5168 == null) {
            c0078 = null;
        } else {
            c0078 = accessibilityDelegateM5168 instanceof C0077 ? ((C0077) accessibilityDelegateM5168).f1022 : new C0078(accessibilityDelegateM5168);
        }
        if (c0078 == null) {
            c0078 = new C0078();
        }
        m5177(view, c0078);
        m5174(view, c0086.m1062());
        m5170(view).add(c0086);
        m5172(view, 0);
    }

    public static void m5176(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3575.m5161(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m5177(View view, C0078 c0078) {
        if (c0078 == null && (m5168(view) instanceof C0077)) {
            c0078 = new C0078();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0078 == null ? null : c0078.f1025);
    }

    public static void m5178(View view, CharSequence charSequence) {
        new C3566(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).m3679(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC3567 viewTreeObserverOnGlobalLayoutListenerC3567 = f11188;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC3567.f11180.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC3567);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3567);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC3567.f11180.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC3567);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3567);
            }
        }
    }

    public static void m5179(View view, AbstractC0592 abstractC0592) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new C3644(abstractC0592));
            return;
        }
        PathInterpolator pathInterpolator = C3643.f11403;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC3642 = new ViewOnApplyWindowInsetsListenerC3642(view, abstractC0592);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC3642);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3642);
        }
    }
}
