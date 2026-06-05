package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3099Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f9635Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Set f9636Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f9637Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f9638Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f9639Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final long f9640Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f9641Ujhhgtgfeyxiexzf;

    public AbstractC3099Ujhhgtgfeyxiexzf(String str, String str2, Set set, boolean z, int i, float f, long j, int i2) {
        str2 = (i2 & 2) != 0 ? "" : str2;
        set = (i2 & 4) != 0 ? new LinkedHashSet() : set;
        z = (i2 & 8) != 0 ? false : z;
        i = (i2 & 16) != 0 ? 0 : i;
        f = (i2 & 32) != 0 ? 0.0f : f;
        j = (i2 & 64) != 0 ? 0L : j;
        this.f9635Ujhhgtgfeyxiexzf = str2;
        this.f9636Ujhhgtgfeyxiexzf = set;
        this.f9637Ujhhgtgfeyxiexzf = z;
        this.f9638Ujhhgtgfeyxiexzf = i;
        this.f9639Ujhhgtgfeyxiexzf = f;
        this.f9640Ujhhgtgfeyxiexzf = j;
        this.f9641Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2977Ujhhgtgfeyxiexzf(18, str));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m4617Ujhhgtgfeyxiexzf() {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getBoolean(strM4621Ujhhgtgfeyxiexzf, this.f9637Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float m4618Ujhhgtgfeyxiexzf() {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getFloat(strM4621Ujhhgtgfeyxiexzf, this.f9639Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m4619Ujhhgtgfeyxiexzf() {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getInt(strM4621Ujhhgtgfeyxiexzf, this.f9638Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final long m4620Ujhhgtgfeyxiexzf() {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getLong(strM4621Ujhhgtgfeyxiexzf, this.f9640Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String m4621Ujhhgtgfeyxiexzf() {
        return (String) this.f9641Ujhhgtgfeyxiexzf.getValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Set m4622Ujhhgtgfeyxiexzf() {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getStringSet(strM4621Ujhhgtgfeyxiexzf, this.f9636Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String m4623Ujhhgtgfeyxiexzf() {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getString(strM4621Ujhhgtgfeyxiexzf, this.f9635Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m4624Ujhhgtgfeyxiexzf(boolean z) {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putBoolean(strM4621Ujhhgtgfeyxiexzf, z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4625Ujhhgtgfeyxiexzf(float f) {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putFloat(strM4621Ujhhgtgfeyxiexzf, f);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4626Ujhhgtgfeyxiexzf(int i) {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putInt(strM4621Ujhhgtgfeyxiexzf, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4627Ujhhgtgfeyxiexzf(long j) {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putLong(strM4621Ujhhgtgfeyxiexzf, j);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4628Ujhhgtgfeyxiexzf(Set set) {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putStringSet(strM4621Ujhhgtgfeyxiexzf, set);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m4629Ujhhgtgfeyxiexzf(String str) {
        String strM4621Ujhhgtgfeyxiexzf = m4621Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putString(strM4621Ujhhgtgfeyxiexzf, str);
    }
}
