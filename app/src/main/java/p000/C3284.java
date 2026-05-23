package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3284 {
    public static final C3283 Companion = new C3283();

    public final String f10413;

    public final C3043 f10414;

    public final C3043 f10415;

    public final C3043 f10416;

    public final C3043 f10417;

    public final C3043 f10418;

    public final C3043 f10419;

    public /* synthetic */ C3284(int i, String str, C3043 c3043, C3043 c3044, C3043 c3045, C3043 c3046, C3043 c3047, C3043 c3048) {
        if (127 != (i & 127)) {
            AbstractC1270.m2997(i, 127, C3282.f10412.mo1363());
            throw null;
        }
        this.f10413 = str;
        this.f10414 = c3043;
        this.f10415 = c3044;
        this.f10416 = c3045;
        this.f10417 = c3046;
        this.f10418 = c3047;
        this.f10419 = c3048;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3284)) {
            return false;
        }
        C3284 c3284 = (C3284) obj;
        return AbstractC2207.m4087(this.f10413, c3284.f10413) && AbstractC2207.m4087(this.f10414, c3284.f10414) && AbstractC2207.m4087(this.f10415, c3284.f10415) && AbstractC2207.m4087(this.f10416, c3284.f10416) && AbstractC2207.m4087(this.f10417, c3284.f10417) && AbstractC2207.m4087(this.f10418, c3284.f10418) && AbstractC2207.m4087(this.f10419, c3284.f10419);
    }

    public final int hashCode() {
        String str = this.f10413;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3043 c3043 = this.f10414;
        int iHashCode2 = (iHashCode + (c3043 == null ? 0 : c3043.hashCode())) * 31;
        C3043 c3044 = this.f10415;
        int iHashCode3 = (iHashCode2 + (c3044 == null ? 0 : c3044.hashCode())) * 31;
        C3043 c3045 = this.f10416;
        int iHashCode4 = (iHashCode3 + (c3045 == null ? 0 : c3045.hashCode())) * 31;
        C3043 c3046 = this.f10417;
        int iHashCode5 = (iHashCode4 + (c3046 == null ? 0 : c3046.hashCode())) * 31;
        C3043 c3047 = this.f10418;
        int iHashCode6 = (iHashCode5 + (c3047 == null ? 0 : c3047.hashCode())) * 31;
        C3043 c3048 = this.f10419;
        return iHashCode6 + (c3048 != null ? c3048.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("u40Proto(key=");
        sb.append(this.f10413);
        sb.append(", thumbnail=");
        sb.append(this.f10414);
        sb.append(", preview=");
        sb.append(this.f10415);
        sb.append(", animation=");
        sb.append(this.f10416);
        sb.append(", landscape_animation=");
        sb.append(this.f10417);
        sb.append(", sign_preview=");
        sb.append(this.f10418);
        sb.append(", sign_thumbnail=");
        sb.append(this.f10419);
        sb.append(')');
        return sb.toString();
    }
}
