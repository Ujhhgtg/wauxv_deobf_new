package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤞᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2311 implements InterfaceC0696 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Class f7443;

    public C2311(Class cls) {
        this.f7443 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2311) {
            return AbstractC2207.m4087(this.f7443, ((C2311) obj).f7443);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7443.hashCode();
    }

    public final String toString() {
        return this.f7443.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000.InterfaceC0696
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo2114() {
        return this.f7443;
    }
}
