package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᲈᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3311 {
    public static final C3310 Companion = new C3310();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10501;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10502;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10503;

    public /* synthetic */ C3311(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3309.f10500.mo1363());
            throw null;
        }
        this.f10501 = str;
        this.f10502 = str2;
        this.f10503 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3311)) {
            return false;
        }
        C3311 c3311 = (C3311) obj;
        return AbstractC2207.m4087(this.f10501, c3311.f10501) && AbstractC2207.m4087(this.f10502, c3311.f10502) && AbstractC2207.m4087(this.f10503, c3311.f10503);
    }

    public final int hashCode() {
        String str = this.f10501;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10502;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10503;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("vd5Proto(finder_username=");
        sb.append(this.f10501);
        sb.append(", sdk_user_id=");
        sb.append(this.f10502);
        sb.append(", seat_id=");
        return AbstractC2668.m4677(sb, this.f10503, ')');
    }
}
