package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛴᛳᛱUjhhgtgᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1447feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TextPaint f5055Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final TextDirectionHeuristic f5056Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f5057Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f5058Ujhhgtgfeyxiexzf;

    public C1447feyxiexzfUjhhgtg(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1451feyxiexzfUjhhgtg.m2942Ujhhgtgfeyxiexzf(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f5055Ujhhgtgfeyxiexzf = textPaint;
        this.f5056Ujhhgtgfeyxiexzf = textDirectionHeuristic;
        this.f5057Ujhhgtgfeyxiexzf = i;
        this.f5058Ujhhgtgfeyxiexzf = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1447feyxiexzfUjhhgtg)) {
            return false;
        }
        C1447feyxiexzfUjhhgtg c1447feyxiexzfUjhhgtg = (C1447feyxiexzfUjhhgtg) obj;
        int i = c1447feyxiexzfUjhhgtg.f5057Ujhhgtgfeyxiexzf;
        TextPaint textPaint = c1447feyxiexzfUjhhgtg.f5055Ujhhgtgfeyxiexzf;
        if (this.f5057Ujhhgtgfeyxiexzf != i || this.f5058Ujhhgtgfeyxiexzf != c1447feyxiexzfUjhhgtg.f5058Ujhhgtgfeyxiexzf) {
            return false;
        }
        TextPaint textPaint2 = this.f5055Ujhhgtgfeyxiexzf;
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
        return this.f5056Ujhhgtgfeyxiexzf == c1447feyxiexzfUjhhgtg.f5056Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f5055Ujhhgtgfeyxiexzf;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f5056Ujhhgtgfeyxiexzf, Integer.valueOf(this.f5057Ujhhgtgfeyxiexzf), Integer.valueOf(this.f5058Ujhhgtgfeyxiexzf));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f5055Ujhhgtgfeyxiexzf;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f5056Ujhhgtgfeyxiexzf);
        sb.append(", breakStrategy=" + this.f5057Ujhhgtgfeyxiexzf);
        sb.append(", hyphenationFrequency=" + this.f5058Ujhhgtgfeyxiexzf);
        sb.append("}");
        return sb.toString();
    }

    public C1447feyxiexzfUjhhgtg(PrecomputedText.Params params) {
        this.f5055Ujhhgtgfeyxiexzf = params.getTextPaint();
        this.f5056Ujhhgtgfeyxiexzf = params.getTextDirection();
        this.f5057Ujhhgtgfeyxiexzf = params.getBreakStrategy();
        this.f5058Ujhhgtgfeyxiexzf = params.getHyphenationFrequency();
    }
}
