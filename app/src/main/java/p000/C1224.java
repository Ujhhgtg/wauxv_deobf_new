package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1224 implements InterfaceC2568 {

    public final boolean f4432;

    public final boolean f4433;

    public final InterfaceC2568 f4434;

    public final InterfaceC1223 f4435;

    public final InterfaceC1749 f4436;

    public int f4437;

    public boolean f4438;

    public C1224(InterfaceC2568 interfaceC2568, boolean z, boolean z2, InterfaceC1749 interfaceC1749, InterfaceC1223 interfaceC1223) {
        AbstractC1460.m3210(interfaceC2568, "Argument must not be null");
        this.f4434 = interfaceC2568;
        this.f4432 = z;
        this.f4433 = z2;
        this.f4436 = interfaceC1749;
        AbstractC1460.m3210(interfaceC1223, "Argument must not be null");
        this.f4435 = interfaceC1223;
    }

    @Override // p000.InterfaceC2568
    public final Object get() {
        return this.f4434.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4432 + ", listener=" + this.f4435 + ", key=" + this.f4436 + ", acquired=" + this.f4437 + ", isRecycled=" + this.f4438 + ", resource=" + this.f4434 + '}';
    }

    public final synchronized void m2846() {
        if (this.f4438) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4437++;
    }

    @Override // p000.InterfaceC2568
    public final synchronized void mo1206() {
        if (this.f4437 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4438) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4438 = true;
        if (this.f4433) {
            this.f4434.mo1206();
        }
    }

    @Override // p000.InterfaceC2568
    public final int mo1207() {
        return this.f4434.mo1207();
    }

    @Override // p000.InterfaceC2568
    public final Class mo1208() {
        return this.f4434.mo1208();
    }

    public final void m2847() {
        boolean z;
        synchronized (this) {
            int i = this.f4437;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f4437 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C1216) this.f4435).m2837(this.f4436, this);
        }
    }
}
