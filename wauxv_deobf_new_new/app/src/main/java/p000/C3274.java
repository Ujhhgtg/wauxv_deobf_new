package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᛸᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3274 {
    public static final C3273 Companion = new C3273();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10407;

    public /* synthetic */ C3274(int i, Boolean bool, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3272.f10405.mo1509());
            throw null;
        }
        this.f10406 = bool;
        this.f10407 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3274)) {
            return false;
        }
        C3274 c3274 = (C3274) obj;
        return AbstractC1469.m3322(this.f10406, c3274.f10406) && AbstractC1469.m3322(this.f10407, c3274.f10407);
    }

    public final int hashCode() {
        Boolean bool = this.f10406;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f10407;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("p11Proto(need_replace_nickname=");
        sb.append(this.f10406);
        sb.append(", replace_nickname=");
        return AbstractC1095.m2801(sb, this.f10407, ')');
    }
}
