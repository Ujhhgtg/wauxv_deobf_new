package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲇᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1748 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1748 f5881 = new C1748();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2717 f5882;

    static {
        C2719 c2719 = C2719.f8737;
        InterfaceC2715[] interfaceC2715Arr = new InterfaceC2715[0];
        if (AbstractC2901.m4869("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c2719.equals(C2911.f9280)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0703 c0703 = new C0703("kotlinx.serialization.json.JsonNull");
        f5882 = new C2717("kotlinx.serialization.json.JsonNull", c2719, c0703.f2685.size(), AbstractC0280.m1535(interfaceC2715Arr), c0703);
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5882;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        AbstractC1586.m3468(interfaceC0978);
        if (interfaceC0978.mo2644()) {
            throw new C1734(AbstractC2234.m4167(-1, "Expected 'null' literal", null, null, null));
        }
        return C1747.INSTANCE;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        AbstractC1586.m3467(interfaceC1207);
        interfaceC1207.mo2919();
    }
}
