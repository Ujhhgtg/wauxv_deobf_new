package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᤝᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2875 extends AbstractC2139 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC0775[] f9186;

    public C2875(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f9186 = new AbstractC0775[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AbstractC0775 m4826(int i) {
        try {
            AbstractC0775 abstractC0775 = this.f9186[i];
            if (abstractC0775 != null) {
                return abstractC0775;
            }
            throw new C1240("invalid constant pool index ".concat(AbstractC2902.m4906(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1240("invalid constant pool index ".concat(AbstractC2902.m4906(i)), null);
        }
    }
}
