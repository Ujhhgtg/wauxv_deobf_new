package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0520 extends AbstractC2394 {

    public byte[] f2201;

    public int f2202;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f2201, this.f2202);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        byte[] bArr = this.f2201;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f2201 = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f2202;
    }
}
