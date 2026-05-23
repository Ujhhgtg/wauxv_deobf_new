package p000;

import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0561 implements Supplier, Consumer {

    public static final ThreadLocal f2290;

    public static final WeakHashMap f2291;

    public volatile boolean f2292;

    static {
        C0561 c0561 = new C0561();
        c0561.f2292 = true;
        f2290 = ThreadLocal.withInitial(c0561);
        f2291 = new WeakHashMap();
    }

    public static boolean m1955() {
        return ((Boolean) f2290.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f2292 = ((Boolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f2292);
    }
}
