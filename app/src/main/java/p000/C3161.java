package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲀᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3161 {
    public static final C3160 Companion = new C3160();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10142;

    public /* synthetic */ C3161(int i, String str, Integer num, Long l) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3159.f10139.mo1363());
            throw null;
        }
        this.f10140 = str;
        this.f10141 = num;
        this.f10142 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3161)) {
            return false;
        }
        C3161 c3161 = (C3161) obj;
        return AbstractC2207.m4087(this.f10140, c3161.f10140) && AbstractC2207.m4087(this.f10141, c3161.f10141) && AbstractC2207.m4087(this.f10142, c3161.f10142);
    }

    public final int hashCode() {
        String str = this.f10140;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10141;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f10142;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("mg5Proto(name=");
        sb.append(this.f10140);
        sb.append(", innerTabType=");
        sb.append(this.f10141);
        sb.append(", topicId=");
        sb.append(this.f10142);
        sb.append(')');
        return sb.toString();
    }
}
