package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3025 {
    public static final C3024 Companion = new C3024();

    public final String f9719;

    public final C3335 f9720;

    public final Integer f9721;

    public final Integer f9722;

    public /* synthetic */ C3025(int i, String str, C3335 c3335, Integer num, Integer num2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3023.f9718.mo1363());
            throw null;
        }
        this.f9719 = str;
        this.f9720 = c3335;
        this.f9721 = num;
        this.f9722 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3025)) {
            return false;
        }
        C3025 c3025 = (C3025) obj;
        return AbstractC2207.m4087(this.f9719, c3025.f9719) && AbstractC2207.m4087(this.f9720, c3025.f9720) && AbstractC2207.m4087(this.f9721, c3025.f9721) && AbstractC2207.m4087(this.f9722, c3025.f9722);
    }

    public final int hashCode() {
        String str = this.f9719;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3335 c3335 = this.f9720;
        int iHashCode2 = (iHashCode + (c3335 == null ? 0 : c3335.hashCode())) * 31;
        Integer num = this.f9721;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9722;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("bb3Proto(voice_live_img=");
        sb.append(this.f9719);
        sb.append(", dynamic_voice_live_img=");
        sb.append(this.f9720);
        sb.append(", img_type=");
        sb.append(this.f9721);
        sb.append(", voice_live_img_ts=");
        return AbstractC2668.m4677(sb, this.f9722, ')');
    }
}
