package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤝᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0371 extends AbstractC0374 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1854;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2400 f1856;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ViewOnClickListenerC0811 f1857;

    public C0371(String str, String str2, C2400 c2400, ViewOnClickListenerC0811 viewOnClickListenerC0811) {
        this.f1854 = str;
        this.f1855 = str2;
        this.f1856 = c2400;
        this.f1857 = viewOnClickListenerC0811;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0371)) {
            return false;
        }
        C0371 c0371 = (C0371) obj;
        return AbstractC1469.m3322(this.f1854, c0371.f1854) && AbstractC1469.m3322(this.f1855, c0371.f1855) && this.f1856.equals(c0371.f1856) && this.f1857.equals(c0371.f1857);
    }

    public final int hashCode() {
        int iHashCode = this.f1854.hashCode() * 31;
        String str = this.f1855;
        return this.f1857.hashCode() + ((this.f1856.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("PluginSwitch(title=");
        sb.append(this.f1854);
        sb.append(", desc=");
        sb.append(this.f1855);
        sb.append(", plugin=");
        sb.append(this.f1856);
        sb.append(", onClick=");
        sb.append(this.f1857);
        sb.append(')');
        return sb.toString();
    }
}
