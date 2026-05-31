package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤞᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final byte[] f8704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f8705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f8706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f8708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2707 f8709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2707 f8710;

    public C2707() {
        this.f8704 = new byte[8192];
        this.f8708 = true;
        this.f8707 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2707 m4679() {
        C2707 c2707 = this.f8709;
        C2707 c2708 = c2707 != this ? c2707 : null;
        C2707 c2709 = this.f8710;
        c2709.f8709 = c2707;
        this.f8709.f8710 = c2709;
        this.f8709 = null;
        this.f8710 = null;
        return c2708;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4680(C2707 c2707) {
        c2707.f8710 = this;
        c2707.f8709 = this.f8709;
        this.f8709.f8710 = c2707;
        this.f8709 = c2707;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2707 m4681() {
        this.f8707 = true;
        return new C2707(this.f8704, this.f8705, this.f8706, true, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4682(C2707 c2707, int i) {
        boolean z = c2707.f8708;
        byte[] bArr = c2707.f8704;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = c2707.f8706;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c2707.f8707) {
                throw new IllegalArgumentException();
            }
            int i4 = c2707.f8705;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0280.m1528(bArr, i4, i2, bArr, 2);
            c2707.f8706 -= c2707.f8705;
            c2707.f8705 = 0;
        }
        int i5 = c2707.f8706;
        int i6 = this.f8705;
        AbstractC0280.m1524(this.f8704, i5, i6, bArr, i6 + i);
        c2707.f8706 += i;
        this.f8705 += i;
    }

    public C2707(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f8704 = bArr;
        this.f8705 = i;
        this.f8706 = i2;
        this.f8707 = z;
        this.f8708 = z2;
    }
}
