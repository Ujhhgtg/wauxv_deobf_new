package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲁᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0396 extends AbstractC0399 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1883;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1884;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2355 f1885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ViewOnClickListenerC0812 f1886;

    public C0396(String str, String str2, C2355 c2355, ViewOnClickListenerC0812 viewOnClickListenerC0812) {
        this.f1883 = str;
        this.f1884 = str2;
        this.f1885 = c2355;
        this.f1886 = viewOnClickListenerC0812;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0396)) {
            return false;
        }
        C0396 c0396 = (C0396) obj;
        return AbstractC2207.m4087(this.f1883, c0396.f1883) && AbstractC2207.m4087(this.f1884, c0396.f1884) && this.f1885.equals(c0396.f1885) && this.f1886.equals(c0396.f1886);
    }

    public final int hashCode() {
        int iHashCode = this.f1883.hashCode() * 31;
        String str = this.f1884;
        return this.f1886.hashCode() + ((this.f1885.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("PluginSwitch(title=");
        sb.append(this.f1883);
        sb.append(", desc=");
        sb.append(this.f1884);
        sb.append(", plugin=");
        sb.append(this.f1885);
        sb.append(", onClick=");
        sb.append(this.f1886);
        sb.append(')');
        return sb.toString();
    }
}
