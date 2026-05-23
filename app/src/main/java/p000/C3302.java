package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᲇᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3302 {
    public static final C3301 Companion = new C3301();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10479 = {null, null, null, null, AbstractC1458.m3163(new C3125(21)), null, null, null, null, AbstractC1458.m3163(new C3125(22)), null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10481;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10482;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10483;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List f10484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Long f10486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10488;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final List f10489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10490;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C3287 f10491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Integer f10492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Boolean f10493;

    public /* synthetic */ C3302(int i, String str, Long l, Integer num, Integer num2, List list, Integer num3, Long l2, Integer num4, Integer num5, List list2, Integer num6, C3287 c3287, Integer num7, Boolean bool) {
        if (16383 != (i & 16383)) {
            AbstractC1270.m2997(i, 16383, C3300.f10478.mo1363());
            throw null;
        }
        this.f10480 = str;
        this.f10481 = l;
        this.f10482 = num;
        this.f10483 = num2;
        this.f10484 = list;
        this.f10485 = num3;
        this.f10486 = l2;
        this.f10487 = num4;
        this.f10488 = num5;
        this.f10489 = list2;
        this.f10490 = num6;
        this.f10491 = c3287;
        this.f10492 = num7;
        this.f10493 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3302)) {
            return false;
        }
        C3302 c3302 = (C3302) obj;
        return AbstractC2207.m4087(this.f10480, c3302.f10480) && AbstractC2207.m4087(this.f10481, c3302.f10481) && AbstractC2207.m4087(this.f10482, c3302.f10482) && AbstractC2207.m4087(this.f10483, c3302.f10483) && AbstractC2207.m4087(this.f10484, c3302.f10484) && AbstractC2207.m4087(this.f10485, c3302.f10485) && AbstractC2207.m4087(this.f10486, c3302.f10486) && AbstractC2207.m4087(this.f10487, c3302.f10487) && AbstractC2207.m4087(this.f10488, c3302.f10488) && AbstractC2207.m4087(this.f10489, c3302.f10489) && AbstractC2207.m4087(this.f10490, c3302.f10490) && AbstractC2207.m4087(this.f10491, c3302.f10491) && AbstractC2207.m4087(this.f10492, c3302.f10492) && AbstractC2207.m4087(this.f10493, c3302.f10493);
    }

    public final int hashCode() {
        String str = this.f10480;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f10481;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f10482;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10483;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f10484;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.f10485;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.f10486;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num4 = this.f10487;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10488;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list2 = this.f10489;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.f10490;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        C3287 c3287 = this.f10491;
        int iHashCode12 = (iHashCode11 + (c3287 == null ? 0 : c3287.hashCode())) * 31;
        Integer num7 = this.f10492;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.f10493;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("v51Proto(battle_id=");
        sb.append(this.f10480);
        sb.append(", battle_seq=");
        sb.append(this.f10481);
        sb.append(", status=");
        sb.append(this.f10482);
        sb.append(", time_left=");
        sb.append(this.f10483);
        sb.append(", player_info=");
        sb.append(this.f10484);
        sb.append(", result=");
        sb.append(this.f10485);
        sb.append(", delay_ms=");
        sb.append(this.f10486);
        sb.append(", battle_type=");
        sb.append(this.f10487);
        sb.append(", battle_mode=");
        sb.append(this.f10488);
        sb.append(", battle_teams=");
        sb.append(this.f10489);
        sb.append(", indicator_type=");
        sb.append(this.f10490);
        sb.append(", extra_info=");
        sb.append(this.f10491);
        sb.append(", battle_scope=");
        sb.append(this.f10492);
        sb.append(", is_disable_next_battle=");
        sb.append(this.f10493);
        sb.append(')');
        return sb.toString();
    }
}
