package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲇᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0901 extends AbstractC1649 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0777 f3344;

    public AbstractC0901(C2590 c2590, C2788 c2788, C2525 c2525, C2526 c2526, AbstractC0777 abstractC0777) {
        super(c2590, c2788, c2525, c2526);
        if (abstractC0777 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f3344 = abstractC0777;
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public String mo2413() {
        return this.f3344.mo1214();
    }
}
