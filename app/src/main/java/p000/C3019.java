package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲈᤝᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3019 {
    public static final C3018 Companion = new C3018();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final InterfaceC1758[] f9699 = {null, null, null, null, null, null, AbstractC1458.m3163(new C2083(20)), null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3046 f9701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3381 f9702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3097 f9703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List f9706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C3281 f9707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Boolean f9708;

    public /* synthetic */ C3019(int i, Integer num, C3046 c3046, C3381 c3381, C3097 c3097, String str, String str2, List list, C3281 c3281, Boolean bool) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C3017.f9698.mo1363());
            throw null;
        }
        this.f9700 = num;
        this.f9701 = c3046;
        this.f9702 = c3381;
        this.f9703 = c3097;
        this.f9704 = str;
        this.f9705 = str2;
        this.f9706 = list;
        this.f9707 = c3281;
        this.f9708 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3019)) {
            return false;
        }
        C3019 c3019 = (C3019) obj;
        return AbstractC2207.m4087(this.f9700, c3019.f9700) && AbstractC2207.m4087(this.f9701, c3019.f9701) && AbstractC2207.m4087(this.f9702, c3019.f9702) && AbstractC2207.m4087(this.f9703, c3019.f9703) && AbstractC2207.m4087(this.f9704, c3019.f9704) && AbstractC2207.m4087(this.f9705, c3019.f9705) && AbstractC2207.m4087(this.f9706, c3019.f9706) && AbstractC2207.m4087(this.f9707, c3019.f9707) && AbstractC2207.m4087(this.f9708, c3019.f9708);
    }

    public final int hashCode() {
        Integer num = this.f9700;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3046 c3046 = this.f9701;
        int iHashCode2 = (iHashCode + (c3046 == null ? 0 : c3046.hashCode())) * 31;
        C3381 c3381 = this.f9702;
        int iHashCode3 = (iHashCode2 + (c3381 == null ? 0 : c3381.hashCode())) * 31;
        C3097 c3097 = this.f9703;
        int iHashCode4 = (iHashCode3 + (c3097 == null ? 0 : c3097.hashCode())) * 31;
        String str = this.f9704;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9705;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f9706;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        C3281 c3281 = this.f9707;
        int iHashCode8 = (iHashCode7 + (c3281 == null ? 0 : c3281.hashCode())) * 31;
        Boolean bool = this.f9708;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("au1Proto(newlife_type=");
        sb.append(this.f9700);
        sb.append(", post_guide_info=");
        sb.append(this.f9701);
        sb.append(", topic_info=");
        sb.append(this.f9702);
        sb.append(", biz_picture_desc=");
        sb.append(this.f9703);
        sb.append(", secretly_push_chatroom_wording=");
        sb.append(this.f9704);
        sb.append(", chatroom_push_oneline_wording=");
        sb.append(this.f9705);
        sb.append(", chatroom_push_list=");
        sb.append(this.f9706);
        sb.append(", chatroom_push_wording=");
        sb.append(this.f9707);
        sb.append(", is_need_display_comment_egg=");
        sb.append(this.f9708);
        sb.append(')');
        return sb.toString();
    }
}
