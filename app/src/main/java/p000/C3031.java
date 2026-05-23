package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3031 {
    public static final C3030 Companion = new C3030();

    public final C3106 f9729;

    public final Integer f9730;

    public final String f9731;

    public final String f9732;

    public final Long f9733;

    public /* synthetic */ C3031(int i, C3106 c3106, Integer num, String str, String str2, Long l) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3029.f9728.mo1363());
            throw null;
        }
        this.f9729 = c3106;
        this.f9730 = num;
        this.f9731 = str;
        this.f9732 = str2;
        this.f9733 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3031)) {
            return false;
        }
        C3031 c3031 = (C3031) obj;
        return AbstractC2207.m4087(this.f9729, c3031.f9729) && AbstractC2207.m4087(this.f9730, c3031.f9730) && AbstractC2207.m4087(this.f9731, c3031.f9731) && AbstractC2207.m4087(this.f9732, c3031.f9732) && AbstractC2207.m4087(this.f9733, c3031.f9733);
    }

    public final int hashCode() {
        C3106 c3106 = this.f9729;
        int iHashCode = (c3106 == null ? 0 : c3106.hashCode()) * 31;
        Integer num = this.f9730;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f9731;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9732;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f9733;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("bf1Proto(mic_contact=");
        sb.append(this.f9729);
        sb.append(", mic_type=");
        sb.append(this.f9730);
        sb.append(", mic_sdk_user_id=");
        sb.append(this.f9731);
        sb.append(", live_mic_id=");
        sb.append(this.f9732);
        sb.append(", mic_seq=");
        sb.append(this.f9733);
        sb.append(')');
        return sb.toString();
    }
}
