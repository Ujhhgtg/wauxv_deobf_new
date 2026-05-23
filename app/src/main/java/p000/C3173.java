package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3173 {
    public static final C3172 Companion = new C3172();

    public static final InterfaceC1758[] f10166 = {AbstractC1458.m3163(new C3125(10))};

    public final List f10167;

    public /* synthetic */ C3173(int i, List list) {
        if (1 == (i & 1)) {
            this.f10167 = list;
        } else {
            AbstractC1270.m2997(i, 1, C3171.f10165.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3173) && AbstractC2207.m4087(this.f10167, ((C3173) obj).f10167);
    }

    public final int hashCode() {
        List list = this.f10167;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "mt1Proto(list=" + this.f10167 + ')';
    }
}
