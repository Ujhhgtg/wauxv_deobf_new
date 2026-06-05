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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2948feyxiexzfUjhhgtg extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2949feyxiexzfUjhhgtg f9249Ujhhgtgfeyxiexzf;

    public C2948feyxiexzfUjhhgtg(C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg) {
        this.f9249Ujhhgtgfeyxiexzf = c2949feyxiexzfUjhhgtg;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9249Ujhhgtgfeyxiexzf.mo2164Ujhhgtgfeyxiexzf(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C2965Ujhhgtgfeyxiexzf c2965UjhhgtgfeyxiexzfMo2165Ujhhgtgfeyxiexzf = this.f9249Ujhhgtgfeyxiexzf.mo2165Ujhhgtgfeyxiexzf(view);
        if (c2965UjhhgtgfeyxiexzfMo2165Ujhhgtgfeyxiexzf != null) {
            return (AccessibilityNodeProvider) c2965UjhhgtgfeyxiexzfMo2165Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f9249Ujhhgtgfeyxiexzf.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object objValueOf;
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg = new C2963feyxiexzfUjhhgtg(accessibilityNodeInfo);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int i = Build.VERSION.SDK_INT;
        Object objM3236Ujhhgtgfeyxiexzf = null;
        if (i >= 28) {
            tag = Boolean.valueOf(AbstractC1890Ujhhgtgfeyxiexzf.m3220Ujhhgtgfeyxiexzf(view));
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
            c2963feyxiexzfUjhhgtg.m4438Ujhhgtgfeyxiexzf(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objValueOf = Boolean.valueOf(AbstractC1890Ujhhgtgfeyxiexzf.m3219Ujhhgtgfeyxiexzf(view));
        } else {
            Object tag2 = view.getTag(R.id.tag_accessibility_heading);
            objValueOf = Boolean.class.isInstance(tag2) ? tag2 : null;
        }
        Boolean bool2 = (Boolean) objValueOf;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c2963feyxiexzfUjhhgtg.m4438Ujhhgtgfeyxiexzf(2, z2);
        }
        CharSequence charSequenceM3257Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3257Ujhhgtgfeyxiexzf(view);
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceM3257Ujhhgtgfeyxiexzf);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM3257Ujhhgtgfeyxiexzf);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            objM3236Ujhhgtgfeyxiexzf = AbstractC1899feyxiexzfUjhhgtg.m3236Ujhhgtgfeyxiexzf(view);
        } else {
            Object tag3 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                objM3236Ujhhgtgfeyxiexzf = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) objM3236Ujhhgtgfeyxiexzf;
        if (i >= 30) {
            AbstractC2957feyxiexzfUjhhgtg.m4408Ujhhgtgfeyxiexzf(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f9249Ujhhgtgfeyxiexzf.mo865Ujhhgtgfeyxiexzf(view, c2963feyxiexzfUjhhgtg);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf((C2956feyxiexzfUjhhgtg) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f9249Ujhhgtgfeyxiexzf.mo2166Ujhhgtgfeyxiexzf(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9249Ujhhgtgfeyxiexzf.mo2167Ujhhgtgfeyxiexzf(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f9249Ujhhgtgfeyxiexzf.mo866Ujhhgtgfeyxiexzf(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f9249Ujhhgtgfeyxiexzf.mo2168Ujhhgtgfeyxiexzf(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f9249Ujhhgtgfeyxiexzf.mo2169Ujhhgtgfeyxiexzf(view, accessibilityEvent);
    }
}
