package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᤝᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1854 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2581 f6187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0917 f6188;

    public C1854(int i, int i2, C2581 c2581) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (i2 == 0) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c2581.f8207 == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f6185 = i;
            this.f6186 = i2;
            this.f6187 = c2581;
            this.f6188 = C0917.m2548(c2581.f8206.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1854) && compareTo((C1854) obj) == 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(this.f6185));
        sb.append(" ");
        switch (this.f6186) {
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
        sb.append(this.f6187);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1854 c1854) {
        int i = c1854.f6185;
        int i2 = this.f6185;
        if (i2 < i) {
            return -1;
        }
        if (i2 <= i) {
            boolean z = this.f6186 == 1;
            if (z == (c1854.f6186 == 1)) {
                return this.f6187.compareTo(c1854.f6187);
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0916 m3763() {
        return this.f6187.f8207.f6184;
    }
}
