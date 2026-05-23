package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3239 {
    public static final C3238 Companion = new C3238();

    public final String f10279;

    public final String f10280;

    public final Float f10281;

    public final Float f10282;

    public final String f10283;

    public final Integer f10284;

    public /* synthetic */ C3239(int i, String str, String str2, Float f, Float f2, String str3, Integer num) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3237.f10278.mo1363());
            throw null;
        }
        this.f10279 = str;
        this.f10280 = str2;
        this.f10281 = f;
        this.f10282 = f2;
        this.f10283 = str3;
        this.f10284 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3239)) {
            return false;
        }
        C3239 c3239 = (C3239) obj;
        return AbstractC2207.m4087(this.f10279, c3239.f10279) && AbstractC2207.m4087(this.f10280, c3239.f10280) && AbstractC2207.m4087(this.f10281, c3239.f10281) && AbstractC2207.m4087(this.f10282, c3239.f10282) && AbstractC2207.m4087(this.f10283, c3239.f10283) && AbstractC2207.m4087(this.f10284, c3239.f10284);
    }

    public final int hashCode() {
        String str = this.f10279;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10280;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.f10281;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f10282;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.f10283;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f10284;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("qj3Proto(url=");
        sb.append(this.f10279);
        sb.append(", thumbUrl=");
        sb.append(this.f10280);
        sb.append(", width=");
        sb.append(this.f10281);
        sb.append(", height=");
        sb.append(this.f10282);
        sb.append(", coverUrl=");
        sb.append(this.f10283);
        sb.append(", videoPlayDuration=");
        return AbstractC2668.m4677(sb, this.f10284, ')');
    }
}
