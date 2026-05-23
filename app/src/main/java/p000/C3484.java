package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3484 extends AbstractC2394 {

    public long[] f10981;

    public int f10982;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return new C3483(Arrays.copyOf(this.f10981, this.f10982));
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        long[] jArr = this.f10981;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f10981 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f10982;
    }
}
