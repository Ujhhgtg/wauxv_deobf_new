package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᤞᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3135 {
    public static final C3134 Companion = new C3134();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10007;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10008;

    public /* synthetic */ C3135(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3133.f10006.mo1509());
            throw null;
        }
        this.f10007 = num;
        this.f10008 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3135)) {
            return false;
        }
        C3135 c3135 = (C3135) obj;
        return AbstractC1469.m3322(this.f10007, c3135.f10007) && AbstractC1469.m3322(this.f10008, c3135.f10008);
    }

    public final int hashCode() {
        Integer num = this.f10007;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10008;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ft1Proto(follow_num=");
        sb.append(this.f10007);
        sb.append(", listen_num=");
        return AbstractC2647.m4623(sb, this.f10008, ')');
    }
}
