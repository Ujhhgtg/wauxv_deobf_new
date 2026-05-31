package p000;

import java.time.ZoneId;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲈᤝᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3754 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final long f11756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f11757;

    static {
        Object c2641;
        Boolean bool;
        boolean z = C3755.f11758;
        if (!C3755.m5365()) {
            C2013 c2013M5325 = AbstractC3744.m5325("__--");
            boolean zBooleanValue = false;
            if (c2013M5325 != null && (bool = (Boolean) c2013M5325.m4026(new Object[0])) != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue && !C3755.m5365()) {
                int i = AbstractApplicationC2032.f6770;
            }
        }
        try {
            c2641 = 1779713681948L;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        Long l = (Long) c2641;
        long jLongValue = l != null ? l.longValue() : 0L;
        f11756 = jLongValue;
        f11757 = AbstractC2234.m4188(jLongValue, null, ZoneId.of("Asia/Shanghai"), 1);
    }
}
