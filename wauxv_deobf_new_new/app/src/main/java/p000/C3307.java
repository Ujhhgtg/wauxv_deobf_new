package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3307 {
    public static final C3306 Companion = new C3306();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10469 = {null, AbstractC2240.m4259(new C3163(17)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10472;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10473;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10474;

    public /* synthetic */ C3307(int i, String str, List list, String str2, Integer num, String str3) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3305.f10468.mo1509());
            throw null;
        }
        this.f10470 = str;
        this.f10471 = list;
        this.f10472 = str2;
        this.f10473 = num;
        this.f10474 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3307)) {
            return false;
        }
        C3307 c3307 = (C3307) obj;
        return AbstractC1469.m3322(this.f10470, c3307.f10470) && AbstractC1469.m3322(this.f10471, c3307.f10471) && AbstractC1469.m3322(this.f10472, c3307.f10472) && AbstractC1469.m3322(this.f10473, c3307.f10473) && AbstractC1469.m3322(this.f10474, c3307.f10474);
    }

    public final int hashCode() {
        String str = this.f10470;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f10471;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f10472;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10473;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f10474;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("s40Proto(component_name=");
        sb.append(this.f10470);
        sb.append(", component_value_list=");
        sb.append(this.f10471);
        sb.append(", select_component_key=");
        sb.append(this.f10472);
        sb.append(", seq=");
        sb.append(this.f10473);
        sb.append(", component_key=");
        return AbstractC1095.m2801(sb, this.f10474, ')');
    }
}
