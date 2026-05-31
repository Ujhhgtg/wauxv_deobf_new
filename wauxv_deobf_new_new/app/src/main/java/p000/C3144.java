package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲀᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3144 {
    public static final C3143 Companion = new C3143();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Boolean f10021;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f10023;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10026;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10027;

    public /* synthetic */ C3144(int i, Integer num, Boolean bool, Integer num2, Long l, Integer num3, Integer num4, String str, Integer num5) {
        if (255 != (i & 255)) {
            AbstractC2234.m4187(i, 255, C3142.f10019.mo1509());
            throw null;
        }
        this.f10020 = num;
        this.f10021 = bool;
        this.f10022 = num2;
        this.f10023 = l;
        this.f10024 = num3;
        this.f10025 = num4;
        this.f10026 = str;
        this.f10027 = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3144)) {
            return false;
        }
        C3144 c3144 = (C3144) obj;
        return AbstractC1469.m3322(this.f10020, c3144.f10020) && AbstractC1469.m3322(this.f10021, c3144.f10021) && AbstractC1469.m3322(this.f10022, c3144.f10022) && AbstractC1469.m3322(this.f10023, c3144.f10023) && AbstractC1469.m3322(this.f10024, c3144.f10024) && AbstractC1469.m3322(this.f10025, c3144.f10025) && AbstractC1469.m3322(this.f10026, c3144.f10026) && AbstractC1469.m3322(this.f10027, c3144.f10027);
    }

    public final int hashCode() {
        Integer num = this.f10020;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f10021;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f10022;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f10023;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.f10024;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10025;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f10026;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.f10027;
        return iHashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("gj1Proto(charge_flag=");
        sb.append(this.f10020);
        sb.append(", is_purchased=");
        sb.append(this.f10021);
        sb.append(", purchase_user_count=");
        sb.append(this.f10022);
        sb.append(", purchase_heat=");
        sb.append(this.f10023);
        sb.append(", unit_price_in_wecoin=");
        sb.append(this.f10024);
        sb.append(", need_get_payment_items=");
        sb.append(this.f10025);
        sb.append(", prompt_wording=");
        sb.append(this.f10026);
        sb.append(", charge_is_member_free=");
        return AbstractC2647.m4623(sb, this.f10027, ')');
    }
}
