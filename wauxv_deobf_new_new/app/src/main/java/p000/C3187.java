package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲀᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3187 {
    public static final C3186 Companion = new C3186();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10135 = {null, null, null, null, null, null, AbstractC2240.m4259(new C3163(2)), null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Boolean f10138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Boolean f10139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f10140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Boolean f10141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List f10142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Long f10144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10146;

    public /* synthetic */ C3187(int i, Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Integer num2, Long l, String str2, String str3) {
        if (2047 != (i & 2047)) {
            AbstractC2234.m4187(i, 2047, C3185.f10134.mo1509());
            throw null;
        }
        this.f10136 = num;
        this.f10137 = str;
        this.f10138 = bool;
        this.f10139 = bool2;
        this.f10140 = bool3;
        this.f10141 = bool4;
        this.f10142 = list;
        this.f10143 = num2;
        this.f10144 = l;
        this.f10145 = str2;
        this.f10146 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3187)) {
            return false;
        }
        C3187 c3187 = (C3187) obj;
        return AbstractC1469.m3322(this.f10136, c3187.f10136) && AbstractC1469.m3322(this.f10137, c3187.f10137) && AbstractC1469.m3322(this.f10138, c3187.f10138) && AbstractC1469.m3322(this.f10139, c3187.f10139) && AbstractC1469.m3322(this.f10140, c3187.f10140) && AbstractC1469.m3322(this.f10141, c3187.f10141) && AbstractC1469.m3322(this.f10142, c3187.f10142) && AbstractC1469.m3322(this.f10143, c3187.f10143) && AbstractC1469.m3322(this.f10144, c3187.f10144) && AbstractC1469.m3322(this.f10145, c3187.f10145) && AbstractC1469.m3322(this.f10146, c3187.f10146);
    }

    public final int hashCode() {
        Integer num = this.f10136;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10137;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f10138;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10139;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f10140;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f10141;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list = this.f10142;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f10143;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f10144;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f10145;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10146;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ko1Proto(tab_id=");
        sb.append(this.f10136);
        sb.append(", tab_name=");
        sb.append(this.f10137);
        sb.append(", prefech_this_tab=");
        sb.append(this.f10138);
        sb.append(", prefech_next_tab=");
        sb.append(this.f10139);
        sb.append(", prefech_pre_tab=");
        sb.append(this.f10140);
        sb.append(", play_voice=");
        sb.append(this.f10141);
        sb.append(", sub_tab_list=");
        sb.append(this.f10142);
        sb.append(", tab_scene=");
        sb.append(this.f10143);
        sb.append(", object_id=");
        sb.append(this.f10144);
        sb.append(", icon_url=");
        sb.append(this.f10145);
        sb.append(", icon_wording=");
        return AbstractC1095.m2801(sb, this.f10146, ')');
    }
}
