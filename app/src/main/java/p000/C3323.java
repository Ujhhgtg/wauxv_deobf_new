package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3323 {
    public static final C3322 Companion = new C3322();

    public final String f10518;

    public final String f10519;

    public final Float f10520;

    public final Boolean f10521;

    public final C3043 f10522;

    public final Boolean f10523;

    public /* synthetic */ C3323(int i, String str, String str2, Float f, Boolean bool, C3043 c3043, Boolean bool2) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3321.f10517.mo1363());
            throw null;
        }
        this.f10518 = str;
        this.f10519 = str2;
        this.f10520 = f;
        this.f10521 = bool;
        this.f10522 = c3043;
        this.f10523 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3323)) {
            return false;
        }
        C3323 c3323 = (C3323) obj;
        return AbstractC2207.m4087(this.f10518, c3323.f10518) && AbstractC2207.m4087(this.f10519, c3323.f10519) && AbstractC2207.m4087(this.f10520, c3323.f10520) && AbstractC2207.m4087(this.f10521, c3323.f10521) && AbstractC2207.m4087(this.f10522, c3323.f10522) && AbstractC2207.m4087(this.f10523, c3323.f10523);
    }

    public final int hashCode() {
        String str = this.f10518;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10519;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.f10520;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.f10521;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C3043 c3043 = this.f10522;
        int iHashCode5 = (iHashCode4 + (c3043 == null ? 0 : c3043.hashCode())) * 31;
        Boolean bool2 = this.f10523;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("w10Proto(key=");
        sb.append(this.f10518);
        sb.append(", name=");
        sb.append(this.f10519);
        sb.append(", price=");
        sb.append(this.f10520);
        sb.append(", custom_text_disabled=");
        sb.append(this.f10521);
        sb.append(", thumbnail=");
        sb.append(this.f10522);
        sb.append(", use_pag=");
        sb.append(this.f10523);
        sb.append(')');
        return sb.toString();
    }
}
