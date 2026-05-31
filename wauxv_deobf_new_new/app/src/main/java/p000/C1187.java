package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᛸᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1187 implements InterfaceC1637 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f4323;

    public C1187(boolean z) {
        this.f4323 = z;
    }

    public final String toString() {
        return AbstractC1095.m2801(new StringBuilder("Empty{"), this.f4323 ? "Active" : "New", '}');
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo2915() {
        return this.f4323;
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2256 mo2916() {
        return null;
    }
}
