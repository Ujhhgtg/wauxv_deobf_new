package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3236 {
    public static final C3235 Companion = new C3235();

    public final String f10275;

    public final String f10276;

    public final Long f10277;

    public /* synthetic */ C3236(int i, String str, String str2, Long l) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3234.f10274.mo1363());
            throw null;
        }
        this.f10275 = str;
        this.f10276 = str2;
        this.f10277 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3236)) {
            return false;
        }
        C3236 c3236 = (C3236) obj;
        return AbstractC2207.m4087(this.f10275, c3236.f10275) && AbstractC2207.m4087(this.f10276, c3236.f10276) && AbstractC2207.m4087(this.f10277, c3236.f10277);
    }

    public final int hashCode() {
        String str = this.f10275;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10276;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f10277;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("qh1Proto(session_id=");
        sb.append(this.f10275);
        sb.append(", vroom_id=");
        sb.append(this.f10276);
        sb.append(", vroom_id_version=");
        sb.append(this.f10277);
        sb.append(')');
        return sb.toString();
    }
}
