package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2594 extends C0403 {

    public int f8222;

    @Override // p000.C0403
    public final int mo1594() {
        int i = this.f1901;
        if (i >= this.f8222) {
            throw new IndexOutOfBoundsException();
        }
        this.f1901 = i + 1;
        return i;
    }
}
