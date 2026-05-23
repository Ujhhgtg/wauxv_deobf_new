package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3347 {
    public static final C3346 Companion = new C3346();

    public final Boolean f10553;

    public /* synthetic */ C3347(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f10553 = bool;
        } else {
            AbstractC1270.m2997(i, 1, C3345.f10552.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3347) && AbstractC2207.m4087(this.f10553, ((C3347) obj).f10553);
    }

    public final int hashCode() {
        Boolean bool = this.f10553;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "wq1Proto(audience_is_member=" + this.f10553 + ')';
    }
}
