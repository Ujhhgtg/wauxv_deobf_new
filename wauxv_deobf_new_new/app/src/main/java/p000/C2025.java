package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᛸᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2025 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ArrayDeque f6758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Object f6759;

    static {
        char[] cArr = AbstractC3580.f11185;
        f6758 = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2025 m4051(Object obj) {
        C2025 c2025;
        ArrayDeque arrayDeque = f6758;
        synchronized (arrayDeque) {
            c2025 = (C2025) arrayDeque.poll();
        }
        if (c2025 == null) {
            c2025 = new C2025();
        }
        c2025.f6759 = obj;
        return c2025;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2025) && this.f6759.equals(((C2025) obj).f6759);
    }

    public final int hashCode() {
        return this.f6759.hashCode();
    }
}
