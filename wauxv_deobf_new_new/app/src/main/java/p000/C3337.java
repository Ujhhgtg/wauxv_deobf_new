package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲇᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3337 {
    public static final C3336 Companion = new C3336();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3015 f10573;

    public /* synthetic */ C3337(int i, C3015 c3015) {
        if (1 == (i & 1)) {
            this.f10573 = c3015;
        } else {
            AbstractC2234.m4187(i, 1, C3335.f10572.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3337) && AbstractC1469.m3322(this.f10573, ((C3337) obj).f10573);
    }

    public final int hashCode() {
        C3015 c3015 = this.f10573;
        if (c3015 == null) {
            return 0;
        }
        return c3015.hashCode();
    }

    public final String toString() {
        return "tq0Proto(ontact=" + this.f10573 + ')';
    }
}
