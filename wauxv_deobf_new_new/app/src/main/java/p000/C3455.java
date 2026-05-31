package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲀᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3455 {
    public static final C3454 Companion = new C3454();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10856 = {null, null, null, null, AbstractC2240.m4259(new C3413(4)), AbstractC2240.m4259(new C3413(5)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10858;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Double f10859;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10860;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List f10861;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List f10862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Double f10863;

    public /* synthetic */ C3455(int i, String str, String str2, Double d, Integer num, List list, List list2, Double d2) {
        if (127 != (i & 127)) {
            AbstractC2234.m4187(i, 127, C3453.f10855.mo1509());
            throw null;
        }
        this.f10857 = str;
        this.f10858 = str2;
        this.f10859 = d;
        this.f10860 = num;
        this.f10861 = list;
        this.f10862 = list2;
        this.f10863 = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3455)) {
            return false;
        }
        C3455 c3455 = (C3455) obj;
        return AbstractC1469.m3322(this.f10857, c3455.f10857) && AbstractC1469.m3322(this.f10858, c3455.f10858) && AbstractC1469.m3322(this.f10859, c3455.f10859) && AbstractC1469.m3322(this.f10860, c3455.f10860) && AbstractC1469.m3322(this.f10861, c3455.f10861) && AbstractC1469.m3322(this.f10862, c3455.f10862) && AbstractC1469.m3322(this.f10863, c3455.f10863);
    }

    public final int hashCode() {
        String str = this.f10857;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10858;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f10859;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f10860;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f10861;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f10862;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d2 = this.f10863;
        return iHashCode6 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("zt1Proto(rich_text_json=");
        sb.append(this.f10857);
        sb.append(", rich_text_title=");
        sb.append(this.f10858);
        sb.append(", picture_cut_ratio=");
        sb.append(this.f10859);
        sb.append(", from_rich_publisher=");
        sb.append(this.f10860);
        sb.append(", secretly_push_chatroom_name=");
        sb.append(this.f10861);
        sb.append(", comment_egg_info=");
        sb.append(this.f10862);
        sb.append(", picture_cut_ratio_for_finder=");
        sb.append(this.f10863);
        sb.append(')');
        return sb.toString();
    }
}
