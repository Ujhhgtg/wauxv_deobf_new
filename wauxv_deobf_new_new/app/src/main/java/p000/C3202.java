package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᛸᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3202 {
    public static final C3201 Companion = new C3201();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10167 = {null, AbstractC2240.m4259(new C3163(5)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10170;

    public /* synthetic */ C3202(int i, Integer num, List list, String str) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3200.f10166.mo1509());
            throw null;
        }
        this.f10168 = num;
        this.f10169 = list;
        this.f10170 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3202)) {
            return false;
        }
        C3202 c3202 = (C3202) obj;
        return AbstractC1469.m3322(this.f10168, c3202.f10168) && AbstractC1469.m3322(this.f10169, c3202.f10169) && AbstractC1469.m3322(this.f10170, c3202.f10170);
    }

    public final int hashCode() {
        Integer num = this.f10168;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10169;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f10170;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ls3Proto(index=");
        sb.append(this.f10168);
        sb.append(", media=");
        sb.append(this.f10169);
        sb.append(", comment_prompt_wording=");
        return AbstractC1095.m2801(sb, this.f10170, ')');
    }
}
