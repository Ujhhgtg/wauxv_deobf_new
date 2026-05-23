package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2937 {
    public static final C2936 Companion = new C2936();

    public final String f9411;

    public final String f9412;

    public final String f9413;

    public final String f9414;

    public final String f9415;

    public final Integer f9416;

    public final Integer f9417;

    public /* synthetic */ C2937(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        if (127 != (i & 127)) {
            AbstractC1270.m2997(i, 127, C2935.f9410.mo1363());
            throw null;
        }
        this.f9411 = str;
        this.f9412 = str2;
        this.f9413 = str3;
        this.f9414 = str4;
        this.f9415 = str5;
        this.f9416 = num;
        this.f9417 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2937)) {
            return false;
        }
        C2937 c2937 = (C2937) obj;
        return AbstractC2207.m4087(this.f9411, c2937.f9411) && AbstractC2207.m4087(this.f9412, c2937.f9412) && AbstractC2207.m4087(this.f9413, c2937.f9413) && AbstractC2207.m4087(this.f9414, c2937.f9414) && AbstractC2207.m4087(this.f9415, c2937.f9415) && AbstractC2207.m4087(this.f9416, c2937.f9416) && AbstractC2207.m4087(this.f9417, c2937.f9417);
    }

    public final int hashCode() {
        String str = this.f9411;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9412;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9413;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9414;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9415;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f9416;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9417;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("AppInfoProto(id=");
        sb.append(this.f9411);
        sb.append(", version=");
        sb.append(this.f9412);
        sb.append(", appName=");
        sb.append(this.f9413);
        sb.append(", installUrl=");
        sb.append(this.f9414);
        sb.append(", fromUrl=");
        sb.append(this.f9415);
        sb.append(", clickable=");
        sb.append(this.f9416);
        sb.append(", isHidden=");
        return AbstractC2668.m4677(sb, this.f9417, ')');
    }
}
