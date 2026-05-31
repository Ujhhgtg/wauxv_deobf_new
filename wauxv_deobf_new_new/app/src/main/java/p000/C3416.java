package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᤝᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3416 {
    public static final C3415 Companion = new C3415();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10745 = {null, null, AbstractC2240.m4259(new C3163(27)), null, null, null, null, AbstractC2240.m4259(new C3163(28)), null, AbstractC2240.m4259(new C3163(29)), null, AbstractC2240.m4259(new C3413(0)), AbstractC2240.m4259(new C3413(1))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f10748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f10751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10752;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final List f10753;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Boolean f10754;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final List f10755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final List f10757;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final List f10758;

    public /* synthetic */ C3416(int i, Integer num, Integer num2, List list, String str, Integer num3, String str2, String str3, List list2, Boolean bool, List list3, String str4, List list4, List list5) {
        if (8191 != (i & 8191)) {
            AbstractC2234.m4187(i, 8191, C3414.f10744.mo1509());
            throw null;
        }
        this.f10746 = num;
        this.f10747 = num2;
        this.f10748 = list;
        this.f10749 = str;
        this.f10750 = num3;
        this.f10751 = str2;
        this.f10752 = str3;
        this.f10753 = list2;
        this.f10754 = bool;
        this.f10755 = list3;
        this.f10756 = str4;
        this.f10757 = list4;
        this.f10758 = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3416)) {
            return false;
        }
        C3416 c3416 = (C3416) obj;
        return AbstractC1469.m3322(this.f10746, c3416.f10746) && AbstractC1469.m3322(this.f10747, c3416.f10747) && AbstractC1469.m3322(this.f10748, c3416.f10748) && AbstractC1469.m3322(this.f10749, c3416.f10749) && AbstractC1469.m3322(this.f10750, c3416.f10750) && AbstractC1469.m3322(this.f10751, c3416.f10751) && AbstractC1469.m3322(this.f10752, c3416.f10752) && AbstractC1469.m3322(this.f10753, c3416.f10753) && AbstractC1469.m3322(this.f10754, c3416.f10754) && AbstractC1469.m3322(this.f10755, c3416.f10755) && AbstractC1469.m3322(this.f10756, c3416.f10756) && AbstractC1469.m3322(this.f10757, c3416.f10757) && AbstractC1469.m3322(this.f10758, c3416.f10758);
    }

    public final int hashCode() {
        Integer num = this.f10746;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10747;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f10748;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f10749;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f10750;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f10751;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10752;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.f10753;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f10754;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list3 = this.f10755;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.f10756;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list4 = this.f10757;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f10758;
        return iHashCode12 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("x93Proto(start_timestamp=");
        sb.append(this.f10746);
        sb.append(", end_timestamp=");
        sb.append(this.f10747);
        sb.append(", item_list=");
        sb.append(this.f10748);
        sb.append(", content_text=");
        sb.append(this.f10749);
        sb.append(", sync_interval=");
        sb.append(this.f10750);
        sb.append(", task_id=");
        sb.append(this.f10751);
        sb.append(", finish_content_text=");
        sb.append(this.f10752);
        sb.append(", animation_list=");
        sb.append(this.f10753);
        sb.append(", cancel=");
        sb.append(this.f10754);
        sb.append(", landscape_animation_list=");
        sb.append(this.f10755);
        sb.append(", finish_carousel_text=");
        sb.append(this.f10756);
        sb.append(", animation_ext_info_list=");
        sb.append(this.f10757);
        sb.append(", landscape_animation_ext_info_list=");
        sb.append(this.f10758);
        sb.append(')');
        return sb.toString();
    }
}
