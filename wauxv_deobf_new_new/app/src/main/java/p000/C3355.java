package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᤝᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3355 {
    public static final C3354 Companion = new C3354();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10635;

    public /* synthetic */ C3355(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3353.f10630.mo1509());
            throw null;
        }
        this.f10631 = str;
        this.f10632 = str2;
        this.f10633 = str3;
        this.f10634 = str4;
        this.f10635 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3355)) {
            return false;
        }
        C3355 c3355 = (C3355) obj;
        return AbstractC1469.m3322(this.f10631, c3355.f10631) && AbstractC1469.m3322(this.f10632, c3355.f10632) && AbstractC1469.m3322(this.f10633, c3355.f10633) && AbstractC1469.m3322(this.f10634, c3355.f10634) && AbstractC1469.m3322(this.f10635, c3355.f10635);
    }

    public final int hashCode() {
        String str = this.f10631;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10632;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10633;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10634;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10635;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("v12Proto(cardId=");
        sb.append(this.f10631);
        sb.append(", title=");
        sb.append(this.f10632);
        sb.append(", subTitle=");
        sb.append(this.f10633);
        sb.append(", thumbUrls=");
        sb.append(this.f10634);
        sb.append(", thumbTokens=");
        return AbstractC1095.m2801(sb, this.f10635, ')');
    }
}
