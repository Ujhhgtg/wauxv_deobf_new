package p000;

import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2372 implements InterfaceC1425 {

    public final /* synthetic */ int f7622;

    public final /* synthetic */ Consumer f7623;

    public /* synthetic */ C2372(Consumer consumer, int i) {
        this.f7622 = i;
        this.f7623 = consumer;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f7622) {
            case 0:
                this.f7623.accept((Long) obj);
                break;
            default:
                this.f7623.accept((String) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
