package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0555 implements InterfaceC2229 {

    public final /* synthetic */ int f2279;

    public final Object f2280;

    public /* synthetic */ C0555(int i, Object obj) {
        this.f2279 = i;
        this.f2280 = obj;
    }

    public final String toString() {
        switch (this.f2279) {
            case 0:
                return "CancelHandler.UserSupplied[" + C1514.class.getSimpleName() + '@' + AbstractC0968.m2473(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC1080) this.f2280) + ']';
        }
    }
}
