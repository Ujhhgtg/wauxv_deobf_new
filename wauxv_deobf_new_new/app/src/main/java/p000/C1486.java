package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲀᲁᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1486 {
    public static final C1485 Companion = new C1485();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public String f5279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Integer f5280;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Integer f5281;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1486)) {
            return false;
        }
        C1486 c1486 = (C1486) obj;
        return AbstractC1469.m3322(this.f5279, c1486.f5279) && AbstractC1469.m3322(this.f5280, c1486.f5280) && AbstractC1469.m3322(this.f5281, c1486.f5281);
    }

    public final int hashCode() {
        String str = this.f5279;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5280;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5281;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("GmailInfo(gmailAcct=");
        sb.append(this.f5279);
        sb.append(", gmailSwitch=");
        sb.append(this.f5280);
        sb.append(", gmailErrCode=");
        return AbstractC2647.m4623(sb, this.f5281, ')');
    }
}
