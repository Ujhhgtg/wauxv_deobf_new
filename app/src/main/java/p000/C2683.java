package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2683 extends AbstractC2685 {

    public static final RectF f8659 = new RectF();

    public final float f8660;

    public final float f8661;

    public final float f8662;

    public final float f8663;

    public float f8664;

    public float f8665;

    public C2683(float f, float f2, float f3, float f4) {
        this.f8660 = f;
        this.f8661 = f2;
        this.f8662 = f3;
        this.f8663 = f4;
    }

    @Override // p000.AbstractC2685
    public final void mo4696(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8668;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f8662;
        float f2 = this.f8663;
        RectF rectF = f8659;
        rectF.set(this.f8660, this.f8661, f, f2);
        path.arcTo(rectF, this.f8664, this.f8665, false);
        path.transform(matrix);
    }
}
