package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲀᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3257 {
    public static final C3256 Companion = new C3256();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10347;

    public /* synthetic */ C3257(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3255.f10344.mo1363());
            throw null;
        }
        this.f10345 = str;
        this.f10346 = str2;
        this.f10347 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3257)) {
            return false;
        }
        C3257 c3257 = (C3257) obj;
        return AbstractC2207.m4087(this.f10345, c3257.f10345) && AbstractC2207.m4087(this.f10346, c3257.f10346) && AbstractC2207.m4087(this.f10347, c3257.f10347);
    }

    public final int hashCode() {
        String str = this.f10345;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10346;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10347;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("sm0Proto(biz_nickname=");
        sb.append(this.f10345);
        sb.append(", biz_username=");
        sb.append(this.f10346);
        sb.append(", biz_friend_follow_count=");
        return AbstractC2668.m4677(sb, this.f10347, ')');
    }
}
