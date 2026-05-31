package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲈᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2069 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public long f6930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public long f6931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public TimeInterpolator f6932;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6934;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2069)) {
            return false;
        }
        C2069 c2069 = (C2069) obj;
        if (this.f6930 == c2069.f6930 && this.f6931 == c2069.f6931 && this.f6933 == c2069.f6933 && this.f6934 == c2069.f6934) {
            return m4062().getClass().equals(c2069.m4062().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6930;
        long j2 = this.f6931;
        return ((((m4062().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f6933) * 31) + this.f6934;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C2069.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f6930);
        sb.append(" duration: ");
        sb.append(this.f6931);
        sb.append(" interpolator: ");
        sb.append(m4062().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f6933);
        sb.append(" repeatMode: ");
        return AbstractC2844.m4785(sb, this.f6934, "}\n");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TimeInterpolator m4062() {
        TimeInterpolator timeInterpolator = this.f6932;
        return timeInterpolator != null ? timeInterpolator : AbstractC0172.f1254;
    }
}
