package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2684 extends AbstractC2685 {

    public float f8666;

    public float f8667;

    @Override // p000.AbstractC2685
    public final void mo4696(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8668;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f8666, this.f8667);
        path.transform(matrix);
    }
}
