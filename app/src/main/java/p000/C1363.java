package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 extends AbstractC2394 {

    public float[] f4870;

    public int f4871;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f4870, this.f4871);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        float[] fArr = this.f4870;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f4870 = Arrays.copyOf(fArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f4871;
    }
}
