package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3057 {
    public static final C3056 Companion = new C3056();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f9809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Long f9810;

    public /* synthetic */ C3057(int i, String str, String str2, String str3, Long l, Long l2) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3055.f9805.mo1509());
            throw null;
        }
        this.f9806 = str;
        this.f9807 = str2;
        this.f9808 = str3;
        this.f9809 = l;
        this.f9810 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3057)) {
            return false;
        }
        C3057 c3057 = (C3057) obj;
        return AbstractC1469.m3322(this.f9806, c3057.f9806) && AbstractC1469.m3322(this.f9807, c3057.f9807) && AbstractC1469.m3322(this.f9808, c3057.f9808) && AbstractC1469.m3322(this.f9809, c3057.f9809) && AbstractC1469.m3322(this.f9810, c3057.f9810);
    }

    public final int hashCode() {
        String str = this.f9806;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9807;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9808;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f9809;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9810;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("VideoTemplateProto(type=");
        sb.append(this.f9806);
        sb.append(", templateId=");
        sb.append(this.f9807);
        sb.append(", musicId=");
        sb.append(this.f9808);
        sb.append(", androidSdkVersionMin=");
        sb.append(this.f9809);
        sb.append(", iosSdkVersionMin=");
        sb.append(this.f9810);
        sb.append(')');
        return sb.toString();
    }
}
