package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2353 extends AbstractC0066 {
    @Override // p000.AbstractC2474
    public final int mo4331(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // p000.AbstractC0066
    public final Random mo949() {
        return ThreadLocalRandom.current();
    }
}
