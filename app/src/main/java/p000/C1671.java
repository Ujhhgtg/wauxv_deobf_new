package p000;

import java.util.function.BinaryOperator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1671 implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj).intValue() ^ ((Integer) obj2).intValue());
    }
}
