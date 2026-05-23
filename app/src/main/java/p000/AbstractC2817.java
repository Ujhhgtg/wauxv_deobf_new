package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2817 implements InterfaceC1926 {

    public final C0918 f9025;

    public final int f9026;

    public final C0914 f9027;

    public final C0442 f9028;

    public AbstractC2817(C0918 c0918, int i, C0914 c0914, C0442 c0442) {
        if (c0918 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0442 == null) {
            throw new NullPointerException("attributes == null");
        }
        this.f9025 = c0918;
        this.f9026 = i;
        this.f9027 = c0914;
        this.f9028 = c0442;
    }

    @Override // p000.InterfaceC1926
    public final C0442 getAttributes() {
        return this.f9028;
    }

    @Override // p000.InterfaceC1926
    public final C0917 getName() {
        return this.f9027.f3374;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f9027.mo1214());
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC1926
    public final C0917 mo2256() {
        return this.f9027.f3375;
    }

    @Override // p000.InterfaceC1926
    public final C0918 mo2258() {
        return this.f9025;
    }

    @Override // p000.InterfaceC1926
    public final int mo2259() {
        return this.f9026;
    }

    @Override // p000.InterfaceC1926
    public final C0914 mo2260() {
        return this.f9027;
    }
}
