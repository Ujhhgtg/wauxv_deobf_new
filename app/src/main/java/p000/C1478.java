package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲀᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1478 {
    public static final C1477 Companion = new C1477();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Integer f5251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1475 f5252;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1478)) {
            return false;
        }
        C1478 c1478 = (C1478) obj;
        return AbstractC2207.m4087(this.f5251, c1478.f5251) && AbstractC2207.m4087(this.f5252, c1478.f5252);
    }

    public final int hashCode() {
        Integer num = this.f5251;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C1475 c1475 = this.f5252;
        return iHashCode + (c1475 != null ? c1475.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("GmailList(count=");
        sb.append(this.f5251);
        sb.append(", list=");
        sb.append(this.f5252);
        sb.append(')');
        return sb.toString();
    }
}
