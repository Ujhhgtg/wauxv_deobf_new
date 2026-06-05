package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳ要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2627Ujhhgtgfeyxiexzf implements LeadingMarginSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f8455Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Paint f8456Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4809Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final RectF f8457Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4808Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Rect f8458Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f8459Ujhhgtgfeyxiexzf;

    public C2627Ujhhgtgfeyxiexzf(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf, int i) {
        this.f8455Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
        this.f8459Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        RectF rectF = this.f8457Ujhhgtgfeyxiexzf;
        Rect rect = this.f8458Ujhhgtgfeyxiexzf;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f8456Ujhhgtgfeyxiexzf;
            paint2.set(paint);
            C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf = this.f8455Ujhhgtgfeyxiexzf;
            c0206Ujhhgtgfeyxiexzf.getClass();
            int i8 = c0206Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf;
            paint2.setColor(paint2.getColor());
            int i9 = c0206Ujhhgtgfeyxiexzf.f1461Ujhhgtgfeyxiexzf;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            int iSave = canvas.save();
            try {
                int iMin = Math.min(i8, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i10 = (i8 - iMin) / 2;
                if (i2 <= 0) {
                    i -= i8;
                }
                int i11 = i + i10;
                int i12 = i11 + iMin;
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin / 2);
                int i13 = iMin + iDescent;
                int i14 = this.f8459Ujhhgtgfeyxiexzf;
                if (i14 == 0 || i14 == 1) {
                    rectF.set(i11, iDescent, i12, i13);
                    paint2.setStyle(i14 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i11, iDescent, i12, i13);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f8455Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf;
    }
}
