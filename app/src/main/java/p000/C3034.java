package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3034 {
    public static final C3033 Companion = new C3033();

    public final String f9735;

    public final String f9736;

    public /* synthetic */ C3034(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3032.f9734.mo1363());
            throw null;
        }
        this.f9735 = str;
        this.f9736 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3034)) {
            return false;
        }
        C3034 c3034 = (C3034) obj;
        return AbstractC2207.m4087(this.f9735, c3034.f9735) && AbstractC2207.m4087(this.f9736, c3034.f9736);
    }

    public final int hashCode() {
        String str = this.f9735;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9736;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ca2Proto(url=");
        sb.append(this.f9735);
        sb.append(", md5=");
        return AbstractC1194.m2786(sb, this.f9736, ')');
    }
}
