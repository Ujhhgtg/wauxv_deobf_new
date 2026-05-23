package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3070 {
    public static final C3069 Companion = new C3069();

    public static final InterfaceC1758[] f9828 = {null, null, null, null, null, AbstractC1458.m3163(new C2083(27)), null};

    public final String f9829;

    public final Long f9830;

    public final String f9831;

    public final C3106 f9832;

    public final Integer f9833;

    public final List f9834;

    public final Integer f9835;

    public /* synthetic */ C3070(int i, String str, Long l, String str2, C3106 c3106, Integer num, List list, Integer num2) {
        if (127 != (i & 127)) {
            AbstractC1270.m2997(i, 127, C3068.f9827.mo1363());
            throw null;
        }
        this.f9829 = str;
        this.f9830 = l;
        this.f9831 = str2;
        this.f9832 = c3106;
        this.f9833 = num;
        this.f9834 = list;
        this.f9835 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3070)) {
            return false;
        }
        C3070 c3070 = (C3070) obj;
        return AbstractC2207.m4087(this.f9829, c3070.f9829) && AbstractC2207.m4087(this.f9830, c3070.f9830) && AbstractC2207.m4087(this.f9831, c3070.f9831) && AbstractC2207.m4087(this.f9832, c3070.f9832) && AbstractC2207.m4087(this.f9833, c3070.f9833) && AbstractC2207.m4087(this.f9834, c3070.f9834) && AbstractC2207.m4087(this.f9835, c3070.f9835);
    }

    public final int hashCode() {
        String str = this.f9829;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f9830;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f9831;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C3106 c3106 = this.f9832;
        int iHashCode4 = (iHashCode3 + (c3106 == null ? 0 : c3106.hashCode())) * 31;
        Integer num = this.f9833;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f9834;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f9835;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ff1Proto(live_mic_id=");
        sb.append(this.f9829);
        sb.append(", mic_seq=");
        sb.append(this.f9830);
        sb.append(", mic_sdk_user_id=");
        sb.append(this.f9831);
        sb.append(", mic_contact=");
        sb.append(this.f9832);
        sb.append(", status=");
        sb.append(this.f9833);
        sb.append(", mic_audience_list=");
        sb.append(this.f9834);
        sb.append(", mic_sdk_live_id=");
        return AbstractC2668.m4677(sb, this.f9835, ')');
    }
}
