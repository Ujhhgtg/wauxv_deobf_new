package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0283 extends AbstractC0369 {

    public final int f1493;

    public final int f1494;

    public final C0542 f1495;

    public final C0536 f1496;

    public final C0442 f1497;

    public C0283(int i, int i2, C0542 c0542, C0536 c0536, C0442 c0442) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c0536.f6944) {
                throw new C1022("catches.isMutable()", null);
            }
            try {
                if (c0442.f6944) {
                    throw new C1022("attributes.isMutable()", null);
                }
                this.f1493 = i;
                this.f1494 = i2;
                this.f1495 = c0542;
                this.f1496 = c0536;
                this.f1497 = c0442;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // p000.AbstractC0369
    public final int mo1402() {
        int iMo1402 = 2;
        int iM4736 = AbstractC2784.m4736(this.f1496.f4836.length, 8, 2, ((C0516) this.f1495.f2252).f2191 + 14);
        C0442 c0442 = this.f1497;
        int length = c0442.f4836.length;
        for (int i = 0; i < length; i++) {
            iMo1402 += ((AbstractC0369) c0442.m3062(i)).mo1402();
        }
        return iM4736 + iMo1402;
    }
}
