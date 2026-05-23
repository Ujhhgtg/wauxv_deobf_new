package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2385 {

    public final TextPaint f7645;

    public final TextDirectionHeuristic f7646;

    public final int f7647;

    public final int f7648;

    public C2385(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2384.m4351(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f7645 = textPaint;
        this.f7646 = textDirectionHeuristic;
        this.f7647 = i;
        this.f7648 = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2385)) {
            return false;
        }
        C2385 c2385 = (C2385) obj;
        int i = c2385.f7647;
        TextPaint textPaint = c2385.f7645;
        if (this.f7647 != i || this.f7648 != c2385.f7648) {
            return false;
        }
        TextPaint textPaint2 = this.f7645;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f7646 == c2385.f7646;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f7645;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f7646, Integer.valueOf(this.f7647), Integer.valueOf(this.f7648));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f7645;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f7646);
        sb.append(", breakStrategy=" + this.f7647);
        sb.append(", hyphenationFrequency=" + this.f7648);
        sb.append("}");
        return sb.toString();
    }

    public C2385(PrecomputedText.Params params) {
        this.f7645 = params.getTextPaint();
        this.f7646 = params.getTextDirection();
        this.f7647 = params.getBreakStrategy();
        this.f7648 = params.getHyphenationFrequency();
    }
}
