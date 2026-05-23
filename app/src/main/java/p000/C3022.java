package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3022 {
    public static final C3021 Companion = new C3021();

    public final String f9710;

    public final Integer f9711;

    public final String f9712;

    public final String f9713;

    public final C3326 f9714;

    public final String f9715;

    public final C3137 f9716;

    public final String f9717;

    public /* synthetic */ C3022(int i, String str, Integer num, String str2, String str3, C3326 c3326, String str4, C3137 c3137, String str5) {
        if (255 != (i & 255)) {
            AbstractC1270.m2997(i, 255, C3020.f9709.mo1363());
            throw null;
        }
        this.f9710 = str;
        this.f9711 = num;
        this.f9712 = str2;
        this.f9713 = str3;
        this.f9714 = c3326;
        this.f9715 = str4;
        this.f9716 = c3137;
        this.f9717 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3022)) {
            return false;
        }
        C3022 c3022 = (C3022) obj;
        return AbstractC2207.m4087(this.f9710, c3022.f9710) && AbstractC2207.m4087(this.f9711, c3022.f9711) && AbstractC2207.m4087(this.f9712, c3022.f9712) && AbstractC2207.m4087(this.f9713, c3022.f9713) && AbstractC2207.m4087(this.f9714, c3022.f9714) && AbstractC2207.m4087(this.f9715, c3022.f9715) && AbstractC2207.m4087(this.f9716, c3022.f9716) && AbstractC2207.m4087(this.f9717, c3022.f9717);
    }

    public final int hashCode() {
        String str = this.f9710;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9711;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9712;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9713;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C3326 c3326 = this.f9714;
        int iHashCode5 = (iHashCode4 + (c3326 == null ? 0 : c3326.hashCode())) * 31;
        String str4 = this.f9715;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C3137 c3137 = this.f9716;
        int iHashCode7 = (iHashCode6 + (c3137 == null ? 0 : c3137.hashCode())) * 31;
        String str5 = this.f9717;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("b22Proto(topic=");
        sb.append(this.f9710);
        sb.append(", topicType=");
        sb.append(this.f9711);
        sb.append(", iconUrl=");
        sb.append(this.f9712);
        sb.append(", desc=");
        sb.append(this.f9713);
        sb.append(", location=");
        sb.append(this.f9714);
        sb.append(", patMusicId=");
        sb.append(this.f9715);
        sb.append(", event=");
        sb.append(this.f9716);
        sb.append(", feedId=");
        return AbstractC1194.m2786(sb, this.f9717, ')');
    }
}
