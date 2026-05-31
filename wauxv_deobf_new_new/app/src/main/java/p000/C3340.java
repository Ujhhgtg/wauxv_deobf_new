package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲈᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3340 {
    public static final C3339 Companion = new C3339();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10576;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10578;

    public /* synthetic */ C3340(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3338.f10574.mo1509());
            throw null;
        }
        this.f10575 = str;
        this.f10576 = str2;
        this.f10577 = str3;
        this.f10578 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3340)) {
            return false;
        }
        C3340 c3340 = (C3340) obj;
        return AbstractC1469.m3322(this.f10575, c3340.f10575) && AbstractC1469.m3322(this.f10576, c3340.f10576) && AbstractC1469.m3322(this.f10577, c3340.f10577) && AbstractC1469.m3322(this.f10578, c3340.f10578);
    }

    public final int hashCode() {
        String str = this.f10575;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10576;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10577;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10578;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("tuProto(wholly_push_wording=");
        sb.append(this.f10575);
        sb.append(", abbreviated_push_wording=");
        sb.append(this.f10576);
        sb.append(", chosen_chatroom_name=");
        sb.append(this.f10577);
        sb.append(", chosen_chatroom_head_url=");
        return AbstractC1095.m2801(sb, this.f10578, ')');
    }
}
