package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤞᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3382 {
    public static final C3381 Companion = new C3381();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f10687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Boolean f10688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3102 f10689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Boolean f10690;

    public /* synthetic */ C3382(int i, String str, String str2, Float f, Boolean bool, C3102 c3102, Boolean bool2) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3380.f10684.mo1509());
            throw null;
        }
        this.f10685 = str;
        this.f10686 = str2;
        this.f10687 = f;
        this.f10688 = bool;
        this.f10689 = c3102;
        this.f10690 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3382)) {
            return false;
        }
        C3382 c3382 = (C3382) obj;
        return AbstractC1469.m3322(this.f10685, c3382.f10685) && AbstractC1469.m3322(this.f10686, c3382.f10686) && AbstractC1469.m3322(this.f10687, c3382.f10687) && AbstractC1469.m3322(this.f10688, c3382.f10688) && AbstractC1469.m3322(this.f10689, c3382.f10689) && AbstractC1469.m3322(this.f10690, c3382.f10690);
    }

    public final int hashCode() {
        String str = this.f10685;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10686;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.f10687;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.f10688;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C3102 c3102 = this.f10689;
        int iHashCode5 = (iHashCode4 + (c3102 == null ? 0 : c3102.hashCode())) * 31;
        Boolean bool2 = this.f10690;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("w10Proto(key=");
        sb.append(this.f10685);
        sb.append(", name=");
        sb.append(this.f10686);
        sb.append(", price=");
        sb.append(this.f10687);
        sb.append(", custom_text_disabled=");
        sb.append(this.f10688);
        sb.append(", thumbnail=");
        sb.append(this.f10689);
        sb.append(", use_pag=");
        sb.append(this.f10690);
        sb.append(')');
        return sb.toString();
    }
}
