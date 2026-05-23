package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3227 {
    public static final C3226 Companion = new C3226();

    public final String f10266;

    public final Integer f10267;

    public /* synthetic */ C3227(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3225.f10265.mo1363());
            throw null;
        }
        this.f10266 = str;
        this.f10267 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3227)) {
            return false;
        }
        C3227 c3227 = (C3227) obj;
        return AbstractC2207.m4087(this.f10266, c3227.f10266) && AbstractC2207.m4087(this.f10267, c3227.f10267);
    }

    public final int hashCode() {
        String str = this.f10266;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10267;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("poProto(d=");
        sb.append(this.f10266);
        sb.append(", e=");
        return AbstractC2668.m4677(sb, this.f10267, ')');
    }
}
