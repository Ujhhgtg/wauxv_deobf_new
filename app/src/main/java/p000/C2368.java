package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2368 {

    public final String f7616;

    public final String f7617;

    public final String f7618;

    public C2368(String str, String str2, String str3) {
        this.f7616 = str;
        this.f7617 = str2;
        this.f7618 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2368)) {
            return false;
        }
        C2368 c2368 = (C2368) obj;
        return AbstractC2207.m4087(this.f7616, c2368.f7616) && AbstractC2207.m4087(this.f7617, c2368.f7617) && AbstractC2207.m4087(this.f7618, c2368.f7618);
    }

    public final int hashCode() {
        return this.f7618.hashCode() + AbstractC1194.m2775(this.f7616.hashCode() * 31, 31, this.f7617);
    }

    public final String toString() {
        String strM5339 = AbstractC3681.m5339(System.currentTimeMillis(), null, null, 3);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(strM5339);
        String[] strArr = AbstractC1574.f5469;
        sb2.append("][1.2.7.r1356.3e63484][");
        sb2.append(this.f7616);
        sb2.append("][");
        sb2.append(this.f7617);
        sb2.append(']');
        sb.append(sb2.toString());
        sb.append(" ");
        sb.append(this.f7618);
        return sb.toString();
    }
}
