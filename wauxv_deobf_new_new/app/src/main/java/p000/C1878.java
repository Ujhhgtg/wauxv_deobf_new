package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᛸᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1878 implements InterfaceC2624, InterfaceC1264 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0253 f6236 = AbstractC2902.m4902(20, new C1224(25));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2872 f6237 = new C2872();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC2624 f6238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f6239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f6240;

    @Override // p000.InterfaceC2624
    public final Object get() {
        return this.f6238.get();
    }

    @Override // p000.InterfaceC1264
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C2872 mo2620() {
        return this.f6237;
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final synchronized void mo1352() {
        this.f6237.m4824();
        this.f6240 = true;
        if (!this.f6239) {
            this.f6238.mo1352();
            this.f6238 = null;
            f6236.mo1457(this);
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1353() {
        return this.f6238.mo1353();
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1354() {
        return this.f6238.mo1354();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m3797() {
        this.f6237.m4824();
        if (!this.f6239) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f6239 = false;
        if (this.f6240) {
            mo1352();
        }
    }
}
