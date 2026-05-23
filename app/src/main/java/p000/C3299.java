package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3299 {
    public static final C3298 Companion = new C3298();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f10472;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10473;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f10474;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f10475;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10476;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10477;

    public /* synthetic */ C3299(int i, Boolean bool, Integer num, Float f, String str, Boolean bool2, String str2, String str3, String str4) {
        if (255 != (i & 255)) {
            AbstractC1270.m2997(i, 255, C3297.f10469.mo1363());
            throw null;
        }
        this.f10470 = bool;
        this.f10471 = num;
        this.f10472 = f;
        this.f10473 = str;
        this.f10474 = bool2;
        this.f10475 = str2;
        this.f10476 = str3;
        this.f10477 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3299)) {
            return false;
        }
        C3299 c3299 = (C3299) obj;
        return AbstractC2207.m4087(this.f10470, c3299.f10470) && AbstractC2207.m4087(this.f10471, c3299.f10471) && AbstractC2207.m4087(this.f10472, c3299.f10472) && AbstractC2207.m4087(this.f10473, c3299.f10473) && AbstractC2207.m4087(this.f10474, c3299.f10474) && AbstractC2207.m4087(this.f10475, c3299.f10475) && AbstractC2207.m4087(this.f10476, c3299.f10476) && AbstractC2207.m4087(this.f10477, c3299.f10477);
    }

    public final int hashCode() {
        Boolean bool = this.f10470;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f10471;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f10472;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f10473;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f10474;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f10475;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10476;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10477;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("v40Proto(support_custom_text=");
        sb.append(this.f10470);
        sb.append(", text_len_limit=");
        sb.append(this.f10471);
        sb.append(", price=");
        sb.append(this.f10472);
        sb.append(", custom_text=");
        sb.append(this.f10473);
        sb.append(", specific_custom_text=");
        sb.append(this.f10474);
        sb.append(", antispam_custom_text=");
        sb.append(this.f10475);
        sb.append(", name=");
        sb.append(this.f10476);
        sb.append(", component_key=");
        return AbstractC1194.m2786(sb, this.f10477, ')');
    }
}
