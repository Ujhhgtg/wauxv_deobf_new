package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᤞᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3042 {
    public static final C3041 Companion = new C3041();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9744;

    public /* synthetic */ C3042(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3040.f9742.mo1509());
            throw null;
        }
        this.f9743 = str;
        this.f9744 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3042)) {
            return false;
        }
        C3042 c3042 = (C3042) obj;
        return AbstractC1469.m3322(this.f9743, c3042.f9743) && AbstractC1469.m3322(this.f9744, c3042.f9744);
    }

    public final int hashCode() {
        String str = this.f9743;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9744;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ScanCodeInfoProto(codeContent=");
        sb.append(this.f9743);
        sb.append(", sourceBizType=");
        return AbstractC2647.m4623(sb, this.f9744, ')');
    }
}
