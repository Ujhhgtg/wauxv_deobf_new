package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3002 {
    public static final C3001 Companion = new C3001();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9591;

    public /* synthetic */ C3002(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3000.f9588.mo1509());
            throw null;
        }
        this.f9589 = str;
        this.f9590 = str2;
        this.f9591 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3002)) {
            return false;
        }
        C3002 c3002 = (C3002) obj;
        return AbstractC1469.m3322(this.f9589, c3002.f9589) && AbstractC1469.m3322(this.f9590, c3002.f9590) && AbstractC1469.m3322(this.f9591, c3002.f9591);
    }

    public final int hashCode() {
        String str = this.f9589;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9590;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9591;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("AppJumpWordingProto(en=");
        sb.append(this.f9589);
        sb.append(", zh_CN=");
        sb.append(this.f9590);
        sb.append(", zh_TW=");
        return AbstractC1095.m2801(sb, this.f9591, ')');
    }
}
