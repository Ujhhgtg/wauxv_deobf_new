package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛲ要点脸ᛱfeyxiexzfᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0566Ujhhgtgfeyxiexzf extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f2581Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Rect f2582Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Paint f2583Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4809Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f2584Ujhhgtgfeyxiexzf;

    public C0566Ujhhgtgfeyxiexzf(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf, int i) {
        this.f2581Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
        this.f2584Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f2584Ujhhgtgfeyxiexzf;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.f2583Ujhhgtgfeyxiexzf;
            paint2.set(paint);
            C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf = this.f2581Ujhhgtgfeyxiexzf;
            c0206Ujhhgtgfeyxiexzf.getClass();
            paint2.setColor(AbstractC1791feyxiexzfUjhhgtg.m3130Ujhhgtgfeyxiexzf(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i9 = c0206Ujhhgtgfeyxiexzf.f1463Ujhhgtgfeyxiexzf;
            if (i9 >= 0) {
                paint2.setStrokeWidth(i9);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.f2582Ujhhgtgfeyxiexzf;
                rect.set(i, i10, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        m1842Ujhhgtgfeyxiexzf(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        m1842Ujhhgtgfeyxiexzf(textPaint);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1842Ujhhgtgfeyxiexzf(TextPaint textPaint) {
        this.f2581Ujhhgtgfeyxiexzf.getClass();
        textPaint.setFakeBoldText(true);
        int i = this.f2584Ujhhgtgfeyxiexzf;
        float[] fArr = C0206Ujhhgtgfeyxiexzf.f1458Ujhhgtgfeyxiexzf;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }
}
