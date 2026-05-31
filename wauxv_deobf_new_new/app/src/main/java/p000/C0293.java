package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0293 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f1567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f1568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0519 f1569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0513 f1570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0417 f1571;

    public C0293(int i, int i2, C0519 c0519, C0513 c0513, C0417 c0417) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c0513.f7068) {
                throw new C1025("catches.isMutable()", null);
            }
            try {
                if (c0417.f7068) {
                    throw new C1025("attributes.isMutable()", null);
                }
                this.f1567 = i;
                this.f1568 = i2;
                this.f1569 = c0519;
                this.f1570 = c0513;
                this.f1571 = c0417;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        int iMo1548 = 2;
        int iM4770 = AbstractC2844.m4770(this.f1570.f4833.length, 8, 2, ((C0493) this.f1569.f2208).f2147 + 14);
        C0417 c0417 = this.f1571;
        int length = c0417.f4833.length;
        for (int i = 0; i < length; i++) {
            iMo1548 += ((AbstractC0344) c0417.m3165(i)).mo1548();
        }
        return iM4770 + iMo1548;
    }
}
