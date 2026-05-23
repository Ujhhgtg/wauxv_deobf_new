package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3007 {
    public static final C3006 Companion = new C3006();

    public final String f9676;

    public final String f9677;

    public final String f9678;

    public final String f9679;

    public final String f9680;

    public final String f9681;

    public final String f9682;

    public final String f9683;

    public /* synthetic */ C3007(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            AbstractC1270.m2997(i, 255, C3005.f9675.mo1363());
            throw null;
        }
        this.f9676 = str;
        this.f9677 = str2;
        this.f9678 = str3;
        this.f9679 = str4;
        this.f9680 = str5;
        this.f9681 = str6;
        this.f9682 = str7;
        this.f9683 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3007)) {
            return false;
        }
        C3007 c3007 = (C3007) obj;
        return AbstractC2207.m4087(this.f9676, c3007.f9676) && AbstractC2207.m4087(this.f9677, c3007.f9677) && AbstractC2207.m4087(this.f9678, c3007.f9678) && AbstractC2207.m4087(this.f9679, c3007.f9679) && AbstractC2207.m4087(this.f9680, c3007.f9680) && AbstractC2207.m4087(this.f9681, c3007.f9681) && AbstractC2207.m4087(this.f9682, c3007.f9682) && AbstractC2207.m4087(this.f9683, c3007.f9683);
    }

    public final int hashCode() {
        String str = this.f9676;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9677;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9678;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9679;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9680;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9681;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9682;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f9683;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("a22Proto(latitudeString=");
        sb.append(this.f9676);
        sb.append(", longitudeString=");
        sb.append(this.f9677);
        sb.append(", poiName=");
        sb.append(this.f9678);
        sb.append(", poiScaleString=");
        sb.append(this.f9679);
        sb.append(", address=");
        sb.append(this.f9680);
        sb.append(", infoUrl=");
        sb.append(this.f9681);
        sb.append(", poiClassifyId=");
        sb.append(this.f9682);
        sb.append(", poiCategories=");
        return AbstractC1194.m2786(sb, this.f9683, ')');
    }
}
