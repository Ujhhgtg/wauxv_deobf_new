package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲀᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3262 {
    public static final C3261 Companion = new C3261();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3409 f10392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10393;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10394;

    public /* synthetic */ C3262(int i, C3409 c3409, Integer num, String str) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3260.f10391.mo1509());
            throw null;
        }
        this.f10392 = c3409;
        this.f10393 = num;
        this.f10394 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3262)) {
            return false;
        }
        C3262 c3262 = (C3262) obj;
        return AbstractC1469.m3322(this.f10392, c3262.f10392) && AbstractC1469.m3322(this.f10393, c3262.f10393) && AbstractC1469.m3322(this.f10394, c3262.f10394);
    }

    public final int hashCode() {
        C3409 c3409 = this.f10392;
        int iHashCode = (c3409 == null ? 0 : c3409.hashCode()) * 31;
        Integer num = this.f10393;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10394;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("o61Proto(cdnTransInfo=");
        sb.append(this.f10392);
        sb.append(", bitRate=");
        sb.append(this.f10393);
        sb.append(", codingFormat=");
        return AbstractC1095.m2801(sb, this.f10394, ')');
    }
}
