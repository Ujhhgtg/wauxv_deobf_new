package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲀᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3141 {
    public static final C3140 Companion = new C3140();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10017;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10018;

    public /* synthetic */ C3141(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3139.f10016.mo1509());
            throw null;
        }
        this.f10017 = num;
        this.f10018 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3141)) {
            return false;
        }
        C3141 c3141 = (C3141) obj;
        return AbstractC1469.m3322(this.f10017, c3141.f10017) && AbstractC1469.m3322(this.f10018, c3141.f10018);
    }

    public final int hashCode() {
        Integer num = this.f10017;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10018;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("gf1Proto(seat_id=");
        sb.append(this.f10017);
        sb.append(", seat_name=");
        return AbstractC1095.m2801(sb, this.f10018, ')');
    }
}
