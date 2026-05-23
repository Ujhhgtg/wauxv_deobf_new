package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3332 {
    public static final C3331 Companion = new C3331();

    public final C2956 f10533;

    public final C3094 f10534;

    public final String f10535;

    public final String f10536;

    public /* synthetic */ C3332(int i, C2956 c2956, C3094 c3094, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3330.f10532.mo1363());
            throw null;
        }
        this.f10533 = c2956;
        this.f10534 = c3094;
        this.f10535 = str;
        this.f10536 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3332)) {
            return false;
        }
        C3332 c3332 = (C3332) obj;
        return AbstractC2207.m4087(this.f10533, c3332.f10533) && AbstractC2207.m4087(this.f10534, c3332.f10534) && AbstractC2207.m4087(this.f10535, c3332.f10535) && AbstractC2207.m4087(this.f10536, c3332.f10536);
    }

    public final int hashCode() {
        C2956 c2956 = this.f10533;
        int iHashCode = (c2956 == null ? 0 : c2956.hashCode()) * 31;
        C3094 c3094 = this.f10534;
        int iHashCode2 = (iHashCode + (c3094 == null ? 0 : c3094.hashCode())) * 31;
        String str = this.f10535;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10536;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("w52Proto(contact=");
        sb.append(this.f10533);
        sb.append(", musicInfo=");
        sb.append(this.f10534);
        sb.append(", audioTrackUrl=");
        sb.append(this.f10535);
        sb.append(", groupId=");
        return AbstractC1194.m2786(sb, this.f10536, ')');
    }
}
