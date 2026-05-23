package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0759 implements InterfaceC0842 {

    public static final C0759 f2859 = new C0759();

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // p000.InterfaceC0842
    public final void mo933(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p000.InterfaceC0842
    public final InterfaceC0877 mo934() {
        throw new IllegalStateException("This continuation is already complete");
    }
}
