package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3341 {
    public static final C3340 Companion = new C3340();

    public static final InterfaceC1758[] f10545 = {AbstractC1458.m3163(new C3125(24))};

    public final List f10546;

    public /* synthetic */ C3341(int i, List list) {
        if (1 == (i & 1)) {
            this.f10546 = list;
        } else {
            AbstractC1270.m2997(i, 1, C3339.f10544.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3341) && AbstractC2207.m4087(this.f10546, ((C3341) obj).f10546);
    }

    public final int hashCode() {
        List list = this.f10546;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "wc1Proto(config=" + this.f10546 + ')';
    }
}
