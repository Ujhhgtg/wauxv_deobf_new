package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᲁᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0292 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0419 f1565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f1566;

    public C0292(C0419 c0419) {
        super("BootstrapMethods");
        this.f1565 = c0419;
        int length = (c0419.f4833.length * 4) + 8;
        for (int i = 0; i < c0419.f4833.length; i++) {
            length += ((C0418) c0419.m3165(i)).f1982.f4833.length * 2;
        }
        this.f1566 = length;
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        return this.f1566;
    }
}
