package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2305 implements LeadingMarginSpan {

    public final C1901 f7422;

    public final String f7423;

    public final Paint f7424 = AbstractC2267.f7364;

    public int f7425;

    public C2305(C1901 c1901, String str) {
        this.f7422 = c1901;
        this.f7423 = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f7424;
            paint2.set(paint);
            C1901 c1901 = this.f7422;
            
            paint2.setColor(paint2.getColor());
            int i9 = c1901.f6273;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.f7423;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = c1901.f6271;
            if (iMeasureText > i10) {
                this.f7425 = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.f7425 = 0;
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
        return Math.max(this.f7425, this.f7422.f6271);
    }
}
