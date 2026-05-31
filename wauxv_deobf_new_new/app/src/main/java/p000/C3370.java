package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᛸᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3370 {
    public static final C3369 Companion = new C3369();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10670;

    public /* synthetic */ C3370(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3368.f10667.mo1509());
            throw null;
        }
        this.f10668 = str;
        this.f10669 = str2;
        this.f10670 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3370)) {
            return false;
        }
        C3370 c3370 = (C3370) obj;
        return AbstractC1469.m3322(this.f10668, c3370.f10668) && AbstractC1469.m3322(this.f10669, c3370.f10669) && AbstractC1469.m3322(this.f10670, c3370.f10670);
    }

    public final int hashCode() {
        String str = this.f10668;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10669;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10670;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("vd5Proto(finder_username=");
        sb.append(this.f10668);
        sb.append(", sdk_user_id=");
        sb.append(this.f10669);
        sb.append(", seat_id=");
        return AbstractC2647.m4623(sb, this.f10670, ')');
    }
}
