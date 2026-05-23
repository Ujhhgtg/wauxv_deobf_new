package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1351 extends AbstractC0950 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4835 = 0;

    public /* synthetic */ AbstractC1351(C1089 c1089, C2788 c2788, C2526 c2526) {
        super(c1089, c2788, c2526);
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public int mo1344() {
        return this.f3468.f3929.mo3109();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public String mo1345() {
        C1089 c1089 = this.f3468;
        AbstractC2205 abstractC2205 = c1089.f3929;
        
        String strM2661 = c1089.m2661();
        String strMo3111 = abstractC2205.mo3111(this);
        String strMo3112 = abstractC2205.mo3112(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strM2661);
        if (strMo3111.length() != 0) {
            sb.append(' ');
            sb.append(strMo3111);
        }
        if (strMo3112.length() != 0) {
            sb.append(" // ");
            sb.append(strMo3112);
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public AbstractC0950 mo2416(C1089 c1089) {
        throw new RuntimeException("unsupported");
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final AbstractC0950 mo2444(int i) {
        switch (0) {
            case 0:
                break;
        }
        return mo1346(this.f3470.m4550(i));
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public void mo1347(C0519 c0519) {
        this.f3468.f3929.mo3114(c0519, this);
    }

    public AbstractC1351(C2788 c2788, C2526 c2526) {
        super(AbstractC1090.f3932, c2788, c2526);
    }
}
