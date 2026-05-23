package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1658 extends AbstractC2394 {

    public int[] f5605;

    public int f5606;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f5605, this.f5606);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        int[] iArr = this.f5605;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5605 = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f5606;
    }
}
