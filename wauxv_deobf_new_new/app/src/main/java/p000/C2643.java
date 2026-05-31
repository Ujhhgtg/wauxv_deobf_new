package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲈᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2643 implements InterfaceC3507 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f8346;

    public C2643(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f8346 = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2643) {
            return this.f8346 == ((C2643) obj).f8346;
        }
        return false;
    }

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11036;
    }

    public final int hashCode() {
        return this.f8346;
    }

    public final String toString() {
        return "<addr:" + AbstractC2902.m4906(this.f8346) + ">";
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return toString();
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo4555() {
        return C3505.f11036.f11065;
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo4556() {
        return false;
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo4558() {
        return C3505.f11036.mo4558();
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC3507 mo4560() {
        return this;
    }
}
