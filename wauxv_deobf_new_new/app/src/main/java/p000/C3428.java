package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲀᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3428 {
    public static final C3427 Companion = new C3427();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10791;

    public /* synthetic */ C3428(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3426.f10788.mo1509());
            throw null;
        }
        this.f10789 = num;
        this.f10790 = num2;
        this.f10791 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3428)) {
            return false;
        }
        C3428 c3428 = (C3428) obj;
        return AbstractC1469.m3322(this.f10789, c3428.f10789) && AbstractC1469.m3322(this.f10790, c3428.f10790) && AbstractC1469.m3322(this.f10791, c3428.f10791);
    }

    public final int hashCode() {
        Integer num = this.f10789;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10790;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10791;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("y4Proto(d=");
        sb.append(this.f10789);
        sb.append(", e=");
        sb.append(this.f10790);
        sb.append(", f=");
        return AbstractC1095.m2801(sb, this.f10791, ')');
    }
}
