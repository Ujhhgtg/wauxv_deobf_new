package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0895 extends AbstractC0777 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0905 f3335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3336;

    public C0895(C0905 c0905, int i) {
        if (c0905 == null) {
            throw new NullPointerException("invokeDynamic == null");
        }
        this.f3335 = c0905;
        this.f3336 = i;
    }

    public final String toString() {
        return this.f3335.f3361.toString();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return this.f3335.f3361.mo1214();
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2267(AbstractC0777 abstractC0777) {
        C0895 c0895 = (C0895) abstractC0777;
        int iCompareTo = this.f3335.compareTo(c0895.f3335);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f3336, c0895.f3336);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "CallSiteRef";
    }
}
