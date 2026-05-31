package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲇᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3069 {
    public static final C3068 Companion = new C3068();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9852;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9853;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9854;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9855;

    public /* synthetic */ C3069(int i, String str, Integer num, Integer num2, Integer num3) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3067.f9851.mo1509());
            throw null;
        }
        this.f9852 = str;
        this.f9853 = num;
        this.f9854 = num2;
        this.f9855 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3069)) {
            return false;
        }
        C3069 c3069 = (C3069) obj;
        return AbstractC1469.m3322(this.f9852, c3069.f9852) && AbstractC1469.m3322(this.f9853, c3069.f9853) && AbstractC1469.m3322(this.f9854, c3069.f9854) && AbstractC1469.m3322(this.f9855, c3069.f9855);
    }

    public final int hashCode() {
        String str = this.f9852;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9853;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9854;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9855;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("a23Proto(gift_id=");
        sb.append(this.f9852);
        sb.append(", max_size=");
        sb.append(this.f9853);
        sb.append(", curr_size=");
        sb.append(this.f9854);
        sb.append(", indicator_type=");
        return AbstractC2647.m4623(sb, this.f9855, ')');
    }
}
