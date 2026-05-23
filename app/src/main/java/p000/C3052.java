package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3052 {
    public static final C3051 Companion = new C3051();

    public static final InterfaceC1758[] f9764 = {AbstractC1458.m3163(new C2083(24)), null, null, null, null, null};

    public final List f9765;

    public final String f9766;

    public final String f9767;

    public final String f9768;

    public final Boolean f9769;

    public final String f9770;

    public /* synthetic */ C3052(int i, List list, String str, String str2, String str3, Boolean bool, String str4) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3050.f9763.mo1363());
            throw null;
        }
        this.f9765 = list;
        this.f9766 = str;
        this.f9767 = str2;
        this.f9768 = str3;
        this.f9769 = bool;
        this.f9770 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3052)) {
            return false;
        }
        C3052 c3052 = (C3052) obj;
        return AbstractC2207.m4087(this.f9765, c3052.f9765) && AbstractC2207.m4087(this.f9766, c3052.f9766) && AbstractC2207.m4087(this.f9767, c3052.f9767) && AbstractC2207.m4087(this.f9768, c3052.f9768) && AbstractC2207.m4087(this.f9769, c3052.f9769) && AbstractC2207.m4087(this.f9770, c3052.f9770);
    }

    public final int hashCode() {
        List list = this.f9765;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f9766;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9767;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9768;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f9769;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f9770;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("dc5Proto(switch_skin_info_list=");
        sb.append(this.f9765);
        sb.append(", default_skin_id=");
        sb.append(this.f9766);
        sb.append(", selected_skin_id=");
        sb.append(this.f9767);
        sb.append(", custom_text=");
        sb.append(this.f9768);
        sb.append(", specific_custom_text=");
        sb.append(this.f9769);
        sb.append(", antispam_custom_text=");
        return AbstractC1194.m2786(sb, this.f9770, ')');
    }
}
