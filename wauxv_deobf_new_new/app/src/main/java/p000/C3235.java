package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᤝᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3235 {
    public static final C3234 Companion = new C3234();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Boolean f10339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3208 f10340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Long f10341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Boolean f10342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Long f10343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Long f10344;

    public /* synthetic */ C3235(int i, String str, Long l, Integer num, Boolean bool, C3208 c3208, Long l2, Boolean bool2, Long l3, Long l4) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3233.f10335.mo1509());
            throw null;
        }
        this.f10336 = str;
        this.f10337 = l;
        this.f10338 = num;
        this.f10339 = bool;
        this.f10340 = c3208;
        this.f10341 = l2;
        this.f10342 = bool2;
        this.f10343 = l3;
        this.f10344 = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3235)) {
            return false;
        }
        C3235 c3235 = (C3235) obj;
        return AbstractC1469.m3322(this.f10336, c3235.f10336) && AbstractC1469.m3322(this.f10337, c3235.f10337) && AbstractC1469.m3322(this.f10338, c3235.f10338) && AbstractC1469.m3322(this.f10339, c3235.f10339) && AbstractC1469.m3322(this.f10340, c3235.f10340) && AbstractC1469.m3322(this.f10341, c3235.f10341) && AbstractC1469.m3322(this.f10342, c3235.f10342) && AbstractC1469.m3322(this.f10343, c3235.f10343) && AbstractC1469.m3322(this.f10344, c3235.f10344);
    }

    public final int hashCode() {
        String str = this.f10336;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f10337;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f10338;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f10339;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C3208 c3208 = this.f10340;
        int iHashCode5 = (iHashCode4 + (c3208 == null ? 0 : c3208.hashCode())) * 31;
        Long l2 = this.f10341;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.f10342;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.f10343;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f10344;
        return iHashCode8 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("n84Proto(finder_username=");
        sb.append(this.f10336);
        sb.append(", reward_wecoin=");
        sb.append(this.f10337);
        sb.append(", winning_streak_count=");
        sb.append(this.f10338);
        sb.append(", is_accepted=");
        sb.append(this.f10339);
        sb.append(", crit_quest_info=");
        sb.append(this.f10340);
        sb.append(", extra_reward_wecoin=");
        sb.append(this.f10341);
        sb.append(", is_applicant=");
        sb.append(this.f10342);
        sb.append(", count=");
        sb.append(this.f10343);
        sb.append(", sdk_user_id=");
        sb.append(this.f10344);
        sb.append(')');
        return sb.toString();
    }
}
