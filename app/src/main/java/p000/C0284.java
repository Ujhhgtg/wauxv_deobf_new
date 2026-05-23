package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0284 extends AbstractC0369 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC3458 f1498;

    public C0284(AbstractC3458 abstractC3458) {
        super("ConstantValue");
        if ((abstractC3458 instanceof C0917) || (abstractC3458 instanceof C0903) || (abstractC3458 instanceof C0910) || (abstractC3458 instanceof C0900) || (abstractC3458 instanceof C0897)) {
            this.f1498 = abstractC3458;
        } else {
            if (abstractC3458 != null) {
                throw new IllegalArgumentException("bad type for constantValue");
            }
            throw new NullPointerException("constantValue == null");
        }
    }

    @Override // p000.AbstractC0369
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1402() {
        return 8;
    }
}
