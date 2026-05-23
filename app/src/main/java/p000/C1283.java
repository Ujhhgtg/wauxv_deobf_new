package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲁᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1283 {
    public static final C1282 Companion = new C1282();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f4688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f4689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f4690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f4691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f4692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f4693;

    public /* synthetic */ C1283(int i, int i2, String str, String str2, int i3, String str3, String str4) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C1281.f4687.mo1363());
            throw null;
        }
        this.f4688 = i2;
        this.f4689 = str;
        this.f4690 = str2;
        this.f4691 = i3;
        this.f4692 = str3;
        if ((i & 32) == 0) {
            this.f4693 = null;
        } else {
            this.f4693 = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1283)) {
            return false;
        }
        C1283 c1283 = (C1283) obj;
        return this.f4688 == c1283.f4688 && AbstractC2207.m4087(this.f4689, c1283.f4689) && AbstractC2207.m4087(this.f4690, c1283.f4690) && this.f4691 == c1283.f4691 && AbstractC2207.m4087(this.f4692, c1283.f4692) && AbstractC2207.m4087(this.f4693, c1283.f4693);
    }

    public final int hashCode() {
        int iM2775 = AbstractC1194.m2775((Integer.hashCode(this.f4691) + AbstractC1194.m2775(AbstractC1194.m2775(Integer.hashCode(this.f4688) * 31, 31, this.f4689), 31, this.f4690)) * 31, 31, this.f4692);
        String str = this.f4693;
        return iM2775 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("VoiceInfoProto(duration=");
        sb.append(this.f4688);
        sb.append(", fileCacheType=");
        sb.append(this.f4689);
        sb.append(", md5Checksum=");
        sb.append(this.f4690);
        sb.append(", fileSize=");
        sb.append(this.f4691);
        sb.append(", fileCacheName=");
        sb.append(this.f4692);
        sb.append(", filePath=");
        return AbstractC1194.m2786(sb, this.f4693, ')');
    }
}
