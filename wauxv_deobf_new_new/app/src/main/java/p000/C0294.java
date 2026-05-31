package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᤞᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0294 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC3514 f1572;

    public C0294(AbstractC3514 abstractC3514) {
        super("ConstantValue");
        if ((abstractC3514 instanceof C0916) || (abstractC3514 instanceof C0902) || (abstractC3514 instanceof C0909) || (abstractC3514 instanceof C0899) || (abstractC3514 instanceof C0896)) {
            this.f1572 = abstractC3514;
        } else {
            if (abstractC3514 != null) {
                throw new IllegalArgumentException("bad type for constantValue");
            }
            throw new NullPointerException("constantValue == null");
        }
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        return 8;
    }
}
