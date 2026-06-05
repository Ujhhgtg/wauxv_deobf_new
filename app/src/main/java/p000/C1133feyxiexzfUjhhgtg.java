package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ要点脸能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1133feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public CharSequence f4284Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final TextPaint f4285Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f4286Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f4287Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f4293Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Layout.Alignment f4288Ujhhgtgfeyxiexzf = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f4289Ujhhgtgfeyxiexzf = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float f4290Ujhhgtgfeyxiexzf = 1.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f4291Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f4292Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public TextUtils.TruncateAt f4294Ujhhgtgfeyxiexzf = null;

    public C1133feyxiexzfUjhhgtg(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f4284Ujhhgtgfeyxiexzf = charSequence;
        this.f4285Ujhhgtgfeyxiexzf = textPaint;
        this.f4286Ujhhgtgfeyxiexzf = i;
        this.f4287Ujhhgtgfeyxiexzf = charSequence.length();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final StaticLayout m2602Ujhhgtgfeyxiexzf() {
        if (this.f4284Ujhhgtgfeyxiexzf == null) {
            this.f4284Ujhhgtgfeyxiexzf = "";
        }
        int iMax = Math.max(0, this.f4286Ujhhgtgfeyxiexzf);
        CharSequence charSequenceEllipsize = this.f4284Ujhhgtgfeyxiexzf;
        int i = this.f4289Ujhhgtgfeyxiexzf;
        TextPaint textPaint = this.f4285Ujhhgtgfeyxiexzf;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f4294Ujhhgtgfeyxiexzf);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f4287Ujhhgtgfeyxiexzf);
        this.f4287Ujhhgtgfeyxiexzf = iMin;
        if (this.f4293Ujhhgtgfeyxiexzf && this.f4289Ujhhgtgfeyxiexzf == 1) {
            this.f4288Ujhhgtgfeyxiexzf = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f4288Ujhhgtgfeyxiexzf);
        builderObtain.setIncludePad(this.f4292Ujhhgtgfeyxiexzf);
        builderObtain.setTextDirection(this.f4293Ujhhgtgfeyxiexzf ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f4294Ujhhgtgfeyxiexzf;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f4289Ujhhgtgfeyxiexzf);
        float f = this.f4290Ujhhgtgfeyxiexzf;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f4289Ujhhgtgfeyxiexzf > 1) {
            builderObtain.setHyphenationFrequency(this.f4291Ujhhgtgfeyxiexzf);
        }
        return builderObtain.build();
    }
}
