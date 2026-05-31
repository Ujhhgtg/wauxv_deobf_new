package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤝᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3301 {
    public static final C3300 Companion = new C3300();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10453 = {null, null, null, null, null, null, AbstractC2240.m4259(new C3163(15)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10456;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10457;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final List f10460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10463;

    public /* synthetic */ C3301(int i, String str, String str2, String str3, String str4, String str5, Integer num, List list, String str6, String str7, String str8) {
        if (1023 != (i & 1023)) {
            AbstractC2234.m4187(i, 1023, C3299.f10452.mo1509());
            throw null;
        }
        this.f10454 = str;
        this.f10455 = str2;
        this.f10456 = str3;
        this.f10457 = str4;
        this.f10458 = str5;
        this.f10459 = num;
        this.f10460 = list;
        this.f10461 = str6;
        this.f10462 = str7;
        this.f10463 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3301)) {
            return false;
        }
        C3301 c3301 = (C3301) obj;
        return AbstractC1469.m3322(this.f10454, c3301.f10454) && AbstractC1469.m3322(this.f10455, c3301.f10455) && AbstractC1469.m3322(this.f10456, c3301.f10456) && AbstractC1469.m3322(this.f10457, c3301.f10457) && AbstractC1469.m3322(this.f10458, c3301.f10458) && AbstractC1469.m3322(this.f10459, c3301.f10459) && AbstractC1469.m3322(this.f10460, c3301.f10460) && AbstractC1469.m3322(this.f10461, c3301.f10461) && AbstractC1469.m3322(this.f10462, c3301.f10462) && AbstractC1469.m3322(this.f10463, c3301.f10463);
    }

    public final int hashCode() {
        String str = this.f10454;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10455;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10456;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10457;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10458;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f10459;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f10460;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.f10461;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10462;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10463;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("rj3Proto(objectId=");
        sb.append(this.f10454);
        sb.append(", username=");
        sb.append(this.f10455);
        sb.append(", nickname=");
        sb.append(this.f10456);
        sb.append(", avatar=");
        sb.append(this.f10457);
        sb.append(", desc=");
        sb.append(this.f10458);
        sb.append(", mediaCount=");
        sb.append(this.f10459);
        sb.append(", mediaList=");
        sb.append(this.f10460);
        sb.append(", objectNonceId=");
        sb.append(this.f10461);
        sb.append(", finderId=");
        sb.append(this.f10462);
        sb.append(", finderObjectNonceId=");
        return AbstractC1095.m2801(sb, this.f10463, ')');
    }
}
