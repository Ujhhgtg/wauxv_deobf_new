package p000;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3646 {

    public final int f11412;

    public float f11413;

    public final Interpolator f11414;

    public final long f11415;

    public AbstractC3646(int i, Interpolator interpolator, long j) {
        this.f11412 = i;
        this.f11414 = interpolator;
        this.f11415 = j;
    }

    public long mo5240() {
        return this.f11415;
    }

    public float mo5241() {
        Interpolator interpolator = this.f11414;
        return interpolator != null ? interpolator.getInterpolation(this.f11413) : this.f11413;
    }

    public int mo5242() {
        return this.f11412;
    }

    public void mo5243(float f) {
        this.f11413 = f;
    }
}
