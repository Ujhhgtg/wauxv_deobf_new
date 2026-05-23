package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1827 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6110;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f6111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2525 f6112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0918 f6113;

    public C1827(int i, int i2, C2525 c2525) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (i2 == 0) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c2525.f8057 == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f6110 = i;
            this.f6111 = i2;
            this.f6112 = c2525;
            this.f6113 = C0918.m2431(c2525.f8056.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1827) && compareTo((C1827) obj) == 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(this.f6110));
        sb.append(" ");
        switch (this.f6111) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "END_SIMPLY";
                break;
            case 3:
                str = "END_REPLACED";
                break;
            case 4:
                str = "END_MOVED";
                break;
            case 5:
                str = "END_CLOBBERED_BY_PREV";
                break;
            case 6:
                str = "END_CLOBBERED_BY_NEXT";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f6112);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1827 c1827) {
        int i = c1827.f6110;
        int i2 = this.f6110;
        if (i2 < i) {
            return -1;
        }
        if (i2 <= i) {
            boolean z = this.f6111 == 1;
            if (z == (c1827.f6111 == 1)) {
                return this.f6112.compareTo(c1827.f6112);
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0917 m3585() {
        return this.f6112.f8057.f6109;
    }
}
