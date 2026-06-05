package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2684Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f8572Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Object f8573Ujhhgtgfeyxiexzf;

    public AbstractC2684Ujhhgtgfeyxiexzf(int i, boolean z) {
        switch (i) {
            case 1:
                this.f8573Ujhhgtgfeyxiexzf = new long[8];
                this.f8572Ujhhgtgfeyxiexzf = -1;
                break;
            default:
                this.f8573Ujhhgtgfeyxiexzf = new C2377Ujhhgtgfeyxiexzf();
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public long m4025Ujhhgtgfeyxiexzf() {
        int i = this.f8572Ujhhgtgfeyxiexzf;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.f8573Ujhhgtgfeyxiexzf)[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ */
    public abstract void mo1959feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ */
    public abstract void mo1960feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ */
    public abstract C2256feyxiexzfUjhhgtg mo1961feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, List list);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public long m4026feyxiexzfUjhhgtg() {
        int i = this.f8572Ujhhgtgfeyxiexzf;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f8573Ujhhgtgfeyxiexzf;
        this.f8572Ujhhgtgfeyxiexzf = i - 1;
        return jArr[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m4027feyxiexzfUjhhgtg(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.f8572Ujhhgtgfeyxiexzf + 1;
        this.f8572Ujhhgtgfeyxiexzf = i;
        long[] jArr = (long[]) this.f8573Ujhhgtgfeyxiexzf;
        if (i >= jArr.length) {
            this.f8573Ujhhgtgfeyxiexzf = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.f8573Ujhhgtgfeyxiexzf)[i] = j;
    }

    public AbstractC2684Ujhhgtgfeyxiexzf(int i) {
        this.f8572Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ */
    public C2073feyxiexzfUjhhgtg mo1962feyxiexzfUjhhgtg(C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg) {
        return c2073feyxiexzfUjhhgtg;
    }
}
