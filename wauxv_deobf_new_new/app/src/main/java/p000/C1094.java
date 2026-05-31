package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1094 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f3937;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f3938;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3939;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC1467 f3940;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f3941;

    public C1094(int i, int i2, int i3, AbstractC1467 abstractC1467, boolean z) {
        if (!AbstractC1468.m3311(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!AbstractC1468.m3311(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!AbstractC1468.m3311(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC1467 == null) {
            throw new NullPointerException("format == null");
        }
        this.f3937 = i;
        this.f3938 = i2;
        this.f3939 = i3;
        this.f3940 = abstractC1467;
        this.f3941 = z;
    }

    public final String toString() {
        return m2787();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String m2787() {
        int i = this.f3937;
        try {
            C0383 c0383 = AbstractC2328.f7513[i + 1];
            if (c0383 != null) {
                return (String) c0383.f1894;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(i == ((char) i) ? AbstractC2902.m4906(i) : AbstractC2902.m4907(i)));
    }
}
