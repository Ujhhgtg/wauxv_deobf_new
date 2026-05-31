package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲈᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3199 {
    public static final C3198 Companion = new C3198();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10165;

    public /* synthetic */ C3199(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3197.f10163.mo1509());
            throw null;
        }
        this.f10164 = num;
        this.f10165 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3199)) {
            return false;
        }
        C3199 c3199 = (C3199) obj;
        return AbstractC1469.m3322(this.f10164, c3199.f10164) && AbstractC1469.m3322(this.f10165, c3199.f10165);
    }

    public final int hashCode() {
        Integer num = this.f10164;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10165;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ll1Proto(module_type=");
        sb.append(this.f10164);
        sb.append(", color=");
        return AbstractC1095.m2801(sb, this.f10165, ')');
    }
}
