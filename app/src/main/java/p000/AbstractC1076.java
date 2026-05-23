package p000;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1076 {
    public static String[] m2638(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int m2639(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int m2640(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int m2641(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int m2642(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int m2643(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params m2644(C0236 c0236) {
        return c0236.getTextMetricsParams();
    }

    public static void m2645(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static boolean m2646(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
