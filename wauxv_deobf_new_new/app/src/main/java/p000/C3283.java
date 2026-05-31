package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᤝᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3283 {
    public static final C3282 Companion = new C3282();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f10428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10431;

    public /* synthetic */ C3283(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3281.f10422.mo1509());
            throw null;
        }
        this.f10423 = str;
        this.f10424 = str2;
        this.f10425 = str3;
        this.f10426 = str4;
        this.f10427 = str5;
        this.f10428 = str6;
        this.f10429 = str7;
        this.f10430 = str8;
        this.f10431 = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3283)) {
            return false;
        }
        C3283 c3283 = (C3283) obj;
        return AbstractC1469.m3322(this.f10423, c3283.f10423) && AbstractC1469.m3322(this.f10424, c3283.f10424) && AbstractC1469.m3322(this.f10425, c3283.f10425) && AbstractC1469.m3322(this.f10426, c3283.f10426) && AbstractC1469.m3322(this.f10427, c3283.f10427) && AbstractC1469.m3322(this.f10428, c3283.f10428) && AbstractC1469.m3322(this.f10429, c3283.f10429) && AbstractC1469.m3322(this.f10430, c3283.f10430) && AbstractC1469.m3322(this.f10431, c3283.f10431);
    }

    public final int hashCode() {
        String str = this.f10423;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10424;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10425;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10426;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10427;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10428;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10429;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10430;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10431;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("pk3Proto(adaptive_pattern_wording=");
        sb.append(this.f10423);
        sb.append(", seat_pattern_wording=");
        sb.append(this.f10424);
        sb.append(", leader_pattern_wording=");
        sb.append(this.f10425);
        sb.append(", solo_battle_mode_wording=");
        sb.append(this.f10426);
        sb.append(", teamup_battle_mode_wording=");
        sb.append(this.f10427);
        sb.append(", battle_indicator_reward_heat_wording=");
        sb.append(this.f10428);
        sb.append(", battle_indicator_specific_gift_num_wording=");
        sb.append(this.f10429);
        sb.append(", audience_solo_battle_pattern_wording=");
        sb.append(this.f10430);
        sb.append(", audience_teamup_battle_pattern_wording=");
        return AbstractC1095.m2801(sb, this.f10431, ')');
    }
}
