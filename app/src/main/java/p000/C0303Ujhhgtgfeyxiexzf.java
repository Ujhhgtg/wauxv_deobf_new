package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ要点脸ᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0303Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final ArrayDeque f1824Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Object f1825Ujhhgtgfeyxiexzf;

    static {
        char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
        f1824Ujhhgtgfeyxiexzf = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0303Ujhhgtgfeyxiexzf m1530Ujhhgtgfeyxiexzf(Object obj) {
        C0303Ujhhgtgfeyxiexzf c0303Ujhhgtgfeyxiexzf;
        ArrayDeque arrayDeque = f1824Ujhhgtgfeyxiexzf;
        synchronized (arrayDeque) {
            c0303Ujhhgtgfeyxiexzf = (C0303Ujhhgtgfeyxiexzf) arrayDeque.poll();
        }
        if (c0303Ujhhgtgfeyxiexzf == null) {
            c0303Ujhhgtgfeyxiexzf = new C0303Ujhhgtgfeyxiexzf();
        }
        c0303Ujhhgtgfeyxiexzf.f1825Ujhhgtgfeyxiexzf = obj;
        return c0303Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0303Ujhhgtgfeyxiexzf) && this.f1825Ujhhgtgfeyxiexzf.equals(((C0303Ujhhgtgfeyxiexzf) obj).f1825Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f1825Ujhhgtgfeyxiexzf.hashCode();
    }
}
