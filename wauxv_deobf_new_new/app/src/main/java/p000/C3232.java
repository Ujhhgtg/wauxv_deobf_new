package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᤝᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3232 {
    public static final C3231 Companion = new C3231();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10333 = {AbstractC2240.m4259(new C3163(12))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10334;

    public /* synthetic */ C3232(int i, List list) {
        if (1 == (i & 1)) {
            this.f10334 = list;
        } else {
            AbstractC2234.m4187(i, 1, C3230.f10332.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3232) && AbstractC1469.m3322(this.f10334, ((C3232) obj).f10334);
    }

    public final int hashCode() {
        List list = this.f10334;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "mt1Proto(list=" + this.f10334 + ')';
    }
}
