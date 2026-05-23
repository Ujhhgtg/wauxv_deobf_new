package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᲈᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3384 {
    public static final C3383 Companion = new C3383();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10663;

    public /* synthetic */ C3384(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3382.f10661.mo1363());
            throw null;
        }
        this.f10662 = str;
        this.f10663 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3384)) {
            return false;
        }
        C3384 c3384 = (C3384) obj;
        return AbstractC2207.m4087(this.f10662, c3384.f10662) && AbstractC2207.m4087(this.f10663, c3384.f10663);
    }

    public final int hashCode() {
        String str = this.f10662;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10663;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("zd0Proto(d=");
        sb.append(this.f10662);
        sb.append(", e=");
        return AbstractC1194.m2786(sb, this.f10663, ')');
    }
}
