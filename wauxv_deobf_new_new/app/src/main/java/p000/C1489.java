package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲁᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1489 {
    public static final C1488 Companion = new C1488();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Integer f5283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1486 f5284;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1489)) {
            return false;
        }
        C1489 c1489 = (C1489) obj;
        return AbstractC1469.m3322(this.f5283, c1489.f5283) && AbstractC1469.m3322(this.f5284, c1489.f5284);
    }

    public final int hashCode() {
        Integer num = this.f5283;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C1486 c1486 = this.f5284;
        return iHashCode + (c1486 != null ? c1486.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("GmailList(count=");
        sb.append(this.f5283);
        sb.append(", list=");
        sb.append(this.f5284);
        sb.append(')');
        return sb.toString();
    }
}
