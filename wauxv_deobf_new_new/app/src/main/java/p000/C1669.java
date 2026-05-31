package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲀᛸᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1669 implements InterfaceC1671 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5635;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f5636;

    public C1669(String str) {
        this.f5635 = str;
        this.f5636 = "";
    }

    @Override // p000.InterfaceC1671
    public C1666 toInstant() {
        throw new C1667(this.f5635 + " when parsing an Instant from \"" + AbstractC0972.m2612(64, this.f5636) + '\"');
    }

    public C1669(String str, String str2) {
        this.f5635 = str;
        this.f5636 = str2;
    }
}
