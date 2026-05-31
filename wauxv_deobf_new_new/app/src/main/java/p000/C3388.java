package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᲈᤝᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3388 {
    public static final C3387 Companion = new C3387();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10696 = {AbstractC2240.m4259(new C3163(25)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10698;

    public /* synthetic */ C3388(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3386.f10695.mo1509());
            throw null;
        }
        this.f10697 = list;
        this.f10698 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3388)) {
            return false;
        }
        C3388 c3388 = (C3388) obj;
        return AbstractC1469.m3322(this.f10697, c3388.f10697) && AbstractC1469.m3322(this.f10698, c3388.f10698);
    }

    public final int hashCode() {
        List list = this.f10697;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f10698;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("w51Proto(battle_duration=");
        sb.append(this.f10697);
        sb.append(", default_battle_duration=");
        return AbstractC2647.m4623(sb, this.f10698, ')');
    }
}
