package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᤞᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2815 extends AbstractC2106 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC0777[] f9024;

    public C2815(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f9024 = new AbstractC0777[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AbstractC0777 m4793(int i) {
        try {
            AbstractC0777 abstractC0777 = this.f9024[i];
            if (abstractC0777 != null) {
                return abstractC0777;
            }
            throw new C1238("invalid constant pool index ".concat(AbstractC1460.m3223(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1238("invalid constant pool index ".concat(AbstractC1460.m3223(i)), null);
        }
    }
}
