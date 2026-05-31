package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲁᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3697 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f11524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f11525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3681 f11526;

    public C3697(String str, String str2, C3681 c3681) {
        this.f11524 = str;
        this.f11525 = str2;
        this.f11526 = c3681;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3697)) {
            return false;
        }
        C3697 c3697 = (C3697) obj;
        return AbstractC1469.m3322(this.f11524, c3697.f11524) && AbstractC1469.m3322(this.f11525, c3697.f11525) && this.f11526.equals(c3697.f11526);
    }

    public final int hashCode() {
        return this.f11526.hashCode() + ((Integer.hashCode(0) + AbstractC2647.m4621(this.f11524.hashCode() * 31, 31, this.f11525)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("PrefItemBean(key=");
        sb.append(this.f11524);
        sb.append(", title=");
        sb.append(this.f11525);
        sb.append(", index=");
        sb.append(0);
        sb.append(", onClick=");
        sb.append(this.f11526);
        sb.append(')');
        return sb.toString();
    }
}
