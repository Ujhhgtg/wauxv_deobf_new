package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲀᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0951 extends C1947 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final RectF f3479;

    public C0951(C2738 c2738, RectF rectF) {
        super(c2738);
        this.f3479 = rectF;
    }

    @Override // p000.C1947, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0952 c0952 = new C0952(this);
        c0952.f3481 = this;
        c0952.invalidateSelf();
        return c0952;
    }

    public C0951(C0951 c0951) {
        super(c0951);
        this.f3479 = c0951.f3479;
    }
}
