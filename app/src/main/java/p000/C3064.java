package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲇᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3064 {
    public static final C3063 Companion = new C3063();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9814;

    public /* synthetic */ C3064(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3062.f9812.mo1363());
            throw null;
        }
        this.f9813 = str;
        this.f9814 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3064)) {
            return false;
        }
        C3064 c3064 = (C3064) obj;
        return AbstractC2207.m4087(this.f9813, c3064.f9813) && AbstractC2207.m4087(this.f9814, c3064.f9814);
    }

    public final int hashCode() {
        String str = this.f9813;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9814;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("f52Proto(template_id=");
        sb.append(this.f9813);
        sb.append(", template_type=");
        return AbstractC2668.m4677(sb, this.f9814, ')');
    }
}
