package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3320 {
    public static final C3319 Companion = new C3319();

    public final Integer f10513;

    public final Integer f10514;

    public final Integer f10515;

    public final Integer f10516;

    public /* synthetic */ C3320(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3318.f10512.mo1363());
            throw null;
        }
        this.f10513 = num;
        this.f10514 = num2;
        this.f10515 = num3;
        this.f10516 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3320)) {
            return false;
        }
        C3320 c3320 = (C3320) obj;
        return AbstractC2207.m4087(this.f10513, c3320.f10513) && AbstractC2207.m4087(this.f10514, c3320.f10514) && AbstractC2207.m4087(this.f10515, c3320.f10515) && AbstractC2207.m4087(this.f10516, c3320.f10516);
    }

    public final int hashCode() {
        Integer num = this.f10513;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10514;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10515;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10516;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("vq5Proto(d=");
        sb.append(this.f10513);
        sb.append(", e=");
        sb.append(this.f10514);
        sb.append(", f=");
        sb.append(this.f10515);
        sb.append(", g=");
        return AbstractC2668.m4677(sb, this.f10516, ')');
    }
}
