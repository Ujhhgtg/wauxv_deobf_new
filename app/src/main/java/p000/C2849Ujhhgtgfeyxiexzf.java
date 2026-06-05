package p000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2849Ujhhgtgfeyxiexzf extends MetricAffectingSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f9049Ujhhgtgfeyxiexzf;

    public C2849Ujhhgtgfeyxiexzf(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf) {
        this.f9049Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf = this.f9049Ujhhgtgfeyxiexzf;
        c0206Ujhhgtgfeyxiexzf.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c0206Ujhhgtgfeyxiexzf.getClass();
        textPaint.bgColor = AbstractC1791feyxiexzfUjhhgtg.m3130Ujhhgtgfeyxiexzf(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f9049Ujhhgtgfeyxiexzf.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
