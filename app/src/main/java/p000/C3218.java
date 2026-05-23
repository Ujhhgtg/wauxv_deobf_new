package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3218 {
    public static final C3217 Companion = new C3217();

    public final Integer f10242;

    public final Float f10243;

    public final Integer f10244;

    public final Integer f10245;

    public final Float f10246;

    public final Integer f10247;

    public final Integer f10248;

    public final Long f10249;

    public final String f10250;

    public /* synthetic */ C3218(int i, Integer num, Float f, Integer num2, Integer num3, Float f2, Integer num4, Integer num5, Long l, String str) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C3216.f10241.mo1363());
            throw null;
        }
        this.f10242 = num;
        this.f10243 = f;
        this.f10244 = num2;
        this.f10245 = num3;
        this.f10246 = f2;
        this.f10247 = num4;
        this.f10248 = num5;
        this.f10249 = l;
        this.f10250 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3218)) {
            return false;
        }
        C3218 c3218 = (C3218) obj;
        return AbstractC2207.m4087(this.f10242, c3218.f10242) && AbstractC2207.m4087(this.f10243, c3218.f10243) && AbstractC2207.m4087(this.f10244, c3218.f10244) && AbstractC2207.m4087(this.f10245, c3218.f10245) && AbstractC2207.m4087(this.f10246, c3218.f10246) && AbstractC2207.m4087(this.f10247, c3218.f10247) && AbstractC2207.m4087(this.f10248, c3218.f10248) && AbstractC2207.m4087(this.f10249, c3218.f10249) && AbstractC2207.m4087(this.f10250, c3218.f10250);
    }

    public final int hashCode() {
        Integer num = this.f10242;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.f10243;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.f10244;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10245;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f2 = this.f10246;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.f10247;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10248;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.f10249;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f10250;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("p61Proto(video_quality_level=");
        sb.append(this.f10242);
        sb.append(", preload_file_size_percent=");
        sb.append(this.f10243);
        sb.append(", preload_file_bytes=");
        sb.append(this.f10244);
        sb.append(", file_total_bytes=");
        sb.append(this.f10245);
        sb.append(", preload_file_duration_percent=");
        sb.append(this.f10246);
        sb.append(", preload_file_duration=");
        sb.append(this.f10247);
        sb.append(", preload_file_total_duration=");
        sb.append(this.f10248);
        sb.append(", preload_start_time=");
        sb.append(this.f10249);
        sb.append(", tag_name=");
        return AbstractC1194.m2786(sb, this.f10250, ')');
    }
}
