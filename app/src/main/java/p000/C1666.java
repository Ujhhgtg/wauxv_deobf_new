package p000;

import bsh.This;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1666 implements Supplier {

    public final /* synthetic */ int f5624;

    public /* synthetic */ C1666(int i) {
        this.f5624 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f5624) {
            case 0:
                ThreadLocal threadLocal = RunnableC1668.f5629;
                return Boolean.FALSE;
            case 1:
                return new ArrayList();
            default:
                return This.lambda$static$1();
        }
    }
}
