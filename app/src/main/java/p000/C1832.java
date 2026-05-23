package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1832 {

    public final int f6119;

    public final int f6120;

    public final C0917 f6121;

    public final C0917 f6122;

    public final C0917 f6123;

    public final int f6124;

    public C1832(int i, int i2, C0917 c0917, C0917 c0918, C0917 c0919, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c0917 == null) {
            throw new NullPointerException("name == null");
        }
        if (c0918 == null && c0919 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f6119 = i;
        this.f6120 = i2;
        this.f6121 = c0917;
        this.f6122 = c0918;
        this.f6123 = c0919;
        this.f6124 = i3;
    }
}
