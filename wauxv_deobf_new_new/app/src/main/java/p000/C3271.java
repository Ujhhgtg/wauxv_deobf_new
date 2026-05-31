package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲈᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3271 {
    public static final C3270 Companion = new C3270();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3087 f10400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10404;

    public /* synthetic */ C3271(int i, C3087 c3087, Integer num, String str, Integer num2, Integer num3) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3269.f10399.mo1509());
            throw null;
        }
        this.f10400 = c3087;
        this.f10401 = num;
        this.f10402 = str;
        this.f10403 = num2;
        this.f10404 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3271)) {
            return false;
        }
        C3271 c3271 = (C3271) obj;
        return AbstractC1469.m3322(this.f10400, c3271.f10400) && AbstractC1469.m3322(this.f10401, c3271.f10401) && AbstractC1469.m3322(this.f10402, c3271.f10402) && AbstractC1469.m3322(this.f10403, c3271.f10403) && AbstractC1469.m3322(this.f10404, c3271.f10404);
    }

    public final int hashCode() {
        C3087 c3087 = this.f10400;
        int iHashCode = (c3087 == null ? 0 : c3087.hashCode()) * 31;
        Integer num = this.f10401;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10402;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10403;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10404;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("or5Proto(tmpl_version_info=");
        sb.append(this.f10400);
        sb.append(", tmpl_type=");
        sb.append(this.f10401);
        sb.append(", camera_tmpl_id=");
        sb.append(this.f10402);
        sb.append(", permitted_publish_method_flag=");
        sb.append(this.f10403);
        sb.append(", camera_position=");
        return AbstractC2647.m4623(sb, this.f10404, ')');
    }
}
