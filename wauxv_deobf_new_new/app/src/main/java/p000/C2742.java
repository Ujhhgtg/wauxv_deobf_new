package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᲁᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2742 extends AbstractC2747 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2744 f8825;

    public C2742(C2744 c2744) {
        this.f8825 = c2744;
    }

    @Override // p000.AbstractC2747
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4731(Matrix matrix, C2736 c2736, int i, Canvas canvas) {
        C2744 c2744 = this.f8825;
        float f = c2744.f8834;
        float f2 = c2744.f8835;
        RectF rectF = new RectF(c2744.f8830, c2744.f8831, c2744.f8832, c2744.f8833);
        Paint paint = c2736.f8779;
        boolean z = f2 < 0.0f;
        Path path = c2736.f8784;
        int[] iArr = C2736.f8776;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c2736.f8783;
            iArr[2] = c2736.f8782;
            iArr[3] = c2736.f8781;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c2736.f8781;
            iArr[2] = c2736.f8782;
            iArr[3] = c2736.f8783;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C2736.f8777;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c2736.f8785);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
