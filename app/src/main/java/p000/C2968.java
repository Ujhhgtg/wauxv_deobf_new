package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲇᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2968 {
    public static final C2967 Companion = new C2967();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9493;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9495;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9497;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9498;

    public /* synthetic */ C2968(int i, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C2966.f9492.mo1363());
            throw null;
        }
        this.f9493 = str;
        this.f9494 = str2;
        this.f9495 = num;
        this.f9496 = num2;
        this.f9497 = str3;
        this.f9498 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2968)) {
            return false;
        }
        C2968 c2968 = (C2968) obj;
        return AbstractC2207.m4087(this.f9493, c2968.f9493) && AbstractC2207.m4087(this.f9494, c2968.f9494) && AbstractC2207.m4087(this.f9495, c2968.f9495) && AbstractC2207.m4087(this.f9496, c2968.f9496) && AbstractC2207.m4087(this.f9497, c2968.f9497) && AbstractC2207.m4087(this.f9498, c2968.f9498);
    }

    public final int hashCode() {
        String str = this.f9493;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9494;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f9495;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9496;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f9497;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f9498;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("GameShareCardObjectProto(sharedata=");
        sb.append(this.f9493);
        sb.append(", gameshareid=");
        sb.append(this.f9494);
        sb.append(", isvideo=");
        sb.append(this.f9495);
        sb.append(", duration=");
        sb.append(this.f9496);
        sb.append(", liteappbizdata=");
        sb.append(this.f9497);
        sb.append(", liteapppriority=");
        return AbstractC2668.m4677(sb, this.f9498, ')');
    }
}
