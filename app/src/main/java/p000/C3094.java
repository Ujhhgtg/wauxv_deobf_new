package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3094 {
    public static final C3093 Companion = new C3093();

    public final String f9874;

    public final String f9875;

    public final String f9876;

    public final String f9877;

    public final String f9878;

    public final String f9879;

    public final String f9880;

    public final String f9881;

    public final String f9882;

    public final Integer f9883;

    public final String f9884;

    public final Integer f9885;

    public final String f9886;

    public final Integer f9887;

    public final String f9888;

    public final String f9889;

    public final String f9890;

    public final C3109 f9891;

    public /* synthetic */ C3094(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, Integer num2, String str11, Integer num3, String str12, String str13, String str14, C3109 c3109) {
        if (262143 != (i & 262143)) {
            AbstractC1270.m2997(i, 262143, C3092.f9873.mo1363());
            throw null;
        }
        this.f9874 = str;
        this.f9875 = str2;
        this.f9876 = str3;
        this.f9877 = str4;
        this.f9878 = str5;
        this.f9879 = str6;
        this.f9880 = str7;
        this.f9881 = str8;
        this.f9882 = str9;
        this.f9883 = num;
        this.f9884 = str10;
        this.f9885 = num2;
        this.f9886 = str11;
        this.f9887 = num3;
        this.f9888 = str12;
        this.f9889 = str13;
        this.f9890 = str14;
        this.f9891 = c3109;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3094)) {
            return false;
        }
        C3094 c3094 = (C3094) obj;
        return AbstractC2207.m4087(this.f9874, c3094.f9874) && AbstractC2207.m4087(this.f9875, c3094.f9875) && AbstractC2207.m4087(this.f9876, c3094.f9876) && AbstractC2207.m4087(this.f9877, c3094.f9877) && AbstractC2207.m4087(this.f9878, c3094.f9878) && AbstractC2207.m4087(this.f9879, c3094.f9879) && AbstractC2207.m4087(this.f9880, c3094.f9880) && AbstractC2207.m4087(this.f9881, c3094.f9881) && AbstractC2207.m4087(this.f9882, c3094.f9882) && AbstractC2207.m4087(this.f9883, c3094.f9883) && AbstractC2207.m4087(this.f9884, c3094.f9884) && AbstractC2207.m4087(this.f9885, c3094.f9885) && AbstractC2207.m4087(this.f9886, c3094.f9886) && AbstractC2207.m4087(this.f9887, c3094.f9887) && AbstractC2207.m4087(this.f9888, c3094.f9888) && AbstractC2207.m4087(this.f9889, c3094.f9889) && AbstractC2207.m4087(this.f9890, c3094.f9890) && AbstractC2207.m4087(this.f9891, c3094.f9891);
    }

    public final int hashCode() {
        String str = this.f9874;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9875;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9876;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9877;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9878;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9879;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9880;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f9881;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f9882;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.f9883;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.f9884;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.f9885;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str11 = this.f9886;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num3 = this.f9887;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str12 = this.f9888;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f9889;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f9890;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        C3109 c3109 = this.f9891;
        return iHashCode17 + (c3109 != null ? c3109.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("gt1Proto(docId=");
        sb.append(this.f9874);
        sb.append(", albumThumbUrl=");
        sb.append(this.f9875);
        sb.append(", name=");
        sb.append(this.f9876);
        sb.append(", artist=");
        sb.append(this.f9877);
        sb.append(", albumName=");
        sb.append(this.f9878);
        sb.append(", mediaStreamingUrl=");
        sb.append(this.f9879);
        sb.append(", miniappInfo=");
        sb.append(this.f9880);
        sb.append(", webUrl=");
        sb.append(this.f9881);
        sb.append(", floatThumbUrl=");
        sb.append(this.f9882);
        sb.append(", musicPlayLen=");
        sb.append(this.f9883);
        sb.append(", high_url=");
        sb.append(this.f9884);
        sb.append(", doc_type=");
        sb.append(this.f9885);
        sb.append(", song_id=");
        sb.append(this.f9886);
        sb.append(", is_try_song=");
        sb.append(this.f9887);
        sb.append(", lrc_content=");
        sb.append(this.f9888);
        sb.append(", identification=");
        sb.append(this.f9889);
        sb.append(", message_ext=");
        sb.append(this.f9890);
        sb.append(", video_template_info=");
        sb.append(this.f9891);
        sb.append(')');
        return sb.toString();
    }
}
