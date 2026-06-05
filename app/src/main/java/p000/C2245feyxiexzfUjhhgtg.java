package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2245feyxiexzfUjhhgtg extends Drawable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2244feyxiexzfUjhhgtg f7297Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Paint f7298Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f7299Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f7300Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f7301Ujhhgtgfeyxiexzf;

    public C2245feyxiexzfUjhhgtg(C2244feyxiexzfUjhhgtg c2244feyxiexzfUjhhgtg) {
        this.f7297Ujhhgtgfeyxiexzf = c2244feyxiexzfUjhhgtg;
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setColor(c2244feyxiexzfUjhhgtg.f7292Ujhhgtgfeyxiexzf);
        paint.setTextSize(c2244feyxiexzfUjhhgtg.f7293Ujhhgtgfeyxiexzf);
        paint.setStyle(Paint.Style.FILL);
        this.f7298Ujhhgtgfeyxiexzf = paint;
        List listM2637Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(c2244feyxiexzfUjhhgtg.f7291Ujhhgtgfeyxiexzf, new char[]{'\n'});
        this.f7299Ujhhgtgfeyxiexzf = listM2637Ujhhgtgfeyxiexzf;
        float fDescent = paint.descent() - paint.ascent();
        this.f7300Ujhhgtgfeyxiexzf = fDescent;
        this.f7301Ujhhgtgfeyxiexzf = (fDescent * listM2637Ujhhgtgfeyxiexzf.size()) + c2244feyxiexzfUjhhgtg.f7296Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = 2;
        float f2 = fWidth * f;
        float f3 = fHeight * f;
        List list = this.f7299Ujhhgtgfeyxiexzf;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        String str = (String) it.next();
        Paint paint = this.f7298Ujhhgtgfeyxiexzf;
        float fMeasureText = paint.measureText(str);
        while (it.hasNext()) {
            fMeasureText = Math.max(fMeasureText, paint.measureText((String) it.next()));
        }
        C2244feyxiexzfUjhhgtg c2244feyxiexzfUjhhgtg = this.f7297Ujhhgtgfeyxiexzf;
        float f4 = fMeasureText + c2244feyxiexzfUjhhgtg.f7295Ujhhgtgfeyxiexzf;
        float f5 = 1;
        int i = (int) ((f2 / f4) + f5);
        float f6 = this.f7301Ujhhgtgfeyxiexzf;
        int i2 = (int) ((f3 / f6) + f5);
        int iSave = canvas.save();
        canvas.rotate(c2244feyxiexzfUjhhgtg.f7294Ujhhgtgfeyxiexzf, fWidth / f, fHeight / f);
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
                        canvas.drawText((String) it2.next(), f10, (this.f7300Ujhhgtgfeyxiexzf * i5) + f12, paint);
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
        this.f7298Ujhhgtgfeyxiexzf.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7298Ujhhgtgfeyxiexzf.setColorFilter(colorFilter);
    }
}
