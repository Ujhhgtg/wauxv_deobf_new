package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲀᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3281 {
    public static final C3280 Companion = new C3280();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10411;

    public /* synthetic */ C3281(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3279.f10407.mo1363());
            throw null;
        }
        this.f10408 = str;
        this.f10409 = str2;
        this.f10410 = str3;
        this.f10411 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3281)) {
            return false;
        }
        C3281 c3281 = (C3281) obj;
        return AbstractC2207.m4087(this.f10408, c3281.f10408) && AbstractC2207.m4087(this.f10409, c3281.f10409) && AbstractC2207.m4087(this.f10410, c3281.f10410) && AbstractC2207.m4087(this.f10411, c3281.f10411);
    }

    public final int hashCode() {
        String str = this.f10408;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10409;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10410;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10411;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("tuProto(wholly_push_wording=");
        sb.append(this.f10408);
        sb.append(", abbreviated_push_wording=");
        sb.append(this.f10409);
        sb.append(", chosen_chatroom_name=");
        sb.append(this.f10410);
        sb.append(", chosen_chatroom_head_url=");
        return AbstractC1194.m2786(sb, this.f10411, ')');
    }
}
