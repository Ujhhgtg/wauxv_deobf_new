package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3194 {
    public static final C3193 Companion = new C3193();

    public final C2956 f10208;

    public final Integer f10209;

    public final String f10210;

    public final C3076 f10211;

    public final C3266 f10212;

    public /* synthetic */ C3194(int i, C2956 c2956, Integer num, String str, C3076 c3076, C3266 c3266) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3192.f10207.mo1363());
            throw null;
        }
        this.f10208 = c2956;
        this.f10209 = num;
        this.f10210 = str;
        this.f10211 = c3076;
        this.f10212 = c3266;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3194)) {
            return false;
        }
        C3194 c3194 = (C3194) obj;
        return AbstractC2207.m4087(this.f10208, c3194.f10208) && AbstractC2207.m4087(this.f10209, c3194.f10209) && AbstractC2207.m4087(this.f10210, c3194.f10210) && AbstractC2207.m4087(this.f10211, c3194.f10211) && AbstractC2207.m4087(this.f10212, c3194.f10212);
    }

    public final int hashCode() {
        C2956 c2956 = this.f10208;
        int iHashCode = (c2956 == null ? 0 : c2956.hashCode()) * 31;
        Integer num = this.f10209;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10210;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C3076 c3076 = this.f10211;
        int iHashCode4 = (iHashCode3 + (c3076 == null ? 0 : c3076.hashCode())) * 31;
        C3266 c3266 = this.f10212;
        return iHashCode4 + (c3266 != null ? c3266.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("o22Proto(contact=");
        sb.append(this.f10208);
        sb.append(", enable_click_author=");
        sb.append(this.f10209);
        sb.append(", h5_url=");
        sb.append(this.f10210);
        sb.append(", friend_data=");
        sb.append(this.f10211);
        sb.append(", lite_app_param=");
        sb.append(this.f10212);
        sb.append(')');
        return sb.toString();
    }
}
