package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤞᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2682 extends AbstractC2686 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2684 f8656;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f8657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f8658;

    public C2682(C2684 c2684, float f, float f2) {
        this.f8656 = c2684;
        this.f8657 = f;
        this.f8658 = f2;
    }

    @Override // p000.AbstractC2686
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4694(Matrix matrix, C2676 c2676, int i, Canvas canvas) {
        C2684 c2684 = this.f8656;
        float f = c2684.f8667;
        float f2 = this.f8658;
        float f3 = c2684.f8666;
        float f4 = this.f8657;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f8670;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m4695());
        
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c2676.f8625;
        int[] iArr = C2676.f8616;
        iArr[0] = i2;
        iArr[1] = c2676.f8624;
        iArr[2] = c2676.f8623;
        Paint paint = c2676.f8622;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C2676.f8617, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float m4695() {
        C2684 c2684 = this.f8656;
        return (float) Math.toDegrees(Math.atan((c2684.f8667 - this.f8658) / (c2684.f8666 - this.f8657)));
    }
}
