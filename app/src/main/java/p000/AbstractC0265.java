package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0265 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int f1461;

    static {
        Object c2585;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c2585 = property != null ? AbstractC2848.m4853(property) : null;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Integer num = (Integer) (c2585 instanceof C2585 ? null : c2585);
        f1461 = num != null ? num.intValue() : 2097152;
    }
}
