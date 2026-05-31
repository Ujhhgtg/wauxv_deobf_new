package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᤞᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0297 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC3510 f1576;

    public C0297(InterfaceC3510 interfaceC3510) {
        super("Exceptions");
        try {
            if (interfaceC3510.mo1406()) {
                throw new C1025("exceptions.isMutable()", null);
            }
            this.f1576 = interfaceC3510;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        return (this.f1576.size() * 2) + 8;
    }
}
