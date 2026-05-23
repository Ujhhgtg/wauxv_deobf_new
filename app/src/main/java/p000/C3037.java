package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3037 {
    public static final C3036 Companion = new C3036();

    public static final InterfaceC1758[] f9738 = {AbstractC1458.m3163(new C2083(21))};

    public final List f9739;

    public /* synthetic */ C3037(int i, List list) {
        if (1 == (i & 1)) {
            this.f9739 = list;
        } else {
            AbstractC1270.m2997(i, 1, C3035.f9737.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3037) && AbstractC2207.m4087(this.f9739, ((C3037) obj).f9739);
    }

    public final int hashCode() {
        List list = this.f9739;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "cf1Proto(mode_config_list=" + this.f9739 + ')';
    }
}
