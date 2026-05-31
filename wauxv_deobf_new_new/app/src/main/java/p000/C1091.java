package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᛸᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1091 {
    public static final C1090 Companion = new C1090();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Integer f3916;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Integer f3917;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1091)) {
            return false;
        }
        C1091 c1091 = (C1091) obj;
        return AbstractC1469.m3322(this.f3916, c1091.f3916) && AbstractC1469.m3322(this.f3917, c1091.f3917);
    }

    public final int hashCode() {
        Integer num = this.f3916;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3917;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("DisturbTimeSpan(beginTime=");
        sb.append(this.f3916);
        sb.append(", endTime=");
        return AbstractC2647.m4623(sb, this.f3917, ')');
    }
}
