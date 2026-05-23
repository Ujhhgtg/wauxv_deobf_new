package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1695 {
    public static final C1694 Companion = new C1694();

    public final String f5752;

    public final String f5753;

    public final Integer f5754;

    public final String f5755;

    public final String f5756;

    public /* synthetic */ C1695(int i, String str, String str2, Integer num, String str3, String str4) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C1693.f5751.mo1363());
            throw null;
        }
        this.f5752 = str;
        this.f5753 = str2;
        this.f5754 = num;
        this.f5755 = str3;
        this.f5756 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695)) {
            return false;
        }
        C1695 c1695 = (C1695) obj;
        return AbstractC2207.m4087(this.f5752, c1695.f5752) && AbstractC2207.m4087(this.f5753, c1695.f5753) && AbstractC2207.m4087(this.f5754, c1695.f5754) && AbstractC2207.m4087(this.f5755, c1695.f5755) && AbstractC2207.m4087(this.f5756, c1695.f5756);
    }

    public final int hashCode() {
        String str = this.f5752;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5753;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5754;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f5755;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5756;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ScopeInfo(scope=");
        sb.append(this.f5752);
        sb.append(", desc=");
        sb.append(this.f5753);
        sb.append(", authState=");
        sb.append(this.f5754);
        sb.append(", extDesc=");
        sb.append(this.f5755);
        sb.append(", authDesc=");
        return AbstractC1194.m2786(sb, this.f5756, ')');
    }
}
