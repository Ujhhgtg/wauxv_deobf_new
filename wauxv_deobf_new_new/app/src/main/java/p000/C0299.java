package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᤞᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0299 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1806 f1578;

    public C0299(C1806 c1806) {
        super("LineNumberTable");
        try {
            if (c1806.f7068) {
                throw new C1025("lineNumbers.isMutable()", null);
            }
            this.f1578 = c1806;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        return (this.f1578.f4833.length * 4) + 8;
    }
}
