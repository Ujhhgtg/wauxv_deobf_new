package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᤞᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3128 {
    public static final C3127 Companion = new C3127();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final InterfaceC1758[] f9968 = {null, null, null, null, null, null, AbstractC1458.m3163(new C3125(0)), null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9969;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Boolean f9971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Boolean f9972;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f9973;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Boolean f9974;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List f9975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f9976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Long f9977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f9978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f9979;

    public /* synthetic */ C3128(int i, Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Integer num2, Long l, String str2, String str3) {
        if (2047 != (i & 2047)) {
            AbstractC1270.m2997(i, 2047, C3126.f9967.mo1363());
            throw null;
        }
        this.f9969 = num;
        this.f9970 = str;
        this.f9971 = bool;
        this.f9972 = bool2;
        this.f9973 = bool3;
        this.f9974 = bool4;
        this.f9975 = list;
        this.f9976 = num2;
        this.f9977 = l;
        this.f9978 = str2;
        this.f9979 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3128)) {
            return false;
        }
        C3128 c3128 = (C3128) obj;
        return AbstractC2207.m4087(this.f9969, c3128.f9969) && AbstractC2207.m4087(this.f9970, c3128.f9970) && AbstractC2207.m4087(this.f9971, c3128.f9971) && AbstractC2207.m4087(this.f9972, c3128.f9972) && AbstractC2207.m4087(this.f9973, c3128.f9973) && AbstractC2207.m4087(this.f9974, c3128.f9974) && AbstractC2207.m4087(this.f9975, c3128.f9975) && AbstractC2207.m4087(this.f9976, c3128.f9976) && AbstractC2207.m4087(this.f9977, c3128.f9977) && AbstractC2207.m4087(this.f9978, c3128.f9978) && AbstractC2207.m4087(this.f9979, c3128.f9979);
    }

    public final int hashCode() {
        Integer num = this.f9969;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9970;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f9971;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9972;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f9973;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f9974;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list = this.f9975;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f9976;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f9977;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f9978;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9979;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ko1Proto(tab_id=");
        sb.append(this.f9969);
        sb.append(", tab_name=");
        sb.append(this.f9970);
        sb.append(", prefech_this_tab=");
        sb.append(this.f9971);
        sb.append(", prefech_next_tab=");
        sb.append(this.f9972);
        sb.append(", prefech_pre_tab=");
        sb.append(this.f9973);
        sb.append(", play_voice=");
        sb.append(this.f9974);
        sb.append(", sub_tab_list=");
        sb.append(this.f9975);
        sb.append(", tab_scene=");
        sb.append(this.f9976);
        sb.append(", object_id=");
        sb.append(this.f9977);
        sb.append(", icon_url=");
        sb.append(this.f9978);
        sb.append(", icon_wording=");
        return AbstractC1194.m2786(sb, this.f9979, ')');
    }
}
