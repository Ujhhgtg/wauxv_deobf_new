package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3296 {
    public static final C3295 Companion = new C3295();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10464;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10465;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10466;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10468;

    public /* synthetic */ C3296(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3294.f10463.mo1363());
            throw null;
        }
        this.f10464 = str;
        this.f10465 = str2;
        this.f10466 = str3;
        this.f10467 = str4;
        this.f10468 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3296)) {
            return false;
        }
        C3296 c3296 = (C3296) obj;
        return AbstractC2207.m4087(this.f10464, c3296.f10464) && AbstractC2207.m4087(this.f10465, c3296.f10465) && AbstractC2207.m4087(this.f10466, c3296.f10466) && AbstractC2207.m4087(this.f10467, c3296.f10467) && AbstractC2207.m4087(this.f10468, c3296.f10468);
    }

    public final int hashCode() {
        String str = this.f10464;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10465;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10466;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10467;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10468;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("v12Proto(cardId=");
        sb.append(this.f10464);
        sb.append(", title=");
        sb.append(this.f10465);
        sb.append(", subTitle=");
        sb.append(this.f10466);
        sb.append(", thumbUrls=");
        sb.append(this.f10467);
        sb.append(", thumbTokens=");
        return AbstractC1194.m2786(sb, this.f10468, ')');
    }
}
