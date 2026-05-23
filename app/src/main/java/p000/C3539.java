package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤞᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3539 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final Matrix f11092 = new Matrix();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Path f11093;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Path f11094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Matrix f11095;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Paint f11096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Paint f11097;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public PathMeasure f11098;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3536 f11099;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f11100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f11101;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f11102;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f11103;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f11104;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String f11105;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Boolean f11106;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C0264 f11107;

    public C3539() {
        this.f11095 = new Matrix();
        this.f11100 = 0.0f;
        this.f11101 = 0.0f;
        this.f11102 = 0.0f;
        this.f11103 = 0.0f;
        this.f11104 = 255;
        this.f11105 = null;
        this.f11106 = null;
        this.f11107 = new C0264(0);
        this.f11099 = new C3536();
        this.f11093 = new Path();
        this.f11094 = new Path();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f11104;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f11104 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m5131(C3536 c3536, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = c3536.f11078;
        ArrayList arrayList = c3536.f11079;
        matrix2.set(matrix);
        Matrix matrix3 = c3536.f11078;
        matrix3.preConcat(c3536.f11087);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC3537 abstractC3537 = (AbstractC3537) arrayList.get(i5);
            if (abstractC3537 instanceof C3536) {
                m5131((C3536) abstractC3537, matrix3, canvas, i, i2);
            } else {
                if (abstractC3537 instanceof AbstractC3538) {
                    AbstractC3538 abstractC3538 = (AbstractC3538) abstractC3537;
                    float f2 = i / this.f11102;
                    float f3 = i2 / this.f11103;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.f11095;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
                    boolean z = 0;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f11093;
                        path.reset();
                        C2341[] c2341Arr = abstractC3538.f11089;
                        if (c2341Arr != null) {
                            C2341.m4329(c2341Arr, path);
                        }
                        Path path2 = this.f11094;
                        path2.reset();
                        if (abstractC3538 instanceof C3534) {
                            path2.setFillType(abstractC3538.f11091 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C3535 c3535 = (C3535) abstractC3538;
                            float f5 = c3535.f11072;
                            if (f5 != 0.0f || c3535.f11073 != 1.0f) {
                                float f6 = c3535.f11074;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (c3535.f11073 + f6) % 1.0f;
                                if (this.f11098 == null) {
                                    this.f11098 = new PathMeasure();
                                }
                                this.f11098.setPath(path, z);
                                float length = this.f11098.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                if (f9 > f10) {
                                    this.f11098.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f11098.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f11098.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(0.0f, 0.0f);
                            }
                            path2.addPath(path, matrix4);
                            C0221 c0221 = c3535.f11069;
                            float f11 = 255.0f;
                            if (((Shader) c0221.f1352) == null && c0221.f1351 == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.f11097 == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f11097 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.f11097;
                                Shader shader = (Shader) c0221.f1352;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c3535.f11071 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c0221.f1351;
                                    float f12 = c3535.f11071;
                                    PorterDuff.Mode mode = C3542.f11121;
                                    paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(c3535.f11091 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C0221 c0222 = c3535.f11067;
                            if (((Shader) c0222.f1352) != null || c0222.f1351 != 0) {
                                if (this.f11096 == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f11096 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f11096;
                                Paint.Join join = c3535.f11076;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c3535.f11075;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c3535.f11077);
                                Shader shader2 = (Shader) c0222.f1352;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c3535.f11070 * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = c0222.f1351;
                                    float f13 = c3535.f11070;
                                    PorterDuff.Mode mode2 = C3542.f11121;
                                    paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c3535.f11068 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public C3539(C3539 c3539) {
        this.f11095 = new Matrix();
        this.f11100 = 0.0f;
        this.f11101 = 0.0f;
        this.f11102 = 0.0f;
        this.f11103 = 0.0f;
        this.f11104 = 255;
        this.f11105 = null;
        this.f11106 = null;
        C0264 c0264 = new C0264(0);
        this.f11107 = c0264;
        this.f11099 = new C3536(c3539.f11099, c0264);
        this.f11093 = new Path(c3539.f11093);
        this.f11094 = new Path(c3539.f11094);
        this.f11100 = c3539.f11100;
        this.f11101 = c3539.f11101;
        this.f11102 = c3539.f11102;
        this.f11103 = c3539.f11103;
        this.f11104 = c3539.f11104;
        this.f11105 = c3539.f11105;
        String str = c3539.f11105;
        if (str != null) {
            c0264.put(str, this);
        }
        this.f11106 = c3539.f11106;
    }
}
