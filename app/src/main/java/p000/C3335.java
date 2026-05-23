package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲈᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3335 {
    public static final C3334 Companion = new C3334();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10539;

    public /* synthetic */ C3335(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3333.f10537.mo1363());
            throw null;
        }
        this.f10538 = str;
        this.f10539 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3335)) {
            return false;
        }
        C3335 c3335 = (C3335) obj;
        return AbstractC2207.m4087(this.f10538, c3335.f10538) && AbstractC2207.m4087(this.f10539, c3335.f10539);
    }

    public final int hashCode() {
        String str = this.f10538;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10539;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("w90Proto(dynamic_voice_live_img_url=");
        sb.append(this.f10538);
        sb.append(", static_voice_img_url=");
        return AbstractC1194.m2786(sb, this.f10539, ')');
    }
}
