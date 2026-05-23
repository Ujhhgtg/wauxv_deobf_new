package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1086 {
    public static final C1085 Companion = new C1085();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Integer f3905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Integer f3906;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1086)) {
            return false;
        }
        C1086 c1086 = (C1086) obj;
        return AbstractC2207.m4087(this.f3905, c1086.f3905) && AbstractC2207.m4087(this.f3906, c1086.f3906);
    }

    public final int hashCode() {
        Integer num = this.f3905;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3906;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("DisturbTimeSpan(beginTime=");
        sb.append(this.f3905);
        sb.append(", endTime=");
        return AbstractC2668.m4677(sb, this.f3906, ')');
    }
}
