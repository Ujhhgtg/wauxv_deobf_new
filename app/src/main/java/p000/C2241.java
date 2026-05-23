package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲁᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2241 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1743 f7259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2655 f7260;

    public C2241(InterfaceC1743 interfaceC1743) {
        this.f7259 = interfaceC1743;
        this.f7260 = new C2655(interfaceC1743.mo1363());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2241.class == obj.getClass() && AbstractC2207.m4087(this.f7259, ((C2241) obj).f7259);
    }

    public final int hashCode() {
        return this.f7259.hashCode();
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return this.f7260;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        if (interfaceC0974.mo2520()) {
            return interfaceC0974.mo2515(this.f7259);
        }
        return null;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        if (obj != null) {
            interfaceC1206.mo2798(this.f7259, obj);
        } else {
            interfaceC1206.mo2797();
        }
    }
}
