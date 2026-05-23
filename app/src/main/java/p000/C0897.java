package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0897 extends AbstractC0908 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0897 f3338 = new C0897(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0897 f3339 = new C0897(Double.doubleToLongBits(1.0d));

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10869;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("double{0x");
        long j = this.f3365;
        sb.append(AbstractC1460.m3225(j));
        sb.append(" / ");
        sb.append(Double.longBitsToDouble(j));
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return Double.toString(Double.longBitsToDouble(this.f3365));
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "double";
    }
}
