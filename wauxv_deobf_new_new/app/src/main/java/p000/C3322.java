package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᛸᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3322 {
    public static final C3321 Companion = new C3321();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10537;

    public /* synthetic */ C3322(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3320.f10534.mo1509());
            throw null;
        }
        this.f10535 = str;
        this.f10536 = str2;
        this.f10537 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3322)) {
            return false;
        }
        C3322 c3322 = (C3322) obj;
        return AbstractC1469.m3322(this.f10535, c3322.f10535) && AbstractC1469.m3322(this.f10536, c3322.f10536) && AbstractC1469.m3322(this.f10537, c3322.f10537);
    }

    public final int hashCode() {
        String str = this.f10535;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10536;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10537;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("suProto(chatroom_username=");
        sb.append(this.f10535);
        sb.append(", chatroom_name=");
        sb.append(this.f10536);
        sb.append(", chatroom_head_url=");
        return AbstractC1095.m2801(sb, this.f10537, ')');
    }
}
