package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲇᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3120 {
    public static final C3119 Companion = new C3119();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9978;

    public /* synthetic */ C3120(int i, String str, Long l) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3118.f9976.mo1509());
            throw null;
        }
        this.f9977 = str;
        this.f9978 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3120)) {
            return false;
        }
        C3120 c3120 = (C3120) obj;
        return AbstractC1469.m3322(this.f9977, c3120.f9977) && AbstractC1469.m3322(this.f9978, c3120.f9978);
    }

    public final int hashCode() {
        String str = this.f9977;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f9978;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ef1Proto(live_meet_id=");
        sb.append(this.f9977);
        sb.append(", anchor_meet_heat=");
        sb.append(this.f9978);
        sb.append(')');
        return sb.toString();
    }
}
