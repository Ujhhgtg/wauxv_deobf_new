package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1866 extends AbstractC0376 {

    public final /* synthetic */ int f6196;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1866(int i) {
        super(0);
        this.f6196 = i;
    }

    public final InterfaceC2376 m3637() {
        switch (this.f6196) {
            case 0:
                return new C1865(this);
            default:
                return new C2715(this);
        }
    }
}
