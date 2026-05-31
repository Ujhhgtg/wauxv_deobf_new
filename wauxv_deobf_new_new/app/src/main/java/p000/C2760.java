package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2760 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f8874;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f8875;

    public C2760(String str, String str2) {
        this.f8874 = str;
        this.f8875 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2760)) {
            return false;
        }
        C2760 c2760 = (C2760) obj;
        return AbstractC1469.m3322(this.f8874, c2760.f8874) && AbstractC1469.m3322(this.f8875, c2760.f8875);
    }

    public final int hashCode() {
        return this.f8875.hashCode() + (this.f8874.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("HideConfig(title=");
        sb.append(this.f8874);
        sb.append(", key=");
        return AbstractC1095.m2801(sb, this.f8875, ')');
    }
}
