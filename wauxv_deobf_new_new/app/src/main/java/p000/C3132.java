package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᛸᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3132 {
    public static final C3131 Companion = new C3131();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10004;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10005;

    public /* synthetic */ C3132(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3130.f10003.mo1509());
            throw null;
        }
        this.f10004 = num;
        this.f10005 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3132)) {
            return false;
        }
        C3132 c3132 = (C3132) obj;
        return AbstractC1469.m3322(this.f10004, c3132.f10004) && AbstractC1469.m3322(this.f10005, c3132.f10005);
    }

    public final int hashCode() {
        Integer num = this.f10004;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10005;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("fm4Proto(related_event_type=");
        sb.append(this.f10004);
        sb.append(", related_event_id=");
        return AbstractC1095.m2801(sb, this.f10005, ')');
    }
}
