package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0590 extends AbstractC2394 {

    public char[] f2396;

    public int f2397;

    @Override // p000.AbstractC2394
    public final Object mo1639() {
        return Arrays.copyOf(this.f2396, this.f2397);
    }

    @Override // p000.AbstractC2394
    public final void mo1640(int i) {
        char[] cArr = this.f2396;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f2396 = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p000.AbstractC2394
    public final int mo1641() {
        return this.f2397;
    }
}
