package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲁᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2344 implements InterfaceC0692 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Class f7565;

    public C2344(Class cls) {
        this.f7565 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2344) {
            return AbstractC1469.m3322(this.f7565, ((C2344) obj).f7565);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7565.hashCode();
    }

    public final String toString() {
        return this.f7565.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000.InterfaceC0692
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo2209() {
        return this.f7565;
    }
}
