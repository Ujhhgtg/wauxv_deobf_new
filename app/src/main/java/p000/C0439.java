package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0439 extends AbstractC2394 {

    public boolean[] f2005;

    public int f2006;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f2005, this.f2006);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        boolean[] zArr = this.f2005;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f2005 = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f2006;
    }
}
