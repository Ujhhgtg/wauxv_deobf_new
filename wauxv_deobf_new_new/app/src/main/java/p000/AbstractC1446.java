package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᛸᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1446 extends AbstractC0529 implements InterfaceC1445, InterfaceC1759, InterfaceC1444 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f5123;

    public AbstractC1446(int i, Class cls, String str, String str2, int i2) {
        this(i, C0528.f2222, cls, str, str2, i2, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1446) {
            AbstractC1446 abstractC1446 = (AbstractC1446) obj;
            return this.f2226.equals(abstractC1446.f2226) && this.f2227.equals(abstractC1446.f2227) && AbstractC1469.m3322(this.f2224, abstractC1446.f2224) && m2027().equals(abstractC1446.m2027());
        }
        if (obj instanceof AbstractC1446) {
            return obj.equals(mo2025());
        }
        return false;
    }

    @Override // p000.InterfaceC1445
    public final int getArity() {
        return this.f5123;
    }

    public final int hashCode() {
        m2027();
        return this.f2227.hashCode() + AbstractC2647.m4621(m2027().hashCode() * 31, 31, this.f2226);
    }

    public final String toString() {
        InterfaceC1759 interfaceC1759Mo2025 = mo2025();
        if (interfaceC1759Mo2025 != this) {
            return interfaceC1759Mo2025.toString();
        }
        String str = this.f2226;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC1095.m2800("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // p000.AbstractC0529
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1759 mo2026() {
        AbstractC2574.f8194.getClass();
        return this;
    }

    public AbstractC1446(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f5123 = i;
    }
}
