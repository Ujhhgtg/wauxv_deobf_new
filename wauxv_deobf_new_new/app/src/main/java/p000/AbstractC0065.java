package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0065 implements InterfaceC0874 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC0875 f1056;

    public AbstractC0065(InterfaceC0875 interfaceC0875) {
        this.f1056 = interfaceC0875;
    }

    @Override // p000.InterfaceC0874
    public final InterfaceC0875 getKey() {
        return this.f1056;
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public InterfaceC0876 mo1083(InterfaceC0875 interfaceC0875) {
        return AbstractC1469.m3322(getKey(), interfaceC0875) ? C1189.f4324 : this;
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final Object mo1084(Object obj, InterfaceC1437 interfaceC1437) {
        return interfaceC1437.mo1342(obj, this);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC0876 mo1085(InterfaceC0876 interfaceC0876) {
        return AbstractC1586.m3481(this, interfaceC0876);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC0874 mo1086(InterfaceC0875 interfaceC0875) {
        if (AbstractC1469.m3322(getKey(), interfaceC0875)) {
            return this;
        }
        return null;
    }
}
