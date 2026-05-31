package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲈᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0914 extends AbstractC3514 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2492 f3383;

    public C0914(C2492 c2492) {
        this.f3383 = c2492;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0914) {
            return this.f3383.equals(((C0914) obj).f3383);
        }
        return false;
    }

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11040;
    }

    public final int hashCode() {
        return this.f3383.f7898.hashCode();
    }

    public final String toString() {
        return AbstractC1095.m2801(new StringBuilder("proto{"), this.f3383.f7898, '}');
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f3383.f7898;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        return this.f3383.compareTo(((C0914) abstractC0775).f3383);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2370() {
        return false;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "proto";
    }
}
