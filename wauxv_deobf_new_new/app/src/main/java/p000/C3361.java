package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3361 {
    public static final C3360 Companion = new C3360();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10646 = {null, null, null, null, AbstractC2240.m4259(new C3163(23)), null, null, null, null, AbstractC2240.m4259(new C3163(24)), null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10647;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10649;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List f10651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Long f10653;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10654;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10655;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final List f10656;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C3346 f10658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Integer f10659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Boolean f10660;

    public /* synthetic */ C3361(int i, String str, Long l, Integer num, Integer num2, List list, Integer num3, Long l2, Integer num4, Integer num5, List list2, Integer num6, C3346 c3346, Integer num7, Boolean bool) {
        if (16383 != (i & 16383)) {
            AbstractC2234.m4187(i, 16383, C3359.f10645.mo1509());
            throw null;
        }
        this.f10647 = str;
        this.f10648 = l;
        this.f10649 = num;
        this.f10650 = num2;
        this.f10651 = list;
        this.f10652 = num3;
        this.f10653 = l2;
        this.f10654 = num4;
        this.f10655 = num5;
        this.f10656 = list2;
        this.f10657 = num6;
        this.f10658 = c3346;
        this.f10659 = num7;
        this.f10660 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3361)) {
            return false;
        }
        C3361 c3361 = (C3361) obj;
        return AbstractC1469.m3322(this.f10647, c3361.f10647) && AbstractC1469.m3322(this.f10648, c3361.f10648) && AbstractC1469.m3322(this.f10649, c3361.f10649) && AbstractC1469.m3322(this.f10650, c3361.f10650) && AbstractC1469.m3322(this.f10651, c3361.f10651) && AbstractC1469.m3322(this.f10652, c3361.f10652) && AbstractC1469.m3322(this.f10653, c3361.f10653) && AbstractC1469.m3322(this.f10654, c3361.f10654) && AbstractC1469.m3322(this.f10655, c3361.f10655) && AbstractC1469.m3322(this.f10656, c3361.f10656) && AbstractC1469.m3322(this.f10657, c3361.f10657) && AbstractC1469.m3322(this.f10658, c3361.f10658) && AbstractC1469.m3322(this.f10659, c3361.f10659) && AbstractC1469.m3322(this.f10660, c3361.f10660);
    }

    public final int hashCode() {
        String str = this.f10647;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f10648;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f10649;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10650;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f10651;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.f10652;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.f10653;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num4 = this.f10654;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10655;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list2 = this.f10656;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.f10657;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        C3346 c3346 = this.f10658;
        int iHashCode12 = (iHashCode11 + (c3346 == null ? 0 : c3346.hashCode())) * 31;
        Integer num7 = this.f10659;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.f10660;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("v51Proto(battle_id=");
        sb.append(this.f10647);
        sb.append(", battle_seq=");
        sb.append(this.f10648);
        sb.append(", status=");
        sb.append(this.f10649);
        sb.append(", time_left=");
        sb.append(this.f10650);
        sb.append(", player_info=");
        sb.append(this.f10651);
        sb.append(", result=");
        sb.append(this.f10652);
        sb.append(", delay_ms=");
        sb.append(this.f10653);
        sb.append(", battle_type=");
        sb.append(this.f10654);
        sb.append(", battle_mode=");
        sb.append(this.f10655);
        sb.append(", battle_teams=");
        sb.append(this.f10656);
        sb.append(", indicator_type=");
        sb.append(this.f10657);
        sb.append(", extra_info=");
        sb.append(this.f10658);
        sb.append(", battle_scope=");
        sb.append(this.f10659);
        sb.append(", is_disable_next_battle=");
        sb.append(this.f10660);
        sb.append(')');
        return sb.toString();
    }
}
