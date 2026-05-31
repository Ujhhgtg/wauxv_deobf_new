package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤝᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3376 {
    public static final C3375 Companion = new C3375();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3153 f10677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3015 f10678;

    public /* synthetic */ C3376(int i, C3153 c3153, C3015 c3015) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3374.f10676.mo1509());
            throw null;
        }
        this.f10677 = c3153;
        this.f10678 = c3015;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3376)) {
            return false;
        }
        C3376 c3376 = (C3376) obj;
        return AbstractC1469.m3322(this.f10677, c3376.f10677) && AbstractC1469.m3322(this.f10678, c3376.f10678);
    }

    public final int hashCode() {
        C3153 c3153 = this.f10677;
        int iHashCode = (c3153 == null ? 0 : c3153.hashCode()) * 31;
        C3015 c3015 = this.f10678;
        return iHashCode + (c3015 != null ? c3015.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("vq0Proto(music_info=");
        sb.append(this.f10677);
        sb.append(", contact=");
        sb.append(this.f10678);
        sb.append(')');
        return sb.toString();
    }
}
