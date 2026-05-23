package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3305 {
    public static final C3304 Companion = new C3304();

    public final Integer f10495;

    public /* synthetic */ C3305(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10495 = num;
        } else {
            AbstractC1270.m2997(i, 1, C3303.f10494.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3305) && AbstractC2207.m4087(this.f10495, ((C3305) obj).f10495);
    }

    public final int hashCode() {
        Integer num = this.f10495;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("vc1Proto(number=");
        return AbstractC2668.m4677(sb, this.f10495, ')');
    }
}
