package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᛸᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2166 extends C2490 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7190 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final long f7191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1681 f7192;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0500 f7193;

    public C2166(long j, C1681 c1681, C2480 c2480, InterfaceC2715 interfaceC2715) {
        C0500 c0500 = new C0500();
        super(c2480, new C1681(c0500), interfaceC2715);
        this.f7191 = j;
        this.f7192 = c1681;
        this.f7193 = c0500;
    }

    @Override // p000.C2490
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public void mo4126(InterfaceC2715 interfaceC2715) {
        switch (this.f7190) {
            case 0:
                int i = (int) (this.f7191 & 2147483647L);
                C1681 c1681 = this.f7192;
                c1681.m3556((C0500) c1681.f5660, EnumC2487.SIZE_DELIMITED.m4409(i), EnumC2482.DEFAULT);
                c1681.m3563(this.f7193);
                break;
            default:
                long j = this.f7191;
                C0500 c0500 = this.f7193;
                C1681 c1682 = this.f7192;
                if (j == 19500) {
                    c1682.m3563(c0500);
                } else {
                    c1682.m3556((C0500) c1682.f5660, EnumC2487.SIZE_DELIMITED.m4409((int) (j & 2147483647L)), EnumC2482.DEFAULT);
                    c1682.m3563(c0500);
                }
                break;
        }
    }

    @Override // p000.C2490
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public long mo3870(InterfaceC2715 interfaceC2715, int i) {
        switch (this.f7190) {
            case 0:
                return 1;
            default:
                return super.mo3870(interfaceC2715, i);
        }
    }

    public C2166(C2480 c2480, C1681 c1681, long j, InterfaceC2715 interfaceC2715, C0500 c0500) {
        super(c2480, new C1681(c0500), interfaceC2715);
        this.f7192 = c1681;
        this.f7191 = j;
        this.f7193 = c0500;
    }
}
