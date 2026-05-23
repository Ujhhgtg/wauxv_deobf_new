package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0912 extends AbstractC3458 {

    public static final String[] f3370 = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    public final int f3371;

    public final AbstractC0777 f3372;

    public C0912(int i, AbstractC0777 abstractC0777) {
        this.f3371 = i;
        this.f3372 = abstractC0777;
    }

    public static boolean m2426(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public static C0912 m2427(int i, AbstractC0777 abstractC0777) {
        if (!m2426(i)) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC0777 instanceof AbstractC0891)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC0777.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(AbstractC1194.m2779(i, "type is out of range: "));
            }
        } else if (!(abstractC0777 instanceof C0899)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC0777.getClass());
        }
        return new C0912(i, abstractC0777);
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10879;
    }

    public final String toString() {
        return "method-handle{" + mo1214() + "}";
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return f3370[this.f3371] + "," + this.f3372.toString();
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        C0912 c0912 = (C0912) abstractC0777;
        int i = c0912.f3371;
        int i2 = this.f3371;
        return i2 == i ? this.f3372.compareTo(c0912.f3372) : Integer.compare(i2, i);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "method handle";
    }
}
