package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤞᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3406 {
    public static final C3405 Companion = new C3405();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10720;

    public /* synthetic */ C3406(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f10720 = bool;
        } else {
            AbstractC2234.m4187(i, 1, C3404.f10719.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3406) && AbstractC1469.m3322(this.f10720, ((C3406) obj).f10720);
    }

    public final int hashCode() {
        Boolean bool = this.f10720;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "wq1Proto(audience_is_member=" + this.f10720 + ')';
    }
}
