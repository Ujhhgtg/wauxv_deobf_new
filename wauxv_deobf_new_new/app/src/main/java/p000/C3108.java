package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᛸᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3108 {
    public static final C3107 Companion = new C3107();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f9928;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9929;

    public /* synthetic */ C3108(int i, Boolean bool, Integer num) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3106.f9927.mo1509());
            throw null;
        }
        this.f9928 = bool;
        this.f9929 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3108)) {
            return false;
        }
        C3108 c3108 = (C3108) obj;
        return AbstractC1469.m3322(this.f9928, c3108.f9928) && AbstractC1469.m3322(this.f9929, c3108.f9929);
    }

    public final int hashCode() {
        Boolean bool = this.f9928;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f9929;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("d91Proto(has_satisfaction_quest=");
        sb.append(this.f9928);
        sb.append(", satisfaction_quest_appear_time_ms=");
        return AbstractC2647.m4623(sb, this.f9929, ')');
    }
}
