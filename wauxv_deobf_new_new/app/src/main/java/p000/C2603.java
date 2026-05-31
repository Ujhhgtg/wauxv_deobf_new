package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᛸᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2603 extends C2488 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f8257;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final long f8258;

    public C2603(C2480 c2480, C2491 c2491, long j, InterfaceC2715 interfaceC2715) {
        super(c2480, c2491, interfaceC2715);
        this.f8257 = -1;
        if (j == 19500) {
            int iM4424 = c2491.m4424(EnumC2482.DEFAULT);
            if (iM4424 < 0) {
                throw new IllegalArgumentException(("Expected positive length for " + interfaceC2715 + ", but got " + iM4424).toString());
            }
            j = -iM4424;
        }
        this.f8258 = j;
    }

    @Override // p000.C2488, p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2331(InterfaceC2715 interfaceC2715) {
        long j = this.f8258;
        C2491 c2491 = this.f7881;
        if (j > 0) {
            if ((this.f8257 == -1 ? c2491.f7893 : c2491.m4437()) == ((int) (j & 2147483647L))) {
                int i = this.f8257 + 1;
                this.f8257 = i;
                return i;
            }
            c2491.f7895 = true;
            int i2 = (c2491.f7893 << 3) | c2491.f7894.f7879;
            c2491.m4439(c2491.f7896);
            c2491.f7896 = i2;
            return -1;
        }
        long j2 = -j;
        int i3 = this.f8257 + 1;
        this.f8257 = i3;
        if (i3 == j2) {
            return -1;
        }
        if (!c2491.f7895) {
            C0498 c0498 = c2491.f7892;
            if (c0498.f2159 - c0498.f2160 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // p000.C2488
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ */
    public final long mo3868(InterfaceC2715 interfaceC2715, int i) {
        long j = this.f8258;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }
}
