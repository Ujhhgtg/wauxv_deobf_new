package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0948 extends C1916 {

    public final RectF f3464;

    public C0948(C2677 c2677, RectF rectF) {
        super(c2677);
        this.f3464 = rectF;
    }

    @Override // p000.C1916, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0949 c0949 = new C0949(this);
        c0949.f3466 = this;
        c0949.invalidateSelf();
        return c0949;
    }

    public C0948(C0948 c0948) {
        super(c0948);
        this.f3464 = c0948.f3464;
    }
}
