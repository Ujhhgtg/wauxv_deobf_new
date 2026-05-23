package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0254 extends AbstractC1813 {

    public final /* synthetic */ int f1424;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0254(InterfaceC2654 interfaceC2654, int i) {
        super(interfaceC2654);
        this.f1424 = i;
    }

    @Override // p000.InterfaceC2654
    public final String mo1342() {
        switch (this.f1424) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
