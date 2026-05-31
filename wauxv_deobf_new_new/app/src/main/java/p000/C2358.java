package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2358 {
    public static final C2357 Companion = new C2357();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f7582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f7583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f7584;

    public /* synthetic */ C2358(int i, String str, String str2, int i2, boolean z) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C2356.f7580.mo1509());
            throw null;
        }
        this.f7581 = str;
        this.f7582 = str2;
        this.f7583 = i2;
        if ((i & 8) == 0) {
            this.f7584 = true;
        } else {
            this.f7584 = z;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2358 m4305(C2358 c2358, String str, int i, boolean z, int i2) {
        String str2 = c2358.f7581;
        if ((i2 & 2) != 0) {
            str = c2358.f7582;
        }
        if ((i2 & 4) != 0) {
            i = c2358.f7583;
        }
        if ((i2 & 8) != 0) {
            z = c2358.f7584;
        }
        c2358.getClass();
        return new C2358(str2, str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2358)) {
            return false;
        }
        C2358 c2358 = (C2358) obj;
        return AbstractC1469.m3322(this.f7581, c2358.f7581) && AbstractC1469.m3322(this.f7582, c2358.f7582) && this.f7583 == c2358.f7583 && this.f7584 == c2358.f7584;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7584) + ((Integer.hashCode(this.f7583) + AbstractC2647.m4621(this.f7581.hashCode() * 31, 31, this.f7582)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("PanelEmojiGroupConfig(dirName=");
        sb.append(this.f7581);
        sb.append(", title=");
        sb.append(this.f7582);
        sb.append(", order=");
        sb.append(this.f7583);
        sb.append(", enable=");
        sb.append(this.f7584);
        sb.append(')');
        return sb.toString();
    }

    public C2358(String str, String str2, int i, boolean z) {
        this.f7581 = str;
        this.f7582 = str2;
        this.f7583 = i;
        this.f7584 = z;
    }
}
