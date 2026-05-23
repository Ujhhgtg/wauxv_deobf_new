package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2681 extends AbstractC2686 {

    public final C2683 f8655;

    public C2681(C2683 c2683) {
        this.f8655 = c2683;
    }

    @Override // p000.AbstractC2686
    public final void mo4694(Matrix matrix, C2676 c2676, int i, Canvas canvas) {
        C2683 c2683 = this.f8655;
        float f = c2683.f8664;
        float f2 = c2683.f8665;
        RectF rectF = new RectF(c2683.f8660, c2683.f8661, c2683.f8662, c2683.f8663);
        Paint paint = c2676.f8621;
        boolean z = f2 < 0.0f;
        Path path = c2676.f8626;
        int[] iArr = C2676.f8618;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c2676.f8625;
            iArr[2] = c2676.f8624;
            iArr[3] = c2676.f8623;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c2676.f8623;
            iArr[2] = c2676.f8624;
            iArr[3] = c2676.f8625;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C2676.f8619;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c2676.f8627);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
