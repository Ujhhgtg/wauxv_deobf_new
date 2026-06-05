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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1878feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Matrix f6261Ujhhgtgfeyxiexzf = new Matrix();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Path f6262Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Path f6263Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Matrix f6264Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Paint f6265Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Paint f6266Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public PathMeasure f6267Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C1882feyxiexzfUjhhgtg f6268Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f6269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f6270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f6271Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f6272Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f6273Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public String f6274Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public Boolean f6275Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C2412Ujhhgtgfeyxiexzf f6276Ujhhgtgfeyxiexzf;

    public C1878feyxiexzfUjhhgtg() {
        this.f6264Ujhhgtgfeyxiexzf = new Matrix();
        this.f6269Ujhhgtgfeyxiexzf = 0.0f;
        this.f6270Ujhhgtgfeyxiexzf = 0.0f;
        this.f6271Ujhhgtgfeyxiexzf = 0.0f;
        this.f6272Ujhhgtgfeyxiexzf = 0.0f;
        this.f6273Ujhhgtgfeyxiexzf = 255;
        this.f6274Ujhhgtgfeyxiexzf = null;
        this.f6275Ujhhgtgfeyxiexzf = null;
        this.f6276Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
        this.f6268Ujhhgtgfeyxiexzf = new C1882feyxiexzfUjhhgtg();
        this.f6262Ujhhgtgfeyxiexzf = new Path();
        this.f6263Ujhhgtgfeyxiexzf = new Path();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f6273Ujhhgtgfeyxiexzf;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f6273Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3206Ujhhgtgfeyxiexzf(C1882feyxiexzfUjhhgtg c1882feyxiexzfUjhhgtg, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = c1882feyxiexzfUjhhgtg.f6293Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c1882feyxiexzfUjhhgtg.f6294Ujhhgtgfeyxiexzf;
        matrix2.set(matrix);
        Matrix matrix3 = c1882feyxiexzfUjhhgtg.f6293Ujhhgtgfeyxiexzf;
        matrix3.preConcat(c1882feyxiexzfUjhhgtg.f6302Ujhhgtgfeyxiexzf);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC1883feyxiexzfUjhhgtg abstractC1883feyxiexzfUjhhgtg = (AbstractC1883feyxiexzfUjhhgtg) arrayList.get(i5);
            if (abstractC1883feyxiexzfUjhhgtg instanceof C1882feyxiexzfUjhhgtg) {
                m3206Ujhhgtgfeyxiexzf((C1882feyxiexzfUjhhgtg) abstractC1883feyxiexzfUjhhgtg, matrix3, canvas, i, i2);
            } else {
                if (abstractC1883feyxiexzfUjhhgtg instanceof AbstractC1879feyxiexzfUjhhgtg) {
                    AbstractC1879feyxiexzfUjhhgtg abstractC1879feyxiexzfUjhhgtg = (AbstractC1879feyxiexzfUjhhgtg) abstractC1883feyxiexzfUjhhgtg;
                    float f2 = i / this.f6271Ujhhgtgfeyxiexzf;
                    float f3 = i2 / this.f6272Ujhhgtgfeyxiexzf;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.f6264Ujhhgtgfeyxiexzf;
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
                        Path path = this.f6262Ujhhgtgfeyxiexzf;
                        path.reset();
                        C1386feyxiexzfUjhhgtg[] c1386feyxiexzfUjhhgtgArr = abstractC1879feyxiexzfUjhhgtg.f6277Ujhhgtgfeyxiexzf;
                        if (c1386feyxiexzfUjhhgtgArr != null) {
                            C1386feyxiexzfUjhhgtg.m2876Ujhhgtgfeyxiexzf(c1386feyxiexzfUjhhgtgArr, path);
                        }
                        Path path2 = this.f6263Ujhhgtgfeyxiexzf;
                        path2.reset();
                        if (abstractC1879feyxiexzfUjhhgtg instanceof C1848Ujhhgtgfeyxiexzf) {
                            path2.setFillType(abstractC1879feyxiexzfUjhhgtg.f6279Ujhhgtgfeyxiexzf == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C1849Ujhhgtgfeyxiexzf c1849Ujhhgtgfeyxiexzf = (C1849Ujhhgtgfeyxiexzf) abstractC1879feyxiexzfUjhhgtg;
                            float f5 = c1849Ujhhgtgfeyxiexzf.f6196Ujhhgtgfeyxiexzf;
                            if (f5 != 0.0f || c1849Ujhhgtgfeyxiexzf.f6197Ujhhgtgfeyxiexzf != 1.0f) {
                                float f6 = c1849Ujhhgtgfeyxiexzf.f6198Ujhhgtgfeyxiexzf;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (c1849Ujhhgtgfeyxiexzf.f6197Ujhhgtgfeyxiexzf + f6) % 1.0f;
                                if (this.f6267Ujhhgtgfeyxiexzf == null) {
                                    this.f6267Ujhhgtgfeyxiexzf = new PathMeasure();
                                }
                                this.f6267Ujhhgtgfeyxiexzf.setPath(path, z);
                                float length = this.f6267Ujhhgtgfeyxiexzf.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                if (f9 > f10) {
                                    this.f6267Ujhhgtgfeyxiexzf.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f6267Ujhhgtgfeyxiexzf.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f6267Ujhhgtgfeyxiexzf.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = c1849Ujhhgtgfeyxiexzf.f6193Ujhhgtgfeyxiexzf;
                            float f11 = 255.0f;
                            if (((Shader) c2344Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf) == null && c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.f6266Ujhhgtgfeyxiexzf == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f6266Ujhhgtgfeyxiexzf = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.f6266Ujhhgtgfeyxiexzf;
                                Shader shader = (Shader) c2344Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c1849Ujhhgtgfeyxiexzf.f6195Ujhhgtgfeyxiexzf * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                                    float f12 = c1849Ujhhgtgfeyxiexzf.f6195Ujhhgtgfeyxiexzf;
                                    PorterDuff.Mode mode = C1888feyxiexzfUjhhgtg.f6321Ujhhgtgfeyxiexzf;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(c1849Ujhhgtgfeyxiexzf.f6279Ujhhgtgfeyxiexzf == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf2 = c1849Ujhhgtgfeyxiexzf.f6191Ujhhgtgfeyxiexzf;
                            if (((Shader) c2344Ujhhgtgfeyxiexzf2.f7649Ujhhgtgfeyxiexzf) != null || c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf != 0) {
                                if (this.f6265Ujhhgtgfeyxiexzf == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f6265Ujhhgtgfeyxiexzf = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f6265Ujhhgtgfeyxiexzf;
                                Paint.Join join = c1849Ujhhgtgfeyxiexzf.f6200Ujhhgtgfeyxiexzf;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c1849Ujhhgtgfeyxiexzf.f6199Ujhhgtgfeyxiexzf;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c1849Ujhhgtgfeyxiexzf.f6201Ujhhgtgfeyxiexzf);
                                Shader shader2 = (Shader) c2344Ujhhgtgfeyxiexzf2.f7649Ujhhgtgfeyxiexzf;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c1849Ujhhgtgfeyxiexzf.f6194Ujhhgtgfeyxiexzf * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf;
                                    float f13 = c1849Ujhhgtgfeyxiexzf.f6194Ujhhgtgfeyxiexzf;
                                    PorterDuff.Mode mode2 = C1888feyxiexzfUjhhgtg.f6321Ujhhgtgfeyxiexzf;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c1849Ujhhgtgfeyxiexzf.f6192Ujhhgtgfeyxiexzf * fMin * fAbs);
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

    public C1878feyxiexzfUjhhgtg(C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg) {
        this.f6264Ujhhgtgfeyxiexzf = new Matrix();
        this.f6269Ujhhgtgfeyxiexzf = 0.0f;
        this.f6270Ujhhgtgfeyxiexzf = 0.0f;
        this.f6271Ujhhgtgfeyxiexzf = 0.0f;
        this.f6272Ujhhgtgfeyxiexzf = 0.0f;
        this.f6273Ujhhgtgfeyxiexzf = 255;
        this.f6274Ujhhgtgfeyxiexzf = null;
        this.f6275Ujhhgtgfeyxiexzf = null;
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
        this.f6276Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
        this.f6268Ujhhgtgfeyxiexzf = new C1882feyxiexzfUjhhgtg(c1878feyxiexzfUjhhgtg.f6268Ujhhgtgfeyxiexzf, c2412Ujhhgtgfeyxiexzf);
        this.f6262Ujhhgtgfeyxiexzf = new Path(c1878feyxiexzfUjhhgtg.f6262Ujhhgtgfeyxiexzf);
        this.f6263Ujhhgtgfeyxiexzf = new Path(c1878feyxiexzfUjhhgtg.f6263Ujhhgtgfeyxiexzf);
        this.f6269Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6269Ujhhgtgfeyxiexzf;
        this.f6270Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6270Ujhhgtgfeyxiexzf;
        this.f6271Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6271Ujhhgtgfeyxiexzf;
        this.f6272Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6272Ujhhgtgfeyxiexzf;
        this.f6273Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6273Ujhhgtgfeyxiexzf;
        this.f6274Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6274Ujhhgtgfeyxiexzf;
        String str = c1878feyxiexzfUjhhgtg.f6274Ujhhgtgfeyxiexzf;
        if (str != null) {
            c2412Ujhhgtgfeyxiexzf.put(str, this);
        }
        this.f6275Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf;
    }
}
