package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᤝᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2187 extends AbstractC1778 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2189 f7233;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2187(C2189 c2189, int i) {
        super(0);
        this.f7232 = i;
        this.f7233 = c2189;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        switch (this.f7232) {
            case 0:
                C2189 c2189 = this.f7233;
                return new C2531(new C2188(c2189.f7235.source(), c2189));
            default:
                return Long.valueOf(this.f7233.f7235.contentLength());
        }
    }
}
