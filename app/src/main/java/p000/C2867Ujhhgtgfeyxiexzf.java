package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲ要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2867Ujhhgtgfeyxiexzf extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f9126Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Rect f9127Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Paint f9128Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4809Ujhhgtgfeyxiexzf;

    public C2867Ujhhgtgfeyxiexzf(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf) {
        this.f9126Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f9128Ujhhgtgfeyxiexzf;
        paint2.setStyle(style);
        this.f9126Ujhhgtgfeyxiexzf.getClass();
        paint2.setColor(AbstractC1791feyxiexzfUjhhgtg.m3130Ujhhgtgfeyxiexzf(paint.getColor(), 25));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        Rect rect = this.f9127Ujhhgtgfeyxiexzf;
        rect.set(i, i3, width, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f9126Ujhhgtgfeyxiexzf.f1462Ujhhgtgfeyxiexzf;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f9126Ujhhgtgfeyxiexzf.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f9126Ujhhgtgfeyxiexzf.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
