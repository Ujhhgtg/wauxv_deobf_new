package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲈᤝᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3434 {
    public static final C3433 Companion = new C3433();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10799;

    public /* synthetic */ C3434(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3432.f10797.mo1509());
            throw null;
        }
        this.f10798 = str;
        this.f10799 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3434)) {
            return false;
        }
        C3434 c3434 = (C3434) obj;
        return AbstractC1469.m3322(this.f10798, c3434.f10798) && AbstractC1469.m3322(this.f10799, c3434.f10799);
    }

    public final int hashCode() {
        String str = this.f10798;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10799;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("yq3Proto(name=");
        sb.append(this.f10798);
        sb.append(", inner_tab_type=");
        return AbstractC2647.m4623(sb, this.f10799, ')');
    }
}
