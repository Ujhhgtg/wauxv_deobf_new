package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3109 {
    public static final C3108 Companion = new C3108();

    public final C2956 f9927;

    public final C3191 f9928;

    public final String f9929;

    public final String f9930;

    public /* synthetic */ C3109(int i, C2956 c2956, C3191 c3191, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3107.f9926.mo1363());
            throw null;
        }
        this.f9927 = c2956;
        this.f9928 = c3191;
        this.f9929 = str;
        this.f9930 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3109)) {
            return false;
        }
        C3109 c3109 = (C3109) obj;
        return AbstractC2207.m4087(this.f9927, c3109.f9927) && AbstractC2207.m4087(this.f9928, c3109.f9928) && AbstractC2207.m4087(this.f9929, c3109.f9929) && AbstractC2207.m4087(this.f9930, c3109.f9930);
    }

    public final int hashCode() {
        C2956 c2956 = this.f9927;
        int iHashCode = (c2956 == null ? 0 : c2956.hashCode()) * 31;
        C3191 c3191 = this.f9928;
        int iHashCode2 = (iHashCode + (c3191 == null ? 0 : c3191.hashCode())) * 31;
        String str = this.f9929;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9930;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("j72Proto(contact=");
        sb.append(this.f9927);
        sb.append(", video_template=");
        sb.append(this.f9928);
        sb.append(", template_creator_h5_url=");
        sb.append(this.f9929);
        sb.append(", template_music_id=");
        return AbstractC1194.m2786(sb, this.f9930, ')');
    }
}
