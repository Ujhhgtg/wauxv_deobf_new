package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᛸᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2745 extends AbstractC2746 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public float f8836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f8837;

    @Override // p000.AbstractC2746
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4733(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8838;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f8836, this.f8837);
        path.transform(matrix);
    }
}
