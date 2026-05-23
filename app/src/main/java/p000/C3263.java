package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲈᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3263 {
    public static final C3262 Companion = new C3262();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10370;

    public /* synthetic */ C3263(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3261.f10367.mo1363());
            throw null;
        }
        this.f10368 = str;
        this.f10369 = str2;
        this.f10370 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3263)) {
            return false;
        }
        C3263 c3263 = (C3263) obj;
        return AbstractC2207.m4087(this.f10368, c3263.f10368) && AbstractC2207.m4087(this.f10369, c3263.f10369) && AbstractC2207.m4087(this.f10370, c3263.f10370);
    }

    public final int hashCode() {
        String str = this.f10368;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10369;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10370;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("suProto(chatroom_username=");
        sb.append(this.f10368);
        sb.append(", chatroom_name=");
        sb.append(this.f10369);
        sb.append(", chatroom_head_url=");
        return AbstractC1194.m2786(sb, this.f10370, ')');
    }
}
