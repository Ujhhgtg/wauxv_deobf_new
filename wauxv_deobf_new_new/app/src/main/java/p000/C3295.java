package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲇᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3295 {
    public static final C3294 Companion = new C3294();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10442;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10444;

    public /* synthetic */ C3295(int i, String str, String str2, Long l) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3293.f10441.mo1509());
            throw null;
        }
        this.f10442 = str;
        this.f10443 = str2;
        this.f10444 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3295)) {
            return false;
        }
        C3295 c3295 = (C3295) obj;
        return AbstractC1469.m3322(this.f10442, c3295.f10442) && AbstractC1469.m3322(this.f10443, c3295.f10443) && AbstractC1469.m3322(this.f10444, c3295.f10444);
    }

    public final int hashCode() {
        String str = this.f10442;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10443;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f10444;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("qh1Proto(session_id=");
        sb.append(this.f10442);
        sb.append(", vroom_id=");
        sb.append(this.f10443);
        sb.append(", vroom_id_version=");
        sb.append(this.f10444);
        sb.append(')');
        return sb.toString();
    }
}
