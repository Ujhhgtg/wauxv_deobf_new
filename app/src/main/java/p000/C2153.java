package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2153 extends AbstractC1756 implements InterfaceC1414 {

    public final /* synthetic */ int f7108;

    public final /* synthetic */ C2155 f7109;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2153(C2155 c2155, int i) {
        super(0);
        this.f7108 = i;
        this.f7109 = c2155;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f7108) {
            case 0:
                C2155 c2155 = this.f7109;
                return new C2477(new C2154(c2155.f7111.source(), c2155));
            default:
                return Long.valueOf(this.f7109.f7111.contentLength());
        }
    }
}
