package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1091 extends AbstractC2394 {

    public double[] f4100;

    public int f4101;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f4100, this.f4101);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        double[] dArr = this.f4100;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f4100 = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f4101;
    }
}
