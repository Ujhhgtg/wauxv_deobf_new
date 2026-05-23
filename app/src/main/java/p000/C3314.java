package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᛸᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3314 {
    public static final C3313 Companion = new C3313();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10508;

    public /* synthetic */ C3314(int i, String str, Integer num, Integer num2, Integer num3) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3312.f10504.mo1363());
            throw null;
        }
        this.f10505 = str;
        this.f10506 = num;
        this.f10507 = num2;
        this.f10508 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3314)) {
            return false;
        }
        C3314 c3314 = (C3314) obj;
        return AbstractC2207.m4087(this.f10505, c3314.f10505) && AbstractC2207.m4087(this.f10506, c3314.f10506) && AbstractC2207.m4087(this.f10507, c3314.f10507) && AbstractC2207.m4087(this.f10508, c3314.f10508);
    }

    public final int hashCode() {
        String str = this.f10505;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10506;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10507;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10508;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("vo1Proto(stream_url=");
        sb.append(this.f10505);
        sb.append(", time_limit=");
        sb.append(this.f10506);
        sb.append(", remain_time=");
        sb.append(this.f10507);
        sb.append(", end_time=");
        return AbstractC2668.m4677(sb, this.f10508, ')');
    }
}
