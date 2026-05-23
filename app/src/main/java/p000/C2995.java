package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2995 {
    public static final C2994 Companion = new C2994();

    public final String f9636;

    public final String f9637;

    public /* synthetic */ C2995(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C2993.f9635.mo1363());
            throw null;
        }
        this.f9636 = str;
        this.f9637 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2995)) {
            return false;
        }
        C2995 c2995 = (C2995) obj;
        return AbstractC2207.m4087(this.f9636, c2995.f9636) && AbstractC2207.m4087(this.f9637, c2995.f9637);
    }

    public final int hashCode() {
        String str = this.f9636;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9637;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("VideoColdDLRuleProto(type=");
        sb.append(this.f9636);
        sb.append(", value=");
        return AbstractC1194.m2786(sb, this.f9637, ')');
    }
}
