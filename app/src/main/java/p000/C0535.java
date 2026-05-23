package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0535 {

    public final int f2235;

    public final int f2236;

    public final int f2237;

    public final C0918 f2238;

    public C0535(int i, int i2, int i3, C0918 c0918) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endPc < startPc");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("handlerPc < 0");
        }
        this.f2235 = i;
        this.f2236 = i2;
        this.f2237 = i3;
        this.f2238 = c0918;
    }
}
