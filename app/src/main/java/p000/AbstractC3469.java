package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᲀᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Map f10959;

    static {
        C0491 c0491 = new C0491(3);
        c0491.put("O", Byte.TYPE);
        c0491.put("S", Short.TYPE);
        c0491.put("I", Integer.TYPE);
        c0491.put("L", Long.TYPE);
        c0491.put("W", BigInteger.class);
        c0491.put("w", BigDecimal.class);
        c0491.put("d", Double.TYPE);
        c0491.put("f", Float.TYPE);
        f10959 = Collections.unmodifiableMap(c0491);
    }
}
