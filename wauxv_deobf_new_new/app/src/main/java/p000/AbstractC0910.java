package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲇᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910 extends AbstractC3514 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0917 f3375;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0913 f3376;

    public AbstractC0910(C0917 c0917, C0913 c0913) {
        if (c0917 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0913 == null) {
            throw new NullPointerException("nat == null");
        }
        this.f3375 = c0917;
        this.f3376 = c0913;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC0910 abstractC0910 = (AbstractC0910) obj;
            if (this.f3375.equals(abstractC0910.f3375) && this.f3376.equals(abstractC0910.f3376)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3375.hashCode() * 31) ^ this.f3376.hashCode();
    }

    public final String toString() {
        return mo2371() + '{' + mo1360() + '}';
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f3375.f3408.mo1360() + '.' + this.f3376.mo1360();
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public int mo2369(AbstractC0775 abstractC0775) {
        AbstractC0910 abstractC0910 = (AbstractC0910) abstractC0775;
        int iCompareTo = this.f3375.compareTo(abstractC0910.f3375);
        return iCompareTo != 0 ? iCompareTo : this.f3376.f3381.compareTo(abstractC0910.f3376.f3381);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2370() {
        return false;
    }
}
