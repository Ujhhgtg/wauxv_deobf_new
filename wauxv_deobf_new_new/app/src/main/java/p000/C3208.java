package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲀᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3208 {
    public static final C3207 Companion = new C3207();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10190 = {null, null, null, null, AbstractC2240.m4259(new C3163(7)), AbstractC2240.m4259(new C3163(8)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10192;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10193;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10194;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List f10195;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List f10196;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Boolean f10197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Boolean f10198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10199;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f10200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f10202;

    public /* synthetic */ C3208(int i, Long l, Long l2, Integer num, Integer num2, List list, List list2, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, String str) {
        if (4095 != (i & 4095)) {
            AbstractC2234.m4187(i, 4095, C3206.f10189.mo1509());
            throw null;
        }
        this.f10191 = l;
        this.f10192 = l2;
        this.f10193 = num;
        this.f10194 = num2;
        this.f10195 = list;
        this.f10196 = list2;
        this.f10197 = bool;
        this.f10198 = bool2;
        this.f10199 = num3;
        this.f10200 = num4;
        this.f10201 = num5;
        this.f10202 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3208)) {
            return false;
        }
        C3208 c3208 = (C3208) obj;
        return AbstractC1469.m3322(this.f10191, c3208.f10191) && AbstractC1469.m3322(this.f10192, c3208.f10192) && AbstractC1469.m3322(this.f10193, c3208.f10193) && AbstractC1469.m3322(this.f10194, c3208.f10194) && AbstractC1469.m3322(this.f10195, c3208.f10195) && AbstractC1469.m3322(this.f10196, c3208.f10196) && AbstractC1469.m3322(this.f10197, c3208.f10197) && AbstractC1469.m3322(this.f10198, c3208.f10198) && AbstractC1469.m3322(this.f10199, c3208.f10199) && AbstractC1469.m3322(this.f10200, c3208.f10200) && AbstractC1469.m3322(this.f10201, c3208.f10201) && AbstractC1469.m3322(this.f10202, c3208.f10202);
    }

    public final int hashCode() {
        Long l = this.f10191;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10192;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f10193;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10194;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f10195;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f10196;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f10197;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10198;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.f10199;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10200;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10201;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.f10202;
        return iHashCode11 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("m40Proto(start_time=");
        sb.append(this.f10191);
        sb.append(", end_time=");
        sb.append(this.f10192);
        sb.append(", quest_duration=");
        sb.append(this.f10193);
        sb.append(", time_interval_before_quest=");
        sb.append(this.f10194);
        sb.append(", progress=");
        sb.append(this.f10195);
        sb.append(", reward=");
        sb.append(this.f10196);
        sb.append(", delivery_crit_quest=");
        sb.append(this.f10197);
        sb.append(", is_crit_quest_accomplished=");
        sb.append(this.f10198);
        sb.append(", current_stage=");
        sb.append(this.f10199);
        sb.append(", stage_time_left=");
        sb.append(this.f10200);
        sb.append(", current_stage_duration=");
        sb.append(this.f10201);
        sb.append(", crit_quest_id=");
        return AbstractC1095.m2801(sb, this.f10202, ')');
    }
}
