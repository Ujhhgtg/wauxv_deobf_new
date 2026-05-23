package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3489 extends AbstractC2394 {

    public short[] f10988;

    public int f10989;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return new C3488(Arrays.copyOf(this.f10988, this.f10989));
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        short[] sArr = this.f10988;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f10988 = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f10989;
    }
}
