package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᤞᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3449 {
    public static final C3448 Companion = new C3448();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10838;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10839;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10841;

    public /* synthetic */ C3449(int i, Integer num, Long l, Long l2, String str) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3447.f10837.mo1509());
            throw null;
        }
        this.f10838 = num;
        this.f10839 = l;
        this.f10840 = l2;
        this.f10841 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3449)) {
            return false;
        }
        C3449 c3449 = (C3449) obj;
        return AbstractC1469.m3322(this.f10838, c3449.f10838) && AbstractC1469.m3322(this.f10839, c3449.f10839) && AbstractC1469.m3322(this.f10840, c3449.f10840) && AbstractC1469.m3322(this.f10841, c3449.f10841);
    }

    public final int hashCode() {
        Integer num = this.f10838;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.f10839;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f10840;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f10841;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("zg4Proto(target_type=");
        sb.append(this.f10838);
        sb.append(", target_num=");
        sb.append(this.f10839);
        sb.append(", current_num=");
        sb.append(this.f10840);
        sb.append(", gift_product_id=");
        return AbstractC1095.m2801(sb, this.f10841, ')');
    }
}
