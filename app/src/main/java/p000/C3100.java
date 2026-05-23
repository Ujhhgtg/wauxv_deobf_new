package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3100 {
    public static final C3099 Companion = new C3099();

    public final Integer f9899;

    public final C2956 f9900;

    public final Integer f9901;

    public final String f9902;

    public final String f9903;

    public /* synthetic */ C3100(int i, Integer num, C2956 c2956, Integer num2, String str, String str2) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3098.f9898.mo1363());
            throw null;
        }
        this.f9899 = num;
        this.f9900 = c2956;
        this.f9901 = num2;
        this.f9902 = str;
        this.f9903 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3100)) {
            return false;
        }
        C3100 c3100 = (C3100) obj;
        return AbstractC2207.m4087(this.f9899, c3100.f9899) && AbstractC2207.m4087(this.f9900, c3100.f9900) && AbstractC2207.m4087(this.f9901, c3100.f9901) && AbstractC2207.m4087(this.f9902, c3100.f9902) && AbstractC2207.m4087(this.f9903, c3100.f9903);
    }

    public final int hashCode() {
        Integer num = this.f9899;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C2956 c2956 = this.f9900;
        int iHashCode2 = (iHashCode + (c2956 == null ? 0 : c2956.hashCode())) * 31;
        Integer num2 = this.f9901;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f9902;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9903;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ht1Proto(music_mv_topic_id=");
        sb.append(this.f9899);
        sb.append(", contact=");
        sb.append(this.f9900);
        sb.append(", object_id=");
        sb.append(this.f9901);
        sb.append(", object_nonce_id=");
        sb.append(this.f9902);
        sb.append(", recommend_reason=");
        return AbstractC1194.m2786(sb, this.f9903, ')');
    }
}
