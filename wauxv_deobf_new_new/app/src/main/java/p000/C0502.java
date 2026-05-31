package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0502 implements InterfaceC1776 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f2168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f2169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f2170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1676 f2171;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0513 f2172;

    public C0502(int i, int i2, int i3, C1676 c1676, C0513 c0513) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int i4 = c1676.f5648;
        for (int i5 = 0; i5 < i4; i5++) {
            if (c1676.m3548(i5) < 0) {
                StringBuilder sbM2802 = AbstractC1095.m2802(i5, "successors[", "] == ");
                sbM2802.append(c1676.m3548(i5));
                throw new IllegalArgumentException(sbM2802.toString());
            }
        }
        if (c0513 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f2168 = i;
        this.f2169 = i2;
        this.f2170 = i3;
        this.f2171 = c1676;
        this.f2172 = c0513;
    }

    public final String toString() {
        return "{" + AbstractC2902.m4906(this.f2168) + ": " + AbstractC2902.m4906(this.f2169) + ".." + AbstractC2902.m4906(this.f2170) + '}';
    }

    @Override // p000.InterfaceC1776
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1682() {
        return this.f2168;
    }
}
