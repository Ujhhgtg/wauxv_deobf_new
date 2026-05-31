package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲀᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3286 {
    public static final C3285 Companion = new C3285();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10434;

    public /* synthetic */ C3286(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3284.f10432.mo1509());
            throw null;
        }
        this.f10433 = str;
        this.f10434 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3286)) {
            return false;
        }
        C3286 c3286 = (C3286) obj;
        return AbstractC1469.m3322(this.f10433, c3286.f10433) && AbstractC1469.m3322(this.f10434, c3286.f10434);
    }

    public final int hashCode() {
        String str = this.f10433;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10434;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("poProto(d=");
        sb.append(this.f10433);
        sb.append(", e=");
        return AbstractC2647.m4623(sb, this.f10434, ')');
    }
}
