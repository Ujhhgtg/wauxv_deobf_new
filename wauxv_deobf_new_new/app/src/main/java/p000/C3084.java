package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᛸᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3084 {
    public static final C3083 Companion = new C3083();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3394 f9887;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9889;

    public /* synthetic */ C3084(int i, String str, C3394 c3394, Integer num, Integer num2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3082.f9885.mo1509());
            throw null;
        }
        this.f9886 = str;
        this.f9887 = c3394;
        this.f9888 = num;
        this.f9889 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3084)) {
            return false;
        }
        C3084 c3084 = (C3084) obj;
        return AbstractC1469.m3322(this.f9886, c3084.f9886) && AbstractC1469.m3322(this.f9887, c3084.f9887) && AbstractC1469.m3322(this.f9888, c3084.f9888) && AbstractC1469.m3322(this.f9889, c3084.f9889);
    }

    public final int hashCode() {
        String str = this.f9886;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3394 c3394 = this.f9887;
        int iHashCode2 = (iHashCode + (c3394 == null ? 0 : c3394.hashCode())) * 31;
        Integer num = this.f9888;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9889;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("bb3Proto(voice_live_img=");
        sb.append(this.f9886);
        sb.append(", dynamic_voice_live_img=");
        sb.append(this.f9887);
        sb.append(", img_type=");
        sb.append(this.f9888);
        sb.append(", voice_live_img_ts=");
        return AbstractC2647.m4623(sb, this.f9889, ')');
    }
}
