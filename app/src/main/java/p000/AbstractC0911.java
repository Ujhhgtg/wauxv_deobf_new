package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᛸᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0911 extends AbstractC3458 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0918 f3368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0914 f3369;

    public AbstractC0911(C0918 c0918, C0914 c0914) {
        if (c0918 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0914 == null) {
            throw new NullPointerException("nat == null");
        }
        this.f3368 = c0918;
        this.f3369 = c0914;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC0911 abstractC0911 = (AbstractC0911) obj;
            if (this.f3368.equals(abstractC0911.f3368) && this.f3369.equals(abstractC0911.f3369)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3368.hashCode() * 31) ^ this.f3369.hashCode();
    }

    public final String toString() {
        return mo2269() + '{' + mo1214() + '}';
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return this.f3368.f3401.mo1214() + '.' + this.f3369.mo1214();
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public int mo2267(AbstractC0777 abstractC0777) {
        AbstractC0911 abstractC0911 = (AbstractC0911) abstractC0777;
        int iCompareTo = this.f3368.compareTo(abstractC0911.f3368);
        return iCompareTo != 0 ? iCompareTo : this.f3369.f3374.compareTo(abstractC0911.f3369.f3374);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2268() {
        return false;
    }
}
