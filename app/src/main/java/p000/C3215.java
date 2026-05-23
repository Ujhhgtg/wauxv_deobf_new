package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3215 {
    public static final C3214 Companion = new C3214();

    public final Boolean f10239;

    public final String f10240;

    public /* synthetic */ C3215(int i, Boolean bool, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3213.f10238.mo1363());
            throw null;
        }
        this.f10239 = bool;
        this.f10240 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3215)) {
            return false;
        }
        C3215 c3215 = (C3215) obj;
        return AbstractC2207.m4087(this.f10239, c3215.f10239) && AbstractC2207.m4087(this.f10240, c3215.f10240);
    }

    public final int hashCode() {
        Boolean bool = this.f10239;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f10240;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("p11Proto(need_replace_nickname=");
        sb.append(this.f10239);
        sb.append(", replace_nickname=");
        return AbstractC1194.m2786(sb, this.f10240, ')');
    }
}
