package p000;

import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230 {
    public static int m1284(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void m1285(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static void m1286(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean m1287(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
