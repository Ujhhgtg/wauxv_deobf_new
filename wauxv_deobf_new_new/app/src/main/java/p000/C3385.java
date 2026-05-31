package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤞᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3385 {
    public static final C3384 Companion = new C3384();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Float f10693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f10694;

    public /* synthetic */ C3385(int i, String str, Float f, Float f2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3383.f10691.mo1509());
            throw null;
        }
        this.f10692 = str;
        this.f10693 = f;
        this.f10694 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3385)) {
            return false;
        }
        C3385 c3385 = (C3385) obj;
        return AbstractC1469.m3322(this.f10692, c3385.f10692) && AbstractC1469.m3322(this.f10693, c3385.f10693) && AbstractC1469.m3322(this.f10694, c3385.f10694);
    }

    public final int hashCode() {
        String str = this.f10692;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.f10693;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f10694;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("w12Proto(poiClassifyId=");
        sb.append(this.f10692);
        sb.append(", longitude=");
        sb.append(this.f10693);
        sb.append(", latitude=");
        sb.append(this.f10694);
        sb.append(')');
        return sb.toString();
    }
}
