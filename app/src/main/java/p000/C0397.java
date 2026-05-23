package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲁᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0397 extends AbstractC0399 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1887;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f1889;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f1890;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1891;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ViewOnClickListenerC0812 f1892;

    public C0397(String str, String str2, int i, String str3, int i2, ViewOnClickListenerC0812 viewOnClickListenerC0812) {
        this.f1887 = str;
        this.f1888 = str2;
        this.f1889 = i;
        this.f1890 = str3;
        this.f1891 = i2;
        this.f1892 = viewOnClickListenerC0812;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0397)) {
            return false;
        }
        C0397 c0397 = (C0397) obj;
        return AbstractC2207.m4087(this.f1887, c0397.f1887) && AbstractC2207.m4087(this.f1888, c0397.f1888) && this.f1889 == c0397.f1889 && AbstractC2207.m4087(this.f1890, c0397.f1890) && this.f1891 == c0397.f1891 && this.f1892.equals(c0397.f1892);
    }

    public final int hashCode() {
        int iHashCode = this.f1887.hashCode() * 31;
        String str = this.f1888;
        return this.f1892.hashCode() + ((Integer.hashCode(this.f1891) + AbstractC1194.m2775((Integer.hashCode(this.f1889) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f1890)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("SearchResult(title=");
        sb.append(this.f1887);
        sb.append(", desc=");
        sb.append(this.f1888);
        sb.append(", tabPos=");
        sb.append(this.f1889);
        sb.append(", tabName=");
        sb.append(this.f1890);
        sb.append(", itemIndexInTab=");
        sb.append(this.f1891);
        sb.append(", onClick=");
        sb.append(this.f1892);
        sb.append(')');
        return sb.toString();
    }
}
