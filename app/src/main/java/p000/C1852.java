package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᤝᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1852 implements InterfaceC2568, InterfaceC1262 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0243 f6162 = AbstractC3471.m5090(20, new C1227(25));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2812 f6163 = new C2812();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC2568 f6164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f6165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f6166;

    @Override // p000.InterfaceC2568
    public final Object get() {
        return this.f6164.get();
    }

    @Override // p000.InterfaceC1262
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C2812 mo2496() {
        return this.f6163;
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final synchronized void mo1206() {
        this.f6163.m4791();
        this.f6166 = true;
        if (!this.f6165) {
            this.f6164.mo1206();
            this.f6164 = null;
            f6162.mo1311(this);
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1207() {
        return this.f6164.mo1207();
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1208() {
        return this.f6164.mo1208();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m3619() {
        this.f6163.m4791();
        if (!this.f6165) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f6165 = false;
        if (this.f6166) {
            mo1206();
        }
    }
}
