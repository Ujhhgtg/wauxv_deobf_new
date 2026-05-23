package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤝᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3396 {
    public static final C3395 Companion = new C3395();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10689 = {null, null, null, null, AbstractC1458.m3163(new C3369(2)), AbstractC1458.m3163(new C3369(3)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Double f10692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List f10694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List f10695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Double f10696;

    public /* synthetic */ C3396(int i, String str, String str2, Double d, Integer num, List list, List list2, Double d2) {
        if (127 != (i & 127)) {
            AbstractC1270.m2997(i, 127, C3394.f10688.mo1363());
            throw null;
        }
        this.f10690 = str;
        this.f10691 = str2;
        this.f10692 = d;
        this.f10693 = num;
        this.f10694 = list;
        this.f10695 = list2;
        this.f10696 = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3396)) {
            return false;
        }
        C3396 c3396 = (C3396) obj;
        return AbstractC2207.m4087(this.f10690, c3396.f10690) && AbstractC2207.m4087(this.f10691, c3396.f10691) && AbstractC2207.m4087(this.f10692, c3396.f10692) && AbstractC2207.m4087(this.f10693, c3396.f10693) && AbstractC2207.m4087(this.f10694, c3396.f10694) && AbstractC2207.m4087(this.f10695, c3396.f10695) && AbstractC2207.m4087(this.f10696, c3396.f10696);
    }

    public final int hashCode() {
        String str = this.f10690;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10691;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f10692;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f10693;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f10694;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f10695;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d2 = this.f10696;
        return iHashCode6 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("zt1Proto(rich_text_json=");
        sb.append(this.f10690);
        sb.append(", rich_text_title=");
        sb.append(this.f10691);
        sb.append(", picture_cut_ratio=");
        sb.append(this.f10692);
        sb.append(", from_rich_publisher=");
        sb.append(this.f10693);
        sb.append(", secretly_push_chatroom_name=");
        sb.append(this.f10694);
        sb.append(", comment_egg_info=");
        sb.append(this.f10695);
        sb.append(", picture_cut_ratio_for_finder=");
        sb.append(this.f10696);
        sb.append(')');
        return sb.toString();
    }
}
