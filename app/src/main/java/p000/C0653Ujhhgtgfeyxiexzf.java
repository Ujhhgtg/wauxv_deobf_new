package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0653Ujhhgtgfeyxiexzf extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0654Ujhhgtgfeyxiexzf f2715Ujhhgtgfeyxiexzf;

    public C0653Ujhhgtgfeyxiexzf(C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf) {
        this.f2715Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f2715Ujhhgtgfeyxiexzf.f2723Ujhhgtgfeyxiexzf.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
