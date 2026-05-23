package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᛸᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3149 {
    public static final C3148 Companion = new C3148();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10023 = {null, null, null, null, AbstractC1458.m3163(new C3125(5)), AbstractC1458.m3163(new C3125(6)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10026;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10027;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List f10028;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List f10029;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Boolean f10030;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Boolean f10031;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10032;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f10033;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10034;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f10035;

    public /* synthetic */ C3149(int i, Long l, Long l2, Integer num, Integer num2, List list, List list2, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, String str) {
        if (4095 != (i & 4095)) {
            AbstractC1270.m2997(i, 4095, C3147.f10022.mo1363());
            throw null;
        }
        this.f10024 = l;
        this.f10025 = l2;
        this.f10026 = num;
        this.f10027 = num2;
        this.f10028 = list;
        this.f10029 = list2;
        this.f10030 = bool;
        this.f10031 = bool2;
        this.f10032 = num3;
        this.f10033 = num4;
        this.f10034 = num5;
        this.f10035 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3149)) {
            return false;
        }
        C3149 c3149 = (C3149) obj;
        return AbstractC2207.m4087(this.f10024, c3149.f10024) && AbstractC2207.m4087(this.f10025, c3149.f10025) && AbstractC2207.m4087(this.f10026, c3149.f10026) && AbstractC2207.m4087(this.f10027, c3149.f10027) && AbstractC2207.m4087(this.f10028, c3149.f10028) && AbstractC2207.m4087(this.f10029, c3149.f10029) && AbstractC2207.m4087(this.f10030, c3149.f10030) && AbstractC2207.m4087(this.f10031, c3149.f10031) && AbstractC2207.m4087(this.f10032, c3149.f10032) && AbstractC2207.m4087(this.f10033, c3149.f10033) && AbstractC2207.m4087(this.f10034, c3149.f10034) && AbstractC2207.m4087(this.f10035, c3149.f10035);
    }

    public final int hashCode() {
        Long l = this.f10024;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10025;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f10026;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10027;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f10028;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f10029;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f10030;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10031;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.f10032;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10033;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10034;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.f10035;
        return iHashCode11 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("m40Proto(start_time=");
        sb.append(this.f10024);
        sb.append(", end_time=");
        sb.append(this.f10025);
        sb.append(", quest_duration=");
        sb.append(this.f10026);
        sb.append(", time_interval_before_quest=");
        sb.append(this.f10027);
        sb.append(", progress=");
        sb.append(this.f10028);
        sb.append(", reward=");
        sb.append(this.f10029);
        sb.append(", delivery_crit_quest=");
        sb.append(this.f10030);
        sb.append(", is_crit_quest_accomplished=");
        sb.append(this.f10031);
        sb.append(", current_stage=");
        sb.append(this.f10032);
        sb.append(", stage_time_left=");
        sb.append(this.f10033);
        sb.append(", current_stage_duration=");
        sb.append(this.f10034);
        sb.append(", crit_quest_id=");
        return AbstractC1194.m2786(sb, this.f10035, ')');
    }
}
