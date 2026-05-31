package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᛸᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3229 {
    public static final C3228 Companion = new C3228();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10331;

    public /* synthetic */ C3229(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3227.f10327.mo1509());
            throw null;
        }
        this.f10328 = num;
        this.f10329 = num2;
        this.f10330 = num3;
        this.f10331 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3229)) {
            return false;
        }
        C3229 c3229 = (C3229) obj;
        return AbstractC1469.m3322(this.f10328, c3229.f10328) && AbstractC1469.m3322(this.f10329, c3229.f10329) && AbstractC1469.m3322(this.f10330, c3229.f10330) && AbstractC1469.m3322(this.f10331, c3229.f10331);
    }

    public final int hashCode() {
        Integer num = this.f10328;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10329;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10330;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10331;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("mr5Proto(d=");
        sb.append(this.f10328);
        sb.append(", e=");
        sb.append(this.f10329);
        sb.append(", f=");
        sb.append(this.f10330);
        sb.append(", g=");
        return AbstractC2647.m4623(sb, this.f10331, ')');
    }
}
