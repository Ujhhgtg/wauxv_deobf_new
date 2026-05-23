package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0077 extends View.AccessibilityDelegate {

    public final C0078 f1022;

    public C0077(C0078 c0078) {
        this.f1022 = c0078;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1022.mo962(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0094 c0094Mo963 = this.f1022.mo963(view);
        if (c0094Mo963 != null) {
            return (AccessibilityNodeProvider) c0094Mo963.f1049;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1022.mo964(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object objValueOf;
        C0092 c0092 = new C0092(accessibilityNodeInfo);
        Field field = AbstractC3578.f11184;
        int i = Build.VERSION.SDK_INT;
        Object objM5163 = null;
        if (i >= 28) {
            tag = Boolean.valueOf(AbstractC3574.m5158(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            c0092.m1094(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objValueOf = Boolean.valueOf(AbstractC3574.m5157(view));
        } else {
            Object tag2 = view.getTag(R.id.tag_accessibility_heading);
            objValueOf = Boolean.class.isInstance(tag2) ? tag2 : null;
        }
        Boolean bool2 = (Boolean) objValueOf;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c0092.m1094(2, z2);
        }
        CharSequence charSequenceM5169 = AbstractC3578.m5169(view);
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceM5169);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM5169);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            objM5163 = AbstractC3576.m5163(view);
        } else {
            Object tag3 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                objM5163 = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) objM5163;
        if (i >= 30) {
            AbstractC0086.m1066(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f1022.mo722(view, c0092);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0092.m1089((C0085) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1022.mo965(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1022.mo966(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f1022.mo723(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f1022.mo967(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1022.mo968(view, accessibilityEvent);
    }
}
