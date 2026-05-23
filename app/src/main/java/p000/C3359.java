package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3359 {
    public static final C3358 Companion = new C3358();

    public final String f10592;

    public final C3043 f10593;

    public final C3043 f10594;

    public /* synthetic */ C3359(int i, String str, C3043 c3043, C3043 c3044) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3357.f10591.mo1363());
            throw null;
        }
        this.f10592 = str;
        this.f10593 = c3043;
        this.f10594 = c3044;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3359)) {
            return false;
        }
        C3359 c3359 = (C3359) obj;
        return AbstractC2207.m4087(this.f10592, c3359.f10592) && AbstractC2207.m4087(this.f10593, c3359.f10593) && AbstractC2207.m4087(this.f10594, c3359.f10594);
    }

    public final int hashCode() {
        String str = this.f10592;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3043 c3043 = this.f10593;
        int iHashCode2 = (iHashCode + (c3043 == null ? 0 : c3043.hashCode())) * 31;
        C3043 c3044 = this.f10594;
        return iHashCode2 + (c3044 != null ? c3044.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("xo3Proto(animation_id=");
        sb.append(this.f10592);
        sb.append(", animation=");
        sb.append(this.f10593);
        sb.append(", landscape_animation=");
        sb.append(this.f10594);
        sb.append(')');
        return sb.toString();
    }
}
