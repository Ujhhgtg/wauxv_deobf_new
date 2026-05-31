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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᲀᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3597 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final Matrix f11241 = new Matrix();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Path f11242;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Path f11243;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Matrix f11244;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Paint f11245;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Paint f11246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public PathMeasure f11247;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3594 f11248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f11249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f11250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f11251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f11252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f11253;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String f11254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Boolean f11255;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C0274 f11256;

    public C3597() {
        this.f11244 = new Matrix();
        this.f11249 = 0.0f;
        this.f11250 = 0.0f;
        this.f11251 = 0.0f;
        this.f11252 = 0.0f;
        this.f11253 = 255;
        this.f11254 = null;
        this.f11255 = null;
        this.f11256 = new C0274(0);
        this.f11248 = new C3594();
        this.f11242 = new Path();
        this.f11243 = new Path();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f11253;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f11253 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m5137(C3594 c3594, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = c3594.f11227;
        ArrayList arrayList = c3594.f11228;
        matrix2.set(matrix);
        Matrix matrix3 = c3594.f11227;
        matrix3.preConcat(c3594.f11236);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC3595 abstractC3595 = (AbstractC3595) arrayList.get(i5);
            if (abstractC3595 instanceof C3594) {
                m5137((C3594) abstractC3595, matrix3, canvas, i, i2);
            } else {
                if (abstractC3595 instanceof AbstractC3596) {
                    AbstractC3596 abstractC3596 = (AbstractC3596) abstractC3595;
                    float f2 = i / this.f11251;
                    float f3 = i2 / this.f11252;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.f11244;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f11242;
                        path.reset();
                        C2380[] c2380Arr = abstractC3596.f11238;
                        if (c2380Arr != null) {
                            C2380.m4343(c2380Arr, path);
                        }
                        Path path2 = this.f11243;
                        path2.reset();
                        if (abstractC3596 instanceof C3592) {
                            path2.setFillType(abstractC3596.f11240 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C3593 c3593 = (C3593) abstractC3596;
                            float f5 = c3593.f11221;
                            if (f5 != 0.0f || c3593.f11222 != 1.0f) {
                                float f6 = c3593.f11223;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (c3593.f11222 + f6) % 1.0f;
                                if (this.f11247 == null) {
                                    this.f11247 = new PathMeasure();
                                }
                                this.f11247.setPath(path, z);
                                float length = this.f11247.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                if (f9 > f10) {
                                    this.f11247.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f11247.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f11247.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            C0231 c0231 = c3593.f11218;
                            float f11 = 255.0f;
                            if (((Shader) c0231.f1426) == null && c0231.f1425 == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.f11246 == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f11246 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.f11246;
                                Shader shader = (Shader) c0231.f1426;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c3593.f11220 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c0231.f1425;
                                    float f12 = c3593.f11220;
                                    PorterDuff.Mode mode = C3600.f11270;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(c3593.f11240 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C0231 c0232 = c3593.f11216;
                            if (((Shader) c0232.f1426) != null || c0232.f1425 != 0) {
                                if (this.f11245 == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f11245 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f11245;
                                Paint.Join join = c3593.f11225;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c3593.f11224;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c3593.f11226);
                                Shader shader2 = (Shader) c0232.f1426;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c3593.f11219 * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = c0232.f1425;
                                    float f13 = c3593.f11219;
                                    PorterDuff.Mode mode2 = C3600.f11270;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c3593.f11217 * fMin * fAbs);
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

    public C3597(C3597 c3597) {
        this.f11244 = new Matrix();
        this.f11249 = 0.0f;
        this.f11250 = 0.0f;
        this.f11251 = 0.0f;
        this.f11252 = 0.0f;
        this.f11253 = 255;
        this.f11254 = null;
        this.f11255 = null;
        C0274 c0274 = new C0274(0);
        this.f11256 = c0274;
        this.f11248 = new C3594(c3597.f11248, c0274);
        this.f11242 = new Path(c3597.f11242);
        this.f11243 = new Path(c3597.f11243);
        this.f11249 = c3597.f11249;
        this.f11250 = c3597.f11250;
        this.f11251 = c3597.f11251;
        this.f11252 = c3597.f11252;
        this.f11253 = c3597.f11253;
        this.f11254 = c3597.f11254;
        String str = c3597.f11254;
        if (str != null) {
            c0274.put(str, this);
        }
        this.f11255 = c3597.f11255;
    }
}
