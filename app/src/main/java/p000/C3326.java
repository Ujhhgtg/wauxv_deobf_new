package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲇᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3326 {
    public static final C3325 Companion = new C3325();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Float f10526;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f10527;

    public /* synthetic */ C3326(int i, String str, Float f, Float f2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3324.f10524.mo1363());
            throw null;
        }
        this.f10525 = str;
        this.f10526 = f;
        this.f10527 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3326)) {
            return false;
        }
        C3326 c3326 = (C3326) obj;
        return AbstractC2207.m4087(this.f10525, c3326.f10525) && AbstractC2207.m4087(this.f10526, c3326.f10526) && AbstractC2207.m4087(this.f10527, c3326.f10527);
    }

    public final int hashCode() {
        String str = this.f10525;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.f10526;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f10527;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("w12Proto(poiClassifyId=");
        sb.append(this.f10525);
        sb.append(", longitude=");
        sb.append(this.f10526);
        sb.append(", latitude=");
        sb.append(this.f10527);
        sb.append(')');
        return sb.toString();
    }
}
