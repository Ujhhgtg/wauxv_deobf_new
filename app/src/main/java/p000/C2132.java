package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲇᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2132 extends C2438 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7066 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final long f7067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1744 f7068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0523 f7069;

    public C2132(long j, C1744 c1744, C2427 c2427, InterfaceC2654 interfaceC2654) {
        C0523 c0523 = new C0523();
        super(c2427, new C1744(c0523), interfaceC2654);
        this.f7067 = j;
        this.f7068 = c1744;
        this.f7069 = c0523;
    }

    @Override // p000.C2438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public void mo3942(InterfaceC2654 interfaceC2654) {
        switch (1) {
            case 0:
                int i = (int) (this.f7067 & 2147483647L);
                C1744 c1744 = this.f7068;
                c1744.m3487((C0523) c1744.f5843, EnumC2434.SIZE_DELIMITED.m4388(i), EnumC2429.DEFAULT);
                c1744.m3495(this.f7069);
                break;
            default:
                long j = this.f7067;
                C0523 c0523 = this.f7069;
                C1744 c1745 = this.f7068;
                if (j == 19500) {
                    c1745.m3495(c0523);
                } else {
                    c1745.m3487((C0523) c1745.f5843, EnumC2434.SIZE_DELIMITED.m4388((int) (j & 2147483647L)), EnumC2429.DEFAULT);
                    c1745.m3495(c0523);
                }
                break;
        }
    }

    @Override // p000.C2438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public long mo3691(InterfaceC2654 interfaceC2654, int i) {
        switch (1) {
            case 0:
                return 1;
            default:
                return super.mo3691(interfaceC2654, i);
        }
    }

    public C2132(C2427 c2427, C1744 c1744, long j, InterfaceC2654 interfaceC2654, C0523 c0523) {
        super(c2427, new C1744(c0523), interfaceC2654);
        this.f7068 = c1744;
        this.f7067 = j;
        this.f7069 = c0523;
    }
}
