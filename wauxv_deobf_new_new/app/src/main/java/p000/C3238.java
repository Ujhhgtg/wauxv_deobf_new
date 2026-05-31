package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲇᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3238 {
    public static final C3237 Companion = new C3237();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3048 f10347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10348;

    public /* synthetic */ C3238(int i, Boolean bool, C3048 c3048, Integer num) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3236.f10345.mo1509());
            throw null;
        }
        this.f10346 = bool;
        this.f10347 = c3048;
        this.f10348 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3238)) {
            return false;
        }
        C3238 c3238 = (C3238) obj;
        return AbstractC1469.m3322(this.f10346, c3238.f10346) && AbstractC1469.m3322(this.f10347, c3238.f10347) && AbstractC1469.m3322(this.f10348, c3238.f10348);
    }

    public final int hashCode() {
        Boolean bool = this.f10346;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C3048 c3048 = this.f10347;
        int iHashCode2 = (iHashCode + (c3048 == null ? 0 : c3048.hashCode())) * 31;
        Integer num = this.f10348;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ne5Proto(d=");
        sb.append(this.f10346);
        sb.append(", e=");
        sb.append(this.f10347);
        sb.append(", f=");
        return AbstractC2647.m4623(sb, this.f10348, ')');
    }
}
