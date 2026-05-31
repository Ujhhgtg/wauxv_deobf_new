package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲈᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3220 {
    public static final C3219 Companion = new C3219();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10307;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10308;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10309;

    public /* synthetic */ C3220(int i, String str, Integer num, Long l) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3218.f10306.mo1509());
            throw null;
        }
        this.f10307 = str;
        this.f10308 = num;
        this.f10309 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3220)) {
            return false;
        }
        C3220 c3220 = (C3220) obj;
        return AbstractC1469.m3322(this.f10307, c3220.f10307) && AbstractC1469.m3322(this.f10308, c3220.f10308) && AbstractC1469.m3322(this.f10309, c3220.f10309);
    }

    public final int hashCode() {
        String str = this.f10307;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10308;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f10309;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("mg5Proto(name=");
        sb.append(this.f10307);
        sb.append(", innerTabType=");
        sb.append(this.f10308);
        sb.append(", topicId=");
        sb.append(this.f10309);
        sb.append(')');
        return sb.toString();
    }
}
