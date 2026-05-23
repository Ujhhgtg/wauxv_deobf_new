package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2036 {

    public long f6806;

    public long f6807;

    public TimeInterpolator f6808;

    public int f6809;

    public int f6810;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036)) {
            return false;
        }
        C2036 c2036 = (C2036) obj;
        if (this.f6806 == c2036.f6806 && this.f6807 == c2036.f6807 && this.f6809 == c2036.f6809 && this.f6810 == c2036.f6810) {
            return m3879().getClass().equals(c2036.m3879().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6806;
        long j2 = this.f6807;
        return ((((m3879().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f6809) * 31) + this.f6810;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C2036.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f6806);
        sb.append(" duration: ");
        sb.append(this.f6807);
        sb.append(" interpolator: ");
        sb.append(m3879().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f6809);
        sb.append(" repeatMode: ");
        return AbstractC2784.m4751(sb, this.f6810, "}\n");
    }

    public final TimeInterpolator m3879() {
        TimeInterpolator timeInterpolator = this.f6808;
        return timeInterpolator != null ? timeInterpolator : AbstractC0164.f1186;
    }
}
