package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᲁᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2743 extends AbstractC2747 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2745 f8826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f8827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f8828;

    public C2743(C2745 c2745, float f, float f2) {
        this.f8826 = c2745;
        this.f8827 = f;
        this.f8828 = f2;
    }

    @Override // p000.AbstractC2747
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4731(Matrix matrix, C2736 c2736, int i, Canvas canvas) {
        C2745 c2745 = this.f8826;
        float f = c2745.f8837;
        float f2 = this.f8828;
        float f3 = c2745.f8836;
        float f4 = this.f8827;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f8840;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m4732());
        c2736.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c2736.f8783;
        int[] iArr = C2736.f8774;
        iArr[0] = i2;
        iArr[1] = c2736.f8782;
        iArr[2] = c2736.f8781;
        Paint paint = c2736.f8780;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C2736.f8775, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float m4732() {
        C2745 c2745 = this.f8826;
        return (float) Math.toDegrees(Math.atan((c2745.f8837 - this.f8828) / (c2745.f8836 - this.f8827)));
    }
}
