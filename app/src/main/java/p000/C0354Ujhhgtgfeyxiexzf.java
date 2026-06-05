package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛴ要点脸能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0354Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public long f1998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public long f1999Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public TimeInterpolator f2000Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f2001Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f2002Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0354Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0354Ujhhgtgfeyxiexzf c0354Ujhhgtgfeyxiexzf = (C0354Ujhhgtgfeyxiexzf) obj;
        if (this.f1998Ujhhgtgfeyxiexzf == c0354Ujhhgtgfeyxiexzf.f1998Ujhhgtgfeyxiexzf && this.f1999Ujhhgtgfeyxiexzf == c0354Ujhhgtgfeyxiexzf.f1999Ujhhgtgfeyxiexzf && this.f2001Ujhhgtgfeyxiexzf == c0354Ujhhgtgfeyxiexzf.f2001Ujhhgtgfeyxiexzf && this.f2002Ujhhgtgfeyxiexzf == c0354Ujhhgtgfeyxiexzf.f2002Ujhhgtgfeyxiexzf) {
            return m1541Ujhhgtgfeyxiexzf().getClass().equals(c0354Ujhhgtgfeyxiexzf.m1541Ujhhgtgfeyxiexzf().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1998Ujhhgtgfeyxiexzf;
        long j2 = this.f1999Ujhhgtgfeyxiexzf;
        return ((((m1541Ujhhgtgfeyxiexzf().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f2001Ujhhgtgfeyxiexzf) * 31) + this.f2002Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C0354Ujhhgtgfeyxiexzf.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f1998Ujhhgtgfeyxiexzf);
        sb.append(" duration: ");
        sb.append(this.f1999Ujhhgtgfeyxiexzf);
        sb.append(" interpolator: ");
        sb.append(m1541Ujhhgtgfeyxiexzf().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f2001Ujhhgtgfeyxiexzf);
        sb.append(" repeatMode: ");
        return AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.f2002Ujhhgtgfeyxiexzf, "}\n");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TimeInterpolator m1541Ujhhgtgfeyxiexzf() {
        TimeInterpolator timeInterpolator = this.f2000Ujhhgtgfeyxiexzf;
        return timeInterpolator != null ? timeInterpolator : AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf;
    }
}
