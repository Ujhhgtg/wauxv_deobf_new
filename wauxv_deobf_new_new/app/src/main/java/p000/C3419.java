package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᤝᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3419 {
    public static final C3418 Companion = new C3418();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3102 f10761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3102 f10762;

    public /* synthetic */ C3419(int i, String str, C3102 c3102, C3102 c3103) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3417.f10759.mo1509());
            throw null;
        }
        this.f10760 = str;
        this.f10761 = c3102;
        this.f10762 = c3103;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3419)) {
            return false;
        }
        C3419 c3419 = (C3419) obj;
        return AbstractC1469.m3322(this.f10760, c3419.f10760) && AbstractC1469.m3322(this.f10761, c3419.f10761) && AbstractC1469.m3322(this.f10762, c3419.f10762);
    }

    public final int hashCode() {
        String str = this.f10760;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3102 c3102 = this.f10761;
        int iHashCode2 = (iHashCode + (c3102 == null ? 0 : c3102.hashCode())) * 31;
        C3102 c3103 = this.f10762;
        return iHashCode2 + (c3103 != null ? c3103.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("xo3Proto(animation_id=");
        sb.append(this.f10760);
        sb.append(", animation=");
        sb.append(this.f10761);
        sb.append(", landscape_animation=");
        sb.append(this.f10762);
        sb.append(')');
        return sb.toString();
    }
}
