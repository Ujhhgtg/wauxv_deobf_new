package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲀᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1286 {
    public static final C1282 Companion = new C1282();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1281 f4694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1285 f4695;

    public /* synthetic */ C1286(int i, C1281 c1281, C1285 c1285) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C1278.f4684.mo1509());
            throw null;
        }
        this.f4694 = c1281;
        this.f4695 = c1285;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1286)) {
            return false;
        }
        C1286 c1286 = (C1286) obj;
        return AbstractC1469.m3322(this.f4694, c1286.f4694) && AbstractC1469.m3322(this.f4695, c1286.f4695);
    }

    public final int hashCode() {
        return this.f4695.hashCode() + (this.f4694.f4686.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("FavInfoProto(chatInfo=");
        sb.append(this.f4694);
        sb.append(", voiceInfo=");
        sb.append(this.f4695);
        sb.append(')');
        return sb.toString();
    }
}
