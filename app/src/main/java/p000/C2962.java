package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2962 {
    public static final C2961 Companion = new C2961();

    public final Integer f9489;

    public /* synthetic */ C2962(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f9489 = num;
        } else {
            AbstractC1270.m2997(i, 1, C2960.f9488.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2962) && AbstractC2207.m4087(this.f9489, ((C2962) obj).f9489);
    }

    public final int hashCode() {
        Integer num = this.f9489;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderJumpInfoProto(jumpinfo_type=");
        return AbstractC2668.m4677(sb, this.f9489, ')');
    }
}
