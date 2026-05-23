package p000;

import java.util.Random;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0066 extends AbstractC2474 {
    @Override // p000.AbstractC2474
    public final int mo947(int i) {
        return ((-i) >> 31) & (mo949().nextInt() >>> (32 - i));
    }

    @Override // p000.AbstractC2474
    public final int mo948() {
        return mo949().nextInt();
    }

    public abstract Random mo949();

    public final int m950(int i) {
        return mo949().nextInt(i);
    }
}
