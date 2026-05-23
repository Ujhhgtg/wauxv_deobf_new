package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3203 {
    public static final C3202 Companion = new C3202();

    public final C3350 f10225;

    public final Integer f10226;

    public final String f10227;

    public /* synthetic */ C3203(int i, C3350 c3350, Integer num, String str) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3201.f10224.mo1363());
            throw null;
        }
        this.f10225 = c3350;
        this.f10226 = num;
        this.f10227 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3203)) {
            return false;
        }
        C3203 c3203 = (C3203) obj;
        return AbstractC2207.m4087(this.f10225, c3203.f10225) && AbstractC2207.m4087(this.f10226, c3203.f10226) && AbstractC2207.m4087(this.f10227, c3203.f10227);
    }

    public final int hashCode() {
        C3350 c3350 = this.f10225;
        int iHashCode = (c3350 == null ? 0 : c3350.hashCode()) * 31;
        Integer num = this.f10226;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10227;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("o61Proto(cdnTransInfo=");
        sb.append(this.f10225);
        sb.append(", bitRate=");
        sb.append(this.f10226);
        sb.append(", codingFormat=");
        return AbstractC1194.m2786(sb, this.f10227, ')');
    }
}
