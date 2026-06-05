package p000;

import java.io.File;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛳᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3190feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f9861Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final long[] f9862Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final File[] f9863Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final File[] f9864Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f9865Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C3187feyxiexzfUjhhgtg f9866Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3189feyxiexzfUjhhgtg f9867Ujhhgtgfeyxiexzf;

    public C3190feyxiexzfUjhhgtg(C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg, String str) {
        this.f9867Ujhhgtgfeyxiexzf = c3189feyxiexzfUjhhgtg;
        this.f9861Ujhhgtgfeyxiexzf = str;
        int i = c3189feyxiexzfUjhhgtg.f9853Ujhhgtgfeyxiexzf;
        File file = c3189feyxiexzfUjhhgtg.f9847Ujhhgtgfeyxiexzf;
        this.f9862Ujhhgtgfeyxiexzf = new long[i];
        this.f9863Ujhhgtgfeyxiexzf = new File[i];
        this.f9864Ujhhgtgfeyxiexzf = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f9863Ujhhgtgfeyxiexzf[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f9864Ujhhgtgfeyxiexzf[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String m4696Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f9862Ujhhgtgfeyxiexzf) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
