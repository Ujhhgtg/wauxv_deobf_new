package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᤞᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0298 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0417 f1577;

    public C0298(C0417 c0417) {
        super("InnerClasses");
        try {
            if (c0417.f7068) {
                throw new C1025("innerClasses.isMutable()", null);
            }
            this.f1577 = c0417;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        return (this.f1577.f4833.length * 8) + 8;
    }
}
