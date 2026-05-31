package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᛸᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2744 extends AbstractC2746 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final RectF f8829 = new RectF();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float f8830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f8831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f8832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f8833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f8834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f8835;

    public C2744(float f, float f2, float f3, float f4) {
        this.f8830 = f;
        this.f8831 = f2;
        this.f8832 = f3;
        this.f8833 = f4;
    }

    @Override // p000.AbstractC2746
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo4733(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8838;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f8832;
        float f2 = this.f8833;
        RectF rectF = f8829;
        rectF.set(this.f8830, this.f8831, f, f2);
        path.arcTo(rectF, this.f8834, this.f8835, false);
        path.transform(matrix);
    }
}
