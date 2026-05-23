package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0903 extends AbstractC0907 {

    public static final C0903[] f3348 = new C0903[511];

    public static final C0903 f3349 = m2420(-1);

    public static final C0903 f3350 = m2420(0);

    public static final C0903 f3351 = m2420(1);

    public static final C0903 f3352 = m2420(2);

    public static final C0903 f3353 = m2420(3);

    public static final C0903 f3354 = m2420(4);

    public static final C0903 f3355 = m2420(5);

    public static C0903 m2420(int i) {
        C0903[] c0903Arr = f3348;
        int length = (2147483647 & i) % c0903Arr.length;
        C0903 c0903 = c0903Arr[length];
        if (c0903 != null && c0903.f3364 == i) {
            return c0903;
        }
        C0903 c0904 = new C0903(i);
        c0903Arr[length] = c0904;
        return c0904;
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10871;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("int{0x");
        int i = this.f3364;
        sb.append(AbstractC1460.m3224(i));
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
        return "int";
    }

    public final int m2421() {
        return this.f3364;
    }
}
