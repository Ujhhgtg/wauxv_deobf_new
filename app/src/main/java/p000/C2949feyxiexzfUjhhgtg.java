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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f9250Ujhhgtgfeyxiexzf = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f9251Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2948feyxiexzfUjhhgtg f9252Ujhhgtgfeyxiexzf;

    public C2949feyxiexzfUjhhgtg() {
        this(f9250Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public boolean mo2164Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9251Ujhhgtgfeyxiexzf.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public C2965Ujhhgtgfeyxiexzf mo2165Ujhhgtgfeyxiexzf(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f9251Ujhhgtgfeyxiexzf.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C2965Ujhhgtgfeyxiexzf(0, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1258Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public void mo2166Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        this.f9251Ujhhgtgfeyxiexzf.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public boolean mo2167Ujhhgtgfeyxiexzf(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9251Ujhhgtgfeyxiexzf.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public boolean mo866Ujhhgtgfeyxiexzf(View view, int i, Bundle bundle) {
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
            if (i2 < list.size()) {
                C2956feyxiexzfUjhhgtg c2956feyxiexzfUjhhgtg = (C2956feyxiexzfUjhhgtg) list.get(i2);
                if (c2956feyxiexzfUjhhgtg.m4404Ujhhgtgfeyxiexzf() == i) {
                    Class cls = c2956feyxiexzfUjhhgtg.f9267Ujhhgtgfeyxiexzf;
                    InterfaceC2973feyxiexzfUjhhgtg interfaceC2973feyxiexzfUjhhgtg = c2956feyxiexzfUjhhgtg.f9268Ujhhgtgfeyxiexzf;
                    if (interfaceC2973feyxiexzfUjhhgtg != null) {
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
                        zPerformAccessibilityAction = interfaceC2973feyxiexzfUjhhgtg.mo2012Ujhhgtgfeyxiexzf(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f9251Ujhhgtgfeyxiexzf.performAccessibilityAction(view, i, bundle);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public void mo2168Ujhhgtgfeyxiexzf(View view, int i) {
        this.f9251Ujhhgtgfeyxiexzf.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public void mo2169Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        this.f9251Ujhhgtgfeyxiexzf.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2949feyxiexzfUjhhgtg(View.AccessibilityDelegate accessibilityDelegate) {
        this.f9251Ujhhgtgfeyxiexzf = accessibilityDelegate;
        this.f9252Ujhhgtgfeyxiexzf = new C2948feyxiexzfUjhhgtg(this);
    }
}
