package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲇᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0900 extends AbstractC0907 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0900 f3341 = new C0900(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0900 f3342 = new C0900(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0900 f3343 = new C0900(Float.floatToIntBits(2.0f));

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10870;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("float{0x");
        int i = this.f3364;
        sb.append(AbstractC1460.m3224(i));
        sb.append(" / ");
        sb.append(Float.intBitsToFloat(i));
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return Float.toString(Float.intBitsToFloat(this.f3364));
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "float";
    }
}
