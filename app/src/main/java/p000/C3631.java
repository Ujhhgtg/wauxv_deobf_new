package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3631 extends Drawable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3630 f11342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Paint f11343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f11344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f11345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f11346;

    public C3631(C3630 c3630) {
        this.f11342 = c3630;
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setColor(c3630.f11337);
        paint.setTextSize(c3630.f11338);
        paint.setStyle(Paint.Style.FILL);
        this.f11343 = paint;
        List listM4842 = AbstractC2841.m4842(c3630.f11336, new char[]{'\n'});
        this.f11344 = listM4842;
        float fDescent = paint.descent() - paint.ascent();
        this.f11345 = fDescent;
        this.f11346 = (fDescent * listM4842.size()) + c3630.f11341;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = 2;
        float f2 = fWidth * f;
        float f3 = fHeight * f;
        List list = this.f11344;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        String str = (String) it.next();
        Paint paint = this.f11343;
        float fMeasureText = paint.measureText(str);
        while (it.hasNext()) {
            fMeasureText = Math.max(fMeasureText, paint.measureText((String) it.next()));
        }
        C3630 c3630 = this.f11342;
        float f4 = fMeasureText + c3630.f11340;
        float f5 = 1;
        int i = (int) ((f2 / f4) + f5);
        float f6 = this.f11346;
        int i2 = (int) ((f3 / f6) + f5);
        int iSave = canvas.save();
        canvas.rotate(c3630.f11339, fWidth / f, fHeight / f);
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
                        canvas.drawText((String) it2.next(), f10, (this.f11345 * i5) + f12, paint);
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
        this.f11343.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11343.setColorFilter(colorFilter);
    }
}
