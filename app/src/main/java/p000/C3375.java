package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3375 {
    public static final C3374 Companion = new C3374();

    public final String f10631;

    public final Integer f10632;

    public /* synthetic */ C3375(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3373.f10630.mo1363());
            throw null;
        }
        this.f10631 = str;
        this.f10632 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3375)) {
            return false;
        }
        C3375 c3375 = (C3375) obj;
        return AbstractC2207.m4087(this.f10631, c3375.f10631) && AbstractC2207.m4087(this.f10632, c3375.f10632);
    }

    public final int hashCode() {
        String str = this.f10631;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10632;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("yq3Proto(name=");
        sb.append(this.f10631);
        sb.append(", inner_tab_type=");
        return AbstractC2668.m4677(sb, this.f10632, ')');
    }
}
