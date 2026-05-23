package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3112 {
    public static final C3111 Companion = new C3111();

    public final C3106 f9932;

    public final String f9933;

    public final String f9934;

    public /* synthetic */ C3112(int i, C3106 c3106, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3110.f9931.mo1363());
            throw null;
        }
        this.f9932 = c3106;
        this.f9933 = str;
        this.f9934 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3112)) {
            return false;
        }
        C3112 c3112 = (C3112) obj;
        return AbstractC2207.m4087(this.f9932, c3112.f9932) && AbstractC2207.m4087(this.f9933, c3112.f9933) && AbstractC2207.m4087(this.f9934, c3112.f9934);
    }

    public final int hashCode() {
        C3106 c3106 = this.f9932;
        int iHashCode = (c3106 == null ? 0 : c3106.hashCode()) * 31;
        String str = this.f9933;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9934;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("k23Proto(mic_contact=");
        sb.append(this.f9932);
        sb.append(", sdk_user_id=");
        sb.append(this.f9933);
        sb.append(", session_id=");
        return AbstractC1194.m2786(sb, this.f9934, ')');
    }
}
