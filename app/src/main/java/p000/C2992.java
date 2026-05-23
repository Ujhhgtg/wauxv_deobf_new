package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2992 {
    public static final C2991 Companion = new C2991();

    public final String f9627;

    public final Integer f9628;

    public final String f9629;

    public final String f9630;

    public final String f9631;

    public final String f9632;

    public final String f9633;

    public final String f9634;

    public /* synthetic */ C2992(int i, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (255 != (i & 255)) {
            AbstractC1270.m2997(i, 255, C2990.f9626.mo1363());
            throw null;
        }
        this.f9627 = str;
        this.f9628 = num;
        this.f9629 = str2;
        this.f9630 = str3;
        this.f9631 = str4;
        this.f9632 = str5;
        this.f9633 = str6;
        this.f9634 = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2992)) {
            return false;
        }
        C2992 c2992 = (C2992) obj;
        return AbstractC2207.m4087(this.f9627, c2992.f9627) && AbstractC2207.m4087(this.f9628, c2992.f9628) && AbstractC2207.m4087(this.f9629, c2992.f9629) && AbstractC2207.m4087(this.f9630, c2992.f9630) && AbstractC2207.m4087(this.f9631, c2992.f9631) && AbstractC2207.m4087(this.f9632, c2992.f9632) && AbstractC2207.m4087(this.f9633, c2992.f9633) && AbstractC2207.m4087(this.f9634, c2992.f9634);
    }

    public final int hashCode() {
        String str = this.f9627;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9628;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9629;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9630;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9631;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9632;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9633;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9634;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("StreamvideoProto(streamvideourl=");
        sb.append(this.f9627);
        sb.append(", streamvideototaltime=");
        sb.append(this.f9628);
        sb.append(", streamvideowording=");
        sb.append(this.f9629);
        sb.append(", streamvideoweburl=");
        sb.append(this.f9630);
        sb.append(", streamvideotitle=");
        sb.append(this.f9631);
        sb.append(", streamvideothumburl=");
        sb.append(this.f9632);
        sb.append(", streamvideoaduxinfo=");
        sb.append(this.f9633);
        sb.append(", streamvideopublishid=");
        return AbstractC1194.m2786(sb, this.f9634, ')');
    }
}
