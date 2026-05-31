package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᲈᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3316 {
    public static final C3315 Companion = new C3315();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10512;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10513;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10514;

    public /* synthetic */ C3316(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3314.f10511.mo1509());
            throw null;
        }
        this.f10512 = str;
        this.f10513 = str2;
        this.f10514 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3316)) {
            return false;
        }
        C3316 c3316 = (C3316) obj;
        return AbstractC1469.m3322(this.f10512, c3316.f10512) && AbstractC1469.m3322(this.f10513, c3316.f10513) && AbstractC1469.m3322(this.f10514, c3316.f10514);
    }

    public final int hashCode() {
        String str = this.f10512;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10513;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10514;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("sm0Proto(biz_nickname=");
        sb.append(this.f10512);
        sb.append(", biz_username=");
        sb.append(this.f10513);
        sb.append(", biz_friend_follow_count=");
        return AbstractC2647.m4623(sb, this.f10514, ')');
    }
}
