package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲀᤞᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0877 extends AbstractC0065 implements InterfaceC0874 {
    public AbstractC0877() {
        super(C1139.f4214);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0972.m2594(this);
    }

    @Override // p000.AbstractC0065, p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0876 mo1083(InterfaceC0875 interfaceC0875) {
        if (!(interfaceC0875 instanceof AbstractC0066)) {
            return C1139.f4214 == interfaceC0875 ? C1189.f4324 : this;
        }
        if (this.f1056 != ((AbstractC0066) interfaceC0875)) {
            return this;
        }
        throw null;
    }

    @Override // p000.AbstractC0065, p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0874 mo1086(InterfaceC0875 interfaceC0875) {
        if (!(interfaceC0875 instanceof AbstractC0066)) {
            if (C1139.f4214 == interfaceC0875) {
                return this;
            }
            return null;
        }
        if (this.f1056 != ((AbstractC0066) interfaceC0875)) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public abstract void mo2509(InterfaceC0876 interfaceC0876, Runnable runnable);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean mo2510(InterfaceC0876 interfaceC0876) {
        return !(this instanceof AbstractC3549);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public AbstractC0877 mo2511(int i) {
        AbstractC3528.m5089(i);
        return new C1804(this, i);
    }
}
