package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲁᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0878 extends AbstractC0058 implements InterfaceC0875 {
    public AbstractC0878() {
        super(C1133.f4202);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0968.m2473(this);
    }

    @Override // p000.AbstractC0058, p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0877 mo939(InterfaceC0876 interfaceC0876) {
        if (!(interfaceC0876 instanceof AbstractC0059)) {
            return C1133.f4202 == interfaceC0876 ? C1187.f4327 : this;
        }
        if (this.f991 != ((AbstractC0059) interfaceC0876)) {
            return this;
        }
        throw null;
    }

    @Override // p000.AbstractC0058, p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0875 mo942(InterfaceC0876 interfaceC0876) {
        if (!(interfaceC0876 instanceof AbstractC0059)) {
            if (C1133.f4202 == interfaceC0876) {
                return this;
            }
            return null;
        }
        if (this.f991 != ((AbstractC0059) interfaceC0876)) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public abstract void mo2392(InterfaceC0877 interfaceC0877, Runnable runnable);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean mo2393(InterfaceC0877 interfaceC0877) {
        return !(this instanceof AbstractC3492);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public AbstractC0878 mo2394(int i) {
        AbstractC1460.m3211(i);
        return new C1781(this, i);
    }
}
