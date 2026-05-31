package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᲇᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3054 {
    public static final C3053 Companion = new C3053();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9804;

    public /* synthetic */ C3054(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3052.f9802.mo1509());
            throw null;
        }
        this.f9803 = str;
        this.f9804 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3054)) {
            return false;
        }
        C3054 c3054 = (C3054) obj;
        return AbstractC1469.m3322(this.f9803, c3054.f9803) && AbstractC1469.m3322(this.f9804, c3054.f9804);
    }

    public final int hashCode() {
        String str = this.f9803;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9804;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("VideoColdDLRuleProto(type=");
        sb.append(this.f9803);
        sb.append(", value=");
        return AbstractC1095.m2801(sb, this.f9804, ')');
    }
}
