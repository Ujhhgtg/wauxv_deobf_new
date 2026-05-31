package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᛸᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2479 extends AbstractC0529 implements InterfaceC1766 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f7861;

    public AbstractC2479(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f7861 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2479) {
            AbstractC2479 abstractC2479 = (AbstractC2479) obj;
            return m2027().equals(abstractC2479.m2027()) && this.f2226.equals(abstractC2479.f2226) && this.f2227.equals(abstractC2479.f2227) && AbstractC1469.m3322(this.f2224, abstractC2479.f2224);
        }
        if (obj instanceof InterfaceC1766) {
            return obj.equals(mo2025());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2227.hashCode() + AbstractC2647.m4621(m2027().hashCode() * 31, 31, this.f2226);
    }

    public final String toString() {
        InterfaceC1759 interfaceC1759Mo2025 = mo2025();
        return interfaceC1759Mo2025 != this ? interfaceC1759Mo2025.toString() : AbstractC2844.m4786(new StringBuilder("property "), this.f2226, " (Kotlin reflection is not available)");
    }

    @Override // p000.AbstractC0529
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC1759 mo2025() {
        return this.f7861 ? this : super.mo2025();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1766 m4407() {
        if (this.f7861) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1759 interfaceC1759Mo2025 = mo2025();
        if (interfaceC1759Mo2025 != this) {
            return (InterfaceC1766) interfaceC1759Mo2025;
        }
        throw new C0885();
    }
}
