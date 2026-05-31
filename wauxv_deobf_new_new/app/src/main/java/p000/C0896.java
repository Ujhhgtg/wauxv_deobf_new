package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0896 extends AbstractC0907 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0896 f3345 = new C0896(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0896 f3346 = new C0896(Double.doubleToLongBits(1.0d));

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11029;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("double{0x");
        long j = this.f3372;
        sb.append(AbstractC2902.m4908(j));
        sb.append(" / ");
        sb.append(Double.longBitsToDouble(j));
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return Double.toString(Double.longBitsToDouble(this.f3372));
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "double";
    }
}
