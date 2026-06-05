package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸能不能ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1024feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1007feyxiexzfUjhhgtg[] f4010Ujhhgtgfeyxiexzf = new C1007feyxiexzfUjhhgtg[4];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Matrix[] f4011Ujhhgtgfeyxiexzf = new Matrix[4];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Matrix[] f4012Ujhhgtgfeyxiexzf = new Matrix[4];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final PointF f4013Ujhhgtgfeyxiexzf = new PointF();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Path f4014Ujhhgtgfeyxiexzf = new Path();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Path f4015Ujhhgtgfeyxiexzf = new Path();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C1007feyxiexzfUjhhgtg f4016Ujhhgtgfeyxiexzf = new C1007feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final float[] f4017Ujhhgtgfeyxiexzf = new float[2];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final float[] f4018Ujhhgtgfeyxiexzf = new float[2];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Path f4019Ujhhgtgfeyxiexzf = new Path();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Path f4020Ujhhgtgfeyxiexzf = new Path();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f4021Ujhhgtgfeyxiexzf = true;

    public C1024feyxiexzfUjhhgtg() {
        for (int i = 0; i < 4; i++) {
            this.f4010Ujhhgtgfeyxiexzf[i] = new C1007feyxiexzfUjhhgtg();
            this.f4011Ujhhgtgfeyxiexzf[i] = new Matrix();
            this.f4012Ujhhgtgfeyxiexzf[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2520Ujhhgtgfeyxiexzf(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg, float f, RectF rectF, C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        C1007feyxiexzfUjhhgtg[] c1007feyxiexzfUjhhgtgArr;
        char c;
        Matrix[] matrixArr2;
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg;
        char c2;
        InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf;
        AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg;
        path.rewind();
        Path path2 = this.f4014Ujhhgtgfeyxiexzf;
        path2.rewind();
        Path path3 = this.f4015Ujhhgtgfeyxiexzf;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            matrixArr = this.f4012Ujhhgtgfeyxiexzf;
            fArr = this.f4017Ujhhgtgfeyxiexzf;
            c1007feyxiexzfUjhhgtgArr = this.f4010Ujhhgtgfeyxiexzf;
            c = 0;
            matrixArr2 = this.f4011Ujhhgtgfeyxiexzf;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                interfaceC3736Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf;
            } else if (i2 != 2) {
                interfaceC3736Ujhhgtgfeyxiexzf = i2 != 3 ? c1017feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf : c1017feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf;
            } else {
                interfaceC3736Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf;
            }
            if (i2 == 1) {
                abstractC3612feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg.f3975Ujhhgtgfeyxiexzf;
            } else if (i2 != 2) {
                abstractC3612feyxiexzfUjhhgtg = i2 != 3 ? c1017feyxiexzfUjhhgtg.f3974Ujhhgtgfeyxiexzf : c1017feyxiexzfUjhhgtg.f3973Ujhhgtgfeyxiexzf;
            } else {
                abstractC3612feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg.f3976Ujhhgtgfeyxiexzf;
            }
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg = c1007feyxiexzfUjhhgtgArr[i2];
            abstractC3612feyxiexzfUjhhgtg.getClass();
            abstractC3612feyxiexzfUjhhgtg.mo2436Ujhhgtgfeyxiexzf(c1007feyxiexzfUjhhgtg, f, interfaceC3736Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = this.f4013Ujhhgtgfeyxiexzf;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg2 = c1007feyxiexzfUjhhgtgArr[i2];
            fArr[0] = c1007feyxiexzfUjhhgtg2.f3928Ujhhgtgfeyxiexzf;
            fArr[1] = c1007feyxiexzfUjhhgtg2.f3929Ujhhgtgfeyxiexzf;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        char c3 = 1;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg3 = c1007feyxiexzfUjhhgtgArr[i4];
            fArr[c] = c1007feyxiexzfUjhhgtg3.f3926Ujhhgtgfeyxiexzf;
            fArr[c3] = c1007feyxiexzfUjhhgtg3.f3927Ujhhgtgfeyxiexzf;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[c], fArr[c3]);
            } else {
                path.lineTo(fArr[c], fArr[c3]);
            }
            c1007feyxiexzfUjhhgtgArr[i4].m2504Ujhhgtgfeyxiexzf(matrixArr2[i4], path);
            if (c0709Ujhhgtgfeyxiexzf != null) {
                C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg4 = c1007feyxiexzfUjhhgtgArr[i4];
                Matrix matrix = matrixArr2[i4];
                C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = (C0226Ujhhgtgfeyxiexzf) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
                BitSet bitSet = c0226Ujhhgtgfeyxiexzf.f1530Ujhhgtgfeyxiexzf;
                c1007feyxiexzfUjhhgtg4.getClass();
                bitSet.set(i4, (boolean) c);
                AbstractC1004feyxiexzfUjhhgtg[] abstractC1004feyxiexzfUjhhgtgArr = c0226Ujhhgtgfeyxiexzf.f1528Ujhhgtgfeyxiexzf;
                c1007feyxiexzfUjhhgtg4.m2503Ujhhgtgfeyxiexzf(c1007feyxiexzfUjhhgtg4.f3931Ujhhgtgfeyxiexzf);
                abstractC1004feyxiexzfUjhhgtgArr[i4] = new C1025feyxiexzfUjhhgtg(new ArrayList(c1007feyxiexzfUjhhgtg4.f3933Ujhhgtgfeyxiexzf), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg5 = c1007feyxiexzfUjhhgtgArr[i4];
            fArr[0] = c1007feyxiexzfUjhhgtg5.f3928Ujhhgtgfeyxiexzf;
            fArr[1] = c1007feyxiexzfUjhhgtg5.f3929Ujhhgtgfeyxiexzf;
            matrixArr2[i4].mapPoints(fArr);
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg6 = c1007feyxiexzfUjhhgtgArr[i6];
            float f3 = c1007feyxiexzfUjhhgtg6.f3926Ujhhgtgfeyxiexzf;
            float[] fArr2 = this.f4018Ujhhgtgfeyxiexzf;
            fArr2[0] = f3;
            fArr2[1] = c1007feyxiexzfUjhhgtg6.f3927Ujhhgtgfeyxiexzf;
            matrixArr2[i6].mapPoints(fArr2);
            C1007feyxiexzfUjhhgtg[] c1007feyxiexzfUjhhgtgArr2 = c1007feyxiexzfUjhhgtgArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg7 = c1007feyxiexzfUjhhgtgArr2[i4];
            fArr[0] = c1007feyxiexzfUjhhgtg7.f3928Ujhhgtgfeyxiexzf;
            fArr[1] = c1007feyxiexzfUjhhgtg7.f3929Ujhhgtgfeyxiexzf;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg8 = this.f4016Ujhhgtgfeyxiexzf;
            c1007feyxiexzfUjhhgtg8.m2506Ujhhgtgfeyxiexzf(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c3382feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg.f3983Ujhhgtgfeyxiexzf;
            } else if (i4 != 2) {
                c3382feyxiexzfUjhhgtg = i4 != 3 ? c1017feyxiexzfUjhhgtg.f3982Ujhhgtgfeyxiexzf : c1017feyxiexzfUjhhgtg.f3981Ujhhgtgfeyxiexzf;
            } else {
                c3382feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg.f3984Ujhhgtgfeyxiexzf;
            }
            c3382feyxiexzfUjhhgtg.mo1288Ujhhgtgfeyxiexzf(fMax, fAbs, f, c1007feyxiexzfUjhhgtg8);
            Path path4 = this.f4019Ujhhgtgfeyxiexzf;
            path4.reset();
            c1007feyxiexzfUjhhgtg8.m2504Ujhhgtgfeyxiexzf(matrixArr[i4], path4);
            if (this.f4021Ujhhgtgfeyxiexzf && (c3382feyxiexzfUjhhgtg.mo2856Ujhhgtgfeyxiexzf() || m2521Ujhhgtgfeyxiexzf(path4, i4) || m2521Ujhhgtgfeyxiexzf(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c1007feyxiexzfUjhhgtg8.f3926Ujhhgtgfeyxiexzf;
                c3 = 1;
                fArr[1] = c1007feyxiexzfUjhhgtg8.f3927Ujhhgtgfeyxiexzf;
                matrixArr[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c1007feyxiexzfUjhhgtg8.m2504Ujhhgtgfeyxiexzf(matrixArr[i4], path2);
            } else {
                c3 = 1;
                c1007feyxiexzfUjhhgtg8.m2504Ujhhgtgfeyxiexzf(matrixArr[i4], path);
            }
            if (c0709Ujhhgtgfeyxiexzf != null) {
                Matrix matrix2 = matrixArr[i4];
                C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = (C0226Ujhhgtgfeyxiexzf) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
                c2 = 0;
                c0226Ujhhgtgfeyxiexzf2.f1530Ujhhgtgfeyxiexzf.set(i4 + 4, false);
                AbstractC1004feyxiexzfUjhhgtg[] abstractC1004feyxiexzfUjhhgtgArr2 = c0226Ujhhgtgfeyxiexzf2.f1529Ujhhgtgfeyxiexzf;
                c1007feyxiexzfUjhhgtg8.m2503Ujhhgtgfeyxiexzf(c1007feyxiexzfUjhhgtg8.f3931Ujhhgtgfeyxiexzf);
                abstractC1004feyxiexzfUjhhgtgArr2[i4] = new C1025feyxiexzfUjhhgtg(new ArrayList(c1007feyxiexzfUjhhgtg8.f3933Ujhhgtgfeyxiexzf), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            c = c2;
            c1007feyxiexzfUjhhgtgArr = c1007feyxiexzfUjhhgtgArr2;
            i4 = i5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m2521Ujhhgtgfeyxiexzf(Path path, int i) {
        Path path2 = this.f4020Ujhhgtgfeyxiexzf;
        path2.reset();
        this.f4010Ujhhgtgfeyxiexzf[i].m2504Ujhhgtgfeyxiexzf(this.f4011Ujhhgtgfeyxiexzf[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
