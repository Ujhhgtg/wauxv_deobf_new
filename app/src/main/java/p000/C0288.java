package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᤞᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0288 extends AbstractC0369 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0442 f1503;

    public C0288(C0442 c0442) {
        super("InnerClasses");
        try {
            if (c0442.f6944) {
                throw new C1022("innerClasses.isMutable()", null);
            }
            this.f1503 = c0442;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // p000.AbstractC0369
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1402() {
        return (this.f1503.f4836.length * 8) + 8;
    }
}
