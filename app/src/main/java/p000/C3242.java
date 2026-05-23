package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3242 {
    public static final C3241 Companion = new C3241();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10286 = {null, null, null, null, null, null, AbstractC1458.m3163(new C3125(13)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List f10293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10296;

    public /* synthetic */ C3242(int i, String str, String str2, String str3, String str4, String str5, Integer num, List list, String str6, String str7, String str8) {
        if (1023 != (i & 1023)) {
            AbstractC1270.m2997(i, 1023, C3240.f10285.mo1363());
            throw null;
        }
        this.f10287 = str;
        this.f10288 = str2;
        this.f10289 = str3;
        this.f10290 = str4;
        this.f10291 = str5;
        this.f10292 = num;
        this.f10293 = list;
        this.f10294 = str6;
        this.f10295 = str7;
        this.f10296 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3242)) {
            return false;
        }
        C3242 c3242 = (C3242) obj;
        return AbstractC2207.m4087(this.f10287, c3242.f10287) && AbstractC2207.m4087(this.f10288, c3242.f10288) && AbstractC2207.m4087(this.f10289, c3242.f10289) && AbstractC2207.m4087(this.f10290, c3242.f10290) && AbstractC2207.m4087(this.f10291, c3242.f10291) && AbstractC2207.m4087(this.f10292, c3242.f10292) && AbstractC2207.m4087(this.f10293, c3242.f10293) && AbstractC2207.m4087(this.f10294, c3242.f10294) && AbstractC2207.m4087(this.f10295, c3242.f10295) && AbstractC2207.m4087(this.f10296, c3242.f10296);
    }

    public final int hashCode() {
        String str = this.f10287;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10288;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10289;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10290;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10291;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f10292;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f10293;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.f10294;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10295;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10296;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("rj3Proto(objectId=");
        sb.append(this.f10287);
        sb.append(", username=");
        sb.append(this.f10288);
        sb.append(", nickname=");
        sb.append(this.f10289);
        sb.append(", avatar=");
        sb.append(this.f10290);
        sb.append(", desc=");
        sb.append(this.f10291);
        sb.append(", mediaCount=");
        sb.append(this.f10292);
        sb.append(", mediaList=");
        sb.append(this.f10293);
        sb.append(", objectNonceId=");
        sb.append(this.f10294);
        sb.append(", finderId=");
        sb.append(this.f10295);
        sb.append(", finderObjectNonceId=");
        return AbstractC1194.m2786(sb, this.f10296, ')');
    }
}
