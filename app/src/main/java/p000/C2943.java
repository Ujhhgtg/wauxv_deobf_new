package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲇᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2943 {
    public static final C2942 Companion = new C2942();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9424;

    public /* synthetic */ C2943(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C2941.f9421.mo1363());
            throw null;
        }
        this.f9422 = str;
        this.f9423 = str2;
        this.f9424 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2943)) {
            return false;
        }
        C2943 c2943 = (C2943) obj;
        return AbstractC2207.m4087(this.f9422, c2943.f9422) && AbstractC2207.m4087(this.f9423, c2943.f9423) && AbstractC2207.m4087(this.f9424, c2943.f9424);
    }

    public final int hashCode() {
        String str = this.f9422;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9423;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9424;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("AppJumpWordingProto(en=");
        sb.append(this.f9422);
        sb.append(", zh_CN=");
        sb.append(this.f9423);
        sb.append(", zh_TW=");
        return AbstractC1194.m2786(sb, this.f9424, ')');
    }
}
