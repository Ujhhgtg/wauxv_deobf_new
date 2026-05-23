package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲇᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2946 {
    public static final C2945 Companion = new C2945();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9429;

    public /* synthetic */ C2946(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C2944.f9425.mo1363());
            throw null;
        }
        this.f9426 = str;
        this.f9427 = str2;
        this.f9428 = str3;
        this.f9429 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2946)) {
            return false;
        }
        C2946 c2946 = (C2946) obj;
        return AbstractC2207.m4087(this.f9426, c2946.f9426) && AbstractC2207.m4087(this.f9427, c2946.f9427) && AbstractC2207.m4087(this.f9428, c2946.f9428) && AbstractC2207.m4087(this.f9429, c2946.f9429);
    }

    public final int hashCode() {
        String str = this.f9426;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9427;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9428;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9429;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("AppMsgProto(appid=");
        sb.append(this.f9426);
        sb.append(", mediaTagName=");
        sb.append(this.f9427);
        sb.append(", messageExt=");
        sb.append(this.f9428);
        sb.append(", messageAction=");
        return AbstractC1194.m2786(sb, this.f9429, ')');
    }
}
