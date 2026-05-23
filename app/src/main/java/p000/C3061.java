package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲇᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3061 {
    public static final C3060 Companion = new C3060();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9811;

    public /* synthetic */ C3061(int i, String str, Long l) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3059.f9809.mo1363());
            throw null;
        }
        this.f9810 = str;
        this.f9811 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3061)) {
            return false;
        }
        C3061 c3061 = (C3061) obj;
        return AbstractC2207.m4087(this.f9810, c3061.f9810) && AbstractC2207.m4087(this.f9811, c3061.f9811);
    }

    public final int hashCode() {
        String str = this.f9810;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f9811;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ef1Proto(live_meet_id=");
        sb.append(this.f9810);
        sb.append(", anchor_meet_heat=");
        sb.append(this.f9811);
        sb.append(')');
        return sb.toString();
    }
}
