package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᤝᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3170 {
    public static final C3169 Companion = new C3169();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10164;

    public /* synthetic */ C3170(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3168.f10160.mo1363());
            throw null;
        }
        this.f10161 = num;
        this.f10162 = num2;
        this.f10163 = num3;
        this.f10164 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3170)) {
            return false;
        }
        C3170 c3170 = (C3170) obj;
        return AbstractC2207.m4087(this.f10161, c3170.f10161) && AbstractC2207.m4087(this.f10162, c3170.f10162) && AbstractC2207.m4087(this.f10163, c3170.f10163) && AbstractC2207.m4087(this.f10164, c3170.f10164);
    }

    public final int hashCode() {
        Integer num = this.f10161;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10162;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10163;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10164;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("mr5Proto(d=");
        sb.append(this.f10161);
        sb.append(", e=");
        sb.append(this.f10162);
        sb.append(", f=");
        sb.append(this.f10163);
        sb.append(", g=");
        return AbstractC2668.m4677(sb, this.f10164, ')');
    }
}
