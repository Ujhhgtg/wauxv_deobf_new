package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲇᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2250 {
    public static final C2246 Companion = new C2246();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f7323 = {null, null, AbstractC2240.m4259(new C2096(4)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0358 f7324;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f7325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f7326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f7327;

    public /* synthetic */ C2250(int i, C0358 c0358, Integer num, List list, Integer num2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C2245.f7313.mo1509());
            throw null;
        }
        this.f7324 = c0358;
        this.f7325 = num;
        this.f7326 = list;
        this.f7327 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2250)) {
            return false;
        }
        C2250 c2250 = (C2250) obj;
        return AbstractC1469.m3322(this.f7324, c2250.f7324) && AbstractC1469.m3322(this.f7325, c2250.f7325) && AbstractC1469.m3322(this.f7326, c2250.f7326) && AbstractC1469.m3322(this.f7327, c2250.f7327);
    }

    public final int hashCode() {
        C0358 c0358 = this.f7324;
        int iHashCode = (c0358 == null ? 0 : c0358.hashCode()) * 31;
        Integer num = this.f7325;
        int iHashCode2 = (this.f7326.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Integer num2 = this.f7327;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("NewSendMsgResp(baseResponse=");
        sb.append(this.f7324);
        sb.append(", count=");
        sb.append(this.f7325);
        sb.append(", list=");
        sb.append(this.f7326);
        sb.append(", noKnow=");
        return AbstractC2647.m4623(sb, this.f7327, ')');
    }
}
