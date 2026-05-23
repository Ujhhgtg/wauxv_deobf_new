package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲈᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3143 {
    public static final C3142 Companion = new C3142();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10000 = {null, AbstractC1458.m3163(new C3125(3)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10001;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10002;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10003;

    public /* synthetic */ C3143(int i, Integer num, List list, String str) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3141.f9999.mo1363());
            throw null;
        }
        this.f10001 = num;
        this.f10002 = list;
        this.f10003 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3143)) {
            return false;
        }
        C3143 c3143 = (C3143) obj;
        return AbstractC2207.m4087(this.f10001, c3143.f10001) && AbstractC2207.m4087(this.f10002, c3143.f10002) && AbstractC2207.m4087(this.f10003, c3143.f10003);
    }

    public final int hashCode() {
        Integer num = this.f10001;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10002;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f10003;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ls3Proto(index=");
        sb.append(this.f10001);
        sb.append(", media=");
        sb.append(this.f10002);
        sb.append(", comment_prompt_wording=");
        return AbstractC1194.m2786(sb, this.f10003, ')');
    }
}
