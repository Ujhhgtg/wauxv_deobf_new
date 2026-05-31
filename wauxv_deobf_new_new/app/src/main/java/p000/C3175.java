package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲇᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3175 {
    public static final C3174 Companion = new C3174();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10104;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10105;

    public /* synthetic */ C3175(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3173.f10103.mo1509());
            throw null;
        }
        this.f10104 = num;
        this.f10105 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3175)) {
            return false;
        }
        C3175 c3175 = (C3175) obj;
        return AbstractC1469.m3322(this.f10104, c3175.f10104) && AbstractC1469.m3322(this.f10105, c3175.f10105);
    }

    public final int hashCode() {
        Integer num = this.f10104;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10105;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("k71Proto(effect_type=");
        sb.append(this.f10104);
        sb.append(", effect_text=");
        return AbstractC1095.m2801(sb, this.f10105, ')');
    }
}
