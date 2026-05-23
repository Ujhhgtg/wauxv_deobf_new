package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1303 extends AbstractC1460 {

    public C2837 f4735;

    public C0705 f4736;

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        C2837 c2837 = this.f4735;
        int iMo961 = c2837 != null ? c2837.mo961(c1353) : 0;
        C0705 c0705 = this.f4736;
        int iMo962 = c0705 != null ? c0705.mo961(c1353) : 0;
        c1353.m3078(10);
        c1353.m3068(9, 0);
        c1353.m3068(8, 0);
        c1353.m3068(7, 0);
        c1353.m3068(6, 0);
        c1353.m3068(5, 0);
        c1353.m3068(4, 0);
        c1353.m3068(3, iMo962);
        c1353.m3068(2, 0);
        c1353.m3068(1, 0);
        c1353.m3068(0, iMo961);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
