package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᛸᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3397 {
    public static final C3396 Companion = new C3396();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10710;

    public /* synthetic */ C3397(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3395.f10707.mo1509());
            throw null;
        }
        this.f10708 = num;
        this.f10709 = str;
        this.f10710 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3397)) {
            return false;
        }
        C3397 c3397 = (C3397) obj;
        return AbstractC1469.m3322(this.f10708, c3397.f10708) && AbstractC1469.m3322(this.f10709, c3397.f10709) && AbstractC1469.m3322(this.f10710, c3397.f10710);
    }

    public final int hashCode() {
        Integer num = this.f10708;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10709;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10710;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("wa3Proto(start_offset=");
        sb.append(this.f10708);
        sb.append(", brief_introduction=");
        sb.append(this.f10709);
        sb.append(", thumb_url=");
        return AbstractC1095.m2801(sb, this.f10710, ')');
    }
}
