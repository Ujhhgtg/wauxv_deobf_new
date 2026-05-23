package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3040 {
    public static final C3039 Companion = new C3039();

    public static final InterfaceC1758[] f9741 = {null, null, null, null, null, null, null, null, null, AbstractC1458.m3163(new C2083(22))};

    public final String f9742;

    public final Long f9743;

    public final Long f9744;

    public final String f9745;

    public final String f9746;

    public final Long f9747;

    public final Boolean f9748;

    public final Boolean f9749;

    public final Integer f9750;

    public final List f9751;

    public /* synthetic */ C3040(int i, String str, Long l, Long l2, String str2, String str3, Long l3, Boolean bool, Boolean bool2, Integer num, List list) {
        if (1023 != (i & 1023)) {
            AbstractC1270.m2997(i, 1023, C3038.f9740.mo1363());
            throw null;
        }
        this.f9742 = str;
        this.f9743 = l;
        this.f9744 = l2;
        this.f9745 = str2;
        this.f9746 = str3;
        this.f9747 = l3;
        this.f9748 = bool;
        this.f9749 = bool2;
        this.f9750 = num;
        this.f9751 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3040)) {
            return false;
        }
        C3040 c3040 = (C3040) obj;
        return AbstractC2207.m4087(this.f9742, c3040.f9742) && AbstractC2207.m4087(this.f9743, c3040.f9743) && AbstractC2207.m4087(this.f9744, c3040.f9744) && AbstractC2207.m4087(this.f9745, c3040.f9745) && AbstractC2207.m4087(this.f9746, c3040.f9746) && AbstractC2207.m4087(this.f9747, c3040.f9747) && AbstractC2207.m4087(this.f9748, c3040.f9748) && AbstractC2207.m4087(this.f9749, c3040.f9749) && AbstractC2207.m4087(this.f9750, c3040.f9750) && AbstractC2207.m4087(this.f9751, c3040.f9751);
    }

    public final int hashCode() {
        String str = this.f9742;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f9743;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9744;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f9745;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9746;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f9747;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.f9748;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9749;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f9750;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f9751;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("cp1Proto(live_ad_id=");
        sb.append(this.f9742);
        sb.append(", start_time_ms=");
        sb.append(this.f9743);
        sb.append(", video_duration_ms=");
        sb.append(this.f9744);
        sb.append(", video_url=");
        sb.append(this.f9745);
        sb.append(", bg_img_url=");
        sb.append(this.f9746);
        sb.append(", end_time_ms=");
        sb.append(this.f9747);
        sb.append(", need_watch_multi_entrance_ad=");
        sb.append(this.f9748);
        sb.append(", need_preload=");
        sb.append(this.f9749);
        sb.append(", preload_percent=");
        sb.append(this.f9750);
        sb.append(", show_time_intervals=");
        sb.append(this.f9751);
        sb.append(')');
        return sb.toString();
    }
}
