package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤞᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0372 extends AbstractC0374 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1858;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1859;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f1860;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f1861;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ViewOnClickListenerC0811 f1863;

    public C0372(String str, String str2, int i, String str3, int i2, ViewOnClickListenerC0811 viewOnClickListenerC0811) {
        this.f1858 = str;
        this.f1859 = str2;
        this.f1860 = i;
        this.f1861 = str3;
        this.f1862 = i2;
        this.f1863 = viewOnClickListenerC0811;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0372)) {
            return false;
        }
        C0372 c0372 = (C0372) obj;
        return AbstractC1469.m3322(this.f1858, c0372.f1858) && AbstractC1469.m3322(this.f1859, c0372.f1859) && this.f1860 == c0372.f1860 && AbstractC1469.m3322(this.f1861, c0372.f1861) && this.f1862 == c0372.f1862 && this.f1863.equals(c0372.f1863);
    }

    public final int hashCode() {
        int iHashCode = this.f1858.hashCode() * 31;
        String str = this.f1859;
        return this.f1863.hashCode() + ((Integer.hashCode(this.f1862) + AbstractC2647.m4621((Integer.hashCode(this.f1860) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f1861)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("SearchResult(title=");
        sb.append(this.f1858);
        sb.append(", desc=");
        sb.append(this.f1859);
        sb.append(", tabPos=");
        sb.append(this.f1860);
        sb.append(", tabName=");
        sb.append(this.f1861);
        sb.append(", itemIndexInTab=");
        sb.append(this.f1862);
        sb.append(", onClick=");
        sb.append(this.f1863);
        sb.append(')');
        return sb.toString();
    }
}
