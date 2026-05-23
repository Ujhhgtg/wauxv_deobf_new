package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0916 extends AbstractC0907 {

    public static final C0916 f3377 = new C0916(0);

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10873;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("short{0x");
        int i = this.f3364;
        sb.append(AbstractC1460.m3223(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return Integer.toString(this.f3364);
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "short";
    }
}
