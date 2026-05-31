package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0174 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C2897 f1261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0177 f1262;

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int i;
        C2897 c2897 = this.f1261;
        int iMo1106 = c2897 != null ? c2897.mo1106(c1353) : 0;
        C0177 c0177 = this.f1262;
        byte bM4769 = (c0177 == null || (i = c0177.f1268) == 0) ? (byte) 0 : AbstractC2844.m4769(i);
        AbstractC0972 abstractC0972 = c0177 != null ? c0177.f1267 : null;
        int iMo1107 = abstractC0972 != null ? abstractC0972.mo1106(c1353) : 0;
        c1353.m3181(3);
        c1353.m3171(2, iMo1107);
        c1353.m3171(0, iMo1106);
        c1353.m3169(bM4769, 1);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
