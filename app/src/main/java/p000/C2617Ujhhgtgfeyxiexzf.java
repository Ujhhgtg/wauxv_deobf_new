package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2617Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ArrayDeque f8437Ujhhgtgfeyxiexzf;

    public C2617Ujhhgtgfeyxiexzf(int i) {
        switch (i) {
            case 1:
                this.f8437Ujhhgtgfeyxiexzf = new ArrayDeque();
                break;
            default:
                char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
                this.f8437Ujhhgtgfeyxiexzf = new ArrayDeque(0);
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public synchronized void m3922Ujhhgtgfeyxiexzf(C3607Ujhhgtgfeyxiexzf c3607Ujhhgtgfeyxiexzf) {
        c3607Ujhhgtgfeyxiexzf.f11221Ujhhgtgfeyxiexzf = null;
        c3607Ujhhgtgfeyxiexzf.f11222Ujhhgtgfeyxiexzf = null;
        this.f8437Ujhhgtgfeyxiexzf.offer(c3607Ujhhgtgfeyxiexzf);
    }
}
