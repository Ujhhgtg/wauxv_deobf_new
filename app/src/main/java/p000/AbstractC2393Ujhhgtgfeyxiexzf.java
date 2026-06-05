package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2393Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int f7779Ujhhgtgfeyxiexzf;

    static {
        Object c0919feyxiexzfUjhhgtg;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c0919feyxiexzfUjhhgtg = property != null ? AbstractC1184feyxiexzfUjhhgtg.m2673feyxiexzfUjhhgtg(property) : null;
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Integer num = (Integer) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
        f7779Ujhhgtgfeyxiexzf = num != null ? num.intValue() : 2097152;
    }
}
