package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲀᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2940 {
    public static final C2939 Companion = new C2939();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9419;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9420;

    public /* synthetic */ C2940(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C2938.f9418.mo1363());
            throw null;
        }
        this.f9419 = str;
        this.f9420 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2940)) {
            return false;
        }
        C2940 c2940 = (C2940) obj;
        return AbstractC2207.m4087(this.f9419, c2940.f9419) && AbstractC2207.m4087(this.f9420, c2940.f9420);
    }

    public final int hashCode() {
        String str = this.f9419;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9420;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("AppJumpWordingKeyProto(installedWordingKey=");
        sb.append(this.f9419);
        sb.append(", uninstalledWordingKey=");
        return AbstractC1194.m2786(sb, this.f9420, ')');
    }
}
