package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲈᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2979 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ThreadLocal f9542 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static AbstractC1237 m4983() {
        ThreadLocal threadLocal = f9542;
        AbstractC1237 abstractC1237 = (AbstractC1237) threadLocal.get();
        if (abstractC1237 != null) {
            return abstractC1237;
        }
        C0412 c0412 = new C0412(Thread.currentThread());
        threadLocal.set(c0412);
        return c0412;
    }
}
