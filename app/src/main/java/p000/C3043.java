package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3043 {
    public static final C3042 Companion = new C3042();

    public final String f9753;

    public final String f9754;

    public /* synthetic */ C3043(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3041.f9752.mo1363());
            throw null;
        }
        this.f9753 = str;
        this.f9754 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3043)) {
            return false;
        }
        C3043 c3043 = (C3043) obj;
        return AbstractC2207.m4087(this.f9753, c3043.f9753) && AbstractC2207.m4087(this.f9754, c3043.f9754);
    }

    public final int hashCode() {
        String str = this.f9753;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9754;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("cq4Proto(pag_url=");
        sb.append(this.f9753);
        sb.append(", pag_md5=");
        return AbstractC1194.m2786(sb, this.f9754, ')');
    }
}
