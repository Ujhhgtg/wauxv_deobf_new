package p000;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2384 {
    public static /* synthetic */ PrecomputedText.Params.Builder m4351(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean m4361(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
