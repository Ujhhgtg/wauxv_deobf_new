package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3073 {
    public static final C3072 Companion = new C3072();

    public final Integer f9837;

    public final String f9838;

    public /* synthetic */ C3073(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3071.f9836.mo1363());
            throw null;
        }
        this.f9837 = num;
        this.f9838 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3073)) {
            return false;
        }
        C3073 c3073 = (C3073) obj;
        return AbstractC2207.m4087(this.f9837, c3073.f9837) && AbstractC2207.m4087(this.f9838, c3073.f9838);
    }

    public final int hashCode() {
        Integer num = this.f9837;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9838;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("fm4Proto(related_event_type=");
        sb.append(this.f9837);
        sb.append(", related_event_id=");
        return AbstractC1194.m2786(sb, this.f9838, ')');
    }
}
