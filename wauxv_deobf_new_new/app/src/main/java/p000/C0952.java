package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲀᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0952 extends C1948 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f3480 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C0951 f3481;

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3481 = new C0951(this.f3481);
        return this;
    }

    @Override // p000.C1948
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2558(Canvas canvas) {
        if (this.f3481.f3479.isEmpty()) {
            super.mo2558(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f3481.f3479);
        super.mo2558(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m2559(float f, float f2, float f3, float f4) {
        RectF rectF = this.f3481.f3479;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
