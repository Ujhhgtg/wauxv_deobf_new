package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1782 {

    public final int f5910;

    public final int f5911;

    public C1782(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        this.f5910 = i;
        this.f5911 = i2;
    }
}
