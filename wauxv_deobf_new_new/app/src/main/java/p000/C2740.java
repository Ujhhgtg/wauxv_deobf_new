package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2740 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2748[] f8811 = new C2748[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Matrix[] f8812 = new Matrix[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Matrix[] f8813 = new Matrix[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final PointF f8814 = new PointF();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Path f8815 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Path f8816 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2748 f8817 = new C2748();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float[] f8818 = new float[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float[] f8819 = new float[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Path f8820 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Path f8821 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean f8822 = true;

    public C2740() {
        for (int i = 0; i < 4; i++) {
            this.f8811[i] = new C2748();
            this.f8812[i] = new Matrix();
            this.f8813[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4729(C2738 c2738, float f, RectF rectF, C1681 c1681, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        C2748[] c2748Arr;
        char c;
        Matrix[] matrixArr2;
        C1139 c1139;
        char c2;
        InterfaceC0873 interfaceC0873;
        AbstractC1471 abstractC1471;
        path.rewind();
        Path path2 = this.f8815;
        path2.rewind();
        Path path3 = this.f8816;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            matrixArr = this.f8813;
            fArr = this.f8818;
            c2748Arr = this.f8811;
            c = 0;
            matrixArr2 = this.f8812;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                interfaceC0873 = c2738.f8804;
            } else if (i2 != 2) {
                interfaceC0873 = i2 != 3 ? c2738.f8803 : c2738.f8802;
            } else {
                interfaceC0873 = c2738.f8805;
            }
            if (i2 == 1) {
                abstractC1471 = c2738.f8800;
            } else if (i2 != 2) {
                abstractC1471 = i2 != 3 ? c2738.f8799 : c2738.f8798;
            } else {
                abstractC1471 = c2738.f8801;
            }
            C2748 c2748 = c2748Arr[i2];
            abstractC1471.getClass();
            abstractC1471.mo2557(c2748, f, interfaceC0873.mo1060(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = this.f8814;
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
            C2748 c2749 = c2748Arr[i2];
            fArr[0] = c2749.f8843;
            fArr[1] = c2749.f8844;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        char c3 = 1;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            C2748 c27410 = c2748Arr[i4];
            fArr[c] = c27410.f8841;
            fArr[c3] = c27410.f8842;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[c], fArr[c3]);
            } else {
                path.lineTo(fArr[c], fArr[c3]);
            }
            c2748Arr[i4].m4735(matrixArr2[i4], path);
            if (c1681 != null) {
                C2748 c27411 = c2748Arr[i4];
                Matrix matrix = matrixArr2[i4];
                C1948 c1948 = (C1948) c1681.f5660;
                BitSet bitSet = c1948.f6440;
                c27411.getClass();
                bitSet.set(i4, (boolean) c);
                AbstractC2747[] abstractC2747Arr = c1948.f6438;
                c27411.m4734(c27411.f8846);
                abstractC2747Arr[i4] = new C2741(new ArrayList(c27411.f8848), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C2748 c27412 = c2748Arr[i4];
            fArr[0] = c27412.f8843;
            fArr[1] = c27412.f8844;
            matrixArr2[i4].mapPoints(fArr);
            C2748 c27413 = c2748Arr[i6];
            float f3 = c27413.f8841;
            float[] fArr2 = this.f8819;
            fArr2[0] = f3;
            fArr2[1] = c27413.f8842;
            matrixArr2[i6].mapPoints(fArr2);
            C2748[] c2748Arr2 = c2748Arr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C2748 c27414 = c2748Arr2[i4];
            fArr[0] = c27414.f8843;
            fArr[1] = c27414.f8844;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            C2748 c27415 = this.f8817;
            c27415.m4737(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c1139 = c2738.f8808;
            } else if (i4 != 2) {
                c1139 = i4 != 3 ? c2738.f8807 : c2738.f8806;
            } else {
                c1139 = c2738.f8809;
            }
            c1139.mo2872(fMax, fAbs, f, c27415);
            Path path4 = this.f8820;
            path4.reset();
            c27415.m4735(matrixArr[i4], path4);
            if (this.f8822 && (c1139.mo2871() || m4730(path4, i4) || m4730(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c27415.f8841;
                c3 = 1;
                fArr[1] = c27415.f8842;
                matrixArr[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c27415.m4735(matrixArr[i4], path2);
            } else {
                c3 = 1;
                c27415.m4735(matrixArr[i4], path);
            }
            if (c1681 != null) {
                Matrix matrix2 = matrixArr[i4];
                C1948 c1949 = (C1948) c1681.f5660;
                c2 = 0;
                c1949.f6440.set(i4 + 4, false);
                AbstractC2747[] abstractC2747Arr2 = c1949.f6439;
                c27415.m4734(c27415.f8846);
                abstractC2747Arr2[i4] = new C2741(new ArrayList(c27415.f8848), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            c = c2;
            c2748Arr = c2748Arr2;
            i4 = i5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m4730(Path path, int i) {
        Path path2 = this.f8821;
        path2.reset();
        this.f8811[i].m4735(this.f8812[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
