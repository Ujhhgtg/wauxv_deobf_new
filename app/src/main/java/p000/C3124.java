package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᛸᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3124 {
    public static final C3123 Companion = new C3123();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1758[] f9964 = {AbstractC1458.m3163(new C2083(29))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f9965;

    public /* synthetic */ C3124(int i, List list) {
        if (1 == (i & 1)) {
            this.f9965 = list;
        } else {
            AbstractC1270.m2997(i, 1, C3122.f9963.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3124) && AbstractC2207.m4087(this.f9965, ((C3124) obj).f9965);
    }

    public final int hashCode() {
        List list = this.f9965;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "kl1Proto(infos=" + this.f9965 + ')';
    }
}
