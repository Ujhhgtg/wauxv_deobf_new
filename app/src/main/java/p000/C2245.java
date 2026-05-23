package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2245 implements LongFunction {
    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return new AtomicLong(j);
    }
}
