package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲀᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3184 {
    public static final C3183 Companion = new C3183();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10132 = {AbstractC2240.m4259(new C3163(1))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10133;

    public /* synthetic */ C3184(int i, List list) {
        if (1 == (i & 1)) {
            this.f10133 = list;
        } else {
            AbstractC2234.m4187(i, 1, C3182.f10131.mo1509());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3184) && AbstractC1469.m3322(this.f10133, ((C3184) obj).f10133);
    }

    public final int hashCode() {
        List list = this.f10133;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "kl1Proto(infos=" + this.f10133 + ')';
    }
}
