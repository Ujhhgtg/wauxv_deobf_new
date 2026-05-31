package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᤞᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3331 {
    public static final C3330 Companion = new C3330();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10558 = {AbstractC2240.m4259(new C3163(19)), null, AbstractC2240.m4259(new C3163(20)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3358 f10560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f10561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3102 f10562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3102 f10563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3102 f10564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3102 f10565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C3102 f10567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Boolean f10569;

    public /* synthetic */ C3331(int i, List list, C3358 c3358, List list2, C3102 c3102, C3102 c3103, C3102 c3104, C3102 c3105, String str, C3102 c3106, String str2, Boolean bool) {
        if (2047 != (i & 2047)) {
            AbstractC2234.m4187(i, 2047, C3329.f10557.mo1509());
            throw null;
        }
        this.f10559 = list;
        this.f10560 = c3358;
        this.f10561 = list2;
        this.f10562 = c3102;
        this.f10563 = c3103;
        this.f10564 = c3104;
        this.f10565 = c3105;
        this.f10566 = str;
        this.f10567 = c3106;
        this.f10568 = str2;
        this.f10569 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3331)) {
            return false;
        }
        C3331 c3331 = (C3331) obj;
        return AbstractC1469.m3322(this.f10559, c3331.f10559) && AbstractC1469.m3322(this.f10560, c3331.f10560) && AbstractC1469.m3322(this.f10561, c3331.f10561) && AbstractC1469.m3322(this.f10562, c3331.f10562) && AbstractC1469.m3322(this.f10563, c3331.f10563) && AbstractC1469.m3322(this.f10564, c3331.f10564) && AbstractC1469.m3322(this.f10565, c3331.f10565) && AbstractC1469.m3322(this.f10566, c3331.f10566) && AbstractC1469.m3322(this.f10567, c3331.f10567) && AbstractC1469.m3322(this.f10568, c3331.f10568) && AbstractC1469.m3322(this.f10569, c3331.f10569);
    }

    public final int hashCode() {
        List list = this.f10559;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C3358 c3358 = this.f10560;
        int iHashCode2 = (iHashCode + (c3358 == null ? 0 : c3358.hashCode())) * 31;
        List list2 = this.f10561;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C3102 c3102 = this.f10562;
        int iHashCode4 = (iHashCode3 + (c3102 == null ? 0 : c3102.hashCode())) * 31;
        C3102 c3103 = this.f10563;
        int iHashCode5 = (iHashCode4 + (c3103 == null ? 0 : c3103.hashCode())) * 31;
        C3102 c3104 = this.f10564;
        int iHashCode6 = (iHashCode5 + (c3104 == null ? 0 : c3104.hashCode())) * 31;
        C3102 c3105 = this.f10565;
        int iHashCode7 = (iHashCode6 + (c3105 == null ? 0 : c3105.hashCode())) * 31;
        String str = this.f10566;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        C3102 c3106 = this.f10567;
        int iHashCode9 = (iHashCode8 + (c3106 == null ? 0 : c3106.hashCode())) * 31;
        String str2 = this.f10568;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f10569;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("t40Proto(reward_product_id=");
        sb.append(this.f10559);
        sb.append(", business_type=");
        sb.append(this.f10560);
        sb.append(", thumbnail_file_url=");
        sb.append(this.f10561);
        sb.append(", preview_pag_url=");
        sb.append(this.f10562);
        sb.append(", animation_pag_url=");
        sb.append(this.f10563);
        sb.append(", thumbnail_file_md5=");
        sb.append(this.f10564);
        sb.append(", preview_pag_md5=");
        sb.append(this.f10565);
        sb.append(", animation_pag_md5=");
        sb.append(this.f10566);
        sb.append(", name=");
        sb.append(this.f10567);
        sb.append(", price=");
        sb.append(this.f10568);
        sb.append(", gift_type=");
        sb.append(this.f10569);
        sb.append(')');
        return sb.toString();
    }
}
