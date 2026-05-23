package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲀᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3179 {
    public static final C3178 Companion = new C3178();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2989 f10180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10181;

    public /* synthetic */ C3179(int i, Boolean bool, C2989 c2989, Integer num) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3177.f10178.mo1363());
            throw null;
        }
        this.f10179 = bool;
        this.f10180 = c2989;
        this.f10181 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3179)) {
            return false;
        }
        C3179 c3179 = (C3179) obj;
        return AbstractC2207.m4087(this.f10179, c3179.f10179) && AbstractC2207.m4087(this.f10180, c3179.f10180) && AbstractC2207.m4087(this.f10181, c3179.f10181);
    }

    public final int hashCode() {
        Boolean bool = this.f10179;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C2989 c2989 = this.f10180;
        int iHashCode2 = (iHashCode + (c2989 == null ? 0 : c2989.hashCode())) * 31;
        Integer num = this.f10181;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ne5Proto(d=");
        sb.append(this.f10179);
        sb.append(", e=");
        sb.append(this.f10180);
        sb.append(", f=");
        return AbstractC2668.m4677(sb, this.f10181, ')');
    }
}
