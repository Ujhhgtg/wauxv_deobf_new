package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲈᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3030 {
    public static final C3029 Companion = new C3029();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9669;

    public /* synthetic */ C3030(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3028.f9666.mo1509());
            throw null;
        }
        this.f9667 = str;
        this.f9668 = str2;
        this.f9669 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3030)) {
            return false;
        }
        C3030 c3030 = (C3030) obj;
        return AbstractC1469.m3322(this.f9667, c3030.f9667) && AbstractC1469.m3322(this.f9668, c3030.f9668) && AbstractC1469.m3322(this.f9669, c3030.f9669);
    }

    public final int hashCode() {
        String str = this.f9667;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9668;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9669;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("LiteappInfoProto(appId=");
        sb.append(this.f9667);
        sb.append(", path=");
        sb.append(this.f9668);
        sb.append(", query=");
        return AbstractC1095.m2801(sb, this.f9669, ')');
    }
}
