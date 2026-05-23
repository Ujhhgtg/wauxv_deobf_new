package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0383 {
    public static final C0382 Companion = new C0382();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f1784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2615 f1785;

    public /* synthetic */ C0383(int i, Integer num, C2615 c2615) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C0381.f1783.mo1363());
            throw null;
        }
        this.f1784 = num;
        this.f1785 = c2615;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0383)) {
            return false;
        }
        C0383 c0383 = (C0383) obj;
        return AbstractC2207.m4087(this.f1784, c0383.f1784) && AbstractC2207.m4087(this.f1785, c0383.f1785);
    }

    public final int hashCode() {
        Integer num = this.f1784;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C2615 c2615 = this.f1785;
        return iHashCode + (c2615 != null ? c2615.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("BaseResponse(ret=");
        sb.append(this.f1784);
        sb.append(", errMsg=");
        sb.append(this.f1785);
        sb.append(')');
        return sb.toString();
    }
}
