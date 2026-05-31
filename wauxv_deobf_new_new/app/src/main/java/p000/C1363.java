package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᲀᛸᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 {
    public static final C1362 Companion = new C1362();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f4874;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f4875;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f4876;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f4877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f4878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f4879;

    public /* synthetic */ C1363(int i, String str, int i2, String str2, String str3, String str4, boolean z) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C1361.f4873.mo1509());
            throw null;
        }
        this.f4874 = str;
        this.f4875 = i2;
        this.f4876 = str2;
        this.f4877 = str3;
        this.f4878 = str4;
        this.f4879 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1363 m3183(C1363 c1363, int i, boolean z, int i2) {
        String str = c1363.f4874;
        if ((i2 & 2) != 0) {
            i = c1363.f4875;
        }
        int i3 = i;
        String str2 = c1363.f4876;
        String str3 = c1363.f4877;
        String str4 = c1363.f4878;
        if ((i2 & 32) != 0) {
            z = c1363.f4879;
        }
        c1363.getClass();
        return new C1363(str, str2, z, str3, i3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1363)) {
            return false;
        }
        C1363 c1363 = (C1363) obj;
        return AbstractC1469.m3322(this.f4874, c1363.f4874) && this.f4875 == c1363.f4875 && AbstractC1469.m3322(this.f4876, c1363.f4876) && AbstractC1469.m3322(this.f4877, c1363.f4877) && AbstractC1469.m3322(this.f4878, c1363.f4878) && this.f4879 == c1363.f4879;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4879) + AbstractC2647.m4621(AbstractC2647.m4621(AbstractC2647.m4621((Integer.hashCode(this.f4875) + (this.f4874.hashCode() * 31)) * 31, 31, this.f4876), 31, this.f4877), 31, this.f4878);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("FabMenuItem(desc=");
        sb.append(this.f4874);
        sb.append(", order=");
        sb.append(this.f4875);
        sb.append(", icon=");
        sb.append(this.f4876);
        sb.append(", type=");
        sb.append(this.f4877);
        sb.append(", action=");
        sb.append(this.f4878);
        sb.append(", enable=");
        sb.append(this.f4879);
        sb.append(')');
        return sb.toString();
    }

    public C1363(String str, String str2, boolean z, String str3, int i, String str4) {
        this.f4874 = str;
        this.f4875 = i;
        this.f4876 = str2;
        this.f4877 = str3;
        this.f4878 = str4;
        this.f4879 = z;
    }
}
