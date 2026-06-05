package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛳᛲᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1473feyxiexzfUjhhgtg implements LeadingMarginSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f5113Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f5114Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Paint f5115Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4809Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f5116Ujhhgtgfeyxiexzf;

    public C1473feyxiexzfUjhhgtg(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf, String str) {
        this.f5113Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
        this.f5114Ujhhgtgfeyxiexzf = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f5115Ujhhgtgfeyxiexzf;
            paint2.set(paint);
            C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf = this.f5113Ujhhgtgfeyxiexzf;
            c0206Ujhhgtgfeyxiexzf.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = c0206Ujhhgtgfeyxiexzf.f1461Ujhhgtgfeyxiexzf;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.f5114Ujhhgtgfeyxiexzf;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = c0206Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf;
            if (iMeasureText > i10) {
                this.f5116Ujhhgtgfeyxiexzf = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.f5116Ujhhgtgfeyxiexzf = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - iMeasureText;
            } else {
                i8 = (i10 - iMeasureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f5116Ujhhgtgfeyxiexzf, this.f5113Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf);
    }
}
