package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᤞᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3131 {
    public static final C3130 Companion = new C3130();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1758[] f9981 = {AbstractC1458.m3163(new C3125(1))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f9982;

    public /* synthetic */ C3131(int i, List list) {
        if (1 == (i & 1)) {
            this.f9982 = list;
        } else {
            AbstractC1270.m2997(i, 1, C3129.f9980.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3131) && AbstractC2207.m4087(this.f9982, ((C3131) obj).f9982);
    }

    public final int hashCode() {
        List list = this.f9982;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "l23Proto(mic_contacts=" + this.f9982 + ')';
    }
}
