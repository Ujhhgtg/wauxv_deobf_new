package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0949 extends C1917 {

    public static final /* synthetic */ int f3465 = 0;

    public C0948 f3466;

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3466 = new C0948(this.f3466);
        return this;
    }

    @Override // p000.C1917
    public final void mo2439(Canvas canvas) {
        if (this.f3466.f3464.isEmpty()) {
            super.mo2439(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f3466.f3464);
        super.mo2439(canvas);
        canvas.restore();
    }

    public final void m2440(float f, float f2, float f3, float f4) {
        RectF rectF = this.f3466.f3464;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
