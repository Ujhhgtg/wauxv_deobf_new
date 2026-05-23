package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3645 extends AbstractC3646 {

    public final WindowInsetsAnimation f11411;

    public C3645(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f11411 = windowInsetsAnimation;
    }

    @Override // p000.AbstractC3646
    public final long mo5240() {
        return this.f11411.getDurationMillis();
    }

    @Override // p000.AbstractC3646
    public final float mo5241() {
        return this.f11411.getInterpolatedFraction();
    }

    @Override // p000.AbstractC3646
    public final int mo5242() {
        return this.f11411.getTypeMask();
    }

    @Override // p000.AbstractC3646
    public final void mo5243(float f) {
        this.f11411.setFraction(f);
    }
}
