package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1351 extends AbstractC0953 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4832 = 0;

    public /* synthetic */ AbstractC1351(C1094 c1094, C2848 c2848, C2582 c2582) {
        super(c1094, c2848, c2582);
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public int mo1490() {
        return this.f3483.f3940.mo3217();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public String mo1491() {
        C1094 c1094 = this.f3483;
        AbstractC1467 abstractC1467 = c1094.f3940;
        abstractC1467.getClass();
        String strM2787 = c1094.m2787();
        String strMo3219 = abstractC1467.mo3219(this);
        String strMo3220 = abstractC1467.mo3220(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strM2787);
        if (strMo3219.length() != 0) {
            sb.append(' ');
            sb.append(strMo3219);
        }
        if (strMo3220.length() != 0) {
            sb.append(" // ");
            sb.append(strMo3220);
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public AbstractC0953 mo2533(C1094 c1094) {
        throw new RuntimeException("unsupported");
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final AbstractC0953 mo2563(int i) {
        switch (this.f4832) {
            case 0:
                break;
        }
        return mo1492(this.f3485.m4572(i));
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public void mo1493(C0496 c0496) {
        this.f3483.f3940.mo3222(c0496, this);
    }

    public AbstractC1351(C2848 c2848, C2582 c2582) {
        super(AbstractC1096.f3943, c2848, c2582);
    }
}
