package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᲈᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3391 {
    public static final C3390 Companion = new C3390();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3015 f10700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3153 f10701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10703;

    public /* synthetic */ C3391(int i, C3015 c3015, C3153 c3153, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3389.f10699.mo1509());
            throw null;
        }
        this.f10700 = c3015;
        this.f10701 = c3153;
        this.f10702 = str;
        this.f10703 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3391)) {
            return false;
        }
        C3391 c3391 = (C3391) obj;
        return AbstractC1469.m3322(this.f10700, c3391.f10700) && AbstractC1469.m3322(this.f10701, c3391.f10701) && AbstractC1469.m3322(this.f10702, c3391.f10702) && AbstractC1469.m3322(this.f10703, c3391.f10703);
    }

    public final int hashCode() {
        C3015 c3015 = this.f10700;
        int iHashCode = (c3015 == null ? 0 : c3015.hashCode()) * 31;
        C3153 c3153 = this.f10701;
        int iHashCode2 = (iHashCode + (c3153 == null ? 0 : c3153.hashCode())) * 31;
        String str = this.f10702;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10703;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("w52Proto(contact=");
        sb.append(this.f10700);
        sb.append(", musicInfo=");
        sb.append(this.f10701);
        sb.append(", audioTrackUrl=");
        sb.append(this.f10702);
        sb.append(", groupId=");
        return AbstractC1095.m2801(sb, this.f10703, ')');
    }
}
