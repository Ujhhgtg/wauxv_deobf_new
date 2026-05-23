package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3272 {
    public static final C3271 Companion = new C3271();

    public static final InterfaceC1758[] f10391 = {AbstractC1458.m3163(new C3125(17)), null, AbstractC1458.m3163(new C3125(18)), null, null, null, null, null, null, null, null};

    public final List f10392;

    public final C3299 f10393;

    public final List f10394;

    public final C3043 f10395;

    public final C3043 f10396;

    public final C3043 f10397;

    public final C3043 f10398;

    public final String f10399;

    public final C3043 f10400;

    public final String f10401;

    public final Boolean f10402;

    public /* synthetic */ C3272(int i, List list, C3299 c3299, List list2, C3043 c3043, C3043 c3044, C3043 c3045, C3043 c3046, String str, C3043 c3047, String str2, Boolean bool) {
        if (2047 != (i & 2047)) {
            AbstractC1270.m2997(i, 2047, C3270.f10390.mo1363());
            throw null;
        }
        this.f10392 = list;
        this.f10393 = c3299;
        this.f10394 = list2;
        this.f10395 = c3043;
        this.f10396 = c3044;
        this.f10397 = c3045;
        this.f10398 = c3046;
        this.f10399 = str;
        this.f10400 = c3047;
        this.f10401 = str2;
        this.f10402 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3272)) {
            return false;
        }
        C3272 c3272 = (C3272) obj;
        return AbstractC2207.m4087(this.f10392, c3272.f10392) && AbstractC2207.m4087(this.f10393, c3272.f10393) && AbstractC2207.m4087(this.f10394, c3272.f10394) && AbstractC2207.m4087(this.f10395, c3272.f10395) && AbstractC2207.m4087(this.f10396, c3272.f10396) && AbstractC2207.m4087(this.f10397, c3272.f10397) && AbstractC2207.m4087(this.f10398, c3272.f10398) && AbstractC2207.m4087(this.f10399, c3272.f10399) && AbstractC2207.m4087(this.f10400, c3272.f10400) && AbstractC2207.m4087(this.f10401, c3272.f10401) && AbstractC2207.m4087(this.f10402, c3272.f10402);
    }

    public final int hashCode() {
        List list = this.f10392;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C3299 c3299 = this.f10393;
        int iHashCode2 = (iHashCode + (c3299 == null ? 0 : c3299.hashCode())) * 31;
        List list2 = this.f10394;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C3043 c3043 = this.f10395;
        int iHashCode4 = (iHashCode3 + (c3043 == null ? 0 : c3043.hashCode())) * 31;
        C3043 c3044 = this.f10396;
        int iHashCode5 = (iHashCode4 + (c3044 == null ? 0 : c3044.hashCode())) * 31;
        C3043 c3045 = this.f10397;
        int iHashCode6 = (iHashCode5 + (c3045 == null ? 0 : c3045.hashCode())) * 31;
        C3043 c3046 = this.f10398;
        int iHashCode7 = (iHashCode6 + (c3046 == null ? 0 : c3046.hashCode())) * 31;
        String str = this.f10399;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        C3043 c3047 = this.f10400;
        int iHashCode9 = (iHashCode8 + (c3047 == null ? 0 : c3047.hashCode())) * 31;
        String str2 = this.f10401;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f10402;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("t40Proto(reward_product_id=");
        sb.append(this.f10392);
        sb.append(", business_type=");
        sb.append(this.f10393);
        sb.append(", thumbnail_file_url=");
        sb.append(this.f10394);
        sb.append(", preview_pag_url=");
        sb.append(this.f10395);
        sb.append(", animation_pag_url=");
        sb.append(this.f10396);
        sb.append(", thumbnail_file_md5=");
        sb.append(this.f10397);
        sb.append(", preview_pag_md5=");
        sb.append(this.f10398);
        sb.append(", animation_pag_md5=");
        sb.append(this.f10399);
        sb.append(", name=");
        sb.append(this.f10400);
        sb.append(", price=");
        sb.append(this.f10401);
        sb.append(", gift_type=");
        sb.append(this.f10402);
        sb.append(')');
        return sb.toString();
    }
}
