package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲈᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3367 {
    public static final C3366 Companion = new C3366();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10666;

    public /* synthetic */ C3367(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3365.f10663.mo1509());
            throw null;
        }
        this.f10664 = num;
        this.f10665 = num2;
        this.f10666 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3367)) {
            return false;
        }
        C3367 c3367 = (C3367) obj;
        return AbstractC1469.m3322(this.f10664, c3367.f10664) && AbstractC1469.m3322(this.f10665, c3367.f10665) && AbstractC1469.m3322(this.f10666, c3367.f10666);
    }

    public final int hashCode() {
        Integer num = this.f10664;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10665;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10666;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("vd1Proto(show_type=");
        sb.append(this.f10664);
        sb.append(", accumulated_seconds=");
        sb.append(this.f10665);
        sb.append(", pause_wording=");
        return AbstractC1095.m2801(sb, this.f10666, ')');
    }
}
