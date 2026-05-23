package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3350 {
    public static final C3349 Companion = new C3349();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f10561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10565;

    public /* synthetic */ C3350(int i, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, String str4, Integer num7) {
        if (2047 != (i & 2047)) {
            AbstractC1270.m2997(i, 2047, C3348.f10554.mo1363());
            throw null;
        }
        this.f10555 = num;
        this.f10556 = str;
        this.f10557 = num2;
        this.f10558 = str2;
        this.f10559 = num3;
        this.f10560 = num4;
        this.f10561 = num5;
        this.f10562 = str3;
        this.f10563 = num6;
        this.f10564 = str4;
        this.f10565 = num7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3350)) {
            return false;
        }
        C3350 c3350 = (C3350) obj;
        return AbstractC2207.m4087(this.f10555, c3350.f10555) && AbstractC2207.m4087(this.f10556, c3350.f10556) && AbstractC2207.m4087(this.f10557, c3350.f10557) && AbstractC2207.m4087(this.f10558, c3350.f10558) && AbstractC2207.m4087(this.f10559, c3350.f10559) && AbstractC2207.m4087(this.f10560, c3350.f10560) && AbstractC2207.m4087(this.f10561, c3350.f10561) && AbstractC2207.m4087(this.f10562, c3350.f10562) && AbstractC2207.m4087(this.f10563, c3350.f10563) && AbstractC2207.m4087(this.f10564, c3350.f10564) && AbstractC2207.m4087(this.f10565, c3350.f10565);
    }

    public final int hashCode() {
        Integer num = this.f10555;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10556;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10557;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f10558;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.f10559;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10560;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10561;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.f10562;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num6 = this.f10563;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.f10564;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num7 = this.f10565;
        return iHashCode10 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("wqProto(d=");
        sb.append(this.f10555);
        sb.append(", e=");
        sb.append(this.f10556);
        sb.append(", f=");
        sb.append(this.f10557);
        sb.append(", g=");
        sb.append(this.f10558);
        sb.append(", h=");
        sb.append(this.f10559);
        sb.append(", i=");
        sb.append(this.f10560);
        sb.append(", j=");
        sb.append(this.f10561);
        sb.append(", n=");
        sb.append(this.f10562);
        sb.append(", p=");
        sb.append(this.f10563);
        sb.append(", q=");
        sb.append(this.f10564);
        sb.append(", r=");
        return AbstractC2668.m4677(sb, this.f10565, ')');
    }
}
