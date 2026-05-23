package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0078 {

    public static final View.AccessibilityDelegate f1023 = new View.AccessibilityDelegate();

    public final View.AccessibilityDelegate f1024;

    public final C0077 f1025;

    public C0078() {
        this(f1023);
    }

    public boolean mo962(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1024.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C0094 mo963(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1024.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0094(0, accessibilityNodeProvider);
        }
        return null;
    }

    public void mo964(View view, AccessibilityEvent accessibilityEvent) {
        this.f1024.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void mo722(View view, C0092 c0092) {
        this.f1024.onInitializeAccessibilityNodeInfo(view, c0092.f1045);
    }

    public void mo965(View view, AccessibilityEvent accessibilityEvent) {
        this.f1024.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean mo966(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1024.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean mo723(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (0 < list.size()) {
                C0085 c0085 = (C0085) list.get(0);
                if (c0085.m1062() == i) {
                    Class cls = c0085.f1040;
                    InterfaceC0102 interfaceC0102 = c0085.f1041;
                    if (interfaceC0102 != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zPerformAccessibilityAction = interfaceC0102.mo1124(view);
                        break;
                    }
                } else {
                    0++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1024.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void mo967(View view, int i) {
        this.f1024.sendAccessibilityEvent(view, i);
    }

    public void mo968(View view, AccessibilityEvent accessibilityEvent) {
        this.f1024.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0078(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1024 = accessibilityDelegate;
        this.f1025 = new C0077(this);
    }
}
