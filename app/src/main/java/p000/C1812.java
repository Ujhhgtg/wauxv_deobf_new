package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1812 extends AbstractC0054 {

    public final C1811 f6048 = new C1811();

    public final int f6049;

    public boolean f6050;

    public C1812(int i) {
        this.f6049 = i;
    }

    @Override // p000.AbstractC0054
    public final boolean mo918(AbstractC0428 abstractC0428) {
        if (!this.f6050) {
            return true;
        }
        AbstractC0428 abstractC0429 = (AbstractC0428) this.f6048.f7218;
        if (!(abstractC0429 instanceof AbstractC1804)) {
            return true;
        }
        ((AbstractC1804) abstractC0429).f6027 = false;
        return true;
    }

    @Override // p000.AbstractC0054
    public final AbstractC0428 mo920() {
        return this.f6048;
    }

    @Override // p000.AbstractC0054
    public final boolean mo921() {
        return true;
    }

    @Override // p000.AbstractC0054
    public final C0429 mo923(C1088 c1088) {
        if (c1088.f3918) {
            if (this.f6048.f7219 == null) {
                return null;
            }
            AbstractC0428 abstractC0428Mo920 = c1088.m2657().mo920();
            this.f6050 = (abstractC0428Mo920 instanceof C2322) || (abstractC0428Mo920 instanceof C1811);
            return C0429.m1634(c1088.f3915);
        }
        int i = c1088.f3917;
        int i2 = this.f6049;
        if (i >= i2) {
            return new C0429(-1, c1088.f3913 + i2, false);
        }
        return null;
    }
}
