package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3209 {
    public static final C3208 Companion = new C3208();

    public final Integer f10231;

    public /* synthetic */ C3209(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10231 = num;
        } else {
            AbstractC1270.m2997(i, 1, C3207.f10230.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3209) && AbstractC2207.m4087(this.f10231, ((C3209) obj).f10231);
    }

    public final int hashCode() {
        Integer num = this.f10231;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ol1Proto(audienceMode=");
        return AbstractC2668.m4677(sb, this.f10231, ')');
    }
}
