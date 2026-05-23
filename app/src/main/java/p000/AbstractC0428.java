package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0428 extends AbstractC2224 {
    @Override // p000.AbstractC2224
    public final AbstractC2224 mo1632() {
        return (AbstractC0428) this.f7218;
    }

    @Override // p000.AbstractC2224
    public final void mo1633(AbstractC2224 abstractC2224) {
        if (!(abstractC2224 instanceof AbstractC0428)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f7218 = abstractC2224;
    }
}
