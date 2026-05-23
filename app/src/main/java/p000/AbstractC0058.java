package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0058 implements InterfaceC0875 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0876 f991;

    public AbstractC0058(InterfaceC0876 interfaceC0876) {
        this.f991 = interfaceC0876;
    }

    @Override // p000.InterfaceC0875
    public final InterfaceC0876 getKey() {
        return this.f991;
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public InterfaceC0877 mo939(InterfaceC0876 interfaceC0876) {
        return AbstractC2207.m4087(getKey(), interfaceC0876) ? C1187.f4327 : this;
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final Object mo940(Object obj, InterfaceC1429 interfaceC1429) {
        return interfaceC1429.mo1196(obj, this);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC0877 mo941(InterfaceC0877 interfaceC0877) {
        return AbstractC2209.m4140(this, interfaceC0877);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC0875 mo942(InterfaceC0876 interfaceC0876) {
        if (AbstractC2207.m4087(getKey(), interfaceC0876)) {
            return this;
        }
        return null;
    }
}
