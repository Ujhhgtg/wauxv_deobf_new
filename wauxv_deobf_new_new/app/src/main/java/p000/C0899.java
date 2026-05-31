package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲀᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0899 extends AbstractC0906 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0899 f3348 = new C0899(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0899 f3349 = new C0899(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0899 f3350 = new C0899(Float.floatToIntBits(2.0f));

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11030;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("float{0x");
        int i = this.f3371;
        sb.append(AbstractC2902.m4907(i));
        sb.append(" / ");
        sb.append(Float.intBitsToFloat(i));
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return Float.toString(Float.intBitsToFloat(this.f3371));
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "float";
    }
}
