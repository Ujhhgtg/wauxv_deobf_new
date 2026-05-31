package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᛸᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3129 {
    public static final C3128 Companion = new C3128();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f9995 = {null, null, null, null, null, AbstractC2240.m4259(new C2096(29)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9996;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9998;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3166 f9999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List f10001;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f10002;

    public /* synthetic */ C3129(int i, String str, Long l, String str2, C3166 c3166, Integer num, List list, Integer num2) {
        if (127 != (i & 127)) {
            AbstractC2234.m4187(i, 127, C3127.f9994.mo1509());
            throw null;
        }
        this.f9996 = str;
        this.f9997 = l;
        this.f9998 = str2;
        this.f9999 = c3166;
        this.f10000 = num;
        this.f10001 = list;
        this.f10002 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3129)) {
            return false;
        }
        C3129 c3129 = (C3129) obj;
        return AbstractC1469.m3322(this.f9996, c3129.f9996) && AbstractC1469.m3322(this.f9997, c3129.f9997) && AbstractC1469.m3322(this.f9998, c3129.f9998) && AbstractC1469.m3322(this.f9999, c3129.f9999) && AbstractC1469.m3322(this.f10000, c3129.f10000) && AbstractC1469.m3322(this.f10001, c3129.f10001) && AbstractC1469.m3322(this.f10002, c3129.f10002);
    }

    public final int hashCode() {
        String str = this.f9996;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f9997;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f9998;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C3166 c3166 = this.f9999;
        int iHashCode4 = (iHashCode3 + (c3166 == null ? 0 : c3166.hashCode())) * 31;
        Integer num = this.f10000;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f10001;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f10002;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ff1Proto(live_mic_id=");
        sb.append(this.f9996);
        sb.append(", mic_seq=");
        sb.append(this.f9997);
        sb.append(", mic_sdk_user_id=");
        sb.append(this.f9998);
        sb.append(", mic_contact=");
        sb.append(this.f9999);
        sb.append(", status=");
        sb.append(this.f10000);
        sb.append(", mic_audience_list=");
        sb.append(this.f10001);
        sb.append(", mic_sdk_live_id=");
        return AbstractC2647.m4623(sb, this.f10002, ')');
    }
}
