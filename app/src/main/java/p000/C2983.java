package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤞᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2983 {
    public static final C2982 Companion = new C2982();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9576;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9577;

    public /* synthetic */ C2983(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C2981.f9575.mo1363());
            throw null;
        }
        this.f9576 = str;
        this.f9577 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2983)) {
            return false;
        }
        C2983 c2983 = (C2983) obj;
        return AbstractC2207.m4087(this.f9576, c2983.f9576) && AbstractC2207.m4087(this.f9577, c2983.f9577);
    }

    public final int hashCode() {
        String str = this.f9576;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9577;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ScanCodeInfoProto(codeContent=");
        sb.append(this.f9576);
        sb.append(", sourceBizType=");
        return AbstractC2668.m4677(sb, this.f9577, ')');
    }
}
