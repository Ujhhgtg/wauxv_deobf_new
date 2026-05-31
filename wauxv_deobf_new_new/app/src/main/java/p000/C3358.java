package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3358 {
    public static final C3357 Companion = new C3357();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f10639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f10641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f10642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10644;

    public /* synthetic */ C3358(int i, Boolean bool, Integer num, Float f, String str, Boolean bool2, String str2, String str3, String str4) {
        if (255 != (i & 255)) {
            AbstractC2234.m4187(i, 255, C3356.f10636.mo1509());
            throw null;
        }
        this.f10637 = bool;
        this.f10638 = num;
        this.f10639 = f;
        this.f10640 = str;
        this.f10641 = bool2;
        this.f10642 = str2;
        this.f10643 = str3;
        this.f10644 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3358)) {
            return false;
        }
        C3358 c3358 = (C3358) obj;
        return AbstractC1469.m3322(this.f10637, c3358.f10637) && AbstractC1469.m3322(this.f10638, c3358.f10638) && AbstractC1469.m3322(this.f10639, c3358.f10639) && AbstractC1469.m3322(this.f10640, c3358.f10640) && AbstractC1469.m3322(this.f10641, c3358.f10641) && AbstractC1469.m3322(this.f10642, c3358.f10642) && AbstractC1469.m3322(this.f10643, c3358.f10643) && AbstractC1469.m3322(this.f10644, c3358.f10644);
    }

    public final int hashCode() {
        Boolean bool = this.f10637;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f10638;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f10639;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f10640;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f10641;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f10642;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10643;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10644;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("v40Proto(support_custom_text=");
        sb.append(this.f10637);
        sb.append(", text_len_limit=");
        sb.append(this.f10638);
        sb.append(", price=");
        sb.append(this.f10639);
        sb.append(", custom_text=");
        sb.append(this.f10640);
        sb.append(", specific_custom_text=");
        sb.append(this.f10641);
        sb.append(", antispam_custom_text=");
        sb.append(this.f10642);
        sb.append(", name=");
        sb.append(this.f10643);
        sb.append(", component_key=");
        return AbstractC1095.m2801(sb, this.f10644, ')');
    }
}
