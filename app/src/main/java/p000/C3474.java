package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3474 extends AbstractC2394 {

    public byte[] f10967;

    public int f10968;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return new C3473(Arrays.copyOf(this.f10967, this.f10968));
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        byte[] bArr = this.f10967;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f10967 = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f10968;
    }
}
