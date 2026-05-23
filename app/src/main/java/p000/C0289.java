package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0289 extends AbstractC0369 {

    public final C1783 f1504;

    public C0289(C1783 c1783) {
        super("LineNumberTable");
        try {
            if (c1783.f6944) {
                throw new C1022("lineNumbers.isMutable()", null);
            }
            this.f1504 = c1783;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // p000.AbstractC0369
    public final int mo1402() {
        return (this.f1504.f4836.length * 4) + 8;
    }
}
