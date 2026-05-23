package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᛸᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3266 {
    public static final C3265 Companion = new C3265();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10373;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10374;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10375;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10377;

    public /* synthetic */ C3266(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3264.f10371.mo1363());
            throw null;
        }
        this.f10372 = str;
        this.f10373 = str2;
        this.f10374 = str3;
        this.f10375 = str4;
        this.f10376 = str5;
        this.f10377 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3266)) {
            return false;
        }
        C3266 c3266 = (C3266) obj;
        return AbstractC2207.m4087(this.f10372, c3266.f10372) && AbstractC2207.m4087(this.f10373, c3266.f10373) && AbstractC2207.m4087(this.f10374, c3266.f10374) && AbstractC2207.m4087(this.f10375, c3266.f10375) && AbstractC2207.m4087(this.f10376, c3266.f10376) && AbstractC2207.m4087(this.f10377, c3266.f10377);
    }

    public final int hashCode() {
        String str = this.f10372;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10373;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10374;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10375;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10376;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f10377;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("sz0Proto(appid=");
        sb.append(this.f10372);
        sb.append(", path=");
        sb.append(this.f10373);
        sb.append(", query=");
        sb.append(this.f10374);
        sb.append(", default_url=");
        sb.append(this.f10375);
        sb.append(", min_version=");
        sb.append(this.f10376);
        sb.append(", is_transparent=");
        return AbstractC2668.m4677(sb, this.f10377, ')');
    }
}
