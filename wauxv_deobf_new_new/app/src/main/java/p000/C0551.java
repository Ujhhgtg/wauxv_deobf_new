package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0551 extends AbstractC1352 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0551 f2302 = new C0551(0);

    @Override // p000.AbstractC1352, p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return m2078("", "");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0551 c0551) {
        if (this == c0551) {
            return 0;
        }
        int length = this.f4833.length;
        int length2 = c0551.f4833.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C0550) m3165(i)).compareTo((C0550) c0551.m3165(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final String m2078(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int length = this.f4833.length;
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < length; i++) {
            C0550 c0550 = (C0550) m3165(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i != length - 1) {
                sb.append(c0550.f2300.f3408.mo1360());
            } else {
                int length2 = this.f4833.length;
                if (length2 == 0 ? false : ((C0550) m3165(length2 - 1)).f2300.equals(C0917.f3388)) {
                    sb.append("<any>");
                } else {
                    sb.append(c0550.f2300.f3408.mo1360());
                }
            }
            sb.append(" -> ");
            int i2 = c0550.f2301;
            sb.append(i2 == ((char) i2) ? AbstractC2902.m4906(i2) : AbstractC2902.m4907(i2));
        }
        return sb.toString();
    }
}
