package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1994 {

    public static final ArrayDeque f6653;

    public Object f6654;

    static {
        char[] cArr = AbstractC3522.f11032;
        f6653 = new ArrayDeque(0);
    }

    public static C1994 m3857(Object obj) {
        C1994 c1994;
        ArrayDeque arrayDeque = f6653;
        synchronized (arrayDeque) {
            c1994 = (C1994) arrayDeque.poll();
        }
        if (c1994 == null) {
            c1994 = new C1994();
        }
        c1994.f6654 = obj;
        return c1994;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1994) && this.f6654.equals(((C1994) obj).f6654);
    }

    public final int hashCode() {
        return this.f6654.hashCode();
    }
}
