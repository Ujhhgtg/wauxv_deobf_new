package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2986 {
    public static final C2985 Companion = new C2985();

    public final Float f9579;

    public final Float f9580;

    public final Float f9581;

    public /* synthetic */ C2986(int i, Float f, Float f2, Float f3) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C2984.f9578.mo1363());
            throw null;
        }
        this.f9579 = f;
        this.f9580 = f2;
        this.f9581 = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2986)) {
            return false;
        }
        C2986 c2986 = (C2986) obj;
        return AbstractC2207.m4087(this.f9579, c2986.f9579) && AbstractC2207.m4087(this.f9580, c2986.f9580) && AbstractC2207.m4087(this.f9581, c2986.f9581);
    }

    public final int hashCode() {
        Float f = this.f9579;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f9580;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f9581;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("SizeProto(width=");
        sb.append(this.f9579);
        sb.append(", height=");
        sb.append(this.f9580);
        sb.append(", totalSize=");
        sb.append(this.f9581);
        sb.append(')');
        return sb.toString();
    }
}
