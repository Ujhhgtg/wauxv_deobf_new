package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲁᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1284 {
    public static final C1280 Companion = new C1280();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1279 f4694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1283 f4695;

    public /* synthetic */ C1284(int i, C1279 c1279, C1283 c1283) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C1276.f4684.mo1363());
            throw null;
        }
        this.f4694 = c1279;
        this.f4695 = c1283;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1284)) {
            return false;
        }
        C1284 c1284 = (C1284) obj;
        return AbstractC2207.m4087(this.f4694, c1284.f4694) && AbstractC2207.m4087(this.f4695, c1284.f4695);
    }

    public final int hashCode() {
        return this.f4695.hashCode() + (this.f4694.f4686.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("FavInfoProto(chatInfo=");
        sb.append(this.f4694);
        sb.append(", voiceInfo=");
        sb.append(this.f4695);
        sb.append(')');
        return sb.toString();
    }
}
