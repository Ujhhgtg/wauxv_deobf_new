package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᲇᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2999 {
    public static final C2998 Companion = new C2998();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9587;

    public /* synthetic */ C2999(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C2997.f9585.mo1509());
            throw null;
        }
        this.f9586 = str;
        this.f9587 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2999)) {
            return false;
        }
        C2999 c2999 = (C2999) obj;
        return AbstractC1469.m3322(this.f9586, c2999.f9586) && AbstractC1469.m3322(this.f9587, c2999.f9587);
    }

    public final int hashCode() {
        String str = this.f9586;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9587;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("AppJumpWordingKeyProto(installedWordingKey=");
        sb.append(this.f9586);
        sb.append(", uninstalledWordingKey=");
        return AbstractC1095.m2801(sb, this.f9587, ')');
    }
}
