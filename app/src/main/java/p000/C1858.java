package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1858 extends AbstractC2394 {

    public long[] f6177;

    public int f6178;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f6177, this.f6178);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        long[] jArr = this.f6177;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f6177 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f6178;
    }
}
