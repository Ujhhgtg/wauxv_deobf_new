package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0900 extends AbstractC1663 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final AbstractC0775 f3351;

    public AbstractC0900(C2648 c2648, C2848 c2848, C2581 c2581, C2582 c2582, AbstractC0775 abstractC0775) {
        super(c2648, c2848, c2581, c2582);
        if (abstractC0775 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f3351 = abstractC0775;
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public String mo2530() {
        return this.f3351.mo1360();
    }
}
