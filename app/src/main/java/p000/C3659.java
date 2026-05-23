package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3659 extends C3658 {

    public C1646 f11444;

    public C1646 f11445;

    public C1646 f11446;

    public C3659(C3669 c3669, WindowInsets windowInsets) {
        super(c3669, windowInsets);
        this.f11444 = null;
        this.f11445 = null;
        this.f11446 = null;
    }

    @Override // p000.C3665
    public C1646 mo5289() {
        if (this.f11445 == null) {
            this.f11445 = C1646.m3376(this.f11433.getMandatorySystemGestureInsets());
        }
        return this.f11445;
    }

    @Override // p000.C3665
    public C1646 mo5290() {
        if (this.f11444 == null) {
            this.f11444 = C1646.m3376(this.f11433.getSystemGestureInsets());
        }
        return this.f11444;
    }

    @Override // p000.C3665
    public C1646 mo5291() {
        if (this.f11446 == null) {
            this.f11446 = C1646.m3376(this.f11433.getTappableElementInsets());
        }
        return this.f11446;
    }

    @Override // p000.AbstractC3656, p000.C3665
    public C3669 mo5269(int i, int i2, int i3, int i4) {
        return C3669.m5299(null, this.f11433.inset(i, i2, i3, i4));
    }

    @Override // p000.C3657, p000.C3665
    public void mo5286(C1646 c1646) {
    }
}
