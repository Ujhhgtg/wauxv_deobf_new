package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲁᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2322 extends C2488 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f7502;

    @Override // p000.C2488, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0764 mo2636(InterfaceC2715 interfaceC2715) {
        AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3640();
        if (!AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9280) && !AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9283) && !(abstractC2236Mo3640 instanceof AbstractC2428)) {
            throw new C1667("Type " + interfaceC2715.mo3640() + " cannot be directly child of oneof element");
        }
        long jM2115 = m2115();
        if (jM2115 == 19500 && AbstractC1469.m3322(this.f7882, interfaceC2715)) {
            return this;
        }
        if (AbstractC2240.m4257(jM2115)) {
            throw new C1667("An oneof element cannot be directly child of another oneof element");
        }
        return new C2488(this.f7880, AbstractC3528.m5087(this.f7881, jM2115), interfaceC2715);
    }

    @Override // p000.C2488, p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2331(InterfaceC2715 interfaceC2715) {
        if (this.f7502) {
            return -1;
        }
        this.f7502 = true;
        return 0;
    }
}
