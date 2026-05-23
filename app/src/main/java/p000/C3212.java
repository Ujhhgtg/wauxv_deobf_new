package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3212 {
    public static final C3211 Companion = new C3211();

    public final C3028 f10233;

    public final Integer f10234;

    public final String f10235;

    public final Integer f10236;

    public final Integer f10237;

    public /* synthetic */ C3212(int i, C3028 c3028, Integer num, String str, Integer num2, Integer num3) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3210.f10232.mo1363());
            throw null;
        }
        this.f10233 = c3028;
        this.f10234 = num;
        this.f10235 = str;
        this.f10236 = num2;
        this.f10237 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3212)) {
            return false;
        }
        C3212 c3212 = (C3212) obj;
        return AbstractC2207.m4087(this.f10233, c3212.f10233) && AbstractC2207.m4087(this.f10234, c3212.f10234) && AbstractC2207.m4087(this.f10235, c3212.f10235) && AbstractC2207.m4087(this.f10236, c3212.f10236) && AbstractC2207.m4087(this.f10237, c3212.f10237);
    }

    public final int hashCode() {
        C3028 c3028 = this.f10233;
        int iHashCode = (c3028 == null ? 0 : c3028.hashCode()) * 31;
        Integer num = this.f10234;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10235;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10236;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10237;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("or5Proto(tmpl_version_info=");
        sb.append(this.f10233);
        sb.append(", tmpl_type=");
        sb.append(this.f10234);
        sb.append(", camera_tmpl_id=");
        sb.append(this.f10235);
        sb.append(", permitted_publish_method_flag=");
        sb.append(this.f10236);
        sb.append(", camera_position=");
        return AbstractC2668.m4677(sb, this.f10237, ')');
    }
}
