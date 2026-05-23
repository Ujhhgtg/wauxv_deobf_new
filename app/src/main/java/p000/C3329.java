package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲇᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3329 {
    public static final C3328 Companion = new C3328();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10529 = {AbstractC1458.m3163(new C3125(23)), null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10531;

    public /* synthetic */ C3329(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3327.f10528.mo1363());
            throw null;
        }
        this.f10530 = list;
        this.f10531 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3329)) {
            return false;
        }
        C3329 c3329 = (C3329) obj;
        return AbstractC2207.m4087(this.f10530, c3329.f10530) && AbstractC2207.m4087(this.f10531, c3329.f10531);
    }

    public final int hashCode() {
        List list = this.f10530;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f10531;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("w51Proto(battle_duration=");
        sb.append(this.f10530);
        sb.append(", default_battle_duration=");
        return AbstractC2668.m4677(sb, this.f10531, ')');
    }
}
