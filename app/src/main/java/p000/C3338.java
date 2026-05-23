package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3338 {
    public static final C3337 Companion = new C3337();

    public final Integer f10541;

    public final String f10542;

    public final String f10543;

    public /* synthetic */ C3338(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3336.f10540.mo1363());
            throw null;
        }
        this.f10541 = num;
        this.f10542 = str;
        this.f10543 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3338)) {
            return false;
        }
        C3338 c3338 = (C3338) obj;
        return AbstractC2207.m4087(this.f10541, c3338.f10541) && AbstractC2207.m4087(this.f10542, c3338.f10542) && AbstractC2207.m4087(this.f10543, c3338.f10543);
    }

    public final int hashCode() {
        Integer num = this.f10541;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10542;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10543;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("wa3Proto(start_offset=");
        sb.append(this.f10541);
        sb.append(", brief_introduction=");
        sb.append(this.f10542);
        sb.append(", thumb_url=");
        return AbstractC1194.m2786(sb, this.f10543, ')');
    }
}
