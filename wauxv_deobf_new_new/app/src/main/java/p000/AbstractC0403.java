package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲁᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0403 extends AbstractC2254 {
    @Override // p000.AbstractC2254
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC2254 mo1738() {
        return (AbstractC0403) this.f7333;
    }

    @Override // p000.AbstractC2254
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo1739(AbstractC2254 abstractC2254) {
        if (!(abstractC2254 instanceof AbstractC0403)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f7333 = abstractC2254;
    }
}
