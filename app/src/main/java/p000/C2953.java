package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2953 {
    public static final C2952 Companion = new C2952();

    public final String f9454;

    public final String f9455;

    public /* synthetic */ C2953(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C2951.f9453.mo1363());
            throw null;
        }
        this.f9454 = str;
        this.f9455 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2953)) {
            return false;
        }
        C2953 c2953 = (C2953) obj;
        return AbstractC2207.m4087(this.f9454, c2953.f9454) && AbstractC2207.m4087(this.f9455, c2953.f9455);
    }

    public final int hashCode() {
        String str = this.f9454;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9455;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("EmotionProto(md5=");
        sb.append(this.f9454);
        sb.append(", wording=");
        return AbstractC1194.m2786(sb, this.f9455, ')');
    }
}
