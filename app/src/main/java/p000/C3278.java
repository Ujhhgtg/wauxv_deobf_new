package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3278 {
    public static final C3277 Companion = new C3277();

    public final C2956 f10406;

    public /* synthetic */ C3278(int i, C2956 c2956) {
        if (1 == (i & 1)) {
            this.f10406 = c2956;
        } else {
            AbstractC1270.m2997(i, 1, C3276.f10405.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3278) && AbstractC2207.m4087(this.f10406, ((C3278) obj).f10406);
    }

    public final int hashCode() {
        C2956 c2956 = this.f10406;
        if (c2956 == null) {
            return 0;
        }
        return c2956.hashCode();
    }

    public final String toString() {
        return "tq0Proto(ontact=" + this.f10406 + ')';
    }
}
