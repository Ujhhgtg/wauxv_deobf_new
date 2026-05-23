package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0900 extends AbstractC0907 {

    public static final C0900 f3341 = new C0900(Float.floatToIntBits(0.0f));

    public static final C0900 f3342 = new C0900(Float.floatToIntBits(1.0f));

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
    public final String mo1214() {
        return Float.toString(Float.intBitsToFloat(this.f3364));
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "float";
    }
}
