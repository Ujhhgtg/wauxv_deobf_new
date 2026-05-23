package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3308 {
    public static final C3307 Companion = new C3307();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10497;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10498;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10499;

    public /* synthetic */ C3308(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3306.f10496.mo1363());
            throw null;
        }
        this.f10497 = num;
        this.f10498 = num2;
        this.f10499 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3308)) {
            return false;
        }
        C3308 c3308 = (C3308) obj;
        return AbstractC2207.m4087(this.f10497, c3308.f10497) && AbstractC2207.m4087(this.f10498, c3308.f10498) && AbstractC2207.m4087(this.f10499, c3308.f10499);
    }

    public final int hashCode() {
        Integer num = this.f10497;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10498;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10499;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("vd1Proto(show_type=");
        sb.append(this.f10497);
        sb.append(", accumulated_seconds=");
        sb.append(this.f10498);
        sb.append(", pause_wording=");
        return AbstractC1194.m2786(sb, this.f10499, ')');
    }
}
