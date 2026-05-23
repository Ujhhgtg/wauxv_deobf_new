package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1509 implements Runnable {

    public final /* synthetic */ int f5328;

    public final /* synthetic */ InterfaceC1425 f5329;

    public final /* synthetic */ Object f5330;

    public /* synthetic */ RunnableC1509(InterfaceC1425 interfaceC1425, Object obj, int i) {
        this.f5328 = i;
        this.f5329 = interfaceC1425;
        this.f5330 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5328) {
            case 0:
                this.f5329.invoke(this.f5330);
                break;
            default:
                this.f5329.invoke(this.f5330);
                break;
        }
    }
}
