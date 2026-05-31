package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤝᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3400 {
    public static final C3399 Companion = new C3399();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10712 = {AbstractC2240.m4259(new C3163(26))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10713;

    public /* synthetic */ C3400(int i, List list) {
        if (1 == (i & 1)) {
            this.f10713 = list;
        } else {
            AbstractC2234.m4187(i, 1, C3398.f10711.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3400) && AbstractC1469.m3322(this.f10713, ((C3400) obj).f10713);
    }

    public final int hashCode() {
        List list = this.f10713;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "wc1Proto(config=" + this.f10713 + ')';
    }
}
