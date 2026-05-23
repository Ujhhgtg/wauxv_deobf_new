package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲇᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3230 {
    public static final C3229 Companion = new C3229();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2956 f10269;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10270;

    public /* synthetic */ C3230(int i, C2956 c2956, Integer num) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3228.f10268.mo1363());
            throw null;
        }
        this.f10269 = c2956;
        this.f10270 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3230)) {
            return false;
        }
        C3230 c3230 = (C3230) obj;
        return AbstractC2207.m4087(this.f10269, c3230.f10269) && AbstractC2207.m4087(this.f10270, c3230.f10270);
    }

    public final int hashCode() {
        C2956 c2956 = this.f10269;
        int iHashCode = (c2956 == null ? 0 : c2956.hashCode()) * 31;
        Integer num = this.f10270;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("q72Proto(contact=");
        sb.append(this.f10269);
        sb.append(", friend_follow_num=");
        return AbstractC2668.m4677(sb, this.f10270, ')');
    }
}
