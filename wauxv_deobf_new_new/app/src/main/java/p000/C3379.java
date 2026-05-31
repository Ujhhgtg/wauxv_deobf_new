package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤝᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3379 {
    public static final C3378 Companion = new C3378();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10683;

    public /* synthetic */ C3379(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3377.f10679.mo1509());
            throw null;
        }
        this.f10680 = num;
        this.f10681 = num2;
        this.f10682 = num3;
        this.f10683 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3379)) {
            return false;
        }
        C3379 c3379 = (C3379) obj;
        return AbstractC1469.m3322(this.f10680, c3379.f10680) && AbstractC1469.m3322(this.f10681, c3379.f10681) && AbstractC1469.m3322(this.f10682, c3379.f10682) && AbstractC1469.m3322(this.f10683, c3379.f10683);
    }

    public final int hashCode() {
        Integer num = this.f10680;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10681;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10682;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10683;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("vq5Proto(d=");
        sb.append(this.f10680);
        sb.append(", e=");
        sb.append(this.f10681);
        sb.append(", f=");
        sb.append(this.f10682);
        sb.append(", g=");
        return AbstractC2647.m4623(sb, this.f10683, ')');
    }
}
