package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲈᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3078 {
    public static final C3077 Companion = new C3077();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final InterfaceC1780[] f9866 = {null, null, null, null, null, null, AbstractC2240.m4259(new C2096(22)), null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3105 f9868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3440 f9869;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3156 f9870;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9872;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List f9873;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C3340 f9874;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Boolean f9875;

    public /* synthetic */ C3078(int i, Integer num, C3105 c3105, C3440 c3440, C3156 c3156, String str, String str2, List list, C3340 c3340, Boolean bool) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3076.f9865.mo1509());
            throw null;
        }
        this.f9867 = num;
        this.f9868 = c3105;
        this.f9869 = c3440;
        this.f9870 = c3156;
        this.f9871 = str;
        this.f9872 = str2;
        this.f9873 = list;
        this.f9874 = c3340;
        this.f9875 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3078)) {
            return false;
        }
        C3078 c3078 = (C3078) obj;
        return AbstractC1469.m3322(this.f9867, c3078.f9867) && AbstractC1469.m3322(this.f9868, c3078.f9868) && AbstractC1469.m3322(this.f9869, c3078.f9869) && AbstractC1469.m3322(this.f9870, c3078.f9870) && AbstractC1469.m3322(this.f9871, c3078.f9871) && AbstractC1469.m3322(this.f9872, c3078.f9872) && AbstractC1469.m3322(this.f9873, c3078.f9873) && AbstractC1469.m3322(this.f9874, c3078.f9874) && AbstractC1469.m3322(this.f9875, c3078.f9875);
    }

    public final int hashCode() {
        Integer num = this.f9867;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3105 c3105 = this.f9868;
        int iHashCode2 = (iHashCode + (c3105 == null ? 0 : c3105.hashCode())) * 31;
        C3440 c3440 = this.f9869;
        int iHashCode3 = (iHashCode2 + (c3440 == null ? 0 : c3440.hashCode())) * 31;
        C3156 c3156 = this.f9870;
        int iHashCode4 = (iHashCode3 + (c3156 == null ? 0 : c3156.hashCode())) * 31;
        String str = this.f9871;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9872;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f9873;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        C3340 c3340 = this.f9874;
        int iHashCode8 = (iHashCode7 + (c3340 == null ? 0 : c3340.hashCode())) * 31;
        Boolean bool = this.f9875;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("au1Proto(newlife_type=");
        sb.append(this.f9867);
        sb.append(", post_guide_info=");
        sb.append(this.f9868);
        sb.append(", topic_info=");
        sb.append(this.f9869);
        sb.append(", biz_picture_desc=");
        sb.append(this.f9870);
        sb.append(", secretly_push_chatroom_wording=");
        sb.append(this.f9871);
        sb.append(", chatroom_push_oneline_wording=");
        sb.append(this.f9872);
        sb.append(", chatroom_push_list=");
        sb.append(this.f9873);
        sb.append(", chatroom_push_wording=");
        sb.append(this.f9874);
        sb.append(", is_need_display_comment_egg=");
        sb.append(this.f9875);
        sb.append(')');
        return sb.toString();
    }
}
