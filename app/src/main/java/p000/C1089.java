package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1089 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f3926;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f3927;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3928;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC2205 f3929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f3930;

    public C1089(int i, int i2, int i3, AbstractC2205 abstractC2205, boolean z) {
        if (!AbstractC2209.m4136(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!AbstractC2209.m4136(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!AbstractC2209.m4136(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC2205 == null) {
            throw new NullPointerException("format == null");
        }
        this.f3926 = i;
        this.f3927 = i2;
        this.f3928 = i3;
        this.f3929 = abstractC2205;
        this.f3930 = z;
    }

    public final String toString() {
        return m2661();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String m2661() {
        int i = this.f3926;
        try {
            C0408 c0408 = AbstractC2295.f7391[i + 1];
            if (c0408 != null) {
                return (String) c0408.f1922;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(i == ((char) i) ? AbstractC1460.m3223(i) : AbstractC1460.m3224(i)));
    }
}
