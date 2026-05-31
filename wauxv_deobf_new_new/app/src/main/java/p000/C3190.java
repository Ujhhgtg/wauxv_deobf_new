package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲇᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3190 {
    public static final C3189 Companion = new C3189();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10148 = {AbstractC2240.m4259(new C3163(3))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10149;

    public /* synthetic */ C3190(int i, List list) {
        if (1 == (i & 1)) {
            this.f10149 = list;
        } else {
            AbstractC2234.m4187(i, 1, C3188.f10147.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3190) && AbstractC1469.m3322(this.f10149, ((C3190) obj).f10149);
    }

    public final int hashCode() {
        List list = this.f10149;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "l23Proto(mic_contacts=" + this.f10149 + ')';
    }
}
