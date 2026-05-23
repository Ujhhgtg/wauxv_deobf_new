package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᤞᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0290 extends AbstractC0369 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1833 f1505;

    public C0290(String str, C1833 c1833) {
        super(str);
        try {
            if (c1833.f6944) {
                throw new C1022("localVariables.isMutable()", null);
            }
            this.f1505 = c1833;
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // p000.AbstractC0369
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1402() {
        return (this.f1505.f4836.length * 10) + 8;
    }
}
