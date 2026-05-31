package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲇᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3096 {
    public static final C3095 Companion = new C3095();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f9905 = {AbstractC2240.m4259(new C2096(23))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f9906;

    public /* synthetic */ C3096(int i, List list) {
        if (1 == (i & 1)) {
            this.f9906 = list;
        } else {
            AbstractC2234.m4187(i, 1, C3094.f9904.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3096) && AbstractC1469.m3322(this.f9906, ((C3096) obj).f9906);
    }

    public final int hashCode() {
        List list = this.f9906;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "cf1Proto(mode_config_list=" + this.f9906 + ')';
    }
}
