package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3368 {
    public static final C3367 Companion = new C3367();

    public final Integer f10621;

    public final Integer f10622;

    public final String f10623;

    public /* synthetic */ C3368(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3366.f10620.mo1363());
            throw null;
        }
        this.f10621 = num;
        this.f10622 = num2;
        this.f10623 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3368)) {
            return false;
        }
        C3368 c3368 = (C3368) obj;
        return AbstractC2207.m4087(this.f10621, c3368.f10621) && AbstractC2207.m4087(this.f10622, c3368.f10622) && AbstractC2207.m4087(this.f10623, c3368.f10623);
    }

    public final int hashCode() {
        Integer num = this.f10621;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10622;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10623;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("y4Proto(d=");
        sb.append(this.f10621);
        sb.append(", e=");
        sb.append(this.f10622);
        sb.append(", f=");
        return AbstractC1194.m2786(sb, this.f10623, ')');
    }
}
