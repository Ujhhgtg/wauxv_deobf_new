package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0282 extends AbstractC0369 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0444 f1491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f1492;

    public C0282(C0444 c0444) {
        super("BootstrapMethods");
        this.f1491 = c0444;
        int length = (c0444.f4836.length * 4) + 8;
        for (int i = 0; i < c0444.f4836.length; i++) {
            length += ((C0443) c0444.m3062(i)).f2010.f4836.length * 2;
        }
        this.f1492 = length;
    }

    @Override // p000.AbstractC0369
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1402() {
        return this.f1492;
    }
}
