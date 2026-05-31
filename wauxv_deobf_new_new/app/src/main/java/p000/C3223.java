package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲈᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3223 {
    public static final C3222 Companion = new C3222();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3048 f10311;

    public /* synthetic */ C3223(int i, C3048 c3048) {
        if (1 == (i & 1)) {
            this.f10311 = c3048;
        } else {
            AbstractC2234.m4187(i, 1, C3221.f10310.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3223) && AbstractC1469.m3322(this.f10311, ((C3223) obj).f10311);
    }

    public final int hashCode() {
        C3048 c3048 = this.f10311;
        if (c3048 == null) {
            return 0;
        }
        return c3048.hashCode();
    }

    public final String toString() {
        return "mh4Proto(d=" + this.f10311 + ')';
    }
}
