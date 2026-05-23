package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3140 {
    public static final C3139 Companion = new C3139();

    public final Integer f9997;

    public final String f9998;

    public /* synthetic */ C3140(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3138.f9996.mo1363());
            throw null;
        }
        this.f9997 = num;
        this.f9998 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3140)) {
            return false;
        }
        C3140 c3140 = (C3140) obj;
        return AbstractC2207.m4087(this.f9997, c3140.f9997) && AbstractC2207.m4087(this.f9998, c3140.f9998);
    }

    public final int hashCode() {
        Integer num = this.f9997;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9998;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ll1Proto(module_type=");
        sb.append(this.f9997);
        sb.append(", color=");
        return AbstractC1194.m2786(sb, this.f9998, ')');
    }
}
