package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲇᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0409 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1962;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1928 f1963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Rect f1964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Paint f1965;

    public C0409(C1928 c1928, int i) {
        this.f1962 = i;
        switch (i) {
            case 1:
                this.f1964 = AbstractC2299.f7483;
                this.f1965 = AbstractC2299.f7485;
                this.f1963 = c1928;
                break;
            default:
                this.f1964 = AbstractC2299.f7483;
                this.f1965 = AbstractC2299.f7485;
                this.f1963 = c1928;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        switch (this.f1962) {
            case 0:
                C1928 c1928 = this.f1963;
                int i8 = c1928.f6351;
                if (i8 == 0) {
                    i8 = (int) ((c1928.f6350 * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f1965;
                paint2.set(paint);
                c1928.getClass();
                int iM2588 = AbstractC0972.m2588(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iM2588);
                int i9 = i2 * i8;
                int i10 = i + i9;
                int i11 = i9 + i10;
                int iMin = Math.min(i10, i11);
                int iMax = Math.max(i10, i11);
                Rect rect = this.f1964;
                rect.set(iMin, i3, iMax, i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i12 = ((i5 - i3) / 2) + i3;
                Paint paint3 = this.f1965;
                paint3.set(paint);
                C1928 c1929 = this.f1963;
                c1929.getClass();
                paint3.setColor(AbstractC0972.m2588(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i13 = c1929.f6355;
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
                Rect rect2 = this.f1964;
                rect2.set(i, i14, width, i15);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.f1962) {
            case 0:
                return this.f1963.f6350;
            default:
                return 0;
        }
    }
}
