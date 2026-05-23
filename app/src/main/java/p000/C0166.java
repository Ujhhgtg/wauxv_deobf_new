package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0166 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2837 f1193;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0169 f1194;

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int i;
        C2837 c2837 = this.f1193;
        int iMo961 = c2837 != null ? c2837.mo961(c1353) : 0;
        C0169 c0169 = this.f1194;
        byte bM4735 = (c0169 == null || (i = c0169.f1200) == 0) ? (byte) 0 : AbstractC2784.m4735(i);
        AbstractC1460 abstractC1460 = c0169 != null ? c0169.f1199 : null;
        int iMo962 = abstractC1460 != null ? abstractC1460.mo961(c1353) : 0;
        c1353.m3078(3);
        c1353.m3068(2, iMo962);
        c1353.m3068(0, iMo961);
        c1353.m3066(bM4735, 1);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
