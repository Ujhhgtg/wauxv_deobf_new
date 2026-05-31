package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲇᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0911 extends AbstractC3514 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String[] f3377 = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3378;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC0775 f3379;

    public C0911(int i, AbstractC0775 abstractC0775) {
        this.f3378 = i;
        this.f3379 = abstractC0775;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static boolean m2543(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static C0911 m2544(int i, AbstractC0775 abstractC0775) {
        if (!m2543(i)) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC0775 instanceof AbstractC0890)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC0775.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(AbstractC1095.m2794(i, "type is out of range: "));
            }
        } else if (!(abstractC0775 instanceof C0898)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC0775.getClass());
        }
        return new C0911(i, abstractC0775);
    }

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11039;
    }

    public final String toString() {
        return "method-handle{" + mo1360() + "}";
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return f3377[this.f3378] + "," + this.f3379.toString();
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        C0911 c0911 = (C0911) abstractC0775;
        int i = c0911.f3378;
        int i2 = this.f3378;
        return i2 == i ? this.f3379.compareTo(c0911.f3379) : Integer.compare(i2, i);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2370() {
        return false;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "method handle";
    }
}
