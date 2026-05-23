package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2692 extends AbstractC2394 {

    public short[] f8686;

    public int f8687;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f8686, this.f8687);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        short[] sArr = this.f8686;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f8686 = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f8687;
    }
}
