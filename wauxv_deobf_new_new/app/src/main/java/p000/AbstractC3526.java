package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᤞᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3526 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Map f11113;

    static {
        C3525 c3525 = new C3525();
        c3525.put("O", Byte.TYPE);
        c3525.put("S", Short.TYPE);
        c3525.put("I", Integer.TYPE);
        c3525.put("L", Long.TYPE);
        c3525.put("W", BigInteger.class);
        c3525.put("w", BigDecimal.class);
        c3525.put("d", Double.TYPE);
        c3525.put("f", Float.TYPE);
        f11113 = Collections.unmodifiableMap(c3525);
    }
}
