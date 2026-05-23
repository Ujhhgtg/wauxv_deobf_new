package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3137 {
    public static final C3136 Companion = new C3136();

    public final String f9990;

    public final String f9991;

    public final String f9992;

    public final Integer f9993;

    public final Long f9994;

    public final String f9995;

    public /* synthetic */ C3137(int i, String str, String str2, String str3, Integer num, Long l, String str4) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3135.f9989.mo1363());
            throw null;
        }
        this.f9990 = str;
        this.f9991 = str2;
        this.f9992 = str3;
        this.f9993 = num;
        this.f9994 = l;
        this.f9995 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3137)) {
            return false;
        }
        C3137 c3137 = (C3137) obj;
        return AbstractC2207.m4087(this.f9990, c3137.f9990) && AbstractC2207.m4087(this.f9991, c3137.f9991) && AbstractC2207.m4087(this.f9992, c3137.f9992) && AbstractC2207.m4087(this.f9993, c3137.f9993) && AbstractC2207.m4087(this.f9994, c3137.f9994) && AbstractC2207.m4087(this.f9995, c3137.f9995);
    }

    public final int hashCode() {
        String str = this.f9990;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9991;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9992;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f9993;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f9994;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f9995;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("lk0Proto(topicEventId=");
        sb.append(this.f9990);
        sb.append(", topicEventName=");
        sb.append(this.f9991);
        sb.append(", topicEventCreator=");
        sb.append(this.f9992);
        sb.append(", participateCount=");
        sb.append(this.f9993);
        sb.append(", displayMask=");
        sb.append(this.f9994);
        sb.append(", shareTitle=");
        return AbstractC1194.m2786(sb, this.f9995, ')');
    }
}
