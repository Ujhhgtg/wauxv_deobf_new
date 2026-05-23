package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3479 extends AbstractC2394 {

    public int[] f10974;

    public int f10975;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return new C3478(Arrays.copyOf(this.f10974, this.f10975));
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        int[] iArr = this.f10974;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f10974 = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f10975;
    }
}
