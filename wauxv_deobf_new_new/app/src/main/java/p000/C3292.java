package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲇᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3292 {
    public static final C3291 Companion = new C3291();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10439;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10440;

    public /* synthetic */ C3292(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3290.f10438.mo1509());
            throw null;
        }
        this.f10439 = num;
        this.f10440 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3292)) {
            return false;
        }
        C3292 c3292 = (C3292) obj;
        return AbstractC1469.m3322(this.f10439, c3292.f10439) && AbstractC1469.m3322(this.f10440, c3292.f10440);
    }

    public final int hashCode() {
        Integer num = this.f10439;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10440;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("qg1Proto(live_mode=");
        sb.append(this.f10439);
        sb.append(", live_sub_mode=");
        return AbstractC2647.m4623(sb, this.f10440, ')');
    }
}
