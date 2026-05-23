package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᤝᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3248 {
    public static final C3247 Companion = new C3247();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10302 = {null, AbstractC1458.m3163(new C3125(15)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10303;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10304;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10305;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10306;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10307;

    public /* synthetic */ C3248(int i, String str, List list, String str2, Integer num, String str3) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3246.f10301.mo1363());
            throw null;
        }
        this.f10303 = str;
        this.f10304 = list;
        this.f10305 = str2;
        this.f10306 = num;
        this.f10307 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3248)) {
            return false;
        }
        C3248 c3248 = (C3248) obj;
        return AbstractC2207.m4087(this.f10303, c3248.f10303) && AbstractC2207.m4087(this.f10304, c3248.f10304) && AbstractC2207.m4087(this.f10305, c3248.f10305) && AbstractC2207.m4087(this.f10306, c3248.f10306) && AbstractC2207.m4087(this.f10307, c3248.f10307);
    }

    public final int hashCode() {
        String str = this.f10303;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f10304;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f10305;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10306;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f10307;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("s40Proto(component_name=");
        sb.append(this.f10303);
        sb.append(", component_value_list=");
        sb.append(this.f10304);
        sb.append(", select_component_key=");
        sb.append(this.f10305);
        sb.append(", seq=");
        sb.append(this.f10306);
        sb.append(", component_key=");
        return AbstractC1194.m2786(sb, this.f10307, ')');
    }
}
