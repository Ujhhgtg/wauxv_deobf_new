package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0825 extends AbstractC0824 {

    public boolean f3220;

    public C0825(int i, boolean z) {
        this.f3219 = i;
        this.f3220 = z;
    }

    @Override // p000.AbstractC0824
    public final byte mo2372() {
        return (byte) 1;
    }

    @Override // p000.AbstractC0824
    public final boolean mo2373() {
        return this.f3220;
    }

    @Override // p000.AbstractC0824
    public final float mo2374() {
        return this.f3220 ? 1.0f : 0.0f;
    }

    @Override // p000.AbstractC0824
    public final int mo2375() {
        return this.f3220 ? 1 : 0;
    }

    @Override // p000.AbstractC0824
    public final long mo2376() {
        return this.f3220 ? 1L : 0L;
    }

    @Override // p000.AbstractC0824
    public final String mo2377() {
        return this.f3220 ? "true" : "false";
    }
}
