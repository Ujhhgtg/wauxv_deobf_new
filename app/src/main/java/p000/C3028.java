package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᤝᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3028 {
    public static final C3027 Companion = new C3027();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9724;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9725;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9727;

    public /* synthetic */ C3028(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3026.f9723.mo1363());
            throw null;
        }
        this.f9724 = num;
        this.f9725 = num2;
        this.f9726 = num3;
        this.f9727 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3028)) {
            return false;
        }
        C3028 c3028 = (C3028) obj;
        return AbstractC2207.m4087(this.f9724, c3028.f9724) && AbstractC2207.m4087(this.f9725, c3028.f9725) && AbstractC2207.m4087(this.f9726, c3028.f9726) && AbstractC2207.m4087(this.f9727, c3028.f9727);
    }

    public final int hashCode() {
        Integer num = this.f9724;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9725;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9726;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9727;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("be5Proto(ios_sdk_version_min=");
        sb.append(this.f9724);
        sb.append(", ios_sdk_version_max=");
        sb.append(this.f9725);
        sb.append(", android_sdk_version_min=");
        sb.append(this.f9726);
        sb.append(", android_sdk_version_max=");
        return AbstractC2668.m4677(sb, this.f9727, ')');
    }
}
