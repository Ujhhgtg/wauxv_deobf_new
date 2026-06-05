package p000;

import java.util.Collection;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能ᛴ要点脸ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f4171Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3268feyxiexzfUjhhgtg f4172Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f4173Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f4174Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f4175Ujhhgtgfeyxiexzf;

    public AbstractC1090feyxiexzfUjhhgtg(String str, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, int i) {
        if (c3268feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("file == null");
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f4171Ujhhgtgfeyxiexzf = str;
        this.f4172Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg;
        this.f4173Ujhhgtgfeyxiexzf = i;
        this.f4174Ujhhgtgfeyxiexzf = -1;
        this.f4175Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public abstract int mo1504Ujhhgtgfeyxiexzf(AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m2561Ujhhgtgfeyxiexzf() {
        int i = this.f4174Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public abstract Collection mo1505Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2562Ujhhgtgfeyxiexzf() {
        m2564Ujhhgtgfeyxiexzf();
        mo1506Ujhhgtgfeyxiexzf();
        this.f4175Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public abstract void mo1506Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m2563Ujhhgtgfeyxiexzf() {
        if (!this.f4175Ujhhgtgfeyxiexzf) {
            throw new RuntimeException("not prepared");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m2564Ujhhgtgfeyxiexzf() {
        if (this.f4175Ujhhgtgfeyxiexzf) {
            throw new RuntimeException("already prepared");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public abstract int mo1507Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m2565Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        m2563Ujhhgtgfeyxiexzf();
        c2608Ujhhgtgfeyxiexzf.m3885Ujhhgtgfeyxiexzf(this.f4173Ujhhgtgfeyxiexzf);
        int i = c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
        int i2 = this.f4174Ujhhgtgfeyxiexzf;
        if (i2 < 0) {
            this.f4174Ujhhgtgfeyxiexzf = i;
        } else if (i2 != i) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + i + ", but expected " + this.f4174Ujhhgtgfeyxiexzf);
        }
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            String str = this.f4171Ujhhgtgfeyxiexzf;
            if (str != null) {
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "\n" + str + ":");
            } else if (i != 0) {
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "\n");
            }
        }
        mo1508Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public abstract void mo1508Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf);
}
