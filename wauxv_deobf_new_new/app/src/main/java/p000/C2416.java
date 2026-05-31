package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2416 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f7751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f7752;

    public C2416(String str, String str2, String str3) {
        this.f7750 = str;
        this.f7751 = str2;
        this.f7752 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2416)) {
            return false;
        }
        C2416 c2416 = (C2416) obj;
        return AbstractC1469.m3322(this.f7750, c2416.f7750) && AbstractC1469.m3322(this.f7751, c2416.f7751) && AbstractC1469.m3322(this.f7752, c2416.f7752);
    }

    public final int hashCode() {
        return this.f7752.hashCode() + AbstractC2647.m4621(this.f7750.hashCode() * 31, 31, this.f7751);
    }

    public final String toString() {
        String strM4188 = AbstractC2234.m4188(System.currentTimeMillis(), null, null, 3);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(strM4188);
        String[] strArr = AbstractC1471.f5234;
        sb2.append("][1.2.7.r1405.70100cc][");
        sb2.append(this.f7750);
        sb2.append("][");
        sb2.append(this.f7751);
        sb2.append(']');
        sb.append(sb2.toString());
        sb.append(" ");
        sb.append(this.f7752);
        return sb.toString();
    }
}
