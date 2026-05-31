package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1226 implements InterfaceC2624 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f4431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f4432;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2624 f4433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC1225 f4434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1772 f4435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f4436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f4437;

    public C1226(InterfaceC2624 interfaceC2624, boolean z, boolean z2, InterfaceC1772 interfaceC1772, InterfaceC1225 interfaceC1225) {
        AbstractC2727.m4693(interfaceC2624, "Argument must not be null");
        this.f4433 = interfaceC2624;
        this.f4431 = z;
        this.f4432 = z2;
        this.f4435 = interfaceC1772;
        AbstractC2727.m4693(interfaceC1225, "Argument must not be null");
        this.f4434 = interfaceC1225;
    }

    @Override // p000.InterfaceC2624
    public final Object get() {
        return this.f4433.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4431 + ", listener=" + this.f4434 + ", key=" + this.f4435 + ", acquired=" + this.f4436 + ", isRecycled=" + this.f4437 + ", resource=" + this.f4433 + '}';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized void m2972() {
        if (this.f4437) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4436++;
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final synchronized void mo1352() {
        if (this.f4436 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4437) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4437 = true;
        if (this.f4432) {
            this.f4433.mo1352();
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1353() {
        return this.f4433.mo1353();
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1354() {
        return this.f4433.mo1354();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2973() {
        boolean z;
        synchronized (this) {
            int i = this.f4436;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f4436 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C1217) this.f4434).m2959(this.f4435, this);
        }
    }
}
