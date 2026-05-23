package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0173 extends AbstractC1460 {

    public C0705 f1207;

    public C0167 f1208;

    @Override // p000.AbstractC1460
    public final int mo961(C1353 c1353) {
        C0705 c0705 = this.f1207;
        int iMo961 = c0705 != null ? c0705.mo961(c1353) : 0;
        C0167 c0167 = this.f1208;
        int iMo962 = c0167 != null ? c0167.mo961(c1353) : 0;
        c1353.m3078(5);
        c1353.m3068(4, 0);
        c1353.m3068(3, iMo962);
        c1353.m3068(1, 0);
        c1353.m3068(0, iMo961);
        c1353.m3066((byte) 0, 2);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
