package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3097 {
    public static final C3096 Companion = new C3096();

    public final String f9893;

    public final Integer f9894;

    public final Integer f9895;

    public final Integer f9896;

    public final Integer f9897;

    public /* synthetic */ C3097(int i, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3095.f9892.mo1363());
            throw null;
        }
        this.f9893 = str;
        this.f9894 = num;
        this.f9895 = num2;
        this.f9896 = num3;
        this.f9897 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3097)) {
            return false;
        }
        C3097 c3097 = (C3097) obj;
        return AbstractC2207.m4087(this.f9893, c3097.f9893) && AbstractC2207.m4087(this.f9894, c3097.f9894) && AbstractC2207.m4087(this.f9895, c3097.f9895) && AbstractC2207.m4087(this.f9896, c3097.f9896) && AbstractC2207.m4087(this.f9897, c3097.f9897);
    }

    public final int hashCode() {
        String str = this.f9893;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9894;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9895;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9896;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9897;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("hs3Proto(feed_detail_url=");
        sb.append(this.f9893);
        sb.append(", biz_uin=");
        sb.append(this.f9894);
        sb.append(", appmsg_id=");
        sb.append(this.f9895);
        sb.append(", appmsg_index=");
        sb.append(this.f9896);
        sb.append(", item_show_type=");
        return AbstractC2668.m4677(sb, this.f9897, ')');
    }
}
