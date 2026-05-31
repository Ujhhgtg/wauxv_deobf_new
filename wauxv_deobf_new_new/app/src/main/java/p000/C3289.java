package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲀᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3289 {
    public static final C3288 Companion = new C3288();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3015 f10436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10437;

    public /* synthetic */ C3289(int i, C3015 c3015, Integer num) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3287.f10435.mo1509());
            throw null;
        }
        this.f10436 = c3015;
        this.f10437 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3289)) {
            return false;
        }
        C3289 c3289 = (C3289) obj;
        return AbstractC1469.m3322(this.f10436, c3289.f10436) && AbstractC1469.m3322(this.f10437, c3289.f10437);
    }

    public final int hashCode() {
        C3015 c3015 = this.f10436;
        int iHashCode = (c3015 == null ? 0 : c3015.hashCode()) * 31;
        Integer num = this.f10437;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("q72Proto(contact=");
        sb.append(this.f10436);
        sb.append(", friend_follow_num=");
        return AbstractC2647.m4623(sb, this.f10437, ')');
    }
}
