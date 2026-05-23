package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2998 {
    public static final C2997 Companion = new C2997();

    public final String f9639;

    public final String f9640;

    public final String f9641;

    public final Long f9642;

    public final Long f9643;

    public /* synthetic */ C2998(int i, String str, String str2, String str3, Long l, Long l2) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C2996.f9638.mo1363());
            throw null;
        }
        this.f9639 = str;
        this.f9640 = str2;
        this.f9641 = str3;
        this.f9642 = l;
        this.f9643 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2998)) {
            return false;
        }
        C2998 c2998 = (C2998) obj;
        return AbstractC2207.m4087(this.f9639, c2998.f9639) && AbstractC2207.m4087(this.f9640, c2998.f9640) && AbstractC2207.m4087(this.f9641, c2998.f9641) && AbstractC2207.m4087(this.f9642, c2998.f9642) && AbstractC2207.m4087(this.f9643, c2998.f9643);
    }

    public final int hashCode() {
        String str = this.f9639;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9640;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9641;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f9642;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9643;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("VideoTemplateProto(type=");
        sb.append(this.f9639);
        sb.append(", templateId=");
        sb.append(this.f9640);
        sb.append(", musicId=");
        sb.append(this.f9641);
        sb.append(", androidSdkVersionMin=");
        sb.append(this.f9642);
        sb.append(", iosSdkVersionMin=");
        sb.append(this.f9643);
        sb.append(')');
        return sb.toString();
    }
}
