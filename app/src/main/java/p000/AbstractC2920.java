package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2920 {

    public static final ThreadLocal f9375 = new ThreadLocal();

    public static AbstractC1235 m4921() {
        ThreadLocal threadLocal = f9375;
        AbstractC1235 abstractC1235 = (AbstractC1235) threadLocal.get();
        if (abstractC1235 != null) {
            return abstractC1235;
        }
        C0437 c0437 = new C0437(Thread.currentThread());
        threadLocal.set(c0437);
        return c0437;
    }
}
