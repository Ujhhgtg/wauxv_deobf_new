package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0434 implements LeadingMarginSpan {

    public final /* synthetic */ int f1990;

    public final C1901 f1991;

    public final Rect f1992;

    public final Paint f1993;

    public C0434(C1901 c1901, int i) {
        this.f1990 = i;
        switch (i) {
            case 1:
                this.f1992 = AbstractC2267.f7362;
                this.f1993 = AbstractC2267.f7364;
                this.f1991 = c1901;
                break;
            default:
                this.f1992 = AbstractC2267.f7362;
                this.f1993 = AbstractC2267.f7364;
                this.f1991 = c1901;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        switch (this.f1990) {
            case 0:
                C1901 c1901 = this.f1991;
                int i8 = c1901.f6272;
                if (i8 == 0) {
                    i8 = (int) ((c1901.f6271 * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f1993;
                paint2.set(paint);
                
                int iM4657 = AbstractC2665.m4657(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iM4657);
                int i9 = i2 * i8;
                int i10 = i + i9;
                int i11 = i9 + i10;
                int iMin = Math.min(i10, i11);
                int iMax = Math.max(i10, i11);
                Rect rect = this.f1992;
                rect.set(iMin, i3, iMax, i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i12 = ((i5 - i3) / 2) + i3;
                Paint paint3 = this.f1993;
                paint3.set(paint);
                C1901 c1902 = this.f1991;
                
                paint3.setColor(AbstractC2665.m4657(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i13 = c1902.f6276;
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
                Rect rect2 = this.f1992;
                rect2.set(i, i14, width, i15);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.f1990) {
            case 0:
                return this.f1991.f6271;
            default:
                return 0;
        }
    }
}
