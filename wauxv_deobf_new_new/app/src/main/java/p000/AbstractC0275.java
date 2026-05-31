package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0275 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int f1535;

    static {
        Object c2641;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c2641 = property != null ? AbstractC2908.m4914(property) : null;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Integer num = (Integer) (c2641 instanceof C2641 ? null : c2641);
        f1535 = num != null ? num.intValue() : 2097152;
    }
}
