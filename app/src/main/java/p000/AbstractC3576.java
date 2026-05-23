package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3576 {
    public static WindowInsets m5162(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence m5163(View view) {
        return view.getStateDescription();
    }

    public static void m5164(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
