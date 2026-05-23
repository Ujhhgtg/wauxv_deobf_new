package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3317 {
    public static final C3316 Companion = new C3316();

    public final C3094 f10510;

    public final C2956 f10511;

    public /* synthetic */ C3317(int i, C3094 c3094, C2956 c2956) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3315.f10509.mo1363());
            throw null;
        }
        this.f10510 = c3094;
        this.f10511 = c2956;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3317)) {
            return false;
        }
        C3317 c3317 = (C3317) obj;
        return AbstractC2207.m4087(this.f10510, c3317.f10510) && AbstractC2207.m4087(this.f10511, c3317.f10511);
    }

    public final int hashCode() {
        C3094 c3094 = this.f10510;
        int iHashCode = (c3094 == null ? 0 : c3094.hashCode()) * 31;
        C2956 c2956 = this.f10511;
        return iHashCode + (c2956 != null ? c2956.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("vq0Proto(music_info=");
        sb.append(this.f10510);
        sb.append(", contact=");
        sb.append(this.f10511);
        sb.append(')');
        return sb.toString();
    }
}
