package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᲈᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3005 {
    public static final C3004 Companion = new C3004();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9596;

    public /* synthetic */ C3005(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3003.f9592.mo1509());
            throw null;
        }
        this.f9593 = str;
        this.f9594 = str2;
        this.f9595 = str3;
        this.f9596 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3005)) {
            return false;
        }
        C3005 c3005 = (C3005) obj;
        return AbstractC1469.m3322(this.f9593, c3005.f9593) && AbstractC1469.m3322(this.f9594, c3005.f9594) && AbstractC1469.m3322(this.f9595, c3005.f9595) && AbstractC1469.m3322(this.f9596, c3005.f9596);
    }

    public final int hashCode() {
        String str = this.f9593;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9594;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9595;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9596;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("AppMsgProto(appid=");
        sb.append(this.f9593);
        sb.append(", mediaTagName=");
        sb.append(this.f9594);
        sb.append(", messageExt=");
        sb.append(this.f9595);
        sb.append(", messageAction=");
        return AbstractC1095.m2801(sb, this.f9596, ')');
    }
}
