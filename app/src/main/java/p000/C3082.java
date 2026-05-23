package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3082 {
    public static final C3081 Companion = new C3081();

    public final Integer f9850;

    public final String f9851;

    public /* synthetic */ C3082(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3080.f9849.mo1363());
            throw null;
        }
        this.f9850 = num;
        this.f9851 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3082)) {
            return false;
        }
        C3082 c3082 = (C3082) obj;
        return AbstractC2207.m4087(this.f9850, c3082.f9850) && AbstractC2207.m4087(this.f9851, c3082.f9851);
    }

    public final int hashCode() {
        Integer num = this.f9850;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9851;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("gf1Proto(seat_id=");
        sb.append(this.f9850);
        sb.append(", seat_name=");
        return AbstractC1194.m2786(sb, this.f9851, ')');
    }
}
