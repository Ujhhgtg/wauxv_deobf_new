package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3691 extends Drawable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3690 f11491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Paint f11492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f11493;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f11494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f11495;

    public C3691(C3690 c3690) {
        this.f11491 = c3690;
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setColor(c3690.f11486);
        paint.setTextSize(c3690.f11487);
        paint.setStyle(Paint.Style.FILL);
        this.f11492 = paint;
        List listM4875 = AbstractC2901.m4875(c3690.f11485, new char[]{'\n'});
        this.f11493 = listM4875;
        float fDescent = paint.descent() - paint.ascent();
        this.f11494 = fDescent;
        this.f11495 = (fDescent * listM4875.size()) + c3690.f11490;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = 2;
        float f2 = fWidth * f;
        float f3 = fHeight * f;
        List list = this.f11493;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        String str = (String) it.next();
        Paint paint = this.f11492;
        float fMeasureText = paint.measureText(str);
        while (it.hasNext()) {
            fMeasureText = Math.max(fMeasureText, paint.measureText((String) it.next()));
        }
        C3690 c3690 = this.f11491;
        float f4 = fMeasureText + c3690.f11489;
        float f5 = 1;
        int i = (int) ((f2 / f4) + f5);
        float f6 = this.f11495;
        int i2 = (int) ((f3 / f6) + f5);
        int iSave = canvas.save();
        canvas.rotate(c3690.f11488, fWidth / f, fHeight / f);
        float f7 = (fWidth - (i * f4)) / f;
        float f8 = (fHeight - (i2 * f6)) / f;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                float f9 = i3 % 2 == 0 ? 0.0f : f4 / f;
                int i4 = 0;
                while (i4 < i) {
                    float f10 = (i4 * f4) + f7 + f9;
                    float f11 = f7;
                    float f12 = (i3 * f6) + f8;
                    Iterator it2 = list.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        int i6 = i5 + 1;
                        float f13 = f8;
                        canvas.drawText((String) it2.next(), f10, (this.f11494 * i5) + f12, paint);
                        i5 = i6;
                        f8 = f13;
                    }
                    i4++;
                    f7 = f11;
                }
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f11492.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11492.setColorFilter(colorFilter);
    }
}
