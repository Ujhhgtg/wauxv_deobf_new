package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2587 implements InterfaceC3450 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f8193;

    public C2587(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f8193 = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2587) {
            return this.f8193 == ((C2587) obj).f8193;
        }
        return false;
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10876;
    }

    public final int hashCode() {
        return this.f8193;
    }

    public final String toString() {
        return "<addr:" + AbstractC1460.m3223(this.f8193) + ">";
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return toString();
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo4533() {
        return C3448.f10876.f10905;
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo4534() {
        return false;
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo4536() {
        return C3448.f10876.mo4536();
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC3450 mo4538() {
        return this;
    }
}
