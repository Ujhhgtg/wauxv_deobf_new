package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤝᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3298 {
    public static final C3297 Companion = new C3297();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f10448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Float f10449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10451;

    public /* synthetic */ C3298(int i, String str, String str2, Float f, Float f2, String str3, Integer num) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3296.f10445.mo1509());
            throw null;
        }
        this.f10446 = str;
        this.f10447 = str2;
        this.f10448 = f;
        this.f10449 = f2;
        this.f10450 = str3;
        this.f10451 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3298)) {
            return false;
        }
        C3298 c3298 = (C3298) obj;
        return AbstractC1469.m3322(this.f10446, c3298.f10446) && AbstractC1469.m3322(this.f10447, c3298.f10447) && AbstractC1469.m3322(this.f10448, c3298.f10448) && AbstractC1469.m3322(this.f10449, c3298.f10449) && AbstractC1469.m3322(this.f10450, c3298.f10450) && AbstractC1469.m3322(this.f10451, c3298.f10451);
    }

    public final int hashCode() {
        String str = this.f10446;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10447;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.f10448;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f10449;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.f10450;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f10451;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("qj3Proto(url=");
        sb.append(this.f10446);
        sb.append(", thumbUrl=");
        sb.append(this.f10447);
        sb.append(", width=");
        sb.append(this.f10448);
        sb.append(", height=");
        sb.append(this.f10449);
        sb.append(", coverUrl=");
        sb.append(this.f10450);
        sb.append(", videoPlayDuration=");
        return AbstractC2647.m4623(sb, this.f10451, ')');
    }
}
