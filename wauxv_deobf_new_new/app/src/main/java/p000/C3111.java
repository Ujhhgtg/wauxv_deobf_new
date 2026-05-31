package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᤞᛸᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3111 {
    public static final C3110 Companion = new C3110();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f9931 = {AbstractC2240.m4259(new C2096(26)), null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f9932;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9934;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f9936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9937;

    public /* synthetic */ C3111(int i, List list, String str, String str2, String str3, Boolean bool, String str4) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3109.f9930.mo1509());
            throw null;
        }
        this.f9932 = list;
        this.f9933 = str;
        this.f9934 = str2;
        this.f9935 = str3;
        this.f9936 = bool;
        this.f9937 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3111)) {
            return false;
        }
        C3111 c3111 = (C3111) obj;
        return AbstractC1469.m3322(this.f9932, c3111.f9932) && AbstractC1469.m3322(this.f9933, c3111.f9933) && AbstractC1469.m3322(this.f9934, c3111.f9934) && AbstractC1469.m3322(this.f9935, c3111.f9935) && AbstractC1469.m3322(this.f9936, c3111.f9936) && AbstractC1469.m3322(this.f9937, c3111.f9937);
    }

    public final int hashCode() {
        List list = this.f9932;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f9933;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9934;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9935;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f9936;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f9937;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("dc5Proto(switch_skin_info_list=");
        sb.append(this.f9932);
        sb.append(", default_skin_id=");
        sb.append(this.f9933);
        sb.append(", selected_skin_id=");
        sb.append(this.f9934);
        sb.append(", custom_text=");
        sb.append(this.f9935);
        sb.append(", specific_custom_text=");
        sb.append(this.f9936);
        sb.append(", antispam_custom_text=");
        return AbstractC1095.m2801(sb, this.f9937, ')');
    }
}
