package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1021feyxiexzfUjhhgtg extends AbstractC1004feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1023feyxiexzfUjhhgtg f4000Ujhhgtgfeyxiexzf;

    public C1021feyxiexzfUjhhgtg(C1023feyxiexzfUjhhgtg c1023feyxiexzfUjhhgtg) {
        this.f4000Ujhhgtgfeyxiexzf = c1023feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC1004feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2501Ujhhgtgfeyxiexzf(Matrix matrix, C1015feyxiexzfUjhhgtg c1015feyxiexzfUjhhgtg, int i, Canvas canvas) {
        C1023feyxiexzfUjhhgtg c1023feyxiexzfUjhhgtg = this.f4000Ujhhgtgfeyxiexzf;
        float f = c1023feyxiexzfUjhhgtg.f4008Ujhhgtgfeyxiexzf;
        float f2 = c1023feyxiexzfUjhhgtg.f4009Ujhhgtgfeyxiexzf;
        RectF rectF = new RectF(c1023feyxiexzfUjhhgtg.f4004Ujhhgtgfeyxiexzf, c1023feyxiexzfUjhhgtg.f4005Ujhhgtgfeyxiexzf, c1023feyxiexzfUjhhgtg.f4006Ujhhgtgfeyxiexzf, c1023feyxiexzfUjhhgtg.f4007Ujhhgtgfeyxiexzf);
        Paint paint = c1015feyxiexzfUjhhgtg.f3965Ujhhgtgfeyxiexzf;
        boolean z = f2 < 0.0f;
        Path path = c1015feyxiexzfUjhhgtg.f3970Ujhhgtgfeyxiexzf;
        int[] iArr = C1015feyxiexzfUjhhgtg.f3962Ujhhgtgfeyxiexzf;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c1015feyxiexzfUjhhgtg.f3969Ujhhgtgfeyxiexzf;
            iArr[2] = c1015feyxiexzfUjhhgtg.f3968Ujhhgtgfeyxiexzf;
            iArr[3] = c1015feyxiexzfUjhhgtg.f3967Ujhhgtgfeyxiexzf;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c1015feyxiexzfUjhhgtg.f3967Ujhhgtgfeyxiexzf;
            iArr[2] = c1015feyxiexzfUjhhgtg.f3968Ujhhgtgfeyxiexzf;
            iArr[3] = c1015feyxiexzfUjhhgtg.f3969Ujhhgtgfeyxiexzf;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C1015feyxiexzfUjhhgtg.f3963Ujhhgtgfeyxiexzf;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1015feyxiexzfUjhhgtg.f3971Ujhhgtgfeyxiexzf);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
