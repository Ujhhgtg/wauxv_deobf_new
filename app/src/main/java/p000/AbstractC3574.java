package p000;

import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3574 {
    public static CharSequence m5156(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean m5157(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean m5158(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void m5159(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
