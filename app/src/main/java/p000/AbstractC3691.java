package p000;

import java.time.ZoneId;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3691 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final long f11599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f11600;

    static {
        Object c2585;
        Boolean bool;
        boolean z = C3692.f11601;
        if (!C3692.m5357()) {
            C1982 c1982M4988 = AbstractC3453.m4988("__--");
            boolean zBooleanValue = false;
            if (c1982M4988 != null && (bool = (Boolean) c1982M4988.invoke(new Object[0])) != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue && !C3692.m5357()) {
                int i = 0;
            }
        }
        try {
            c2585 = 1777192932264L;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        Long l = (Long) c2585;
        long jLongValue = l != null ? l.longValue() : 0L;
        f11599 = jLongValue;
        f11600 = AbstractC3681.m5339(jLongValue, null, ZoneId.of("Asia/Shanghai"), 1);
    }
}
