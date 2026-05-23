package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2219 {
    public static final C2215 Companion = new C2215();

    public static final InterfaceC1758[] f7203 = {null, null, AbstractC1458.m3163(new C2083(3)), null};

    public final C0383 f7204;

    public final Integer f7205;

    public final List f7206;

    public final Integer f7207;

    public /* synthetic */ C2219(int i, C0383 c0383, Integer num, List list, Integer num2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C2214.f7193.mo1363());
            throw null;
        }
        this.f7204 = c0383;
        this.f7205 = num;
        this.f7206 = list;
        this.f7207 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2219)) {
            return false;
        }
        C2219 c2219 = (C2219) obj;
        return AbstractC2207.m4087(this.f7204, c2219.f7204) && AbstractC2207.m4087(this.f7205, c2219.f7205) && AbstractC2207.m4087(this.f7206, c2219.f7206) && AbstractC2207.m4087(this.f7207, c2219.f7207);
    }

    public final int hashCode() {
        C0383 c0383 = this.f7204;
        int iHashCode = (c0383 == null ? 0 : c0383.hashCode()) * 31;
        Integer num = this.f7205;
        int iHashCode2 = (this.f7206.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Integer num2 = this.f7207;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("NewSendMsgResp(baseResponse=");
        sb.append(this.f7204);
        sb.append(", count=");
        sb.append(this.f7205);
        sb.append(", list=");
        sb.append(this.f7206);
        sb.append(", noKnow=");
        return AbstractC2668.m4677(sb, this.f7207, ')');
    }
}
