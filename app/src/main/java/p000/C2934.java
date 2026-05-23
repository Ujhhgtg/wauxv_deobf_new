package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᤞᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2934 {
    public static final C2933 Companion = new C2933();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9409;

    public /* synthetic */ C2934(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C2932.f9407.mo1363());
            throw null;
        }
        this.f9408 = num;
        this.f9409 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2934)) {
            return false;
        }
        C2934 c2934 = (C2934) obj;
        return AbstractC2207.m4087(this.f9408, c2934.f9408) && AbstractC2207.m4087(this.f9409, c2934.f9409);
    }

    public final int hashCode() {
        Integer num = this.f9408;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9409;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("AppActionSceneProto(installedActionScene=");
        sb.append(this.f9408);
        sb.append(", uninstalledActionScene=");
        return AbstractC2668.m4677(sb, this.f9409, ')');
    }
}
