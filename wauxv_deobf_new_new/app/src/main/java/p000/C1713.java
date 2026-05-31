package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1713 {
    public static final C1712 Companion = new C1712();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f5796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f5797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5799;

    public /* synthetic */ C1713(int i, String str, String str2, Integer num, String str3, String str4) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C1711.f5794.mo1509());
            throw null;
        }
        this.f5795 = str;
        this.f5796 = str2;
        this.f5797 = num;
        this.f5798 = str3;
        this.f5799 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1713)) {
            return false;
        }
        C1713 c1713 = (C1713) obj;
        return AbstractC1469.m3322(this.f5795, c1713.f5795) && AbstractC1469.m3322(this.f5796, c1713.f5796) && AbstractC1469.m3322(this.f5797, c1713.f5797) && AbstractC1469.m3322(this.f5798, c1713.f5798) && AbstractC1469.m3322(this.f5799, c1713.f5799);
    }

    public final int hashCode() {
        String str = this.f5795;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5796;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5797;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f5798;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5799;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ScopeInfo(scope=");
        sb.append(this.f5795);
        sb.append(", desc=");
        sb.append(this.f5796);
        sb.append(", authState=");
        sb.append(this.f5797);
        sb.append(", extDesc=");
        sb.append(this.f5798);
        sb.append(", authDesc=");
        return AbstractC1095.m2801(sb, this.f5799, ')');
    }
}
