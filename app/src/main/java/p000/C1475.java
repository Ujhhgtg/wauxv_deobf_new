package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1475 {
    public static final C1474 Companion = new C1474();

    public String f5247;

    public Integer f5248;

    public Integer f5249;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1475)) {
            return false;
        }
        C1475 c1475 = (C1475) obj;
        return AbstractC2207.m4087(this.f5247, c1475.f5247) && AbstractC2207.m4087(this.f5248, c1475.f5248) && AbstractC2207.m4087(this.f5249, c1475.f5249);
    }

    public final int hashCode() {
        String str = this.f5247;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5248;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5249;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("GmailInfo(gmailAcct=");
        sb.append(this.f5247);
        sb.append(", gmailSwitch=");
        sb.append(this.f5248);
        sb.append(", gmailErrCode=");
        return AbstractC2668.m4677(sb, this.f5249, ')');
    }
}
