package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3356 {
    public static final C3355 Companion = new C3355();

    public static final InterfaceC1758[] f10577 = {null, null, AbstractC1458.m3163(new C3125(25)), null, null, null, null, AbstractC1458.m3163(new C3125(26)), null, AbstractC1458.m3163(new C3125(27)), null, AbstractC1458.m3163(new C3125(28)), AbstractC1458.m3163(new C3125(29))};

    public final Integer f10578;

    public final Integer f10579;

    public final List f10580;

    public final String f10581;

    public final Integer f10582;

    public final String f10583;

    public final String f10584;

    public final List f10585;

    public final Boolean f10586;

    public final List f10587;

    public final String f10588;

    public final List f10589;

    public final List f10590;

    public /* synthetic */ C3356(int i, Integer num, Integer num2, List list, String str, Integer num3, String str2, String str3, List list2, Boolean bool, List list3, String str4, List list4, List list5) {
        if (8191 != (i & 8191)) {
            AbstractC1270.m2997(i, 8191, C3354.f10576.mo1363());
            throw null;
        }
        this.f10578 = num;
        this.f10579 = num2;
        this.f10580 = list;
        this.f10581 = str;
        this.f10582 = num3;
        this.f10583 = str2;
        this.f10584 = str3;
        this.f10585 = list2;
        this.f10586 = bool;
        this.f10587 = list3;
        this.f10588 = str4;
        this.f10589 = list4;
        this.f10590 = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3356)) {
            return false;
        }
        C3356 c3356 = (C3356) obj;
        return AbstractC2207.m4087(this.f10578, c3356.f10578) && AbstractC2207.m4087(this.f10579, c3356.f10579) && AbstractC2207.m4087(this.f10580, c3356.f10580) && AbstractC2207.m4087(this.f10581, c3356.f10581) && AbstractC2207.m4087(this.f10582, c3356.f10582) && AbstractC2207.m4087(this.f10583, c3356.f10583) && AbstractC2207.m4087(this.f10584, c3356.f10584) && AbstractC2207.m4087(this.f10585, c3356.f10585) && AbstractC2207.m4087(this.f10586, c3356.f10586) && AbstractC2207.m4087(this.f10587, c3356.f10587) && AbstractC2207.m4087(this.f10588, c3356.f10588) && AbstractC2207.m4087(this.f10589, c3356.f10589) && AbstractC2207.m4087(this.f10590, c3356.f10590);
    }

    public final int hashCode() {
        Integer num = this.f10578;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10579;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f10580;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f10581;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f10582;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f10583;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10584;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.f10585;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f10586;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list3 = this.f10587;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.f10588;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list4 = this.f10589;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f10590;
        return iHashCode12 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("x93Proto(start_timestamp=");
        sb.append(this.f10578);
        sb.append(", end_timestamp=");
        sb.append(this.f10579);
        sb.append(", item_list=");
        sb.append(this.f10580);
        sb.append(", content_text=");
        sb.append(this.f10581);
        sb.append(", sync_interval=");
        sb.append(this.f10582);
        sb.append(", task_id=");
        sb.append(this.f10583);
        sb.append(", finish_content_text=");
        sb.append(this.f10584);
        sb.append(", animation_list=");
        sb.append(this.f10585);
        sb.append(", cancel=");
        sb.append(this.f10586);
        sb.append(", landscape_animation_list=");
        sb.append(this.f10587);
        sb.append(", finish_carousel_text=");
        sb.append(this.f10588);
        sb.append(", animation_ext_info_list=");
        sb.append(this.f10589);
        sb.append(", landscape_animation_ext_info_list=");
        sb.append(this.f10590);
        sb.append(')');
        return sb.toString();
    }
}
