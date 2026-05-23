package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲈᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2971 {
    public static final C2970 Companion = new C2970();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9501;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9502;

    public /* synthetic */ C2971(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C2969.f9499.mo1363());
            throw null;
        }
        this.f9500 = str;
        this.f9501 = str2;
        this.f9502 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2971)) {
            return false;
        }
        C2971 c2971 = (C2971) obj;
        return AbstractC2207.m4087(this.f9500, c2971.f9500) && AbstractC2207.m4087(this.f9501, c2971.f9501) && AbstractC2207.m4087(this.f9502, c2971.f9502);
    }

    public final int hashCode() {
        String str = this.f9500;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9501;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9502;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("LiteappInfoProto(appId=");
        sb.append(this.f9500);
        sb.append(", path=");
        sb.append(this.f9501);
        sb.append(", query=");
        return AbstractC1194.m2786(sb, this.f9502, ')');
    }
}
