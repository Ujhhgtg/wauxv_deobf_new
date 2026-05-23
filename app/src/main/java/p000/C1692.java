package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1692 {
    public static final C1691 Companion = new C1691();

    public final Integer f5749;

    public final String f5750;

    public /* synthetic */ C1692(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C1690.f5748.mo1363());
            throw null;
        }
        this.f5749 = num;
        this.f5750 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692)) {
            return false;
        }
        C1692 c1692 = (C1692) obj;
        return AbstractC2207.m4087(this.f5749, c1692.f5749) && AbstractC2207.m4087(this.f5750, c1692.f5750);
    }

    public final int hashCode() {
        Integer num = this.f5749;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5750;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("JSAPIBaseResp(errCode=");
        sb.append(this.f5749);
        sb.append(", errMsg=");
        return AbstractC1194.m2786(sb, this.f5750, ')');
    }
}
