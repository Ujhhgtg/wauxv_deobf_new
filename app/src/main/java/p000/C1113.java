package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1113 implements InterfaceC2650, InterfaceC1114 {

    public final InterfaceC2650 f4159;

    public final int f4160;

    public C1113(InterfaceC2650 interfaceC2650, int i) {
        this.f4159 = interfaceC2650;
        this.f4160 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000.InterfaceC2650
    public final Iterator iterator() {
        return new C1112(this);
    }

    @Override // p000.InterfaceC1114
    public final InterfaceC2650 mo2686(int i) {
        int i2 = this.f4160 + i;
        return i2 < 0 ? new C1113(this, i) : new C1113(this.f4159, i2);
    }
}
