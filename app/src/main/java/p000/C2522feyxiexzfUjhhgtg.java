package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2522feyxiexzfUjhhgtg implements LeadingMarginSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8213Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f8214Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Rect f8215Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Paint f8216Ujhhgtgfeyxiexzf;

    public C2522feyxiexzfUjhhgtg(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf, int i) {
        this.f8213Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                this.f8215Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4807Ujhhgtgfeyxiexzf;
                this.f8216Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4809Ujhhgtgfeyxiexzf;
                this.f8214Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
                break;
            default:
                this.f8215Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4807Ujhhgtgfeyxiexzf;
                this.f8216Ujhhgtgfeyxiexzf = AbstractC1332feyxiexzfUjhhgtg.f4809Ujhhgtgfeyxiexzf;
                this.f8214Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        switch (this.f8213Ujhhgtgfeyxiexzf) {
            case 0:
                C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf = this.f8214Ujhhgtgfeyxiexzf;
                int i8 = c0206Ujhhgtgfeyxiexzf.f1460Ujhhgtgfeyxiexzf;
                if (i8 == 0) {
                    i8 = (int) ((c0206Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f8216Ujhhgtgfeyxiexzf;
                paint2.set(paint);
                c0206Ujhhgtgfeyxiexzf.getClass();
                int iM3130Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3130Ujhhgtgfeyxiexzf(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iM3130Ujhhgtgfeyxiexzf);
                int i9 = i2 * i8;
                int i10 = i + i9;
                int i11 = i9 + i10;
                int iMin = Math.min(i10, i11);
                int iMax = Math.max(i10, i11);
                Rect rect = this.f8215Ujhhgtgfeyxiexzf;
                rect.set(iMin, i3, iMax, i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i12 = ((i5 - i3) / 2) + i3;
                Paint paint3 = this.f8216Ujhhgtgfeyxiexzf;
                paint3.set(paint);
                C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf2 = this.f8214Ujhhgtgfeyxiexzf;
                c0206Ujhhgtgfeyxiexzf2.getClass();
                paint3.setColor(AbstractC1791feyxiexzfUjhhgtg.m3130Ujhhgtgfeyxiexzf(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i13 = c0206Ujhhgtgfeyxiexzf2.f1464Ujhhgtgfeyxiexzf;
                if (i13 >= 0) {
                    paint3.setStrokeWidth(i13);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                int i14 = i12 - strokeWidth;
                int i15 = i12 + strokeWidth;
                Rect rect2 = this.f8215Ujhhgtgfeyxiexzf;
                rect2.set(i, i14, width, i15);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.f8213Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f8214Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf;
            default:
                return 0;
        }
    }
}
