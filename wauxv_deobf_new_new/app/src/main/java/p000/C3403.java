package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤝᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3403 {
    public static final C3402 Companion = new C3402();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10717;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10718;

    public /* synthetic */ C3403(int i, Long l, Integer num, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3401.f10714.mo1509());
            throw null;
        }
        this.f10715 = l;
        this.f10716 = num;
        this.f10717 = str;
        this.f10718 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3403)) {
            return false;
        }
        C3403 c3403 = (C3403) obj;
        return AbstractC1469.m3322(this.f10715, c3403.f10715) && AbstractC1469.m3322(this.f10716, c3403.f10716) && AbstractC1469.m3322(this.f10717, c3403.f10717) && AbstractC1469.m3322(this.f10718, c3403.f10718);
    }

    public final int hashCode() {
        Long l = this.f10715;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.f10716;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10717;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10718;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("wq0Proto(highest_reward=");
        sb.append(this.f10715);
        sb.append(", share_percentage=");
        sb.append(this.f10716);
        sb.append(", share_wording=");
        sb.append(this.f10717);
        sb.append(", highest_reward_suffix_wording=");
        return AbstractC1095.m2801(sb, this.f10718, ')');
    }
}
