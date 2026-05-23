package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤞᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2679 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2687[] f8641 = new C2687[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Matrix[] f8642 = new Matrix[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Matrix[] f8643 = new Matrix[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final PointF f8644 = new PointF();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Path f8645 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Path f8646 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2687 f8647 = new C2687();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float[] f8648 = new float[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float[] f8649 = new float[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Path f8650 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Path f8651 = new Path();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean f8652 = true;

    public C2679() {
        for (int i = 0; i < 4; i++) {
            this.f8641[i] = new C2687();
            this.f8642[i] = new Matrix();
            this.f8643[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4692(C2677 c2677, float f, RectF rectF, C1744 c1744, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        C2687[] c2687Arr;
        char c;
        Matrix[] matrixArr2;
        C1133 c1133;
        char c2;
        InterfaceC0874 interfaceC0874;
        AbstractC2207 abstractC2207;
        path.rewind();
        Path path2 = this.f8645;
        path2.rewind();
        Path path3 = this.f8646;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            matrixArr = this.f8643;
            fArr = this.f8648;
            c2687Arr = this.f8641;
            c = 0;
            matrixArr2 = this.f8642;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                interfaceC0874 = c2677.f8634;
            } else if (i2 != 2) {
                interfaceC0874 = i2 != 3 ? c2677.f8633 : c2677.f8632;
            } else {
                interfaceC0874 = c2677.f8635;
            }
            if (i2 == 1) {
                abstractC2207 = c2677.f8630;
            } else if (i2 != 2) {
                abstractC2207 = i2 != 3 ? c2677.f8629 : c2677.f8628;
            } else {
                abstractC2207 = c2677.f8631;
            }
            C2687 c2687 = c2687Arr[i2];
            abstractC2207.getClass();
            abstractC2207.mo2438(c2687, f, interfaceC0874.mo916(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = this.f8644;
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
            C2687 c2688 = c2687Arr[i2];
            fArr[0] = c2688.f8673;
            fArr[1] = c2688.f8674;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        char c3 = 1;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            C2687 c2689 = c2687Arr[i4];
            fArr[c] = c2689.f8671;
            fArr[c3] = c2689.f8672;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[c], fArr[c3]);
            } else {
                path.lineTo(fArr[c], fArr[c3]);
            }
            c2687Arr[i4].m4698(matrixArr2[i4], path);
            if (c1744 != null) {
                C2687 c26810 = c2687Arr[i4];
                Matrix matrix = matrixArr2[i4];
                C1917 c1917 = (C1917) c1744.f5843;
                BitSet bitSet = c1917.f6335;
                c26810.getClass();
                bitSet.set(i4, (boolean) c);
                AbstractC2686[] abstractC2686Arr = c1917.f6333;
                c26810.m4697(c26810.f8676);
                abstractC2686Arr[i4] = new C2680(new ArrayList(c26810.f8678), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C2687 c26811 = c2687Arr[i4];
            fArr[0] = c26811.f8673;
            fArr[1] = c26811.f8674;
            matrixArr2[i4].mapPoints(fArr);
            C2687 c26812 = c2687Arr[i6];
            float f3 = c26812.f8671;
            float[] fArr2 = this.f8649;
            fArr2[0] = f3;
            fArr2[1] = c26812.f8672;
            matrixArr2[i6].mapPoints(fArr2);
            C2687[] c2687Arr2 = c2687Arr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C2687 c26813 = c2687Arr2[i4];
            fArr[0] = c26813.f8673;
            fArr[1] = c26813.f8674;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            C2687 c26814 = this.f8647;
            c26814.m4700(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c1133 = c2677.f8638;
            } else if (i4 != 2) {
                c1133 = i4 != 3 ? c2677.f8637 : c2677.f8636;
            } else {
                c1133 = c2677.f8639;
            }
            c1133.mo2729(fMax, fAbs, f, c26814);
            Path path4 = this.f8650;
            path4.reset();
            c26814.m4698(matrixArr[i4], path4);
            if (this.f8652 && (c1133.mo2728() || m4693(path4, i4) || m4693(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c26814.f8671;
                c3 = 1;
                fArr[1] = c26814.f8672;
                matrixArr[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c26814.m4698(matrixArr[i4], path2);
            } else {
                c3 = 1;
                c26814.m4698(matrixArr[i4], path);
            }
            if (c1744 != null) {
                Matrix matrix2 = matrixArr[i4];
                C1917 c1918 = (C1917) c1744.f5843;
                c2 = 0;
                c1918.f6335.set(i4 + 4, false);
                AbstractC2686[] abstractC2686Arr2 = c1918.f6334;
                c26814.m4697(c26814.f8676);
                abstractC2686Arr2[i4] = new C2680(new ArrayList(c26814.f8678), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            c = c2;
            c2687Arr = c2687Arr2;
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
    public final boolean m4693(Path path, int i) {
        Path path2 = this.f8651;
        path2.reset();
        this.f8641[i].m4698(this.f8642[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
