package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲇᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3233 {
    public static final C3232 Companion = new C3232();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10273;

    public /* synthetic */ C3233(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3231.f10271.mo1363());
            throw null;
        }
        this.f10272 = num;
        this.f10273 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3233)) {
            return false;
        }
        C3233 c3233 = (C3233) obj;
        return AbstractC2207.m4087(this.f10272, c3233.f10272) && AbstractC2207.m4087(this.f10273, c3233.f10273);
    }

    public final int hashCode() {
        Integer num = this.f10272;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10273;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("qg1Proto(live_mode=");
        sb.append(this.f10272);
        sb.append(", live_sub_mode=");
        return AbstractC2668.m4677(sb, this.f10273, ')');
    }
}
