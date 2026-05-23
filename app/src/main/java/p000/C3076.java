package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᛸᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3076 {
    public static final C3075 Companion = new C3075();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9841;

    public /* synthetic */ C3076(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3074.f9839.mo1363());
            throw null;
        }
        this.f9840 = num;
        this.f9841 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3076)) {
            return false;
        }
        C3076 c3076 = (C3076) obj;
        return AbstractC2207.m4087(this.f9840, c3076.f9840) && AbstractC2207.m4087(this.f9841, c3076.f9841);
    }

    public final int hashCode() {
        Integer num = this.f9840;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9841;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ft1Proto(follow_num=");
        sb.append(this.f9840);
        sb.append(", listen_num=");
        return AbstractC2668.m4677(sb, this.f9841, ')');
    }
}
