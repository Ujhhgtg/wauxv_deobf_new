package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1935feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Map f6406Ujhhgtgfeyxiexzf;

    static {
        C1934feyxiexzfUjhhgtg c1934feyxiexzfUjhhgtg = new C1934feyxiexzfUjhhgtg();
        c1934feyxiexzfUjhhgtg.put("O", Byte.TYPE);
        c1934feyxiexzfUjhhgtg.put("S", Short.TYPE);
        c1934feyxiexzfUjhhgtg.put("I", Integer.TYPE);
        c1934feyxiexzfUjhhgtg.put("L", Long.TYPE);
        c1934feyxiexzfUjhhgtg.put("W", BigInteger.class);
        c1934feyxiexzfUjhhgtg.put("w", BigDecimal.class);
        c1934feyxiexzfUjhhgtg.put("d", Double.TYPE);
        c1934feyxiexzfUjhhgtg.put("f", Float.TYPE);
        f6406Ujhhgtgfeyxiexzf = Collections.unmodifiableMap(c1934feyxiexzfUjhhgtg);
    }
}
