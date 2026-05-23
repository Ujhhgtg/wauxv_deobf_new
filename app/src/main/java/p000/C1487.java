package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1487 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int[] f5279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f5280;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f5281 = 8.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float f5282 = 8.0f;

    public C1487(int[] iArr, int i) {
        this.f5279 = iArr;
        this.f5280 = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fMeasureText = paint.measureText(charSequence, i, i2);
        float f2 = i4;
        float f3 = paint.getFontMetrics().ascent + f2;
        float f4 = 8.0f;
        RectF rectF = new RectF(f, f3, (16.0f) + fMeasureText + f, paint.getFontMetrics().descent + f2);
        int color = paint.getColor();
        Shader shader = paint.getShader();
        paint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f5279, (float[]) null, Shader.TileMode.CLAMP));
        float f5 = 8.0f;
        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
        paint.setColor(this.f5280);
        paint.setShader(null);
        canvas.drawText(charSequence, i, i2, f + 8.0f, f2, paint);
        paint.setColor(color);
        paint.setShader(shader);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) ((16.0f) + paint.measureText(charSequence, i, i2));
    }
}
