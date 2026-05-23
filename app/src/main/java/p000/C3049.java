package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3049 {
    public static final C3048 Companion = new C3048();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f9761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9762;

    public /* synthetic */ C3049(int i, Boolean bool, Integer num) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3047.f9760.mo1363());
            throw null;
        }
        this.f9761 = bool;
        this.f9762 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3049)) {
            return false;
        }
        C3049 c3049 = (C3049) obj;
        return AbstractC2207.m4087(this.f9761, c3049.f9761) && AbstractC2207.m4087(this.f9762, c3049.f9762);
    }

    public final int hashCode() {
        Boolean bool = this.f9761;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f9762;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("d91Proto(has_satisfaction_quest=");
        sb.append(this.f9761);
        sb.append(", satisfaction_quest_appear_time_ms=");
        return AbstractC2668.m4677(sb, this.f9762, ')');
    }
}
